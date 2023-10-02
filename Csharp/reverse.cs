using System;

namespace NumberReverse
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter a number: ");
            string input = Console.ReadLine();
            string reversedNumber = string.Join("", input.Reverse());
            Console.WriteLine("Reversed Number: " + reversedNumber);
            Console.ReadLine();
        }
    }
}
