public class Main {
    public static void main(String[] args) {

        System.out.println(APCalendar.numberOfLeapYears(2000, 2025));
        
        System.out.println(APCalendar.dayOfWeek(1, 5, 2019));  
        System.out.println(APCalendar.dayOfWeek(1, 10, 2019)); 
        
        System.out.println(APCalendar.dayOfWeek(2, 14, 2023)); 
        System.out.println(APCalendar.dayOfWeek(7, 4, 2025)); 
    }
}