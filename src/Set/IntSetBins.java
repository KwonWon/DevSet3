package Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class IntSetBins implements IntSet {
   private HashMap<Integer, Integer> map = new HashMap<>();
   private int maxelems;
   private int maxval;
   
   public IntSetBins() {
      this.maxelems = 0;
      this.maxval = 0;
   }
 
   @Override
   public void intSetImp(int maxelems, int maxval) {
      // TODO Auto-generated method stub
      this.maxelems = maxelems;
      this.maxval = maxval;
   }

   @Override
   public void insert(int element) {
      // TODO Auto-generated method stub
      map.put(element / 10, element);
   }

   @Override
   public int size() {
      // TODO Auto-generated method stub
      return map.get(0);
   }

   @Override
   public int[] report() {
      // TODO Auto-generated method stub
      sort();
      
      return null;
   }
   
   private void sort() {
      List<Integer> list = new ArrayList();
      list.addAll(map.keySet());
      
      int i = list.get(0);
      
      Collections.sort(list, new Comparator() {
         public int compare(Object a, Object b) {
//            Object v1 = map.get(a);
//            Object v2 = map.get(b);
            
            return ((Comparable) a).compareTo(b);
         }
      });
      
//      for(int i = 0; i < list.size(); i++) {
//         List<Integer> temp = new ArrayList();
//         temp.addAll(map.get(list.get(i)));
//      }
   }

}