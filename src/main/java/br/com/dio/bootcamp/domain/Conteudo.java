package br.com.dio.bootcamp.domain;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conteudo {
    protected static final Double XP = 10d;
    private String titulo;
    private String descricao;

    public abstract Double calcularXP();
}
