package Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class IntSetBins implements IntSet {
   private HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
   private int maxelems;
   private int maxval;
   private int length;
   
   public IntSetBins() {
      this.maxelems = 0;
      this.maxval = 0;
   }
 
   @Override
   public void intSetImp(int maxelems, int maxval) {
      // TODO Auto-generated method stub
      this.maxelems = maxelems;
      this.maxval = maxval;
      this.length = 0;
   }

   @Override
   public void insert(int element) {
      // TODO Auto-generated method stub
     if(this.maxval >= element && maxelems > length) { 
         if(!map.containsKey(element/10)) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(element);
            map.put(element/10, list);
            this.length++;
         }
         else {
            ArrayList<Integer> list = map.get(element/10);
            if(!list.contains(element)) {
                list.add(element);
                map.remove(element/10);
                map.put(element/10, list);
                this.length++;
            }
         }
     }
   }

   @Override
   public int size() {
      // TODO Auto-generated method stub
      return this.length;
   }

   @Override
   public int[] report() {
      // TODO Auto-generated method stub
      
      return sort();
   }
   
   private int[] sort() {
      List<Integer> list = new ArrayList();
      list.addAll(map.keySet());
      
      Collections.sort(list, new Comparator() {
            public int compare(Object a, Object b) {      
               return ((Comparable) a).compareTo(b);
            }
         });
      
      ArrayList<Integer> finalList = new ArrayList<>();
      for(int i = 0; i < list.size(); i++) {
         ArrayList<Integer> temp = map.get(list.get(i));
         
         temp.sort(new Comparator() {
         @Override
         public int compare(Object o1, Object o2) {
            // TODO Auto-generated method stub
                return ((Comparable) o1).compareTo(o2);
         }
         });
         
         finalList.addAll(temp);
      }
      
      int[] returnValue = new int[finalList.size()];
      for(int i = 0; i < returnValue.length; i++) {
         returnValue[i] = finalList.get(i);
      }
      
      return returnValue;
   }
}