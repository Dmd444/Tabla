package com.dmd.tabla;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtNumero;
    @FXML private TextArea txtTabla;

    private TablaMultiplicar tablaObj;

    @FXML
    public void calcular() {
        int numero = Integer.parseInt(txtNumero.getText());
        String resultadoTemp = "";

        for (int i = 1; i <= 10; i++) {
            int multiplicacion = numero * i;
            resultadoTemp = resultadoTemp + numero + "x" + i + " = " + multiplicacion + "\n";
        }

        tablaObj = new TablaMultiplicar(numero, resultadoTemp);
        txtTabla.setText(tablaObj.getResultado());
    }

    @FXML
    public void limpiar() {
        txtNumero.setText("");
        txtTabla.setText("");
        tablaObj = null;
    }
}
