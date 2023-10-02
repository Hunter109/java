using System;

namespace Math
{
    // Step 1: Declare the delegate signature
    delegate int MathAction(int a, int b);

    class Program
    {
        static int Add(int a, int b)
        {
            return a + b;
        }

        static int Subtract(int a, int b)
        {
            return a - b;
        }

        static void Main(string [] args)
        {
            // Step 2: Create delegate instance and associate it with a method
            MathAction operation = Add;

            // Step 3: Use the delegate to call the associated method
            int result = operation(5, 3);
            Console.WriteLine("Addition: " + result);

            // Associate the delegate with a different method
            operation = Subtract;

            // Use the delegate to call the new associated method
            result = operation(10, 4);
            Console.WriteLine("Subtraction: " + result);
        }
    }
}
