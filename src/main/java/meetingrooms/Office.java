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
        return meetingRooms;
    }

    public List<MeetingRoom> getEverySecondMeetingRoom(int number) {
        return meetingRooms;
    }

    /*
    public MeetingRoom getMeetingRoomWithGivenName(String name) {
        Office office = new Office();
        office.getMeetingRooms(name);
        MeetingRoom meetingroom = new MeetingRoom();
        return meetingroom;
    }
    */
    public List<MeetingRoom> getMeetingRoomsWithGivenNamePart(String namePart) {
        return meetingRooms;
    }

    public List<MeetingRoom> getMeetingRoomsWithAreaLargerThan(int area) {
        return meetingRooms;
    }

}
