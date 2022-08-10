package ListaDeLivro.livro.controller;

import ListaDeLivro.livro.model.LivrosModel;
import ListaDeLivro.livro.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LivrosController {

    @Autowired
    private LivroService livroService;

    @GetMapping(path = "/livros")
    public List<LivrosModel> exibirTodosLivros() {
        return livroService.buscarTodos();
    }

    @GetMapping(path = "/livros/{codigo}")
    public Optional<LivrosModel> buscarPorId(@PathVariable Long codigo) {
        return livroService.buscarId(codigo);
    }

    @PostMapping(path = "/livros")
    @ResponseStatus(HttpStatus.CREATED)
    public LivrosModel cadastrarLivros(@RequestBody LivrosModel livrosModel) {
        return livroService.cadastrar(livrosModel);
    }

    @PutMapping(path = "/livros/{codigo}")
    public LivrosModel alterarLivros(@RequestBody LivrosModel livrosModel) {
        return livroService.alterar(livrosModel);
    }

    @DeleteMapping(path = "livros/{codigo}")
    public void deletarLivros(@PathVariable Long codigo) {
        livroService.deletar(codigo);
    }
}
