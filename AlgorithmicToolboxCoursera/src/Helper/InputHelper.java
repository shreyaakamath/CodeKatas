package Helper;

import java.util.ArrayList;
import java.util.List;

public class InputHelper {
    public static List<Integer> stringToIntList(String input){
        List<Integer> list = new ArrayList();
        String[] arr = input.split(" ");
        for(String s:arr){
            list.add(Integer.parseInt(s));
        }
        return list;
    }
}
