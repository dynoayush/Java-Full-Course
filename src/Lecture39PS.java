    // Question 1
//class Employee{
//    int salary;
//    String name;
//    public int getSalary() {
//            return salary;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String n){
//        name = n;
//    }
//    }
    // Question 2
//    class cellphone{
//        public void ring(){
//            System.out.println("Ringing");
//        }
//        public void vibrate(){
//            System.out.println("Vibrating");
//        }
//        public void call(){
//            System.out.println("Call Friend");
//        }
//     }
     // Question 3
//    class Square{
//    int side;
//    public int area(){
//        return side*side;
//    }
//    public int perimeter(){
//        return 4*side;
//    }
//   }
   // Question 4
//class Rectangle{
//    int length;
//    int breath;
//    public int area(){
//        return length*breath;
//    }
//    public int perimeter(){
//        return 2*(length+breath);
//    }
//}
   // Question 5
//    class Tommy{
//      public void hit(){
//          System.out.println("Hitting the enemy");
//      }
//      public void run(){
//          System.out.println("Running from the enemy");
//      }
//      public void fire(){
//          System.out.println("Firing on the enemy");
//      }
//   }
   // Question 6
   class Circle{
       double radius;
       public void setRadius(double r){
            this.radius=r;
        }
        public double getRadius(){
            return radius;
        }
       public double calcarea(){

            return Math.PI*Math.pow(radius,2);
       }
       public double calcperimeter(){

            return 2* Math.PI*radius;
       }
   }
   public class Lecture39PS {
    public static void main(String[] args) {
    // Question 1
//        Employee ayush = new Employee();
//        ayush.setName("Riju");
//        ayush.salary=100;
//        System.out.println(ayush.getName());
//        System.out.println(ayush.getSalary());

    // Question 2
//        cellphone samsung = new cellphone();
//        samsung.call();
//        samsung.ring();
//        samsung.vibrate();
     // Question 3
//      Square sq = new Square();
//      sq.side = 6;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());
        //    Question 4
//        Rectangle sq = new Rectangle();
//        sq.length = 2;
//        sq.breath = 2;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());
        // Question 5
//        Tommy player1 = new Tommy();
//        player1.fire();
//        player1.hit();
//        player1.run();
        // Question 6
        Circle cr = new Circle();
        cr.setRadius(2);
        System.out.println(cr.getRadius());
        System.out.println(cr.calcarea());
        System.out.println(cr.calcperimeter());








      }
    }
