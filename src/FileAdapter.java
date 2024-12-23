public class FileAdapter implements DataSourceAdapter {
    private FileService fileService;
    public FileAdapter() {
        this.fileService = new FileService();
    }

    @Override
    public void fetchData() {
         fileService.getDataFromFile();
    }
}
