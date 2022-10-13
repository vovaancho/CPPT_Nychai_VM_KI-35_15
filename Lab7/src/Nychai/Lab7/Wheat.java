package Nychai.Lab7;

public class Wheat implements Data {
    private String sortOfWheat;
    private int price;
    Wheat(int price, String sortOfWheat){
        this.price=price;
        this.sortOfWheat=sortOfWheat;
    }

    public String getSortOfWheat() {return sortOfWheat;}
    public void setSortOfWheat(String sortOfWheat) {this.sortOfWheat = sortOfWheat;}

    public int getPrice() {return 0;}
    public void setPrice(int price) {this.price = price;}

    public int compareTo(Data p) {
        Integer s = price;
        return s.compareTo(p.getPrice());
    }
    public void print(){
        System.out.println("Sort of wheat is "+ sortOfWheat+"\tPrice is "+price);
    }
}
