package br.com.dio.bootcamp.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
public class Bootcamp {

    private String nome;
    private String descricao;
    private LocalDateTime dataInicial;
    private LocalDateTime dataFinal;
    private Set<Dev> inscritos;
    private Set<Conteudo> conteudos;

    public Bootcamp() {
        dataInicial = LocalDateTime.now();
        dataFinal = dataInicial.plusDays(45);
        inscritos = new HashSet<>();
        conteudos = new LinkedHashSet<>();

    }

    public void adicionarInscrito(Dev dev){
        inscritos.add(dev);
    }

    public void adicionarConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
    }

}
