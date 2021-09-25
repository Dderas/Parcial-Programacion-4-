/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.Clases;

/**
 *
 * @author chele
 */
public class Alumno extends Materias {

    public String Nombre;
    public String Apellido;
    public String Aprobado;
    public String Reprobado;
    public String Graduado;
    public String Reposicion;
    public String Estado;
    public int Grado;
    public String NuevoEstado;

    public Alumno() {
        Aprobado = "";
        Reprobado = "";
        Graduado = "";
        Reposicion = "";
        NuevoEstado = "";
        Grado = 0;
    }

    public Alumno(String Nombre, String Apellido, String NomMateria, String Aprobado, String Reprobado, String Graduado, String Reposicion, String Estado, String NuevoEstado, int Grado, double Nota1, double Nota2, double Nota3, double Nota4, double Nota5, double NotaT) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.NomMateria = NomMateria;
        this.Aprobado = Aprobado;
        this.Reprobado = Reprobado;
        this.Graduado = Graduado;
        this.Reposicion = Reposicion;
        this.Estado = Estado;
        this.Grado = Grado;
        this.NuevoEstado = NuevoEstado;
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
        this.Nota3 = Nota3;
        this.Nota4 = Nota4;
        this.Nota5 = Nota5;
        this.NotaT = NotaT;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getGrado() {
        return Grado;
    }

    public void setGrado(int Grado) {
        this.Grado = Grado;
    }

    public String getAprobado() {
        return Aprobado;
    }

    public void setAprobado(String Aprobado) {
        this.Aprobado = Aprobado;
    }

    public String getReprobado() {
        return Reprobado;
    }

    public void setReprobado(String Reprobado) {
        this.Reprobado = Reprobado;
    }

    public String getGraduado() {
        return Graduado;
    }

    public void setGraduado(String Graduado) {
        this.Graduado = Graduado;
    }

    public String getReposicion() {
        return Reposicion;
    }

    void setReposicion(String Reposicion) {
        this.Reposicion = Reposicion;
    }


    public String getEstado() {
        return Estado;
    }


    public void setEstado(String Estado) {
        this.Estado = Estado;
    }


    public String getNuevoEstado() {
        return NuevoEstado;
    }

    public void setNuevoEstado(String NuevoEstado) {
        this.NuevoEstado = NuevoEstado;
    }

}
