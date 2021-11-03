package movies;
import static movies.MoviesArray.findAll;
import util.Input;

import java.util.Objects;

public class Movie {

    private String name;
    private String category;

    public String getMovie() {
        return this.name;
    }

    public String setMovie(String name) {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public String setCategory(String category) {
        return this.category;

    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public static void getAllMovies() {
        for (int i = 0; i < findAll().length; i++) {
            System.out.println(findAll()[i].getMovie());
        }
    }
        public static void getMoviesByCategory (String category) {
        for (int i = 0; i < findAll().length; i++) {
            if (Objects.equals(findAll()[i].getCategory(), category)) {
                System.out.println(findAll()[i].getMovie());
            }

        }

    }
}