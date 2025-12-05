public class Ravi {
    private String month;
    private int day;
    private String gift;
    public Ravi(String gift){
        this.gift = gift;
        this.month = "January"; 
        this.day = 23;
    }
    public String getGift(){
        return gift;
    }
    public void setGift(String gift){
        this.gift = gift;
    }
    public String ToString(){
        return "Ravi - Month: " + month + ", Day: " + day + ", Gift: " + gift;
    }
}