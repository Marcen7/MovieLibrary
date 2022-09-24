import Models.Actor;
import Models.Director;
import Models.Movie;
import Tolls.MovieFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MovieLibrary {
        private static int filmIndex;

        public static void main(String[] args) {
                filmIndex = 2;

                List<Movie> movies = MovieFactory.createMovies();

                Movie movie1 = movies.get(0);
                Movie movie2 = movies.get(1);
                Movie movie3 = movies.get(2);
                Movie movie4 = movies.get(3);
                Movie movie5 = movies.get(4);

                //Pętla do wyświetlania tytółow

       for (Movie movie : movies){
               System.out.println(movie.getTitle());
       }
       // Pętla do wyświetlania aktorów
       for (Movie movie : movies){
               System.out.println(movie.getActorList());
       }
                 //Petla do wyświtlania reżyserów
                System.out.println("Lista reżyserów wszystkich filmów");
                for (Movie movie : movies) {
                        System.out.println("Reżyser: " + "Imie: " + movie.getDirector());


                }
                System.out.println("Lista aktorów z określonego firmu: ");
                for (int i=0; i <= movies.size()-1; i++) {
                   if (i == filmIndex )     {
                           List<Actor> actorList = movies.get(i).getActorList();

                         for (Actor actor : actorList) {
                                 System.out.println("Aktor: " + movies.get(i).getActorList());
                   }
                }

        }
}}
