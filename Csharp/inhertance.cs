using System;

namespace MyNamespace
{
    class ParentClass
    {
        public void Display()
        {
            Console.WriteLine("This is the parent class.");
        }
    }

    class ChildClass : ParentClass
    {
        public void Show()
        {
            Console.WriteLine("This is the child class.");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            ChildClass obj = new ChildClass();

            obj.Display();

            obj.Show();
        }
    }
}
