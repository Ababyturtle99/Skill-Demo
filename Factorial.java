class Factorial {
    public int Fact(int num) {
        if(num < 0) {
            return -1;
        }else {
            int answer = 1;
            while(num > 0) {
                answer *= num;
                num--;
            }
            return answer;
        }
    }
}