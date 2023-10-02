using System;
using System.Collections;

namespace ArrayListExample
{
    class Program
    {
        static void Main(string[] args)
        {
            ArrayList  arrayList = new ArrayList(); // Creates an ArrayList

            arrayList.Add(10);
            arrayList.Add(20);
            arrayList.Add(30);
            arrayList.Add(40);
            arrayList.Add(50);

            Console.WriteLine("ArrayList:");
            foreach (int num in arrayList)
            {
                Console.WriteLine(num);
            }
                        Console.ReadLine();

        }
    }
}
