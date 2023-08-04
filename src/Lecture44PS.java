     // Question 1,2
//    class Cylinder{
//    double radius;
//    double height;
//         public void setRadius(double r){
//             this.radius=r;
//         }
//         public double getRadius(){
//             return radius;
//         }
//         public void setHeight(double h){
//             this.height=h;
//         }
//         public double getHeight(){
//             return height;
//         }
//         public double calcsurfacearea(){
//             return 2*Math.PI*radius*height+2*Math.PI*Math.pow(radius,2);
//         }
//         public double calcvolume(){
//             return Math.PI*Math.pow(radius,2)*height;
//         }
//     }
     // Question 3
//     class Cylinder1 {
//         double radius;
//         double height;
//
//         public Cylinder1(double radius, double height) {   // Using Constructors with arguments
//             this.radius = radius;
//             this.height = height;
//         }
//         public double getRadius(){
//             return radius;
//         }
//         public double getHeight(){
//             return radius;
//         }
//         public double calcsurfacearea(){
//             return 2*Math.PI*radius*height+2*Math.PI*Math.pow(radius,2);
//         }
//         public double calcvolume(){
//             return Math.PI*Math.pow(radius,2)*height;
//         }
//     }
     // Question 4
     class Rectangle{       // Overloading of constructor
         int length;
         int breadth;

         public Rectangle() {       // First constructor where the value is initialized
             this.length = 4;
             this.breadth = 5;
         }

         public Rectangle(int length,int breadth) {        // Second Constructor where the values are custom parameter
             this.length = length;
             this.breadth = breadth;
         }

         public int getLength() {
             return length;
         }

         public int getBreadth() {
             return breadth;
         }
     }
     class Sphere{
    double radius;


         public Sphere(double radius) {   // Using Constructors with arguments
             this.radius = radius;

         }
         public double getRadius(){
             return radius;
         }
         public double calcsurfacearea(){
             return 4*3.142*Math.pow(radius,2);
         }
         public double calcvolume(){
             return 1.33*3.142*Math.pow(radius,3);
         }
     }
     public class Lecture44PS {
             public static void main(String[] args) {
                 // Question 1,2
//        Cylinder cy = new Cylinder();
//        cy.setRadius(2);
//        cy.setHeight(2);
//        System.out.println(cy.getRadius());
//        System.out.println(cy.getHeight());
//        System.out.println(cy.calcsurfacearea());
//        System.out.println(cy.calcvolume());
                 // Question 3
//        Cylinder1 cy = new Cylinder1(2, 2);
//        System.out.println(cy.getRadius());
//        System.out.println(cy.getHeight());
//        System.out.println(cy.calcsurfacearea());
//        System.out.println(cy.calcvolume());
                 // Question 4
                 Rectangle r = new Rectangle();
                 System.out.println(r.getLength());
                 System.out.println(r.getBreadth());
                 // Question 5
                 Sphere sp = new Sphere(2);
                 System.out.println(sp.getRadius());
                 System.out.println(sp.calcsurfacearea());
                 System.out.println(sp.calcvolume());




             }
         }

