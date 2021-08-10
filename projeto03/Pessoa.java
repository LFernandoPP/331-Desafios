package desafio01.projeto03;

public class Pessoa {
    private String nome;
    private int idade;


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
   // public void cancelar(prj03 p[]){
   //     for (int i = 0; i <p.length; i++) {
    //        System.out.println(nome+idade);
   //     }
   // }

    public String listarTodos(Pessoa p[]) {
        System.out.println("Nome: " + nome + "\nIdade= " + idade);
        System.out.println("\n---Todas as idades---");
        for (int i = 0; i <p.length; i++) {

            System.out.println(nome+idade);
        }return nome+idade;
    }

    public void listarMaiores() {
        if (idade >= 18) {
            System.out.println("Nome: " + nome + "\nIdade= " + idade);
        }
    }

    public void listarMenores() {
        if (idade < 18) {
            System.out.println("Nome: " + nome + "\nIdade= " + idade);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}