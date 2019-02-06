//Singleton Class example
public class SingletonExample {

       private static SingletonExample singletonExample;          //Declare static variable
       
       private SingletonExample() {                               //Create an void Builder
             System.out.println("Builder initiated"); 
       }
       
       public static SingletonExample getInstance() {             //Here we get instance of Singleton
             if(singletonExample==null) {
                    singletonExample = new SingletonExample();    // If singleton is null we create new Singleton
             } else {
                    System.out.println("Singleton initialized");  // Else, singleton is initialized
             }
             
             return singletonExample;                             // Return singleton
       }
       
       public static void main(String[] args) {                   //This is main class, here we will call to "SingletonExample getInstance()" twice.
             
             SingletonExample.getInstance();                      //Here we call to "SingletonExample getInstance()" first time
             
             // The main feature of Singleton Class is that only instances once the variable, so this second call never will never happen
             //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ THIS SECOND CALL NEVER WILL HAPPEN ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
             
             SingletonExample.getInstance();                      //Here we call to "SingletonExample getInstance()" second time
       }

}
