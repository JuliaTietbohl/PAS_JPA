package br.pucrs.nomeusuario.exemplo.persistencia;

import jakarta.persistence.*;

@Entity
public class Editora {
    @Id
    private Long codigo;
    private String nome;


    public Editora() {
        
    }
    public Editora(Long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Long getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
}