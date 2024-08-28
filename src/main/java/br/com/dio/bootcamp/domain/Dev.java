package br.com.dio.bootcamp.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos;
    private Set<Conteudo> conteudosConcluidos;

    public Dev(){
        conteudosInscritos =  new LinkedHashSet<>();
        conteudosConcluidos = new LinkedHashSet<>();
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.adicionarInscrito(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
          conteudosConcluidos.add(conteudo.get());
          conteudosInscritos.remove(conteudo.get());
        }
    }

    public Double calcularXp() {
        return conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXP).sum();
    }


}
