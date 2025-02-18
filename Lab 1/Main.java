/*
 * IT-2660 - Lab 1
 * Student Name: Christian Allen 
 */
 
public class Main {
  public static void main(String[] args) {
      System.out.println("hello, world!");
      
      Lab1 lab = new Lab1();
      System.out.println(lab.increment(1));
      
      int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};
      
      System.out.print("Array: ");
      int i = 0;
      while (i < nums.length) {
          System.out.print(nums[i] + " ");
          i++;
      }
      System.out.println();
      
      System.out.print("Array in reverse: ");
      for (int j = nums.length - 1; j >= 0; j--) {
          System.out.print(nums[j] + " ");
      }
      System.out.println();
      
      System.out.println("First value: " + nums[0]);
      System.out.println("Last value: " + nums[nums.length - 1]);
      
      //Im hoping I did this part right, I might've messed up here
      System.out.println("Maximum of " + nums[0] + " and " + nums[1] + ": " + lab.max(nums[0], nums[1]));
      System.out.println("Minimum of " + nums[2] + " and " + nums[3] + ": " + lab.min(nums[2], nums[3]));
      System.out.println("Sum: " + lab.sum(nums));
      System.out.println("Average: " + lab.average(nums));
      System.out.println("Max: " + lab.max(nums));
      System.out.println("Minimum: " + lab.min(nums));
    }
}

class Lab1 {
  public int increment(int num) {
      return ++num;
  }
  
  // Add all of the methods here
  public int max(int a, int b) {
      if (a > b) {
          return a;
      } else {
          return b;
      }
  }
  
  public int min(int a, int b) {
      if (a < b) {
          return a;
      } else {
          return b;
      }
  }
  
  public int sum(int[] nums) {
      int sum = 0;
      for (int num : nums) {
          sum += num;
      }
      return sum;
  }
  
  public double average(int[] nums) {
      int sum = sum(nums); 
      return (double) sum / nums.length;
  }
  
  public int max(int[] nums) {
      int max = nums[0];
      for (int i = 1; i < nums.length; i++) {
          if (nums[i] > max) {
              max = nums[i];
          }
      }
      return max;
  }
  
  public int min(int[] nums) {
      int min = nums[0];
      for (int i = 1; i < nums.length; i++) {
          if (nums[i] < min) {
              min = nums[i];
          }
      }
      return min;
  }
}
