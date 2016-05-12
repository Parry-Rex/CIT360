
public class MVCtest {
   public static void main(String[] args) {

      //Setup model
      Pokemon model  = retrivePokemonFromDatabase();

      //Setup view
      PokemonView view = new PokemonView();

      PokemonController controller = new PokemonController(model, view);

      controller.updateView();

      //Setup model
      controller.setPokemonName("Squirtle");

      controller.updateView();
   }

   private static Pokemon retrivePokemonFromDatabase(){
      Pokemon pokemon = new Pokemon();
      pokemon.setName("Charmander");
      pokemon.setNumber(5);
      return pokemon;
   }
}