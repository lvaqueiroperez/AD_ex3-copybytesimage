/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_copybytesimage;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
//Para trabajar con ficheros binarios:
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

/**
 *
 * @author oracle
 */
public class Ex3_copybytesimage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
         A) partindo do que aprendiches no exercicio anterior ( copybytestexto )
         saberias copiar  o contido dun arquivo .jpg noutro ? . Comprobao copiando
         a  imaxe foto.jpg que se achega  nun arquivo que se denomine foto2.jpg .
         Canto ocupa foto2.jpg ? ocupa o mesmo que a imaxe orixinal ?
         */
        FileInputStream leer1 = null;
        ArrayList<Integer> listaBytes1 = new ArrayList<>();
        int valByte = 0;

        try {
            leer1 = new FileInputStream("/home/oracle/Desktop/ex3/foto.jpg");

            while (valByte != -1) {

                try {
                    valByte = leer1.read();
                    listaBytes1.add(valByte);
                } catch (IOException ex) {
                    Logger.getLogger(Ex3_copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            {

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ex3_copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                leer1.close();
            } catch (IOException ex) {
                Logger.getLogger(Ex3_copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        //escritura
//        FileOutputStream escribir1 = null;
//
//        try {
//            escribir1 = new FileOutputStream("/home/oracle/Desktop/ex3/foto2.jpg");
//
//            for (Integer z : listaBytes1) {
//
//                try {
//                    escribir1.write(z);
//                } catch (IOException ex) {
//                    Logger.getLogger(Ex3_copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
//                }
//
//            }
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Ex3_copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//
//            try {
//                escribir1.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Ex3_copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }

        /*
         B)executa por segunda vez a aplicacion para que se engada de novo a 
         imaxe foto.jpg  á imaxe foto2.jpg. ¿que ocorre se abrimos a imaxe, vese 
         a imaxe repetida? , Canto ocupa agora o arquivo foto2.jpg?         
         */
//        FileOutputStream escribir1 = null;
//
//        try {
//            escribir1 = new FileOutputStream("/home/oracle/Desktop/ex3/foto2.jpg", true);
//
//            for (Integer z : listaBytes1) {
//
//                try {
//                    escribir1.write(z);
//                } catch (IOException ex) {
//                    Logger.getLogger(Ex3_copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
//                }
//
//            }
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Ex3_copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//
//            try {
//                escribir1.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Ex3_copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }
        
    /*
       C) copybytesimage2 
        leer texto del ejercicio
        
        */
        
        BufferedInputStream leerConBuffer = null;
        
        leerConBuffer = new BufferedInputStream(leer1);
        
        
        
        

    }

}
