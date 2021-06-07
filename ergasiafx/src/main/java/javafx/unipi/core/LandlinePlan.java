package javafx.unipi.core;

public class LandlinePlan extends Plan {
    private int lineSpeed ; 
    private String lineType ; 
    public LandlinePlan(int uniCode , String company , int callMinutes , double programCost , int lineSpeed , String lineType) {
        super(uniCode , company , callMinutes , programCost ) ;
        this.lineSpeed = lineSpeed ;
        this.lineType = lineType ; 
    }
    public int getLineSpeed() {
        return lineSpeed;
    }
    public void setLineSpeed(int lineSpeed) {
        this.lineSpeed = lineSpeed;
    }
    public String getLineType() {
        return lineType;
    }
    public void setLineType(String lineType) {
        this.lineType = lineType;
    }
}  