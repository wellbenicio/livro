package ListaDeLivro.livro.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Livros")
public class LivrosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(length = 50, nullable = false)
    private String autor;
    @Column(length = 50, nullable = false)
    private String nome;
    @Column(length = 10, nullable = false)
    private String dataLancamento;
}
