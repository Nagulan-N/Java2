package demo;
import java.util.Scanner;  

public class Main {
	 public static void main(String[] args) {
		 // 1)
		    int age = 0 ;
		    String name;
	        Scanner myObj = new Scanner(System.in);
	        System.out.println("Please your name.");
	        name = myObj.next();
	        try {
	        while (true) {
	        	System.out.print("Enter Your Age: ");
	        	if (myObj.hasNextInt()) {
	                age = myObj.nextInt();
	                break; 
	            } else {
	                myObj.next();
	                System.out.println("Invalid input! Please enter an integer.");
	            }
	        }
	        }catch(Exception e){
	        	System.out.println("Enter Value should be Number.");
	        }
	        
	        myObj.close();
	        Person addNewPerson = new Person(name,age);
	        
	        addNewPerson.displayInfo();
	        System.out.printf("***************************");
	        
	        //2)
	        
	        Product[] products = {
	                new Product(1, 10.0, 5),
	                new Product(2, 15.0, 3),
	                new Product(3, 20.0, 2)
	            };

	            double totalSpent = calculateTotalAmount(products);
	            System.out.println("");
	            System.out.printf("Total amount spent: $%.2f%n", totalSpent);
	            
	            System.out.println("***************************");
	            
	            //3)
	            System.out.println("Account 1");
	            Account account1 = new Account();
	            account1.deposit(100);
	            account1.withdraw(50);
	            account1.displayBalance(); // Output: Balance: $50.00
	            System.out.println("Account 2");
	            Account account2 = new Account(500);
	            account2.withdraw(200);
	            account2.displayBalance();
	            
	            System.out.println("***************************");
	            
	            // 4)
	            
	            Employee emp1 = new Employee("Jhon",30,1001,66.0);
	            System.out.println("Employee ID: " + emp1.getEmployeeID());
	            System.out.println("Name: " + emp1.getName());
	            System.out.println("Age: " + emp1.getAge());
	            System.out.println("Salary: $" + emp1.getSalary());
	            System.out.println("***************************");
	            
	    }
	 
	 public static double calculateTotalAmount(Product[] products) {
	        double totalAmount = 0;
	        for (Product product : products) {
	            totalAmount += product.getPrice() * product.getQuantity();
	        }
	        return totalAmount;
	    }
	 
	 
	 
}


