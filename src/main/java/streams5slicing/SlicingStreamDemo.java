package streams5slicing;

import streams2.Movie;

import java.util.Arrays;
import java.util.List;

public class SlicingStreamDemo {

    public static void main(String[] args) {
        //limit()
        //skip() elements in stream
        //takeWhile(predicate) as long as this true keep taking elements

        List<Movie> movies = Arrays.asList(
                new Movie("Titanic", 15),
                new Movie("Spiderman", 12),
                new Movie("Rocky", 500)
        );

        movies.stream().limit(2)
                .forEach(movie -> System.out.println(movie.getTitle()));

        //both found movies are skipped
        movies.stream().limit(2).skip(2).forEach(movie -> System.out.println(movie.getTitle()));

        //take while drop while in java 9

    }
}
