using System;

namespace factorial
{
    class Program
    {
        public static int Factorial(int num)
        {
            if (num == 0)
                return 1;
            else
                // Recursive call to calculate factorial
                return num * Factorial(num - 1);
        }

        public static void Main(string[] args)
        {
            Console.Write("Enter a number: ");
            int num = int.Parse(Console.ReadLine());

            int fact = Factorial(num);
            Console.WriteLine("Factorial of " + num + " is " + fact);
            
                                    Console.ReadLine();

        }
    }
}
