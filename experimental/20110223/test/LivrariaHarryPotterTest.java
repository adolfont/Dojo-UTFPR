/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adolfo
 */
public class LivrariaHarryPotterTest {

    public LivrariaHarryPotterTest() {
    }


    LivrariaHarryPotter livraria;

    @Before
    public void setUp() {
        livraria  = new LivrariaHarryPotter();
    }

    @After
    public void tearDown() {
    }

 @Test
   public void compraUmLivro() {

     LivrariaHarryPotter livraria = new LivrariaHarryPotter();
     int [] listaDeCompras = {1,0,0,0,0,0,0};
     assertEquals (42, livraria.comprar(listaDeCompras), 0.000001);

 }

    @Test
    public void compraDoisDif(){
//        LivrariaHarryPotter livraria = new LivrariaHarryPotter();
        double resultado = 84.0*0.95;
        int [] listaDeCompras = {1,1,0,0,0,0,0};
        assertEquals (resultado, livraria.comprar(listaDeCompras),0.000001);
    }

    @Test
    public void compraDoisDifUmIgual(){
//        LivrariaHarryPotter livraria = new LivrariaHarryPotter();
        double resultado = 84.0*0.95+42;
        int [] listaDeCompras = {2,1,0,0,0,0,0};
        assertEquals (resultado, livraria.comprar(listaDeCompras),0.000001);
    }

    @Test
    public void compraTresDifUmIgual(){
//        LivrariaHarryPotter livraria = new LivrariaHarryPotter();
        double resultado = 126.0*0.90+42;
        int [] listaDeCompras = {2,1,1,0,0,0,0};
        assertEquals (resultado, livraria.comprar(listaDeCompras),0.000001);
    }

    @Test
    public void contagemEdicoesDif(){
        int [] listaDeCompras = {2,1,1,0,0,0,0};
        assertEquals (3, livraria.contagemEdicao(listaDeCompras));
    }

    @Test
    public void contagemEdicoesDif5(){
        int [] listaDeCompras = {2,1,1,3,1,0,2};
        assertEquals (5, livraria.contagemEdicao(listaDeCompras));
    }

    @Test
    public void compraTresDifPrimeiroZero(){
//        LivrariaHarryPotter livraria = new LivrariaHarryPotter();
        double resultado = 126.0*0.90+0;
        int [] listaDeCompras = {0,1,1,0,1,0,0};
        assertEquals (resultado, livraria.comprar(listaDeCompras),0.000001);
    }

    @Test
    public void compraDoisDiffMaiorZero(){
//        LivrariaHarryPotter livraria = new LivrariaHarryPotter();
        double resultado = 4*42*0.95;
        int [] listaDeCompras = {0,2,2,0,0,0,0};
        assertEquals (resultado, livraria.comprar(listaDeCompras),0.000001);
    }

    @Test
    public void compraTesteEnunciado(){
        double resultado = 5*42*0.8 + 3*42*0.9;
        int [] listaDeCompras = {2,2,2,1,1,0,0};
        assertEquals (resultado, livraria.comprar(listaDeCompras),0.000001);
    }

    @Test
    public void compraTesteAlternado(){
        double resultado = 10*42*0.8;
        int [] listaDeCompras = {2,1,2,1,2,1,1};
        assertEquals (resultado, livraria.comprar(listaDeCompras),0.000001);
    }

    @Test
    public void compraTesteSeisDif(){
        double resultado = 6*42*0.8;
        int [] listaDeCompras = {1,1,1,1,1,1,0};
        assertEquals (resultado, livraria.comprar(listaDeCompras),0.000001);
    }

}