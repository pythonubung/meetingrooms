package meetingrooms;
import java.util.ArrayList;
import java.util.List;

public class Office {

    // példányosítjuk, mivel szükség lesz a listára, és így nem marad null
    private List<MeetingRoom> meetingRooms = new ArrayList<>();


    public void addMeetingRoom(String name, int width, int length) {
        // az pedig példányosítson a kapott adatok alapján egy új tárgyalót, majd adja hozzá azt az osztály listájához!
        MeetingRoom meetingRoom = new MeetingRoom(name, width, length);
        // hozzáadjuk a friss objektumot a már korábban példányosított attribútumhoz (meetingRooms lista)
        meetingRooms.add(meetingRoom);
    }

    public List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    public List<MeetingRoom> getMeetingRoomsInReverseOrder() {
        List<MeetingRoom> reverseRooms = new ArrayList<>();
        for(int i=(meetingRooms.size()-1); i>=0; i--) {
                reverseRooms.add(meetingRooms.get(i)); //.getName());
            }


        return reverseRooms;
    }

    public List<MeetingRoom> getEverySecondMeetingRoom(int number) {
        // egy új listát deklarálunk, ide fogjuk pakolni a találatokat és ez lesz return-ben is
        List<MeetingRoom> secondRooms = new ArrayList<>();

        // végigmegyünk a meetinRooms listán
        for(int i=0; i< meetingRooms.size(); i++) {
            // páros = ha felhasználó 2-t adott meg páros
            if(i%2==0 && number==2) {
                secondRooms.add(meetingRooms.get(i));
            }
            else if(i%2==1 && number==1) { // ha a felhasználó 1-et adott meg páratlan
                secondRooms.add(meetingRooms.get(i));
            }
            else {} // hibakezelés helyett...
        }
        return secondRooms;
    }


    public MeetingRoom getMeetingRoomWithGivenName(String name) {

    /* EZ ÉRDEKES, foreach jó lenne, sima for nem??
        // előbb a List tárgyalókon végigmegyünk keresni
        for (int i=0; i<meetingRooms.size(); i++) {
            if(meetingRooms.get(i).getName().equals(name)) {
                // megtaláltuk, adja vissza az objektumot
                return meetingRooms;

            }
        }
        // ha nem találta meg, akkor egy null referenciát adunk vissza
        return null;
     */
        // foreach: objektum típusú item végigmegy a LIST -en!
        for(MeetingRoom item : meetingRooms) {
            // ha az aktuálisan vizsgált eleme neve egyezik a kapott metódusparaméter name-el, akkor return
            if(item.getName().equals(name)) {
                return item; // egy objektumot ad így vissza! tehát jó
            }
        }
        return null; // ha nem találta meg, akkor null-t ad vissza
    }


    public List<MeetingRoom> getMeetingRoomsWithGivenNamePart(String namePart) {
        //egy új lista, ebbbe gyűjtjük a találatokat és return is ezt adja vissza majd
        List<MeetingRoom> givenNamePartRooms = new ArrayList<>();

        // itt most a listában megyünk végig
        for(int i=0; i<meetingRooms.size(); i++) {
            // ha az aktuális sorszámú elem name attribútuma részben egyezik a kapott metódusparaméter namePart-el, akkor return
            if(meetingRooms.get(i).getName().contains(namePart)) {
                givenNamePartRooms.add(meetingRooms.get(i)); // az aktuális elemét a listának bedobjuk, mivel azt találta meg
            }
        }
        //return null; // ha nem találta meg, akkor null-t ad vissza
        return givenNamePartRooms; // ha nem volt találat akkor az üres lista megy vissza

    }



    public List<MeetingRoom> getMeetingRoomsWithAreaLargerThan(int area) {
        // találati lista
        List<MeetingRoom> largeRoom = new ArrayList<>();

        for (MeetingRoom items : meetingRooms) {
            if(items.getArea() > area) {
                largeRoom.add(items);
            }
        }

        //return meetingRooms;
        return largeRoom;
    }

}
