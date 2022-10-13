package Nychai.Lab7;

import java.util.ArrayList;

class Car<T extends Data> {
    private ArrayList<T> arr;
    public  Car(){
        arr = new ArrayList<T>();
    }
    public T findMax()
    {
        if (!arr.isEmpty())
        {
            T max = arr.get(0);
            for (int i=1; i< arr.size(); i++)
            {
                if ( arr.get(i).compareTo(max) > 0 )
                    max = arr.get(i);
            }
            return max;
        }
        return null;
    }
    public void AddData(T data)
    {
        arr.add(data);
        System.out.print("Element added: ");
        data.print();
    }
    public void DeleteData(int i)
    {
        arr.remove(i);
    }

}
