import java.util.Scanner;
public class TotalSecond {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Hour: ");
        int hour = scanner.nextInt();
        System.out.println("Enter Minutes: ");
        int minutes = scanner.nextInt();
        System.out.println("Enter Seconds: ");
        int seconds = scanner.nextInt();
        int secondInHour = hour * 3600;
        int secondInMinutes = minutes * 60;
        int totalSeconds = secondInHour + secondInMinutes + seconds ;
        
        System.out.println("Total Seconds : " + totalSeconds);
        scanner.close();
    }
}
