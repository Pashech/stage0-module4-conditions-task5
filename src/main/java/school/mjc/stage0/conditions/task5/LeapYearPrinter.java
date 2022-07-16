package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {

        switch (year){
            case (2000):
            case (2004):
            case (2008):
            case (2012):
                System.out.println("leap");
                break;

            case (1900):
            case (1904):
                System.out.println("not leap");
        }
    }
}
