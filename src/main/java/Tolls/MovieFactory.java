package Tolls;

import Models.Actor;
import Models.Director;
import Models.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieFactory {
    public static List<Movie> createMovies(){
        List<Movie> moveList = new ArrayList<>();
        //List of directors
        Director adamNowak = new Director("Adam", "Nowak");
        Director adamMalysz = new Director("Adam", "Malysz");
        Director krzysztofZanussi = new Director("Krzysztof", "Zanussi");

        //List of actors

        Actor bradPitt =  new Actor("Brad", "Pitt");
        Actor angelinaJolie =  new Actor("Angelina", "Jole");
        Actor borysSzyc =  new Actor("Brys", "Szyc");
        Actor piotrAdamczyk =  new Actor("Piotr", "Adamczyk");
        Actor salmaHayek =  new Actor("Salma", "Hajek");
        Actor antonioBanderas =  new Actor("Antonio", "Banderas");
        Actor tomCruz =  new Actor("Tom", "Cruz");


        List<Actor> actorsFilm1 = new ArrayList<>();

        actorsFilm1.add(borysSzyc);
        actorsFilm1.add(piotrAdamczyk);
        actorsFilm1.add(angelinaJolie);



        List<Actor> actorsFilm2 = List.of(bradPitt, angelinaJolie, salmaHayek,tomCruz);



        List<Actor> actorsFilm3 = new ArrayList<>();

        actorsFilm3.addAll(actorsFilm1);
        actorsFilm3.add(salmaHayek);
        actorsFilm3.add(antonioBanderas);

        //List of movies

        Movie topGun = new Movie("Top Gun", "01,08,2022", adamMalysz, actorsFilm1);
        Movie zielonaMila = new Movie("Zielona Mila", "01,08,2000", adamNowak, actorsFilm1);
        Movie missionImposible = new Movie("Mision Imposible", "01,03,2022", krzysztofZanussi, actorsFilm3);
        Movie gladiator = new Movie("Gladiator", "04,03,2021", adamMalysz, actorsFilm1);
        Movie troja = new Movie("Troja", "01,06,1983", adamNowak, actorsFilm2);

        moveList.add(topGun);
        moveList.add(zielonaMila);
        moveList.add(missionImposible);
        moveList.add(gladiator);
        moveList.add(troja);

        return moveList;

    }
    }
