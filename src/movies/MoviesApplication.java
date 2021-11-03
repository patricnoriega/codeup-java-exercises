package movies;
import util.Input;

import java.util.Scanner;

import static movies.Movie.getAllMovies;
import static movies.Movie.getMoviesByCategory;

//import static movies.Movie.getMovieByCategory;
public class MoviesApplication {

    public static void main(String[] args) {

        System.out.println("What would you like to do? ");
        System.out.println("0 - exit ");
        System.out.println("1 - view all movies ");
        System.out.println("2 - view movies in the animated category ");
        System.out.println("3 - view movies in the drama category ");
        System.out.println("4 - view movies in the horror category ");
        System.out.println("5 - view movies in the scifi category ");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        switch (userInput) {
            case "0":
                System.out.println("Exiting Application");
                break;
            case "1":
                getAllMovies();
                break;
            case "2":
                getMoviesByCategory("animated");
                break;
            case "3":
                getMoviesByCategory("drama");
                break;
            case "4":
                getMoviesByCategory("horror");
                break;
            case "5":
                getMoviesByCategory("scifi");
                break;

        }
    }
}

