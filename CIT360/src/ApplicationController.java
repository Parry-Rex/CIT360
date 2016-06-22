
public class ApplicationController {
	
   private Dispatcher dispatcher;

   public ApplicationController(){
      dispatcher = new Dispatcher();
   }

   private boolean isAuthenticDM(){
      System.out.println("DM is authenticated successfully.");
      return true;
   }

   private void trackRequest(String request){
      System.out.println("Info requested: " + request);
   }

   public void dispatchRequest(String request){
      trackRequest(request);
      
      if(isAuthenticDM()){
         dispatcher.dispatch(request);
      }	
   }
}
