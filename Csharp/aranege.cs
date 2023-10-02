using System;

namespace CitySorting
{
    class Program
    {
        static void Main()
        {
            Console.Write("Enter the number of cities: ");
            int n = int.Parse(Console.ReadLine());

            string[] cities = new string[n];

            for (int i = 0; i < n; i++)
            {
                Console.Write("Enter city name: ");
                cities[i] = Console.ReadLine();
            }

           Array.Sort(cities, new CaseInsensitiveComparer());

foreach (string city in cities)
{
    Console.WriteLine(city);
}

        }
    }
}
