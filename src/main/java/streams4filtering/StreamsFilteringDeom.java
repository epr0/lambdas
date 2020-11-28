package streams4filtering;

import streams2.Movie;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamsFilteringDeom {

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Titanic", 15),
                new Movie("Spiderman", 12),
                new Movie("Rocky", 500)
        );

        //Intermediate operations
        //filter() and map() returns new stream, so we can reuse them again.
        //Terminal operations
        //foreach() it consumes a stream.
        movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .filter(movie -> movie.getLikes() > 16)
                //filtering happens only when we call a terminal operation
                .forEach(movie -> System.out.println(movie.getTitle()));

        Predicate<Movie> isPopuar = movie -> movie.getLikes() > 10;

        //attaching more pipes to get smaller amount of water (filtered)
        movies.stream().filter(isPopuar).forEach(movie -> System.out.println(movie.getTitle()));
    }
}
