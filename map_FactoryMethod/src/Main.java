import factory.SanduicheFactory;
import factoryConcreto.*;
import produto.Sanduiche;

public class Main {

    public static void main(String[] args) {

        SanduicheFactory tradicionalFactory = new SanduicheTradicional();
        SanduicheFactory fitFactory = new SanduicheFit();
        SanduicheFactory queijoFactory = new SanduicheQueijo();

        Sanduiche tradicional = tradicionalFactory.criarSanduiche();
        Sanduiche fit = fitFactory.criarSanduiche();
        Sanduiche queijo = queijoFactory.criarSanduiche();

        System.out.println("Montagem do (*) Sanduíche Tradicional (*) :");

        System.out.println("Fatia 1 de pão: " + tradicional.getPaoFatia1().tipo());
        System.out.println("Queijo: " + tradicional.getQueijo().tipo());
        System.out.println("Presunto: " + tradicional.getPresunto().tipo());
        System.out.println("Ovo: " + tradicional.getOvo().tipo());
        System.out.println("Tomate: " + tradicional.getTomate().tipo());
        System.out.println("Fatia 2 de pão: " + tradicional.getPaoFatia2().tipo());

        System.out.println();

        System.out.println("Montagem do (*)Sanduíche Fit (*) :");

        System.out.println("Fatia 1 de pão: " + fit.getPaoFatia1().tipo());       
        System.out.println("Queijo: " + fit.getQueijo().tipo());
        //System.out.println("Presunto: " + fit.getPresunto().tipo());
        System.out.println("Ovo: " + fit.getOvo().tipo());
        System.out.println("Tomate: " + fit.getTomate().tipo());
        System.out.println("Fatia 2 de pão: " + fit.getPaoFatia2().tipo());
        
        
        System.out.println();
        
        System.out.println("Montagem do (*) Sanduíche Queijo (*) :");

        System.out.println("Fatia 1 de pão: " + queijo.getPaoFatia1().tipo());
        System.out.println("Queijo: " + queijo.getQueijo().tipo());
        System.out.println("Tomate: " + queijo.getTomate().tipo());
        System.out.println("Fatia 2 de pão: " + queijo.getPaoFatia2().tipo());
    }
}