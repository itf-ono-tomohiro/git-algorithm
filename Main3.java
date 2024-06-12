import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 入力パラメータを読み込む
        String input = br.readLine();
        String[] param = input.split(" ");//入力値を空白で分解する
        Integer sum = 0;
        String type = null;

        for(int i = 0;i < param.length; i++ ){
            if(param[i].equals("+") || param[i].equals("-")){
                type = param[i];
            } else{
                Integer num = Integer.parseInt(param[i]);
                if(type != null){
                    if(type.equals("+")){
                        sum += num;
                    }else if(type.equals("-")){
                        sum -= num;
                    }
                } else {
                    sum = num;
                }
            }
        }
        System.out.println(sum);
    }
}