public class Classroom{
    Wilder w1= new Wilder("Jean-Claude", true);
    Wilder w2= new Wilder("Henri", false);
    public static void main(String[] args){

        Classroom c = new Classroom();
        c.w1.whoAmI();
        c.w2.whoAmI();
    }
}

