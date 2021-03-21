package com.tinnova.bubleSort;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BubleSortService {
    public ArrayList<Integer> sort(ArrayList<Integer> list){
        boolean shouldStop; //Flag to break loop
        for (int i = 1; i < list.size(); i++) {
            shouldStop = true;
            for (int j = 0; j < list.size()-1; j++){

                if (list.get(j)>list.get(j+1)){
                    shouldStop = false;
                    int swapInt = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,swapInt);
                }
            }
            //One full iterations without swap means that the list is already sorted, and the service can stop.
            if (shouldStop){break;}
        }
        return list;
    }


}
