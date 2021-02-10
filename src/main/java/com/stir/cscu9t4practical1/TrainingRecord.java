// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;




import java.util.*;


public class TrainingRecord {
    private List<Entry> tr;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } //constructor
    
    // add a record to the list
   public void addEntry(Entry e){
       tr.add(e);    
   } // addClass 
  
   
   
   
/** 
 * LOOK UP ENTRY METHOD
 * 
 *Look up the entry of a given day and month and year,
 *
 *takes the first entry possible
 *
 **/
   public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       StringBuilder resCon = new StringBuilder(""); //string builder declaration for result container
            Entry current = iter.next();
            if (current.getDay()==d && current.getMonth()==m && current.getYear()==y)
                resCon.append(current.getEntry() + " ");//appends the value of current to the result container
        
        return resCon.toString();//prints the value of rescon
   } // lookupEntry
   
   
   
   
   
   /** 
    * LOOK UP ALL BY DATE METHOD
    * 
    *Look up the entries of a given day and month and year,
    *
    *same as above but with a nice little loop too
    *
    **/
   public String lookupAllByDate (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       StringBuilder result=new StringBuilder(""); //create a StringBuilder to concatenate a string with entries on that date
       while (iter.hasNext()) {
           Entry current = iter.next();
           if (current.getDay() == d && current.getMonth() == m && current.getYear() == y)
               result.append(current.getEntry()+" ");
       }
       if(result.equals("")){
           result.append("No entires found"); 
       }
       return result.toString();
   }
   
  
   
   
   
   
   
   
   
   
   // Count the number of entries
   public int getNumberOfEntries(){
       return tr.size();
   }
   // Clear all entries
   public void clearAllEntries(){
       tr.clear();
   }
   
} // TrainingRecord