package meetingrooms;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class MeetingRoomController {

    // azért kell, hogy az Office attribútumait elérjük
    private Office office = new Office();

    // ?? IDE érdemes a Scanner-t példányosítani, az pufferelést megoldja?
    // azért érdemes kiemelni, hogy ne kelljen többször példányosítani metódusokban
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        MeetingRoomController controller = new MeetingRoomController();
        controller.runMenu();

    }
        private void runMenu(){
            // Hány tárgyalót szeretne rögzíteni?
            //Scanner scanner = new Scanner(System.in);
            System.out.println("Hány darab tárgyaló adatait rögzítsük?");
                int rooms = scanner.nextInt();
                scanner.nextLine(); // azért, hogy utána az enter-t is bevegye
            readMeetingRooms(rooms); // ezt jobb gomb-->Refactor-->Extract method -dal Idea kiszervezte, átneveztük

            // meghívja a printMenu()-t
                printMenu();
                // Test

                    System.out.println(office.getMeetingRooms().size());
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

    private void readMeetingRooms(int rooms) {
        // Tárgyalók adatai: Név? Szélesség? Hosszúság (méter)?
        //for (int parameters : rooms) {
        for(int i = 0; i< rooms; i++) {
            System.out.println("Tárgyaló neve?");
                String name = scanner.nextLine();
                // just as "buffer" to not to skip to next nextInt right after
                 scanner.nextLine();
            System.out.println("Tárgyaló szélessége?");
                int width = scanner.nextInt();
                // just as "buffer" to not to skip to next nextInt right after
                scanner.nextLine();
            System.out.println("Tárgyaló hosszúsága?");
                int length = scanner.nextInt();
                // just as "buffer" to not to skip to next nextInt right after
                scanner.nextLine();
                // just as "buffer" to not to skip to next nextInt right after
                // scanner.nextLine();

            // Az adatokat átadjuk Office addMeetingRoom-nak
            // Ő példányosítson új tárgyalót, és adja hozzá azt az osztály listájához
            // EZ nem jó itt, mivel túl sokszor példányosítana... elejére osztálynak kiemeltük: Office office = new Office();
            office.addMeetingRoom(name, width, length);
        }
    }

    private void printMenu() {

            System.out.println("1. Tárgyalók sorrendben");
            System.out.println("2. Tárgyalók visszafele sorrendben");
            System.out.println("3. Minden második tárgyaló");
            System.out.println("4. Területek");
            System.out.println("5. Keresés pontos név alapján");
            System.out.println("6. Keresés névtöredék alapján");
            System.out.println("7. Keresés terület alapján");
            System.out.println("8. Kilépés");

            System.out.println("Kérem a menüpont számát!");
            int whichMethod = scanner.nextInt();
            scanner.nextLine();

        chooseMenuItem(whichMethod); // ezt is kiszervezte Refactorral Idea

    }

    private void chooseMenuItem(int whichMethod) {
        if (whichMethod ==1) {
            printNames(                 // én írom meg, ciklussal végigmegy a lista elemein és kiírja őket szépen
                        office.getMeetingRooms()
            );
        }
        if (whichMethod ==2) {
            printNames( office.getMeetingRoomsInReverseOrder() );
        }
        if (whichMethod ==3) {
            System.out.println("Ha 1-est ad be a páratlanok jönnek, ha 2-est a párosak. Melyik legyen?");
            int number = scanner.nextInt();
            scanner.nextLine();

            printNames(office.getEverySecondMeetingRoom(number));
        }
        if (whichMethod ==4) {
            printMeetingRooms(office.getMeetingRooms());
        }
        if (whichMethod ==5) {

        }
        if (whichMethod ==6) {

        }
        if (whichMethod ==7) {

        }
        if (whichMethod ==8) {

        }
        else
        {

        }
    }

    // kiiratásra mi írjuk meg
    private void printNames(List<MeetingRoom> listOfRooms) {
        for (MeetingRoom items : listOfRooms) {
            System.out.println(items.getName());
        }
    }

    // kiiratásra mi írjuk meg, a tárgyalók minden adatát szépen kiírja
    private void printMeetingRooms(List<MeetingRoom> meetingRooms){
        for (MeetingRoom item : meetingRooms) {
            System.out.println(
                                "név: " + item.getName() + " , " +
                                "szélessége: " + item.getWidth() + " méter, " +
                                "hossza: " + item.getLength() + " méter,  " +
                                "területe: " + item.getArea() + " m2."
            );
        }

    }


}


