//package dataStructures.set;
//
//import dataStructures.arrayList.ArrayList;
//
//public class Set {
//    private boolean isEmpty = true;
////    private String[] elements = new String[5];
//    private int size;
//    private ArrayList elements = new ArrayList();
//
//    public boolean isEmpty() {
//        return isEmpty;
//    }
//
//    public boolean add(String element) {
//        if(!elements.contains(element)){
//            elements.add(element);
//        }
//        return true;
//    }
//
//    public boolean remove(String element) {
//        if (element == null) throw new IllegalArgumentException("cannot remove null element");
//        int target = -1;
//
//        if()
//        if (target == -1) {
//            return false;
//        }
//
//       for(int count = target; count < size - 1; count++){
//           this.elements[count] = elements[count + 1];
//       }
//
//       this.elements[--size] = null;
//       return true;
//    }
//
//    public int size() {
//        return size;
//    }
//
//    private void resize() {
//
//        String[] newCollection = new String[elements.length * 2];
//
//        for(int count = 0; count < elements.length; count++) newCollection[count] = elements[count];
//
//        elements = newCollection;
//    }
//
//
//    public boolean  contains(String element) {
//        if(element == null ) throw new IllegalArgumentException("Null argument");
//        for(String item : elements){
//            if (element.equals(item)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//   public String[] toArray() {
//       String[] newArray = new String[size];
//       for(int count = 0; count < size; count++){
//           newArray[count] = elements[count];
//       }
//       return newArray;
//   }
//
//    public void clear() {
//        size = 0;
//    }
//}
