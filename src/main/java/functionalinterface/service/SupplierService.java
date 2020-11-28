package functionalinterface.service;

import java.util.function.Supplier;

public class SupplierService implements LambdaService {

    @Override
    public void execute() {
        //Represent supplier of results
        //Does NOT Contain ANY arguments
        //Empty argument list is still MANDATORY
        Supplier<String> supplier = () -> "Java is FUN";
        System.out.println(supplier.get());
    }

}
