import java.util.*;

class FindOddNoArr{

    public static void main(String[] args) {

        int[] numbers = {10, 44, 555, 999, 5, 6, 77, 50, 633, 80, 40, 550, 440, 444, 603, 708, 503, 555,  03, 05, 80, 702, 201, 308, 397};

        getResult(numbers);
    }

    private static void getResult(int[] numbers) {

        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumber = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++){

            if(numbers[i] % 2 == 0){
                evenNumber.add(numbers[i]);
            }else {
                oddNumbers.add(numbers[i]);
            }
        }

        System.out.println("oddNumbers = " + oddNumbers);
        System.out.println("\nevenNumber = " + evenNumber);
    }
}