package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.LinkedList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class EditoraRepoJpaImpl implements IEditoraRepository {
    private IEditoraJpaItfRep repository;

    public EditoraRepoJpaImpl(IEditoraJpaItfRep repository) {
        this.repository = repository;
    }

    @Override
    public List<Editora> getEditoras() {
        List<Editora> editoras = repository.findAll();
        if (editoras.size() == 0) 
            editoras = new LinkedList<Editora>();
        return editoras;
    }

    @Override
    public List<Editora> getEditoraCodigoNome(long codigo, String nome) {
        List<Editora> editoras = repository.findByCodigoAndNome(codigo, nome);
        if (editoras.size() == 0) 
            editoras = new LinkedList<Editora>();
        return editoras;
    }

    @Override
    public List<Editora> getEditorasNome(String nome) {
        List<Editora> editoras = repository.findByNome(nome);
        if (editoras.size() == 0) 
            editoras = new LinkedList<Editora>();
        return editoras;
    }
    
}
