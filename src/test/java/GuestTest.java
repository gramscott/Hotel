import org.example.guests.Guest;
import org.junit.Before;

public class GuestTest {

    Guest guest;

    @Before
    public void setGuest(){
        guest = new Guest("Simon");
    }
}
