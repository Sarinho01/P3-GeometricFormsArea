package entities;

public class TriangleIsosceles extends TriangleRectangle{
    private Double baseSide;
    private Double lateralSide;


    public TriangleIsosceles(Double baseSide, Double lateralSide) {
        super((Math.sqrt((4* (lateralSide * lateralSide)) - (baseSide * baseSide))) / 2, baseSide / 2);
        this.baseSide = baseSide;
        this.lateralSide = lateralSide;
    }

    public Double getBaseSide() {
        return baseSide;
    }

    public void setBaseSide(Double baseSide) {
        this.baseSide = baseSide;
    }

    public Double getLateralSide() {
        return lateralSide;
    }

    public void setLateralSide(Double lateralSide) {
        this.lateralSide = lateralSide;
    }

    @Override

    public Double CalculateArea(){
        return super.CalculateArea() * 2;


    }
}
