package rol;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static void main(String[] args) {
        System.out.println("Leyendo los datos del XML");
        howToReadXML();

        System.out.println("Extrayendo los datos del XML");
        howToExtractDataFromXML();
    }

    private static void howToReadXML() {
        File f = new File("personatges.xml");
        List<Personatges> personatges = new ArrayList<>();

        for (Personatges personatge : personatges) {
            System.out.println(personatge.toString());
        }
        System.out.println("Datos leidos correctamente");
    }

    private static void howToExtractDataFromXML() {

    }
}
