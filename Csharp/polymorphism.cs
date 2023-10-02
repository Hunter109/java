using System;

namespace Shapes
{
    class Shape
    {
        public virtual void Draw()
        {
            Console.WriteLine("Drawing a shape");
        }
    }

    class Circle : Shape
    {
        public override void Draw()
        {
            Console.WriteLine("Drawing a circle");
        }
    }

    class Rectangle : Shape
    {
        public override void Draw()
        {
            Console.WriteLine("Drawing a rectangle");
        }
    }

    class Program
    {
        static void Main()
        {
            Shape shape1 = new Circle();
            Shape shape2 = new Rectangle();

            shape1.Draw(); // Calls Circle's Draw method
            shape2.Draw(); // Calls Rectangle's Draw method
        }
    }
}
