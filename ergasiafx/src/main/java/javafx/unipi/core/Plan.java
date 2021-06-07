package javafx.unipi.core;

public class Plan {                 // iperklasi
    private int uniCode ;                                               // monadikos kodikos ths etairias  
    private String company ;                                           // i etairia pou parexei to programma 
    private int callMinutes;                                          // plithos lepton dorean kliseon se stathera kai kinita 
    private double programCost ;                                     //kostos tou programmatos 
    Plan(int uniCode , String company , int callMinutes , double programCost) {
        this.uniCode = uniCode ;
        this.company = company ;
        this.callMinutes = callMinutes ;
        this.programCost = programCost ;
    }
    public int getUniCode() {
        return uniCode;
    }
    public void setUniCode(int uniCode) {
        this.uniCode = uniCode;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public int getCallMinutes() {
        return callMinutes;
    }
    public void setCallMinutes(int callMinutes) {
        this.callMinutes = callMinutes;
    }
    public double getProgramCost() {
        return programCost;
    }
    public void setProgramCost(double programCost) {
        this.programCost = programCost;
    }
    
}