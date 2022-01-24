public class Example {
    enum Week implements A{      //All Enums explicitly Extends java.lang.Enums class.   So you cant really extend any other class
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enums constants
        //these are public static final by default
        //ce these are final, you cant create child enums
        // type of these Objects is Week

        Week(){
                System.out.println("Constructor called for " + this);
        }

         //this is not public or protected, only private or default
        //why? -> we dont want to create new objects of type Week
        //Bcz that is not the concept of Enums

        //internally : public static final Week Monday = new Week();

        @Override
        public void hello() {
            System.out.println("How are you");
            
        }    
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        // System.out.println(week);

        // for(Week day : Week.values()){
        // System.out.println(day);
        // }

        // System.out.println(week.ordinal());
    }
}
