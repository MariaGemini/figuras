package ar.com.ada.figuras.subclass;

import ar.com.ada.figuras.abst.Figura;

import java.util.Objects;

public class Rectangulo extends Figura {

    private Double b;
    private Double h;

    public Rectangulo(){

    }

    public Rectangulo(double b, double h){
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
         area = b * h;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangulo " +
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
        Rectangulo that = (Rectangulo) obj;
        return super.equals(that) &&
                this.b.equals(that.b) && this.h.equals(that.h);
    }

    @Override
    public int hashCode() {
        return -40 * Objects.hash(this.b, this.h);
    }
}
