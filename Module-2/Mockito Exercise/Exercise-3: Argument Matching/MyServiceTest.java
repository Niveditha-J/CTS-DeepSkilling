import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testArgumentMatching() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getDataById(anyInt())).thenReturn("Mocked Data");

        MyService service = new MyService(mockApi);
        String result = service.fetchDataById(10);

        assertEquals("Mocked Data", result);
        verify(mockApi).getDataById(eq(10)); // Verify argument
    }
}
