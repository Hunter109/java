using System;

namespace ArrayExamples
{
    class Program
    {
        static void Main(string[] args)
        {
            // Create an array of strings with size 5
            string [] names = new string[5];

            // Initialize the elements of the array
            names[0] = "Alice";
            names[1] = "Bob";
            names[2] = "Charlie";
            names[3] = "David";
            names[4] = "Eve";

            Console.WriteLine("Names in the array:");
            for (int i = 0; i < 5; i++)
            {
                Console.WriteLine(names[i]);
            }

            Console.ReadLine();
        }
    }
}
