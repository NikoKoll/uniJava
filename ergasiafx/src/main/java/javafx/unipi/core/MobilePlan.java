package javafx.unipi.core;

public class MobilePlan extends Plan {
    private int SMS ;                           // plithos dorean sms ana mina 
    private int GB ;                            // plithos dorean dedomenon ana mina
    public MobilePlan (int uniCode , String company , int callMinutes , double programCost , int SMS ,int GB ) {
        super(uniCode , company , callMinutes , programCost);
        this.SMS = SMS ;
        this.GB = GB ;
    }
    public int getSMS() {
        return SMS;
    }
    public void setSMS(int sMS) {
        SMS = sMS;
    }
    public int getGB() {
        return GB;
    }
    public void setGB(int gB) {
        GB = gB;
    }
	@Override
	public String toString() {
		return "MobilePlan [SMS=" + SMS + ", GB=" + GB + ", toString()=" + super.toString() + "]";
	}
    
    
    
}