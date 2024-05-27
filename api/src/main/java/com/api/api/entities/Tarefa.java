package com.api.api.entities;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_tarefas")
public class Tarefa {
    @Id // Diz que esse campo é a chave primária do banco
    @GeneratedValue(strategy = GenerationType.IDENTITY) // é uma forma de gerar os IDs
    private Integer id;
    private String descricao;
    private Date dataCriacao;
    private Date dataLimite;
    private boolean finalizada;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(Date dataLimite) {
        this.dataLimite = dataLimite;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }
}