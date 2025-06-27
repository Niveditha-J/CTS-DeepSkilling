import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVoidMethodThrowsException() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        doThrow(new RuntimeException("Logging failed")).when(mockApi).logData(anyString());

        MyService service = new MyService(mockApi);

        assertThrows(RuntimeException.class, () -> {
            service.log("Trigger exception");
        });

        verify(mockApi).logData(eq("Trigger exception"));
    }
}
