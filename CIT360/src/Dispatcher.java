
public class Dispatcher {
   private DMView dMView;
   private CharacterView characterView;
   
   public Dispatcher(){
      dMView = new DMView();
      characterView = new CharacterView();
   }

   public void dispatch(String request){
      if(request.equalsIgnoreCase("DM")){
         dMView.display();}
      else{ characterView.display();}	
   }
}
