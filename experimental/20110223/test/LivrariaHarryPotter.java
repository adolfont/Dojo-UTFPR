/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adolfo
 */
class LivrariaHarryPotter {

    public double comprar(int[] quantidades) {
        double ret = 0.0;
        int cnt;
        while((cnt = contagemEdicao(quantidades)) > 0) {
            ret = ret + 42*cnt*(1 - (cnt - 1)*0.05);
        }

        return ret;
    }

    public int contagemEdicao(int[] listaDeCompras) {
        int i, cont = 0;
        for (i = 0; i < listaDeCompras.length; i++) {
            if (listaDeCompras[i] > 0 && cont < 5) {

                --listaDeCompras[i];
                cont++;

            }
        }
        return cont;
    }
}
