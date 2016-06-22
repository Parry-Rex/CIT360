import java.util.*;
public class SBTree {
	public static void main(String[] args) {
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
	      //delete all elements from set
	        Races.clear();
	        System.out.println("Is set empty: "+ Races.isEmpty());
	
	}

}
