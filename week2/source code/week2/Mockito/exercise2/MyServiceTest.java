package week2.Mockito.exercise2;



import org.junit.Test;
import week2.Mockito.exercise1.ExternalApi;
import week2.Mockito.exercise1.MyService;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Use the service
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Step 3: Verify the mock method was called once
        verify(mockApi).getData();
    }


}
