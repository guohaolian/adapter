import java.util.ArrayList;
import java.util.List;

// 数据存储系统，使用适配器进行数据存储
public class client {

    public static void main(String[] args) {
        DataSourceAdapter dataSourceAdapter = (DataSourceAdapter)XMLUtil.getBean("base");
        dataSourceAdapter.fetchData();
    }
}
