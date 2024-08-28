package br.com.dio.bootcamp.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@EqualsAndHashCode
public class Mentoria extends Conteudo{


    private LocalDateTime data;

    public Mentoria(){
        data = LocalDateTime.now();
    }
    @Override
    public Double calcularXP() {
        return XP + 20;
    }

    @Override
    public String toString() {
        return String.format("Mentoria: \ntitulo: %s \ndescricao: %s \ndata: %s \nXP: %.2f", getTitulo(), getDescricao(), data, calcularXP());
    }
}
