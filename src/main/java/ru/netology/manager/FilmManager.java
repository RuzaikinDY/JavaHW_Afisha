package ru.netology.manager;

import ru.netology.domain.FilmProperties;

public class FilmManager {
    private FilmProperties[] items = new FilmProperties[0];
    private int filmToShow;

    public FilmManager(int filmToShow) {
        this.filmToShow = filmToShow;
    }

    public FilmManager() {
        this.filmToShow = 10;
    }

    public void addFilm(FilmProperties item) {
        int lenght = items.length + 1;
        FilmProperties[] tmp = new FilmProperties[lenght];
//        for (int i = 0; i < items.length; i++) {
//            tmp[i] = items[i];
//        }
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public FilmProperties[] findAll() {
        return items;
    }

    public FilmProperties[] findLastAdd() {
        int resultLenght;
        boolean isFilmToShow = this.filmToShow < findAll().length;

        resultLenght = isFilmToShow ? this.filmToShow : findAll().length;
        FilmProperties[] result = new FilmProperties[resultLenght];
        for (int i = 0; i < resultLenght; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}
