public class Dominic_Mosca {
    private String month;
    private int day;
    private String gift;

    public Dominic_Mosca(String gift){
        this.month = "May";
        this.day = 23;
        this.gift = gift;

    }
    public String getGift(){
        return gift;
    }
    public void setGift(String gift){
        this.gift = gift;
    }

    public String toString(){
        return "Name: Dominic Mosca, Birth Month: " + month + ", Day: " + day + ", Gift: " + gift; 
    }

    public static void main(String[] args) {
        Dominic_Mosca mosca = new Dominic_Mosca("Computer Science Potluck");
        System.out.println(mosca.toString());
    }

}
