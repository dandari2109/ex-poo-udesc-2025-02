package exercicio1oo.classes;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno dandari = new Aluno();
        dandari.matricula = "Cesmo-42";
        dandari.nome = " Dandari Rossi";
        dandari.idade = 36;
        dandari.nota1 = 8;
        dandari.nota2 = 9;
        dandari.nota3 = 10;
        dandari.nota4 = 10;
        System.out.println(" matricula " + dandari.matricula  );
        System.out.println("nome" + dandari.nome);
        System.out.println("idade " + dandari.idade);
        System.out.println("nota1 " + dandari.nota1);
        System.out.println("nota2 " + dandari.nota2);

        System.out.println("nota3 " + dandari.nota3);
        System.out.println("nota4 " + dandari.nota4);

    }
}
