package br.com.dio.bootcamp.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Curso extends Conteudo{


    private Integer cargaHoraria;

    public Curso() {
    }

    @Override
    public Double calcularXP() {
        return XP * cargaHoraria;
    }

    @Override
    public String toString() {
        return String.format("Curso: \ntitulo: %s \ndescricao: %s \ncarga horaria: %d \nXP: %.2f", getTitulo(), getDescricao(), cargaHoraria, calcularXP());
    }
}
