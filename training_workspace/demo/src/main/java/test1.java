// import java.util.Map;
// import java.util.Set;
// import java.util.HashMap;
// import java.util.HashSet;

// // public class test1 {
// //     public static void main(String[] args) {
// //         System.out.println("namaste world");

// //       //input

// //         // Scanner sc = new Scanner(System.in);
// //         // String name = sc.nextLine();
// //         //  int n = sc.nextInt();

// //         //array
// //         //int[] numbers = new int[n];

// //         //  int[] nums = {10, 20, 30};

// //         //  int n = nums.length;
// //         //  System.out.println(n);

     
// //         Scanner sc = new Scanner(System.in);
// //         int n = sc.nextInt();
        
// //         int[] nums = new int[n];
        

// //         for(int i=0; i<n;i++){
// //             nums[i]=sc.nextInt();
// //         }

// //         for(int i=0;i<n;i++){
// //             System.out.print(nums[i] + " ");
// //         }
// //     }
// // }
// import java.util.Map;
// import java.util.HashMap;

// class Main {

//     public static void main(String[] args) {
//         // Creating a map using the HashMap
//         Map<String, Integer> numbers = new HashMap<>();

//         // Insert elements to the map
//         numbers.put("One", 1);
//         numbers.put("Two", 2);
//         System.out.println("Map: " + numbers);

//         // Access keys of the map
//         System.out.println("Keys: " + numbers.keySet());

//         // Access values of the map
//         System.out.println("Values: " + numbers.values());

//         // Access entries of the map
//         System.out.println("Entries: " + numbers.entrySet());

//            // Access values using keys
//         System.out.println("Value for 'One': " + numbers.get("One"));     // Output: 1
//         System.out.println("Value for 'Two': " + numbers.get("Two"));     // Output: 2
//         System.out.println("Value for 'Four': " + numbers.get("Four"));

//         // Remove Elements from the map
//         int value = numbers.remove("Two");
//         System.out.println("Removed Value: " + value);
//     }
// }
import java.util.Set;
import java.util.HashSet;

public class test1 {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();

        hs.add("Tom");
        hs.add("Mary");
        hs.add("Peter");
        hs.add("Alice");
        hs.add("Peter"); 
        hs.add("Alice"); 
        System.out.println(hs.size());

        hs.remove("Mary");
        hs.remove("raj"); 

        System.out.println(hs.contains("Peter"));

        System.out.println(hs);
    }
}
