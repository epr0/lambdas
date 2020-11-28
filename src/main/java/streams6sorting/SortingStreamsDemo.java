package streams6sorting;

import streams2.Movie;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingStreamsDemo {

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Titanic", 15),
                new Movie("Spiderman", 12),
                new Movie("Rocky", 500)
        );

        movies.stream() //sorted without arguments depends on Movie class impl
                .sorted((a,b) -> a.getTitle().compareTo(b.getTitle()))
                .forEach(movie -> System.out.println(movie.getTitle()));

        movies.stream()
                .sorted(Comparator.comparing(movie -> movie.getTitle()));

        //or method reference
        movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle))
        .forEach(movie -> System.out.println(movie.getTitle()));
    }
}
