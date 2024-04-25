/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veterianaria;

/**
 *
 * @author USER
 */
public class VeterinariaMascotita {
    private String dniDueno;
    private String nombreDueno;
    private String nombreMascota;
    private String enfermedadMascota;

    // Constructor vacío
    public VeterinariaMascotita() {
    }

    // Constructor lleno
    public VeterinariaMascotita(String dniDueno, String nombreDueno, String nombreMascota, String enfermedadMascota) {
        this.dniDueno = dniDueno;
        this.nombreDueno = nombreDueno;
        this.nombreMascota = nombreMascota;
        this.enfermedadMascota = enfermedadMascota;
    }

    // Getters y Setters
    public String getDniDueno() {
        return dniDueno;
    }

    public void setDniDueno(String dniDueno) {
        this.dniDueno = dniDueno;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getEnfermedadMascota() {
        return enfermedadMascota;
    }

    public void setEnfermedadMascota(String enfermedadMascota) {
        this.enfermedadMascota = enfermedadMascota;
    }

    // Método toString()
    @Override
    public String toString() {
        return "DNI del Dueño: " + dniDueno + "\n"
                + "Nombre del Dueño: " + nombreDueno + "\n"
                + "Nombre de la Mascota: " + nombreMascota + "\n"
                + "Enfermedad de la Mascota: " + enfermedadMascota + "\n"
                + "------------------------------------\n";
    }
}