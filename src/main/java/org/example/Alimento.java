package org.example;

public class Alimento {

     private String nombreAlimento;
     private  Integer calorias;

    public Alimento() {
    }

    public Alimento(String nombreAlimento, Integer calorias) {
        this.nombreAlimento = nombreAlimento;
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "nombreAlimento='" + nombreAlimento + '\'' +
                ", calorias=" + calorias +
                '}';
    }
}
