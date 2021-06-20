import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void testSetName(){
        Account myAccount = new Account();

        assertNull(myAccount.getName());

        myAccount.setName("Toba Armani");

        assertEquals("Toba Armani", myAccount.getName());
    }



    }

