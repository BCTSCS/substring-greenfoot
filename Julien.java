public class Julien {
    private String month;
    private int day;
    private String gift;
    public Julien(String gift) {
        this.gift = gift;
    }
    public String getGift() {
        return gift;
    }
    public void setGift(String gift) {
        this.gift = gift;
    }
    public String toString() {
        return "Julien's birthday is " + month + " " + day + " and the gift is " + gift;
    }
}