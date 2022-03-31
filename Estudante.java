public class Estudante {

    // region private props
    private String nome;
    private double nota1;
    private double nota2;
    // endregion

    // region constructores
    public Estudante() {

    }

    public Estudante(String nome) {
        this.nome = nome;
    }
    // endregion

    // region Gets

    public String getNome() {
        return this.nome;
    }

    public double getNota1() {
        return this.nota1;
    }

    public double getNota2() {
        return this.nota2;
    }
    // endregion

    // region sets
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
}
