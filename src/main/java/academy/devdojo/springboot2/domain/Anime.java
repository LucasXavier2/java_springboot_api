package academy.devdojo.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //get, set, equal e hashcode
@AllArgsConstructor //construtor com os atributos
public class Anime {
    private long id;
    private String name;
}
