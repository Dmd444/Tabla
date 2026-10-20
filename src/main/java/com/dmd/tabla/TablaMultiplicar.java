package com.dmd.tabla;

public class TablaMultiplicar {
    
    private int numero;
    private String resultado;

    public TablaMultiplicar() {
    }

    public TablaMultiplicar(int numero, String resultado) {
        this.numero = numero;
        this.resultado = resultado;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getResultado() {
        return resultado;
    }
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "TablaMultiplicar{" + "numero=" + numero + ", resultado=" + resultado + '}';
    }
        
}
