// https://www.hackerrank.com/challenges/java-factory/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
package basic;

import java.util.*;
import java.security.*;
interface Food {
	 public String getType();
}
class Pizza implements Food {
	public String getType() {
		return "Someone ordered a Fast Food!";
	}
}
class Cake implements Food {
	public String getType() {
		return "Someone ordered a Dessert!";
	}
}
class FoodFactory {
	public Food getFood(String order) {
		//Write your code here
		Food f = null;
		if(order.equals("cake" )) return new Cake();
		if(order.equals("pizza" )) return new Pizza();
		return f;
		
	}//End of getFood method
}//End of factory class

public class P044AdvancedJavaFactoryPattern {

 public static void main(String args[]){
		Do_Not_Terminate.forbidExit();

	try{

		Scanner sc=new Scanner(System.in);
		//creating the factory
		FoodFactory foodFactory = new FoodFactory();

		//factory instantiates an object
		Food food = foodFactory.getFood(sc.nextLine());

		
		System.out.println("The factory returned "+food.getClass());
		System.out.println(food.getType());
		sc.close();
	}
	catch (Do_Not_Terminate.ExitTrappedException e) {
		System.out.println("Unsuccessful Termination!!");
	}
 }

}
class Do_Not_Terminate {
	 
    public static class ExitTrappedException extends SecurityException {

		private static final long serialVersionUID = 1L;
    }
 
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}	
