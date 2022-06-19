package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmProperties;

public class FilmManagerTest {
    FilmManager manager=new FilmManager();
    FilmProperties first = new FilmProperties(1,"First Blood","action");
    FilmProperties second = new FilmProperties(2,"Spider man","action");
    FilmProperties third = new FilmProperties(3,"Transformers","action");
    FilmProperties fourth = new FilmProperties(4,"Rambo","action");
    FilmProperties fifth = new FilmProperties(5,"Predator","action");
    FilmProperties sixth = new FilmProperties(6,"Rampage","action");
    FilmProperties seventh = new FilmProperties(7,"Transformers 2","action");
    FilmProperties eights = new FilmProperties(8,"Jurassic Park","action");
    FilmProperties ninths = new FilmProperties(9,"Independence Day","action");
    FilmProperties tenth = new FilmProperties(10,"Alien","action");
    FilmProperties eleventh = new FilmProperties(11,"Star Wars","action");


@Test
    public void shouldAddItems(){
    FilmManager manager = new FilmManager();
    manager.addFilm(first);
    manager.addFilm(second);
    manager.addFilm(third);
    manager.addFilm(fourth);
    manager.addFilm(fifth);
    manager.addFilm(sixth);
    FilmProperties[] actual = manager.findAll();
    FilmProperties[] expected = {first,second,third,fourth,fifth,sixth};
    Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void shouldCheckLimitFiveFilms() {
        FilmManager manager = new FilmManager(5);
        manager.addFilm(first);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(ninths);
        manager.addFilm(eleventh);

        FilmProperties[] actual = manager.findLastAdd();
        FilmProperties[] expected = {eleventh,ninths,sixth,fifth,first};
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void shouldCheckItemsOverLimitOfFourItems() {
        FilmManager manager = new FilmManager(3);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);

        FilmProperties[] actual = manager.findLastAdd();
        FilmProperties[] expected = {fourth,third,second};
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void shouldCheckItemOverLimitWithoutMeaningfilmtoShow() {
        FilmManager manager = new FilmManager();
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eights);
        manager.addFilm(ninths);
        manager.addFilm(tenth);
        manager.addFilm(eleventh);

        FilmProperties[] actual = manager.findLastAdd();
        FilmProperties[] expected = {eleventh,tenth,ninths,eights,seventh,sixth,fifth,fourth,third,second};
        Assertions.assertArrayEquals(expected,actual);
    }


}
