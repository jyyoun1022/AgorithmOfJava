package programmers;

public class 전화번호가리기 {
    public static void main(String[] args) {

        String num= "01046232891";

        String answer ="";
        String[] split = num.split("");
        for(int i=0; i< split.length; i++){
            if(i< (split.length-4)){
                answer += "*";
            }else {
                answer += split[i];
            }
        }
        System.out.println(answer);
    }
}
