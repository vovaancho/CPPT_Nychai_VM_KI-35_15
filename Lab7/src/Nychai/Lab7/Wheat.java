package Nychai.Lab7;

/**
 * Class <code>Wheat</code> class describes work and actions with wheat
 * @author  Nychai Volodymyr KI-35
 * @version 1.0
 */

public class Wheat implements Data {
    private String sortOfWheat;
    private int price;
    private int weight;

    /**
     * @param price price of wheat
     * @param weight weight of wheat
     * @param sortOfWheat sort of wheat
     */
    Wheat(int price,int weight, String sortOfWheat){
        this.price=price;
        this.weight=weight;
        this.sortOfWheat=sortOfWheat;
    }

    /**
     * @return sort
     */
    public String getSortOfWheat() {return sortOfWheat;}

    /**
     * method sets sort
     * @param sortOfWheat
     */
    public void setSortOfWheat(String sortOfWheat) {this.sortOfWheat = sortOfWheat;}

    /**
     * @return price
     */
    public int getPrice() {return 0;}

    /**
     * method sets price
     * @param price
     */
    public void setPrice(int price) {this.price = price;}

    /**
     * @return weight
     */
    public int getWeight() {return weight;}

    /**
     * method sets weight
     * @param weight
     */
    public void setWeight(int weight) {this.weight = weight;}

    /**
     * method doing some operation with weight
     * @param p is data
     * @return
     */
    public int compareTo(Data p) {
        Integer s = weight;
        return s.compareTo(p.getWeight());
    }

    /**
     * method print info
     */
    public void print(){
        System.out.println("Sort of wheat is "+ sortOfWheat+"\tPrice is "+price);
    }
}
