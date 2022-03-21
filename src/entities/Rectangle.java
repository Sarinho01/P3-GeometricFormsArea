package entities;

public class Rectangle extends TriangleRectangle{
    private Double baseSide;
    private Double lateralSide;

    public Rectangle(Double baseSide, Double lateralSide) {
        super(baseSide, lateralSide);
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
