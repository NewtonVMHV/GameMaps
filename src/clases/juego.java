/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Random;

/**
 *
 * @author Estudiante
 */
public class juego {
    private static String rCorrecta;
    private static String pregunta;
    private static String rEleccion;
    public static int nivel = 0;
    
    public static int puntaje = 0;
    public static int vidas = 3;
    
    public String[] pptEleccion = new String[3];
    public juego(){
    pptEleccion[0] = "Piedra";
    pptEleccion[1] = "Papel";
    pptEleccion[2] = "Tijera";
    }
    public static int resultadoPpt(String EleccionJ1, String EleccionJ2){
        String p = "Piedra";
        String pa = "Papel";
        String t = "Tijera";
        int r=0;
        switch(EleccionJ1){
            case "Piedra":
                if (EleccionJ2 == t) {
                    r = 1;
                }
                else if (EleccionJ2 == pa) {
                    r = -1;
                }
                else{
                    return 0;    
                }
            break;
            case "Papel":
                if (EleccionJ2 == p) {
                    r = 1;
                }
                else if (EleccionJ2 == t) {
                    r = -1;
                }
                else{
                    r = 0;
                }
            break;
            case "Tijera":
                if (EleccionJ2 == pa) {
                    r = 1;
                }
                else if (EleccionJ2 == p ) {
                    r = -1;
                }
                else{
                    r = 0;
                }
            break;
        }
        return r;
    }
    public static String eleccionJuegoPpt(){
        Random a = new Random();
        int eleccion = a.nextInt(3);
        juego j = new juego();
        return j.pptEleccion[eleccion];
    }
    public static boolean comprobarRespuesta(){
        return rEleccion.equals(rCorrecta);
    }
    public static String getEleccion() {
        return rEleccion;
    }
    public static void setEleccion(String eleccion) {
        juego.rEleccion = eleccion;
    }
    public static String getCorrecta() {
        return rCorrecta;
    }

    public static void setCorrecta(String correcta) {
        juego.rCorrecta = correcta;
    }
}
