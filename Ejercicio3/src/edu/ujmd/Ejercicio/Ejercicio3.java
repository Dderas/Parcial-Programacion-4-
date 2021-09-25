/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.Ejercicio;

import edu.ujmd.Clases.Alumno;
import java.util.Scanner;

/**
 *
 * @author chele
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        String Nombre;
        String Apellido;
        String Aprobado = "Aprobastes";
        String Reprobado = "Reprobastes";
        String Graduado = "Felicidades te has Graduado!";
        String Reposicion = "Realizar examen de Reposicion.";
        String Estado = "";
        String NomMateria;
        double Nota1 = 0;
        double Nota2 = 0;
        double Nota3 = 0;
        double Nota4 = 0;
        double Nota5 = 0;
        double NotaT = 0;
        int cont = 0;
        String NuevoEstado = "";
        int Grado;

        // Construimos el arrelgo 
        Alumno[] Alumnos = new Alumno[5];

        //Llenamos los slots del arreglo
        for (int i = 0; i < Alumnos.length; i++) {
            Scanner reader = new Scanner(System.in);
            System.out.println("-Ingrese los Alumnos-");
            System.out.println("--------------------------------");
            System.out.println("Digite el nombre del Alumno:");
            Nombre = reader.next();
            System.out.println("Digite el Apellido del Alumno:");
            Apellido = reader.next();
            System.out.println("Digite la materia:");
            NomMateria = reader.next();
            System.out.println("Grado:");
            Grado = reader.nextInt();
            // Condicion notas no negativas
            do {
                System.out.println("Digite Nota 1:");
                Nota1 = reader.nextDouble();
                System.out.println("Digite Nota 2:");
                Nota2 = reader.nextDouble();
                System.out.println("Digite Nota 3:");
                Nota3 = reader.nextDouble();
                System.out.println("Digite Nota 4:");
                Nota4 = reader.nextDouble();
                System.out.println("Digite Nota 5:");
                Nota5 = reader.nextDouble();

            } while (Nota1 < 0 || Nota2 < 0 || Nota3 < 0 || Nota4 < 0 || Nota5 < 0);

            Alumnos[i] = new Alumno(Nombre, Apellido, NomMateria, Aprobado, Reprobado, Graduado, Reposicion, Estado, NuevoEstado, Grado, Nota1, Nota2, Nota3, Nota4, Nota5, NotaT);

            //Porcentaje de nota correspondiente
            Nota1 = Nota1 * 0.15;
            Nota2 = Nota2 * 0.10;
            Nota3 = Nota3 * 0.20;
            Nota4 = Nota4 * 0.30;
            Nota5 = Nota5 * 0.25;

            //Sumatorio de actividades para sacar nota final 
            Alumnos[i].NotaT = (Nota1 + Nota2 + Nota3 + Nota4 + Nota5);

            //Almacenar notas a cada alumno
            if (Alumnos[i].NotaT < 50) {

                if (Alumnos[i].NotaT >= 6.50 && Alumnos[i].NotaT <= 6.99) {
                    Alumnos[i].Estado = Reposicion;
                    
                } else if (Alumnos[i].Grado == 10) {
                    Alumnos[i].NuevoEstado = Graduado;
                    

                    
                } else if (Alumnos[i].NotaT >= 7.0) {
                    Alumnos[i].Estado = Aprobado;
                    Alumnos[i].Grado++;

                } else if (Alumnos[i].NotaT <= 5.0) {
                    Alumnos[i].Estado = Reprobado;
                }
            }
        }
        for (int i = 0; i < Alumnos.length; i++) {
            System.out.println("--------------------------------");
            System.out.println("Nombre: " + Alumnos[i].getNombre());
            System.out.println("Apellidos: " + Alumnos[i].getApellido());
            System.out.println("Nombre de materia: " + Alumnos[i].getNomMateria());
            System.out.println("Nota 1: " + Alumnos[i].getNota1());
            System.out.println("Nota 2: " + Alumnos[i].getNota2());
            System.out.println("Nota 3: " + Alumnos[i].getNota3());
            System.out.println("Nota 4: " + Alumnos[i].getNota4());
            System.out.println("Nota 5: " + Alumnos[i].getNota5());
            System.out.println("La nota total es: " + Alumnos[i].getNotaT());
                    
            if (Alumnos[i].Grado < 10) {
                System.out.println("Estado del alumno:" + Alumnos[i].getEstado());
                System.out.println("El grado a cursar es:" + Alumnos[i].getGrado());
            } else {
                System.out.println(Alumnos[i].NuevoEstado);
            }
        }
    }
}
