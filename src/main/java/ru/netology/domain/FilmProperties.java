package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class FilmProperties {

    private int id;
    private String FilmName;
    private String FilmGenre;


}
