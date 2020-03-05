package framework;

import java.util.*;

public class CustomList 
{
   private static final String Monday = null;

public static void main(String args[])
   {

     LinkedList<String> list=new LinkedList<String>( );
        
     list.add("March");
     list.add("April");
     list.add("May");
     list.add("June");
     list.add("July");
     list.add("August");
     list.add("September");
     list.add("October");
     list.add("Novermber");
     list.addFirst("January"); 
     list.addLast("December");
     list.add(1, "Febrary"); 
     list.add(2,  "honey");
     System.out.println("LinkedList is:" +list);

     int i=0;
     while(list.size()>i) {
    	 System.out.println(list.get(i));
    	 i++;
     }     
     Iterator<String> iterator=list.iterator();
     while(iterator.hasNext()){
       System.out.println(iterator.next()); 
       }
    System.out.println("------------------------------"); 
    
    
     list.remove("June");
     list.remove(2);
     list.removeFirst();
     list.removeLast();
    System.out.println("Linked list after removing: " + list); 

     Iterator<String> iterator1=list.iterator();
     while(iterator1.hasNext()){
       System.out.println(iterator1.next());  
     }  
     System.out.println("The element is: " + list.get(2)); 
     System.out.println("The first element is: " + list.getFirst());
     
     boolean status = list.contains("March"); 
     
     if(status) 
         System.out.println("List contains the element 'March' "); 
     else
         System.out.println("List doesn't contain the element 'Aug'"); 
     
     int size = list.size(); 
     System.out.println("Size of linked list = " + size); 
   }
}