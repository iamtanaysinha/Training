// class Boy extends Human {
//     //Overriding method
//     //Methods are decided by the OBJECT, variables are decided by the REFERENCE.
//     int age=10;
//     public void eat() {
//         System.out.println("Boy is eating");
//     }

//     public void display() {
//         System.out.println("Boy is invoked");
//     }
    
//     public static void main( String args[]) {
//         Human obj = new Boy();
        
//         //This will call the child class version of eat()
//         // obj.eat();
//         // System.out.println(obj.age);
//     }
// }
class Boy extends Human {

    void identify() {
        System.out.println("I am a Boy");
    }
}
