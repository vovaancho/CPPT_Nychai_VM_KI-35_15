package Nychai.Lab7;
/**
 * Class <code>Coal</code> class describes work and actions with coal
 * @author  Nychai Volodymyr KI-35
 * @version 1.0
 */

public class Coal implements Data{
    private int price;
    private int weight;
    private String placeOfMining;

    /**
     * @param price price of coal
     * @param weight weight of coal
     * @param placeOfMining place of mining
     */
    Coal(int price,int weight, String placeOfMining){
        this.price=price;
        this.weight=weight;
        this.placeOfMining=placeOfMining;
    }

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
     * @return place
     */
    public String getPlaceOfMining() {return placeOfMining;}

    /**
     * method sets place of mining
     * @param placeOfMining
     */
    public void setPlaceOfMining(String placeOfMining) {this.placeOfMining = placeOfMining;}

    /**
     * @return price
     */
    public int getPrice() {return price;}
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
        System.out.println("Weight is " + weight + "\tPrice is " + price + "\tPlace of mining "+ placeOfMining);
    }
}
