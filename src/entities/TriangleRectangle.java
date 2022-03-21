package entities;

import interfaces.GeometricForm;

public class TriangleRectangle implements GeometricForm {
    private Double aSide;
    private Double bSide;

    public TriangleRectangle(Double aSide, Double bSide){
        this.aSide = aSide;
        this.bSide = bSide;
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

    @Override
    public Double CalculateArea() {
        return (aSide * bSide) / 2;

    }
}
