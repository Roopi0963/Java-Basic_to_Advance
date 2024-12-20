package Switch_Cases;

public class Switch_case {
    public static void main(String[] args) {
        String day = "saturday";

        switch(day)
        {
            case "sunday","saturday" :
                System.out.println("8 am");
                break;
            case "monday" :
                System.out.println("7 am");
                break;
            default :
                System.out.println("6 am");

        }
    }
}
