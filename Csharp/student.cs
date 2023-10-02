using System;

namespace hunter
{
    class student
    {
        private string name;
        private int age;
        private int reg_no;
        private float math, computer, science;

        public student(string name, int age, int reg_no)
        {
            this.name = name;
            this.age = age;
            this.reg_no = reg_no;
        }

        public void input()
        {
            Console.Write("Enter the marks of math: ");
            math = float.Parse(Console.ReadLine());

            Console.Write("Enter the marks of computer: ");
            computer = float.Parse(Console.ReadLine());

            Console.Write("Enter the marks of science: ");
            science = float.Parse(Console.ReadLine());

        }

        public void display()
        {
            Console.WriteLine("Name of the student: " + name);
            Console.WriteLine("Marks in math: " + math);
            Console.WriteLine("Marks in computer: " + computer);
            Console.WriteLine("Marks in science: " + science);
        }

    }

    class HelloWorld
    {
        static void Main(string[] args)
        {
            student utsav = new student("Utsav", 21, 3891);
            utsav.input();
            utsav.display();

            Console.ReadLine();
        }
    }
}
