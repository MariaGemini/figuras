package ar.com.ada.figuras.subclass;

import ar.com.ada.figuras.abst.Figura;

import java.util.Objects;

public class Triangulo extends Figura {

    private double b;
    private double h;

    public Triangulo(){

    }

    public Triangulo(double b, double h){
        this.b = b;
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calculaArea(){
        area = (b * h) / 2;
      return area;
      }

    @Override
    public String toString() {
        return "Triangulo"  +
                " Base: " + b +
                " Altura: " + h +
                " Área: " + area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangulo triangulo = (Triangulo) o;
        return Double.compare(triangulo.getB(), getB()) == 0 &&
                Double.compare(triangulo.getH(), getH()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getB(), getH());
    }
}

