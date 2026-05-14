package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.List;

public interface IEditoraRepository {
    List<Editora> getEditoras();
    List<Editora> getEditoraCodigoNome(long codigo, String nome);
    List<Editora> getEditorasNome(String nome);
} 
