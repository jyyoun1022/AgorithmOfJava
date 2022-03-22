package programmers;

public class 소수만들기 {


    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4};
        System.out.println(solution(arr));
    }

    //1. 2-N 이하 자연수로 나누어지는지 판별
    static public int solution(int[] nums) {
        int answer = 0;

        //서로 다른 3개의 수 조회
        for(int i=0; i< nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                for(int k=j+1; k< nums.length; k++){
                    int sum = nums[i]+nums[j]+nums[k];

                    answer += isPrime(sum)? 1 : 0;
                }
            }
        }
        return answer;
    }
    private static boolean isPrime(int num){
        for(int i=2; i<=Math.sqrt(num); i++){

            //나눠떨어질 경우
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}