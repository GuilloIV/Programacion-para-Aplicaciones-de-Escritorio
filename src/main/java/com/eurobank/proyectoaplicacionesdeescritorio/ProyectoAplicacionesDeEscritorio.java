
package com.eurobank.proyectoaplicacionesdeescritorio;

import com.eurobank.proyectoaplicacionesdeescritorio.vista.ManejadorDeVistas;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class ProyectoAplicacionesDeEscritorio extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        ManejadorDeVistas.obtenerInstancia().abrirVistaEnNuevaVentana(ManejadorDeVistas.Vista.LOGIN, "INICIO DE SESIÓN");
    }
}
