package exercicio1oo.classes;

public class TesteLivro
{
    public static void main(String[] args)
    {
        Livro livro1 = new Livro();
        livro1.autor= "J K Rolling";
        livro1.titulo= "Harry Potter";
        livro1.genero= "Fantasia";
        livro1.emprestado= true;
        System.out.println("Livro 1: " + livro1.autor );
        System.out.println("Livro 1: " + livro1.titulo );
        System.out.println("Livro 1: " + livro1.genero );
        System.out.println("Livro 1: " + livro1.emprestado);
    }
}
