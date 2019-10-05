package ar.com.ada.figuras.subclass;

import ar.com.ada.figuras.abst.Figura;

import java.util.Objects;

public class Circulo extends Figura {
    private double radio;

    public Circulo(){

    }

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculaArea(){
         area = Math.PI * Math.pow(radio,2);
        return area;

    }

    @Override
    public String toString() {
        return "Circulo " +
                " Radio: " + radio +
                " Área: " + area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circulo circulo = (Circulo) o;
        return Double.compare(circulo.getRadio(), getRadio()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadio());
    }
}
