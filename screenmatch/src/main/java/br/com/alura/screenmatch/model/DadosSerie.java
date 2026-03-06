package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


//Json mapeia e pega o json chave e valor, por isso se coloca do mesmo jeito que está no json, em primeira instacia estamos apenas dizendo que title vai ser armazenado em titulo e o nome que vai levar sera titulo msm, pois usa o JsonAlias, se usasse o JsonPropetiers iria colocar o mesmo nome, como o titulo iria ficar title mesmo..

// tudo o que eu não pedi não vai converter
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporada,
                         @JsonAlias("imdbRating") String avaliacao) {
}
