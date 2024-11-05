
class test1{

String name= "anil raj";
int age;
static int id= 2626;

}

class test2 {

String name1 = "Ramesh";
int age1;
static int id = 2323;


}


public class test3{

   public static void main(String[] args){

     test1 obj = new test1();
     test2 obj1 = new test2();

     System.out.println(obj.name);
     obj.age = 22;
     System.out.println(obj.age);
     System.out.println(obj.id);

     System.out.println(obj1.name1);
     obj1.age1= 24;
     System.out.println(obj1.age1);
     System.out.println(obj1.id);
  
   }
}