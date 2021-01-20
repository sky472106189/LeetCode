package Properties_Demo;

import customException.CustomException;

import java.io.InputStreamReader;
import java.util.Properties;

public class AppConfigConstants {

    private static Properties properties;

    static{
        load();
    }

    private static void load(){
        try {
            Properties temp = new Properties();
            InputStreamReader in = new InputStreamReader(AppConfigConstants.class.getResourceAsStream("./config.properties"),"UTF-8");
            temp.load(in);
            properties = temp;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //直接调用get 不存在就返回null
    public static String getStr(String key){
        return properties.getProperty(key);
    }

    //不存在则报错
    public static String offer(String key) throws CustomException{
        if(properties.get(key)!=null){
            return properties.getProperty(key);
        }else{
            throw new CustomException("不存在此key");
        }
    }

    public static boolean isExist(String key){
        return (properties.getProperty(key)!=null)?true:false;
    }


}
