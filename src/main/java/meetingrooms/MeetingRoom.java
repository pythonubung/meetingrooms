package meetingrooms;

public class MeetingRoom {

    private String name;
    private int width;
    private int length;

    public MeetingRoom(String name, int width, int length) {
        // attribútumok beállítása paraméterek alapján
        this.name = name;
        this.width = width;
        this.length = length;
    }

    public int getArea() {
        // tárgyaló területét adja vissza
        int area = width * length;
        return(area);
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
