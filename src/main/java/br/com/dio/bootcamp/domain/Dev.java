package br.com.dio.bootcamp.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos;
    private Set<Conteudo> conteudoConcluidos;

    public Dev(){
        conteudosInscritos =  new LinkedHashSet<>();
        conteudoConcluidos = new LinkedHashSet<>();
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        ;
    }

    public void calcularXp() {

    }


}
