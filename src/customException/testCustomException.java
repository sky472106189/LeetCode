package customException;

public class testCustomException {
    public static void main(String[] args) {
        Integer i = 10;
        Integer j = 0;
//        Integer j = 2;
        try{
            if(j==0){
                throw new CustomException("被除数不能为0");
            }else{
                Integer result = i/j;
                System.out.println(result);
            }
        }catch (CustomException e){
            System.out.println(e.getMessage());
        }


    }
}
