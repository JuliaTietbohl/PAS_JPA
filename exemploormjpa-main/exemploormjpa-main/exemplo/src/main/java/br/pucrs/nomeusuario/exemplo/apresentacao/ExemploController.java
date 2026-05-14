package br.pucrs.nomeusuario.exemplo.apresentacao;

import br.pucrs.nomeusuario.exemplo.persistencia.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/biblioteca")
public class ExemploController {
    private IAcervoRepository acervo;

    @Autowired
    public ExemploController(IAcervoRepository acervo) {
        this.acervo = acervo;        
    }

    @GetMapping("")
    public String getMensagemInicial() {
        return "Aplicacao Spring-Boot funcionando!";
    }

    @GetMapping("/livros")
    public List<Livro> getLivros() {
        return acervo.getLivros();
    }

    @GetMapping("/livroid/{id}")
    public Livro getLivroId(@PathVariable long id) {
        return acervo.getLivroId(id);
    }

    @GetMapping("/livrosautor/{autor}")
    public List<Livro> getLivrosTitulo(@PathVariable String autor) {
        return acervo.getLivrosAutor(autor);
    }

}