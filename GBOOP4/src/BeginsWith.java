import java.util.ArrayList;
import java.util.Collection;

public class BeginsWith<T> implements IsGood<T>{
    private String beginsWith;

    public BeginsWith(String theString){
        this.beginsWith=theString;
    }
    @Override
    public boolean isGood(T item) {
        String temp = "";
        try{
            temp = item.toString();
        } catch (NumberFormatException e){
            System.out.println(e);
        }
        if (temp.startsWith(this.beginsWith)){
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
