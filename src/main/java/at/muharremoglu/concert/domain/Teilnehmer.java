package at.muharremoglu.concert.domain;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Teilnehmer extends AbstractEntity{


    private String name;


    @NotNull
    @NotEmpty
    private String vorname;


    @NotNull
    @NotEmpty
    private String nachname;


}
