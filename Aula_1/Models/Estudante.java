package Aula_1.Models;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Estudante {

    // region private props

    private int number;
    private String nome;
    private double nota1;
    private double nota2;
    private double average;

    // endregion

    // region constructores
    public Estudante() {

    }

    public Estudante(String nome) {
        this.nome = nome;
    }
    // endregion

    // region Gets
    public int getNumber() {
        return this.number;
    }

    public String getNome() {
        return this.nome;
    }

    public double getNota1() {
        return this.nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public double getaverage() {
        return this.average;
    }

    // endregion

    // region sets

    public void SetNumber(int value) {
        this.number = value;
    }

    public void SetNome(String value) {
        this.nome = value;
    }

    public void SetNota1(Double value) {
        this.nota1 = value;
    }

    public void SetNota2(Double value) {
        this.nota2 = value;
    }
    // endregion

    // region publics methods
    public void CalcAverage(double nota1, double nota2) {

        OptionalDouble result = DoubleStream.of(nota1, nota2).average();
        this.average = result.orElse(-1);
    }

    public String toString() {
        return " Numero: " + this.number + " Nome: " + this.nome + " - " + " Nota: " + this.average;
    }
    // endregion
}
