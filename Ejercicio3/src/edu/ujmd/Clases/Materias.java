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
public class Materias {

    public String NomMateria;
    public double Nota1 = 0;
    public double Nota2 = 0;
    public double Nota3 = 0;
    public double Nota4 = 0;
    public double Nota5 = 0;
    public double NotaT = 0;

    public Materias() {
        Nota1 = 0;
        Nota2 = 0;
        Nota3 = 0;
        Nota4 = 0;
        Nota5 = 0;
        NotaT = 0;
    }

    public Materias(String NomMaterias, String Aprobado) {
        this.NomMateria = NomMaterias;
    }

    public String getNomMateria() {
        return NomMateria;
    }

    public void setNomMateria(String NomMateria) {
        this.NomMateria = NomMateria;
    }

    public double getNota1() {
        return Nota1;
    }

    public void setNota1(double Nota1) {
        this.Nota1 = Nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNota2(double Nota2) {
        this.Nota2 = Nota2;
    }

    public double getNota3() {
        return Nota3;
    }

    public void setNota3(double Nota3) {
        this.Nota3 = Nota3;
    }

    public double getNota4() {
        return Nota4;
    }

    public void setNota4(double Nota4) {
        this.Nota4 = Nota4;
    }

    public double getNota5() {
        return Nota5;
    }

    public void setNota5(double Nota5) {
        this.Nota5 = Nota5;
    }

    public double getNotaT() {
        return NotaT;
    }

    public void setNotaT(double NotaT) {
        this.NotaT = NotaT;
    }

}
