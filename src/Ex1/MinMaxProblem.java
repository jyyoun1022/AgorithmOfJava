package Ex1;

public class MinMaxProblem {
    public static void main(String[] args) {
        int[] numbers ={10, 55, 23, 2, 79, 101, 16, 82, 30, 45};

        int min = numbers[0];   //배열에 있는 수 중 맨 처음에 있는 값을 max,min으로 가정하기!
        int max = numbers[0];
        int minPos = 0; //최소값의 배열이 몇번째인지?
        int maxPos = 0; //최대값의 배열이 몇번쨰에 있는지?

        for(int i=1; i<numbers.length; i++){    //자기자신은 제외해야하므로 1부터 시작하기
            if(min>numbers[i]){ //만약 numbers[0]>numbers[i] 이라면
                min = numbers[i];   //min =numbers[i]로 바뀐다.
                minPos = i+1;   //minPos는 i+1씩 한다.(배열은 0부터 시작하기때문에)
            }
            if(max <numbers[i]){
                max = numbers[i];
                maxPos = i+1;
            }
        }
        System.out.println("가장 작은값 : " +min + "이고, 위치는" + minPos +"번쨰입니다.");
        System.out.println("가장 큰값 : " +max + "이고, 위치는" + maxPos +"번쨰입니다.");
    }
}
