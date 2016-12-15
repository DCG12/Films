package com.company;

/**
 * Created by 46406163y on 15/12/16.
 */
public class Personajes {

    int idMovie;
    int idActor;
    String personaje;

    public void setidMovie(Object idMovie) {
        this.idMovie = (int) idMovie;
    }

    public void setidActor(Object idActor) {
        this.idActor = (int) idActor;
    }

    public void setPersonaje(Object personaje) {
        this.personaje = (String) personaje;
    }

    public int getIdMovie() {
        return idMovie;
    }

    public int getIdActor() {
        return idActor;
    }

    public String getPersonaje() {
        return personaje;
    }
}
