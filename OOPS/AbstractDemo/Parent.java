public abstract class Parent {

    int age = 5;

     public Parent(int age){
         this.age = age;
     }

    

    //  abstract Parent();      //You cant create abstract constructors


    //You cant create objects of abstrct classes, because if you create object of this Parent class,
    //that means you can access its methods via obj.career() or obj.partner()
    //But these abstract methods dont have a body so what is the purpose of calling it

     //you cant create abstract static methods, becuase abstract methods needs to be overriden
     //And static methods cant be overriden

    abstract void career();
    abstract void partner();
}
