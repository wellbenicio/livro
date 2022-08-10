package ListaDeLivro.livro.service;

import ListaDeLivro.livro.model.LivrosModel;
import ListaDeLivro.livro.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<LivrosModel> buscarTodos() {
        return livroRepository.findAll();
    }

    public Optional <LivrosModel> buscarId(Long codigo) {
        return livroRepository.findById(codigo);
    }

    public LivrosModel cadastrar( LivrosModel livrosModel) {
        livrosModel.getCodigo();
        livrosModel.getNome();
        livrosModel.getDataLancamento();
        livrosModel.getAutor();
        return livroRepository.save(livrosModel);
    }

    public LivrosModel alterar(LivrosModel livrosModel) {
        livrosModel.getCodigo();
        livrosModel.getNome();
        livrosModel.getDataLancamento();
        livrosModel.getAutor();
        return livroRepository.save(livrosModel);
    }

    public void deletar(Long codigo) {
        livroRepository.deleteById(codigo);
    }

}
