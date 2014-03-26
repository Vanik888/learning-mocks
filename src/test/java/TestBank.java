import static org.mockito.Mockito.*;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import static org.mockito.Mockito.mock;

/**
 * Created by vanik on 26.03.14.
 */
public class TestBank {
    Bank mockedBank =  mock(Bank.class);
    @BeforeMethod
    public void setUp() {
        System.out.println("Before method");
    }
    @Test
    public void tesBank() {
        System.out.println("testMethod");
        //.getAccount(10) was called 2 times
        mockedBank.getAccount(10);
        mockedBank.getAccount(10);
        verify(mockedBank, times(2)).getAccount(10);

        //getAccount(100) was called atLeast 1 time
        mockedBank.getAccount(100);
        mockedBank.getAccount(100);
        mockedBank.getAccount(100);
        verify(mockedBank, atLeast(1)).getAccount(100);
        //getAccount(100) was called atMost 2 times
        verify(mockedBank, atMost(2)).getAccount(100);
    }
    @AfterMethod
    public void tearDown() {
        System.out.println("After method");
    }

}
