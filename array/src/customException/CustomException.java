package customException;

/*
* 自定义异常类
* */
public class CustomException extends Exception{
    public CustomException() {
    }
    public CustomException(String message) {
        super(message);
    }
}
