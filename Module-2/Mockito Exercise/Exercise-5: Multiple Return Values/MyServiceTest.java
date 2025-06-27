import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testMultipleReturns() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("First Call", "Second Call");

        MyService service = new MyService(mockApi);
        String first = service.fetchData();
        String second = service.fetchData();

        assertEquals("First Call", first);
        assertEquals("Second Call", second);
    }
}
