package functionalinterface.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierService implements LambdaService {

    @Override
    public void execute() {
        //Represent supplier of results
        //Does NOT Contain ANY arguments
        //Empty argument list is still MANDATORY
        Supplier<String> supplier = () -> "[SUPPLIER] Java is FUN";
        System.out.println(supplier.get());

        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        LocalDateTime time = s.get();
        System.out.println("[SUPPLIER 1] " + time.toString());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
        String time2 = s1.get();
        System.out.println("[SUPPLIER 2] " + time2.toString());

        Developer obj = factory(Developer::new);
        System.out.println(obj);

        Developer obj2 = factory(() -> new Developer("mkyong"));
        System.out.println(obj2);
    }

    public static Developer factory(Supplier<? extends Developer> s) {

        Developer developer = s.get();
        if (developer.getName() == null || "".equals(developer.getName())) {
            developer.setName("default");
        }
        developer.setSalary(BigDecimal.ONE);
        developer.setStart(LocalDate.of(2017, 8, 8));

        return developer;

    }

    public class Developer {

        String name;
        BigDecimal salary;
        LocalDate start;

        // for factory(Developer::new);
        public Developer() {
        }

        // for factory(() -> new Developer("mkyong"));
        public Developer(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BigDecimal getSalary() {
            return salary;
        }

        public void setSalary(BigDecimal salary) {
            this.salary = salary;
        }

        public LocalDate getStart() {
            return start;
        }

        public void setStart(LocalDate start) {
            this.start = start;
        }
    }

}
