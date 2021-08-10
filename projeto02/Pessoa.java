package desafio01.projeto02;

public class Pessoa {
    private String nome;
    private int idade;

    public void listarMaiores() {
        if (idade>=18) {
            System.out.println("Nome: " + nome + "\nIdade= " + idade);
        }
    }
    public void listarMenores() {
        if (idade<18) {
            System.out.println("Nome: " + nome + "\nIdade= " + idade);
        }
    }

    public String toString() {
        return "Nome: " + nome + "\nIdade= " + idade;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}