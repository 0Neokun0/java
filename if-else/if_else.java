class Main {
    public static void main(String[] args) 
    {
  
      // declaring double type variables
      Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;
  
      // checks if n1 is greater than or equal to n2
      if (n1 >= n2) 
      {
  
        
        // checks if n1 is greater than or equal to n3
        if (n1 >= n3) 
        {
          largest = n1;
        }
  
        else 
        {
          largest = n3;
        }
      } 
      else 
      {
        // checks if n2 is greater than or equal to n3
        if (n2 >= n3) 
        {
          largest = n2;
        }
  
        else 
        {
          largest = n3;
        }
      }
  
      System.out.println("Largest Number: " + largest);
    }
  }