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
         HACER ESTOS EJERCICIOS SIN ALMACEAR LOS BYTES EN UN ARRAYLIST
         */
        /*
         A) partindo do que aprendiches no exercicio anterior ( copybytestexto )
         saberias copiar  o contido dun arquivo .jpg noutro ? . Comprobao copiando
         a  imaxe foto.jpg que se achega  nun arquivo que se denomine foto2.jpg .
         Canto ocupa foto2.jpg ? ocupa o mesmo que a imaxe orixinal ?
         */
//        FileInputStream leer1 = null;
//        FileOutputStream escribir1 = null;
//        int bytes = 0;
//        try {
//            leer1 = new FileInputStream("/home/oracle/Desktop/ex3/foto.jpg");
//
//            escribir1 = new FileOutputStream("/home/oracle/Desktop/ex3/foto2.jpg");
//
//            while (bytes != -1) {
//
//                try {
//                    bytes = leer1.read();
//
//                    escribir1.write(bytes);
//                } catch (IOException ex) {
//                    Logger.getLogger(Ex3_copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Ex3_copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//
//            try {
//                leer1.close();
//                escribir1.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Ex3_copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
//            }
            /*
         B)executa por segunda vez a aplicacion para que se engada de novo a
         imaxe foto.jpg  á imaxe foto2.jpg. ¿que ocorre se abrimos a imaxe, vese
         a imaxe repetida? , Canto ocupa agora o arquivo foto2.jpg?
         */
//        FileInputStream leer1 = null;
//        FileOutputStream escribir1 = null;
//        int bytes = 0;
//        try {
//            leer1 = new FileInputStream("/home/oracle/Desktop/ex3/foto.jpg");
//
//            escribir1 = new FileOutputStream("/home/oracle/Desktop/ex3/foto2.jpg", true);
//
//            while (bytes != -1) {
//
//                try {
//                    bytes = leer1.read();
//
//                    escribir1.write(bytes);
//                } catch (IOException ex) {
//                    Logger.getLogger(Ex3_copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Ex3_copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//
//            try {
//                leer1.close();
//                escribir1.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Ex3_copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
//            }

        /*
         C) copybytesimage2
         leer texto del ejercicio
         Para usar los Buffered, desactivamos el código anteror de los
         input/output sin buffer
         */
        FileInputStream leer2 = null;
        BufferedInputStream leerBuffer = null;
        FileOutputStream escribir2 = null;
        BufferedOutputStream escribirBuffer = null;
        int bytes2 = 0;

        try {

            leer2 = new FileInputStream("/home/oracle/Desktop/ex3/foto.jpg");
            leerBuffer = new BufferedInputStream(leer2);
            escribir2 = new FileOutputStream("/home/oracle/Desktop/ex3/foto2.jpg");
            escribirBuffer = new BufferedOutputStream(escribir2);

            while (bytes2 != -1) {

                try {
                    bytes2 = leerBuffer.read();
                    escribirBuffer.write(bytes2);

                } catch (IOException ex) {
                    Logger.getLogger(Ex3_copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ex3_copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                escribir2.close();

                escribirBuffer.close();
                leer2.close();
                leerBuffer.close();
            } catch (IOException ex) {
                Logger.getLogger(Ex3_copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
