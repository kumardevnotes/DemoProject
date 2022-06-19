import java.io.FileReader;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) throws Exception {
        FileReader reader=new FileReader("src/test/IOFiles/appData.properties");
        Properties props=new Properties();
        props.load(reader);
        System.out.println(props.getProperty("appBrowser"));
        System.out.println(props.getProperty("appUserName"));
    }
}
