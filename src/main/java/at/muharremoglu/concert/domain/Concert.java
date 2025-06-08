package at.muharremoglu.concert.domain;

import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Concert extends AbstractEntity {

    @NotNull
    @NotEmpty
    private String kuenstler;


    @NotNull
    @NotEmpty
    private String ort;


    @OneToMany
    private Teilnehmer teilnehmer;


}
