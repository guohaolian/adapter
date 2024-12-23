public class NetworkAdapter implements DataSourceAdapter{
    private NetworkService networkService;
    public NetworkAdapter() {
        this.networkService = new NetworkService();
    }

    @Override
    public void fetchData() {
        networkService.getDataFromNetwork();
    }
}
