// Operators
// Types of Operators = 
// 1. Arthmetic Operators (Binary / Unary)
// 2. Relational Operators
// 3. Logical Operators
// 4. Bitwise Operators
// 5. Assignment Operators



// Arthmetic Operators

// Types

// Binary = 2 operands

// + , - , * , / , %(modulo) it is used for find the remiander


// Unary = 1 operands

// ++(increment) = ++a(pre increment operator) , a++(post increment operator) , --(decrement)



public class basic13 {
    public static void main(String[] args) {
        // Pre increment 
        
        int A = 10;
        int B = 20;
        // System.out.println(A);
        // System.out.println(B);

        // Post increment
        
        // int A = 10;
        // int B = A++;
        // System.out.println(A);
        // System.out.println(B);

        // Pre decrement
        
        // int A = 10;
        // int B = --A;
        // System.out.println(A);
        // System.out.println(B);

        // Post decrement
        
        // int A = 10;
        // int B = A--;
        // System.out.println(A);
        // System.out.println(B);



        // Binary Operator
        
        System.out.println("Add : " +(A+B));
        System.out.println("Subtract : " +(A-B));
        System.out.println("Divide : " +(A/B));
        System.out.println("Multiply : " +(A*B));
        System.out.println("Modulo : " +(A%B));
    }
}
