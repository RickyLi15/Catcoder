package interfacesGenerics;

public class Cat implements Animal {
     private int mice=0;
     private String name;

     public Cat(String name) {
    	 this.name=name;
     }
     
     public Cat(Cat object) {
    this.mice=object.mice;
    this.name=object.name;
     }
     
     public String getName() {
    	 return name;
     }
     
     public void setName(String s) {
    	 name=s;
     }
     
     public String makeSound() {
    	 return name+ " is meowing";
     }
     
     public void caughtAnother() {
    	 mice++;
     }
     public int getMouseCount() {
    	 return mice;
     }
     
     public String toString() {
    	 return "The cat "+name+ " has caught "+mice+" mice";
     }
     
     public static void main(String args[]) {
    	 Cat dap=new Cat("Fury");
    
    	 dap.caughtAnother();
    	 dap.caughtAnother();
    	 dap.caughtAnother(); 
    	 System.out.println(dap.makeSound());
    	 System.out.println(dap);
    	 
     }
     
}
