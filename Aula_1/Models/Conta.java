package Aula_1.Models;

public class Conta {

    // region private props
    private int numConta;
    private String nome;
    private double saldo;
    // endregion

    // region constructores
    public Conta() {

    }

    public Conta(int numConta, String nome) {
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = 0;
    }
    // endregion

    // region Gets
    public int getNumConta() {
        return this.numConta;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSaldo() {
        return this.saldo;
    }
    // endregion

    // region sets
    public void SetNumConta(int value) {
        this.numConta = value;
    }

    public void SetNome(String value) {
        this.nome = value;
    }

    public void Setsaldo(double value) {
        this.saldo = value;
    }
    // endregion

    // region publics methods
    public void deposit(double value) {
        this.saldo = this.saldo + value;
    }

    public boolean withdraw(double value) {

        if (getSaldo() < value) {

            return false;

        } else {

            this.saldo = this.saldo - value;

            return true;
        }

    }

    public boolean transfer(Conta destinationAccount, double value) {
        if (getSaldo() < value) {

            return false;

        } else {

            destinationAccount.deposit(value);
            this.withdraw(value);
            return true;
        }
    }

    // endregion

    // region Method to string
    public String toString() {
        return this.numConta + " - " + this.nome + " - " + this.saldo;
    }

    public boolean equals(Conta obj) {
        if (this.numConta == obj.numConta) {
            return true;
        } else {
            return false;
        }
    }
    // endregion
}
