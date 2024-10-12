// Logical Operators

// Types

//  && (AND) 

//  Answer    Statement1    Statement2
//    T             T             T
//    F             T             F    
//    F             F             T
//    F             F             F     


//  || (OR)

//  Answer    Statement1    Statement2
//    T             T             T
//    T             T             F    
//    T             F             T
//    F             F             F  


//  !(NOT)

//  Answer    Statement
//    T             T   
//    F             T    



public class basic15 {
    public static void main(String[] args) {
        System.out.println((3<2) && (6<3));
        System.out.println((3<2) || (6<3));
        System.out.println(! (6<3));
    }
    
}
