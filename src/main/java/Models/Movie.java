package Models;

import java.util.List;

public class Movie {
    private String title;
    private String relaseDate;
    private Director director;
    private List<Actor> actorList;

    public Movie(String title, String relaseDate, Director director, List<Actor> actorList) {
        this.title = title;
        this.relaseDate = relaseDate;
        this.director = director;
        this.actorList = actorList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRelaseDate() {
        return relaseDate;
    }

    public void setRelaseDate(String relaseDate) {
        this.relaseDate = relaseDate;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(List<Actor> actorList) {
        this.actorList = actorList;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", relaseDate='" + relaseDate + '\'' +
                ", director=" + director +
                ", actorList=" + actorList +
                '}';
    }
}
