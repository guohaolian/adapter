public class DBAdapter implements DataSourceAdapter {
    private DatabaseService dbService;
    public DBAdapter() {
        this.dbService = new DatabaseService();
    }

    @Override
    public void fetchData() {
        dbService.getDataFromDatabase();
    }
}
