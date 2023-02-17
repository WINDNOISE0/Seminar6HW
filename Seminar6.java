import java.util.ArrayList;
import java.util.List;

public class Seminar6 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        addNum(45, array);
        addNum(45, array);
        addNum(89, array);
        addNum(79, array);
        addNum(101, array);
        addNum(79,array);
        showArray(array);
        }
        public static void addNum(Integer num, List<Integer> array){
            if(!array.contains(num)) {
                array.add(num);
            }

        }
        public static void showArray(List<Integer> arrays){
            for(Integer num: arrays){
                System.out.println(num);
            }
        }
    }
