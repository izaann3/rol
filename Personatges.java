package rol;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import java.utils.ArrayList;
import java.utils.List;

class Parser {
    public static void main(String[] args) {
        System.out.println("Leyendo los datos del XML");
        howToReadXML();

        System.out.println("Extrayendo los datos del XML");
        howToExtractDataFromXML();
    }

    private static void howToReadXML() {

    }

    private static void howToExtractDataFromXML() {

    }
}

class Personatges {
    private String nombre;
    private int nivel;
    private int puntosDeVida;
    private int puntosDeMana;
    private String arma;
    private String armadura;

    public Personatges(String nombre, int nivel, int puntosDeVida, int puntosDeMana, String arma, String armadura) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
        this.puntosDeMana = puntosDeMana;
        this.arma = arma;
        this.armadura = armadura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public int getPuntosDeMana() {
        return puntosDeMana;
    }

    public String getArma() {
        return arma;
    }

    public String getArmadura() {
        return armadura;
    }
}
