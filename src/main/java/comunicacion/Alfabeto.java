package comunicacion;

public class Alfabeto extends Pictograma{
    private static String[] letras ;
    private String interpretacion;
    public Alfabeto(String origen,String[] letras, String interpretacion){
        super(origen);
        Alfabeto.letras =letras;
        this.interpretacion = interpretacion;

    }
    public int cantidadLetras(){
        int contador=0;
        for (int i =0;i< Alfabeto.letras.length;i++) {
            if (Alfabeto.letras[i] != null) {
                contador+=1;
            }
        }
        return contador;
    }
    public String interpretacion(){
        return this.interpretacion;
        /*  */
    }

    @Override
    public String toString() {
        return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
