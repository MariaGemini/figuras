package ar.com.ada.figuras.subclass;

import ar.com.ada.figuras.abst.Figura;

import java.util.Objects;

public class Circulo extends Figura {

    private Double radio;

    public Circulo(){

    }

    public Circulo(Double radio){

        this.radio = radio;
    }

    public Double getRadio() {

        return radio;
    }

    public void setRadio(Double radio) {
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
        Circulo that = (Circulo) obj;
        return super.equals(that) &&
                this.radio.equals(that.radio);
    }

    @Override
    public int hashCode() {
        return -40 * Objects.hash(this.radio);
    }
}
