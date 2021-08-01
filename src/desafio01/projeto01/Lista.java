package desafio01.projeto01;
public class Lista {
    public static void main(String[] args) {
        String[] nome = new String[4];
        int[] idade={18,15,23,17};
        nome[0] = "A";
        nome[1] = "B";
        nome[2] = "C";
        nome[3] = "D";
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Nome: "+nome[i]+"\nIdade: "+idade[i]);
        }
        System.out.println("_________________");
        for (int i = 0; i < nome.length; i++) {
            if (idade[i] >=18){
                System.out.println("Nome: "+nome[i]+"\nIdade: "+idade[i]);
            }
        }
    }
}