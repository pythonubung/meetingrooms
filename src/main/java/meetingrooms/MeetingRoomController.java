package meetingrooms;
import java.util.Scanner;


public class MeetingRoomController {

    private Office office;

    public static void main(String[] args) {

        MeetingRoomController controller = new MeetingRoomController();
        controller.runMenu();

    }
        private void runMenu(){
            // Hány tárgyalót szeretne rögzíteni?
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hány darab tárgyaló adatait rögzítsük?");
                int rooms = scanner.nextInt();

            // Tárgyalók adatai: Név? Szélesség? Hosszúság (méter)?
                //for (int parameters : rooms) {
                for(int i=0; i<rooms; i++) {
                    System.out.println("Tárgyaló neve?");
                        String name = scanner.nextLine();
                    System.out.println("Tárgyaló szélessége?");
                        int width = scanner.nextInt();
                    System.out.println("Tárgyaló hosszúsága?");
                        int length = scanner.nextInt();

                    // Az adatokat átadjuk Office addMeetingRoom-nak
                    // Ő példányosítson új tárgyalót, és adja hozzá azt az osztály listájához
                    Office office = new Office();
                    office.addMeetingRoom(name, width, length);
                }

                // Test


                /*
                for (int paramaters : rooms) {
                    System.out.println("Tárgyaló neve:");
                    String name = scanner.hasNextLine(System.in);
                    System.out.println("Tárgyaló szélessége?");
                    int width = scanner.hasNextInt(System.in);
                    System.out.println("Tárgyaló hosszúsága?");
                    int length = scanner.hasNextInt(System.in);
                }

                 */

        }

        private void printMenu() {

        }
}


