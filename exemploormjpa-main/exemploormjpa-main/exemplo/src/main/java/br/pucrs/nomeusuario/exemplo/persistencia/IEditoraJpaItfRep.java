package br.pucrs.nomeusuario.exemplo.persistencia;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IEditoraJpaItfRep extends CrudRepository<Editora,Long> {
    List<Editora> findAll();
    List<Editora> findByCodigoAndNome(long codigo, String nome);
    List<Editora> findByNome(String nome);
}
