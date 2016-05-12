
public class PokemonController {
   private Pokemon model;
   private PokemonView view;

   public PokemonController(Pokemon model, PokemonView view){
      this.model = model;
      this.view = view;
   }

   public void setPokemonName(String name){
      model.setName(name);		
   }

   public String getPokemonName(){
      return model.getName();		
   }

   public void setPokemonNumber(int number){
      model.setNumber(number);		
   }

   public int getPokemonNumber(){
      return model.getNumber();		
   }

   public void updateView(){				
      view.printPokemonDetails(model.getName(), model.getNumber());
   }	
}
