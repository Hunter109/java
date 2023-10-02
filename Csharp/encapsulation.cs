using System;

namespace CarApp
{
    class Car
    {
        private string make;
        private string model;
        private int year;

        public Car(string make, string model, int year)
        {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public void DisplayCarDetails()
        {
            Console.WriteLine("Make: " + make);
            Console.WriteLine("Model: " + model);
            Console.WriteLine("Year: " + year);
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Car myCar = new Car("Toyota", "Corolla", 2021);
            myCar.DisplayCarDetails();
                        Console.ReadLine();

        }
    }
}
