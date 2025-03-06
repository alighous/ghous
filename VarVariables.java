import java.util.List;
import java.util.Map;

public class VarVariables {

    public static int getDays(String month, int year){
        return switch (month){
            case  "SEPTEMBER", "APRIL","JUNE"->30;
            case "FEBUARY" -> {
                System.out.println("check the year" + year);
                yield year==2025? 28:29;
            }
            default->31;
        };

    }

    public static void main(String[] args) {
/*    String multiLine = """
           This is
           mutline
           example
           """;
        System.out.println(multiLine);*/
        System.out.println(getDays("FEBUARY",2025));

    }
}