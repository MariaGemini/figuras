package ar.com.ada.figuras.subclass;

import ar.com.ada.figuras.abst.Figura;

import java.util.Objects;

public class Triangulo extends Figura {

    private Double b;
    private Double h;

    public Triangulo() {

    }

    public Triangulo(double b, double h) {
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
    public double calculaArea() {
        area = (b * h) / 2;
        return area;
    }

    @Override
    public String toString() {
        return "Triangulo" +
                " Base: " + b +
                " Altura: " + h +
                " Área: " + area;
    }

    @Override
    public boolean equals(Object obj) {
//        misma referencia
        if (this == obj) {
            return true;
        }
//        misma clase
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
//        casting obj
        Triangulo that = (Triangulo) obj;
        return super.equals(that) &&
        this.b.equals(that.b) && this.h.equals(that.h);
    }

        @Override
        public int hashCode () {

            return -50 * Objects.hash(this.b, this.h);
        }


}

