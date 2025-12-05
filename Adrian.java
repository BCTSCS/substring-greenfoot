public class Adrian {
    private String month;
    private int day;
    private String gift;
    

    public Adrian(String gift) {

    }
    public String getGift(){
        return gift;
    }
    public void setGift(String gif) {
        gift = gif;
    }
    public String toString() {
        return "Adrian, " + month + ", " + day + ", " + gift;
    }
    
}