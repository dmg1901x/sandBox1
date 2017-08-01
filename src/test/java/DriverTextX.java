import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dmg01 on 7/14/2017.
 */
public class DriverTextX {
    Board testCheck = new Board();
    PathOptions testPath = new PathOptions();

   public void runCheck(){
       testCheck.setBoard();                        // Initial board setup
   }


   @Test
   public void verifyPath001(){
       Assert.assertTrue("The path move count is incorrect !?!?", verifyFindShortestPaths("A","B",1));
       System.out.println("The path move count is CORRECT");
   }

    @Test
    public void verifyPath002(){
        Assert.assertTrue("The path move count is incorrect !?!?", verifyFindShortestPaths("A","C",2));
        System.out.println("The path move count is CORRECT");
    }

    @Test
    public void verifyPath003(){
        Assert.assertTrue("The path move count is incorrect !?!?", verifyFindShortestPaths("A","D",1));
        System.out.println("The path move count is CORRECT");
    }

    @Test
    public void verifyPath004(){
        Assert.assertTrue("The path move count is incorrect !?!?", verifyFindShortestPaths("A","E",2));
        System.out.println("The path move count is CORRECT");
    }

    @Test
    public void verifyPath005(){
        Assert.assertTrue("The path move count is incorrect !?!?", verifyFindShortestPaths("A","F",2));
        System.out.println("The path move count is CORRECT");
    }

    @Test
    public void verifyPath006(){
        Assert.assertTrue("The path move count is incorrect !?!?", verifyFindShortestPaths("A","G",2));
        System.out.println("The path move count is CORRECT");
    }

    @Test
    public void verifyPath007(){
        Assert.assertTrue("The path move count is incorrect !?!?", verifyFindShortestPaths("A","H",3));
        System.out.println("The path move count is CORRECT");
    }

    @Test
    public void verifyPath008(){
        Assert.assertTrue("The path move count is incorrect !?!?", verifyFindShortestPaths("A","I",3));
        System.out.println("The path move count is CORRECT");
    }

    @Test
    public void verifyPath009(){
        Assert.assertTrue("The path move count is incorrect !?!?", verifyFindShortestPaths("A","J",4));
        System.out.println("The path move count is CORRECT");
    }

    @Test
    public void verifyPath010(){
        Assert.assertTrue("The path move count is incorrect !?!?", verifyFindShortestPaths("A","K",4));
        System.out.println("The path move count is CORRECT");
    }

    @Test
    public void verifyPath011(){
        Assert.assertTrue("The path move count is incorrect !?!?", verifyFindShortestPaths("A","L",5));
        System.out.println("The path move count is CORRECT");
    }

    @Test
    public void verifyPath012(){
        Assert.assertTrue("The path move count is incorrect !?!?", verifyFindShortestPaths("A","M",6));
        System.out.println("The path move count is CORRECT");
    }


   public boolean verifyFindShortestPaths(String startPosition, String target, int expected){
       runCheck();
       try {
           int moveCnt = testPath.nodeDriver(startPosition, target);
           if ( moveCnt == expected ){
               System.out.println("From: " + startPosition + " To: " + target + " The move count is: " + moveCnt);
               return true;
           }
           System.out.println("From: " + startPosition + " To: " + target + " Calculation is incorrect; Count should be: " + moveCnt);
       } catch (Exception e){
       }
       return false;
   }
}
