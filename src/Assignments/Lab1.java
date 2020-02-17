/*
1. Write a function that takes a value n returns the sum of numbers 1 to n
2. Write a function that computes the factorial value
Definition: n! = n*(n-1)! , where 0! = 1
1! = 1
2! = 2 * 1! = 2 * 1
3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
Hint: use the recursive method that was used to calculate Fibonnaci number
3. Write 3 functions that take an array as a parameter and return the minimum,
average, and maximum values of that array.
Hint: this should be static functions with a return type of the same data type as the array
declaration.
 */
package Assignments;

/**
 *
 * @author shell
 */
public class Lab1 {
    public static void main(String[] args) {
    // Write a function that takes a value N and returns the sum of 1 to N
        System.out.println(sum(4));
    //Write a function that computes factorial: hint use recursion,
        //System.out.println("Factorial: " + fact(5));
    //Write a function that return the min,avg and max of an array
    int[] numbers = {5, -2, 0,234,-438,63};
        System.out.println("min: " +findmin(numbers));
        System.out.println("max: " +findmax(numbers));
        System.out.println("Avg: " +findAvg(numbers));
    }

    public static int findAvg(int[] arr){
        //Take sum divide by number of elements
        int sum = 0;
        for(int n =0;n<arr.length;n++){
            sum = sum + arr[n];
        }
        System.out.println("Sum: " + sum);
        return sum/arr.length;
    }
    public static int findmin(int[] arr){
        int min = arr[0];
        for(int i =0; i< arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int findmax(int[] arr){
     int max = arr[0];
     for(int i =0; i < arr.length;i++){
         if(arr[i] > max){
             max =arr[i];
         }
     }
     return max;
    }
    public static int sum(int n){
     int sum = 0;
    for(int i =0; i <= n;i++){
    System.out.print(sum+ " + " + i);
    sum =sum+ i;
    System.out.println(sum);

}

}
