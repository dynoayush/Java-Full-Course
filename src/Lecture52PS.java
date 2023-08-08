        // Question 1 and 3
//        class Circle1{
//    Circle1(){
//        System.out.println("I am not a parameterised constructor");
//    }
//    Circle1(int r){
//        System.out.println("I am a circle parameterised constructor");
//        this.radius = r;
//    }
//    public int radius;
//    public double area(){
//        return Math.PI*this.radius*this.radius;
//    }
//        }
//        class Cylinder1 extends Circle1{
//    Cylinder1(int r,int h){
//        super(r);
//        System.out.println("I am cylinder parameterised constructor");
//        this.height = h;
//    }
//    public int height;
//    public double volume(){
//        return Math.PI*this.radius*this.radius*this.height;
//    }
//        }
        // Question 2 and 4
        class Rectangle1{
    Rectangle1(){
        System.out.println("I have nothing");
    }
    Rectangle1(int l,int b){
        System.out.println("I am length and breadth of class rectangle");
        this.length = l;
        this.breadth = b;
    }
    public int length;
    public int breadth;
      public int getLength() {
                return length;
            }
            public void setLength(int length) {
                this.length = length;
            }
            public int getBreadth() {
                return breadth;
            }
            public void setBreadth(int breadth) {
                this.breadth = breadth;
            }

            public int area(){
             return this.length*this.breadth;
         }
        }
        class Cuboid extends Rectangle1{
    Cuboid(){
        System.out.println("I also have nothing");
    }
    Cuboid(int l,int b,int h){
        super(l,b);      // Calls length,breadth from super/parent class
        System.out.println("I am Cuboid parameterised constructor ");
        this.height = h;
        this.length = l;
        this.breadth = b;
    }
    public int length;
        public int breadth;
        public int height;
        public int getLength() {
                return length;
            }
            public void setLength(int length) {
                this.length = length;
            }
            public int getBreadth() {
                return breadth;
            }
            public void setBreadth(int breadth) {
                this.breadth = breadth;
            }
            public int getHeight() {
                return height;
            }
            public void setHeight(int height) {
                this.height = height;
            }
            public int volume(){
            return this.length*this.breadth*this.height;
        }
    }
public class Lecture52PS{
    public static void main(String[] args) {
        // Question 1 and 3
     //  Circle1 obj = new Circle1(12);
    //   Cylinder1 obj1 = new Cylinder1(4,12);
       // Question 2 and 4
        Rectangle1 r = new Rectangle1(1,3);
        System.out.println(r.area());
        Cuboid c = new Cuboid(1,2,3);
        System.out.println(c.area());
        System.out.println(c.volume());   // It will not run cause height is not present in the super class



    }
}
