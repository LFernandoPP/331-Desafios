package desafio01.projeto03;
public class prj03 {
    public static void main(String[] args) {
        Pessoa[] p=new Pessoa[5];
        Pessoa[] p2=new Pessoa[5];

        p[0]=new Pessoa("Dilma",57);
        p[1]=new Pessoa("Queen",22);
        p[2]=new Pessoa("Cabra",18);
        p[3]=new Pessoa("Sorvete",1);
        p[4]=new Pessoa("Queijo",17);
        p2[0]= new Pessoa("asd",23);
   //      System.out.println("\n---Todas as idades---");
   //     for (int i = 0; i < p.length; i++) {
   //         p[i].listarTodos();
   //     }
        System.out.println("\n---Menores de idade---");
        for (int i = 0; i < p.length; i++) {
            p[i].listarMenores();
        }
        System.out.println("\n---Maiores de idade---");
        for (int i = 0; i < p.length; i++) {
            p[i].listarMaiores();
        }

        System.out.println("\n---Todas as idades---");
        for (int i = 0; i < p.length; i++) {

       }

      //  for (int i = 0; i < p.length; i++) {
       //     p[0].cancelar();
      //  }
    }
}