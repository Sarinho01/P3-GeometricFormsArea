package entities;

import interfaces.GeometricForm;

public class TriangleScalene implements GeometricForm {

    private Double aSide;
    private Double bSide;
    private Double cSide;

    public TriangleScalene(Double aSide, Double bSide, Double cSide){
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    public Double getaSide() {
        return aSide;
    }

    public void setaSide(Double aSide) {
        this.aSide = aSide;
    }

    public Double getbSide() {
        return bSide;
    }

    public void setbSide(Double bSide) {
        this.bSide = bSide;
    }

    public Double getcSide() {
        return cSide;
    }

    public void setcSide(Double cSide) {
        this.cSide = cSide;
    }

    @Override
    public Double CalculateArea() {
        Double semiPerimeter = (aSide+bSide+cSide) / 2;
        Double area = Math.sqrt(semiPerimeter*(semiPerimeter-aSide)*(semiPerimeter-bSide)*(semiPerimeter-cSide));
        return area;
    }
}
