import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVoidMethod() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        doNothing().when(mockApi).logData(anyString());

        MyService service = new MyService(mockApi);
        service.log("Test log");

        verify(mockApi).logData(eq("Test log"));
    }
}
