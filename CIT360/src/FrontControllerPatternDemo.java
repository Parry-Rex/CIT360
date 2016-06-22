
public class FrontControllerPatternDemo {
   public static void main(String[] args) {
   
      ApplicationController applicationController = new ApplicationController();
      applicationController.dispatchRequest("Player Info");
      applicationController.dispatchRequest("DM Info");
   }
}