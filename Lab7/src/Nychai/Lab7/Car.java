package Nychai.Lab7;

import java.util.ArrayList;

/**
 * Class <code>Car</code> class describes work and actions with car
 * @author  Nychai Volodymyr KI-35
 * @version 1.0
 * @param <T> everyone data
 */
class Car<T extends Data> {
    private ArrayList<T> arr;
    public  Car(){
        arr = new ArrayList<T>();
    }

    /**
     * method find min in arraylist
     * @return
     */
    public T findMin()
    {
        if (!arr.isEmpty())
        {
            T min = arr.get(0);
            for (int i=1; i< arr.size(); i++)
            {
                if ( arr.get(i).compareTo(min) < 0 )
                    min = arr.get(i);
            }
            return min;
        }
        return null;
    }

    /**
     * method add elements
     * @param data
     */
    public void AddData(T data)
    {
        arr.add(data);
        System.out.print("Element added: ");
        data.print();
    }

    /**
     * method delete elements
     * @param i
     */
    public void DeleteData(int i)
    {
        arr.remove(i);
    }

}
