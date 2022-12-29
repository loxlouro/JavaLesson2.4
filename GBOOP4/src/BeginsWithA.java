import java.util.ArrayList;
import java.util.Collection;

public class BeginsWithA<T> implements IsGood<T> {
    @Override
    public boolean isGood(T item) {
        String temp = "";
        try{
            temp = item.toString();
        } catch (NumberFormatException e){
            System.out.println(e);
        }
        if (temp.startsWith("A")){
            return true;
        } else return false;
    }

    @Override
    public ArrayList<T> filter(Collection<T> items) {
        ArrayList<T> newList = new ArrayList<>();
        for (T item:items){
            if(isGood(item)){
                newList.add(item);
            }
        }

        return newList;
    }
}
