package ar.com.ada.figuras.abst;

import java.util.Objects;

public abstract class Figura {

    protected Double area;

    public abstract double calculaArea();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Figura that = (Figura) obj;
        return this.area.equals(that.area);
    }

    @Override
    public int hashCode() {
        return -25 * Objects.hash(this.area);
    }
}
