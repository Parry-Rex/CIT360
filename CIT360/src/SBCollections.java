import java.util.*;

public class SBCollections {
	
	public static void main(String[] args) {
		//Java Collections (one each of Map, List, Set, Tree)
		//The Map interface maps unique keys to values, not an extension of collection
		Map idnumber = new HashMap();
		idnumber.put("Adam","1");
		idnumber.put("Eve","2");
		idnumber.put("Seth","3");
		idnumber.put("Cain","4");
		idnumber.put("Abel","5");
		System.out.println();
	      System.out.println(" People and their ID numbers");
	      System.out.print("\t" + idnumber);
	      
	    //The List is an extension of collection that can have duplicate values and elements are accessed by their position in the list
	      List fruit = new LinkedList();
	      fruit.add("apple");
	      fruit.add("orange");
	      fruit.add("pear");
	      fruit.add("apple");
	      System.out.println();
	      System.out.println(" List of fruit eaten today");
	      System.out.print("\t" + fruit);
	      
	    //A Set is an extension of Collection that cannot contain duplicate elements.
	      Set poke = new HashSet(); 
	      poke.add("Charmander");
	      poke.add("Squirtle");
	      poke.add("Bulbasaur");
	      System.out.println();
	      System.out.println(" Starter Pokemon");
	      System.out.print("\t" + poke);
	      
	      //A tree is an extension of set and stores objects in ascending order, good for large amount of information
	      TreeSet Races = new TreeSet();
	     
	      Races.add("Human");
	      Races.add("Orc");
	      Races.add("Elf");
	      Races.add("Dwarf");
	      Races.add("Halfling");
	      Races.add("Gnome");
	      //check if tree is empty
	      System.out.println("Is the Tree empty: "+Races.isEmpty());
	      //print what I just entered into the tree (note it will display in ascending order, not the order entered)
	      System.out.println();
	      System.out.println(" Fantasy Races");
	      System.out.println("\t" + Races);
	}

}
