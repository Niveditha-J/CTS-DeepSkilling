// Mocked interface
public interface ExternalApi {
    String getData();
    String getDataById(int id);
    void logData(String data);
}

// Service under test
public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public String fetchDataById(int id) {
        return api.getDataById(id);
    }

    public void log(String data) {
        api.logData(data);
    }

    public void process() {
        String data = api.getData();
        api.logData(data);
    }
}
