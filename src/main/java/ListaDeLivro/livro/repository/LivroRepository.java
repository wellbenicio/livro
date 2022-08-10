package ListaDeLivro.livro.repository;

import ListaDeLivro.livro.model.LivrosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository  extends JpaRepository<LivrosModel, Long> {
}
