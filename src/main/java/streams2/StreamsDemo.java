package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Titanic", 15),
                new Movie("Spiderman", 12),
                new Movie("Rocky", 500)
        );

        //Imperative programming
        //Statements which specify HOW we should count
        int counter = 0;
        for (Movie movie : movies) {
            if(movie.getLikes() > 10) {
                counter++;
            }
        }

        //Declarative programming (SQL) / functional programming
        //Statements which specify WHAT (to get from db) should be done
        //Stream is collection of objects. A water tank. Stream is a pipe.
        //filter takes a PREDICATE (takes a value returns boolean)
        long anotherCounter = movies.stream()
                                    .filter(movie -> movie.getLikes() > 0)
                                    .count();

        //Mapping PART streams 3
        //attaching pipes
        movies.stream()
                .map(movie -> movie.getTitle())
                .forEach(name -> System.out.println(name));

        movies.stream()
                .mapToInt(movie -> movie.getLikes())
                .forEach(likes -> System.out.println(likes));

        Stream streamOfLists = Stream.of(Arrays.asList(1,2,3), Arrays.asList(4,5,6));
        streamOfLists.forEach(list -> System.out.println(list));

    }
}
