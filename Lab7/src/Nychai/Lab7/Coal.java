package Nychai.Lab7;

public class Coal implements Data{
    private int price;
    private double weight;
    private String placeOfMining;

    Coal(int price,double weight, String placeOfMining){
        this.price=price;
        this.weight=weight;
        this.placeOfMining=placeOfMining;
    }

    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight;}

    public String getPlaceOfMining() {return placeOfMining;}
    public void setPlaceOfMining(String placeOfMining) {this.placeOfMining = placeOfMining;}

    public int getPrice() {return price;}
    public int compareTo(Data p) {
        Integer s = price;
        return s.compareTo(p.getPrice());
    }

    public void print(){
        System.out.println("Weight is " + weight + "\tPrice is " + price + "\tPlace of mining "+ placeOfMining);
    }
}
