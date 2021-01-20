package Properties_Demo;

import customException.CustomException;

/*
* 利用Properties读取配置文件
*   同时还熟悉架构方法的书写规范,同样的方法，提供三种方式
*   1.不报错   getStr
*   2.报错     offer
*   3.是否存在 isExist
* */
public class PropertiesDemo {
    public static void main(String[] args) {
        System.out.println(AppConfigConstants.getStr("appkey"));
        System.out.println(AppConfigConstants.getStr("appId"));//null 不报错

        try {
            System.out.println(AppConfigConstants.offer("appId"));//报错提示
        } catch (CustomException e) {
            e.printStackTrace();
        }

        System.out.println(AppConfigConstants.isExist("appkey"));
        System.out.println(AppConfigConstants.isExist("appId"));
    }
}
