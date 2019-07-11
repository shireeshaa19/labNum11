package labNumber11;

import java.util.ArrayList;
import java.util.Scanner;

public class ListofMoviesApp {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to the Movie List Application! \n");

		ArrayList<Movie> listOfMovies = new ArrayList<>();
		Movie m1 = new Movie("Toystory", "animated");
		listOfMovies.add(m1);
		Movie m2 = new Movie("Beauty and the Beast", "animated");
		listOfMovies.add(m2);
		Movie m3 = new Movie("Coco ", "animated");
		listOfMovies.add(m3);
		Movie m4 = new Movie("up", "animated");
		listOfMovies.add(m4);
		Movie m5 = new Movie("Star Wars", "Scifi");
		listOfMovies.add(m5);
		Movie m6 = new Movie("The Extra terrestrial", "Scifi");
		listOfMovies.add(m6);
		Movie m7 = new Movie("A star is Born", "Drama");
		listOfMovies.add(m7);
		Movie m8 = new Movie("Spotlight", "Drama");
		listOfMovies.add(m8);
		Movie m9 = new Movie("Halloween", "Horror");
		listOfMovies.add(m9);
		Movie m10 = new Movie("The Witch", "Horror");
		listOfMovies.add(m10);
		Movie m11 = new Movie("2001:A Space Odyssey", "Scifi");
		listOfMovies.add(m11);
		Movie m12 = new Movie("A Clockwork Orange", "Scifi");
		listOfMovies.add(m12);

		System.out.println("There are 12 movies in the list. ");

		String userChoice = "";
		String answer = "";

		do {
			System.out.println("What category are you interested in? \n");
			userChoice = scnr.next();

			for (Movie movie : listOfMovies) {
				if (userChoice.equalsIgnoreCase("animated")) {

					if (movie.getCategory().equalsIgnoreCase("animated")) {
						System.out.println(movie.getTitle());
					}

				} else if (userChoice.equalsIgnoreCase("Horror")) {

					if (movie.getCategory().equalsIgnoreCase("Horror")) {
						System.out.println(movie.getTitle());
					}
				} else if (userChoice.equalsIgnoreCase("Scifi")) {

					if (movie.getCategory().equalsIgnoreCase("Scifi")) {
						System.out.println(movie.getTitle());
					}

				} else if (userChoice.equalsIgnoreCase("drama")) {

					if (movie.getCategory().equalsIgnoreCase("drama")) {
						System.out.println(movie.getTitle());

					}
				}
			}
			System.out.println("Would you like to Continue(y/n)");
			answer = scnr.next();

		} while (answer.equals("y"));
		scnr.close();

	}

}
