using System;

namespace NumberSorting
{
    class Program
    {
        static void Main()
        {
            Console.Write("Enter the number of elements: ");
            int n = int.Parse(Console.ReadLine());

            int[] numbers = new int[n];

            for (int i = 0; i < n; i++)
            {
                Console.Write("Enter number  ");
                numbers[i] = int.Parse(Console.ReadLine());
            }

            Array.Sort(numbers);
            Array.Reverse(numbers);

            Console.WriteLine("Numbers in ascendnig order: " + string.Join(" ", numbers));
        }
    }
}
