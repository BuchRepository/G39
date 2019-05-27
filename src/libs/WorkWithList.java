package libs;

import java.util.ArrayList;
import java.util.List;
public class WorkWithList {

    // Why are we should create returning ,method in this moment? it work without return method
    public ArrayList<ArrayList<String>> addNewList (ArrayList<ArrayList<String>> listList){
        listList.add(new ArrayList<String>());
        System.out.println("The newList is created");
        return listList;
    }

    public void addValueToListList (int numberOfList, String value, ArrayList <ArrayList<String>> listList){
        try {
            listList.get(numberOfList).add(value);
            printList(listList);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("The request list isn't found. The size listList: "+listList.size()+ ", the requst list: "+numberOfList+";");
            printList(listList);
        }

    }

    public void printList (ArrayList<ArrayList<String>> listList){
        for (ArrayList element: listList) {
            System.out.println(element);
        }
    }

}
