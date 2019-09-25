
package servicios;


public class CalcuService {
    public double resultado = 0.0;
    public Double Operar(Double nro1,Double nro2, char ope){
        switch(ope){
               case'+': resultado =  (nro1 + nro2); break;
               case'-': resultado =  (nro1 - nro2); break;
               case'*': resultado =  (nro1 * nro2); break;
               case'/': resultado =  (nro1 / nro2); break;
        }
        return resultado;
}

    public Double operar(Double nro1, Double nro2, char ope) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
