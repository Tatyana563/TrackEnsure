package calculation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Calculation {
    public static void main(String[] args) {
        // findSin("10", "100");
       // findSin2("10", "100");
        findSin3(10,100,10);
    }

    public static void findSin(String a, String b) {
        double max = 0;
        BigDecimal step = new BigDecimal("10");
        BigDecimal value1 = new BigDecimal(a);
        BigDecimal value2 = new BigDecimal(b);
        for (BigDecimal value = value1;

             value.compareTo(value2) < 0;
             value = value.add(step)) {
            List<BigDecimal> list = new ArrayList<>();
            list.add(value);
            System.out.println("the value is: " + value);
            for (int i = 0; i < list.size(); i++) {
                Double d = list.get(i).doubleValue();
                Double radians = Math.toRadians(d);
                Double sin = Math.sin(radians);
                List<Double> sinList = new ArrayList<>();
                sinList.add(sin);
                System.out.println("sin:" + sinList);
                max = Collections.max(sinList);
            }
        }

        System.out.println("max value from sinList:" + max);
    }

    public static void findSin2(String a, String b) {
        double max = 0;
        BigDecimal step = new BigDecimal("10");
        BigDecimal value1 = new BigDecimal(a);
        BigDecimal value2 = new BigDecimal(b);
        BigDecimal value = value1;
        List<Double> sinList = new ArrayList<>();
        do {
            value = value.add(step);
            List<BigDecimal> list = new ArrayList<>();
            list.add(value);
            System.out.println("the value is: " + value);

            for (int i = 0; i < list.size(); i++) {
                Double d = list.get(i).doubleValue();
                Double radians = Math.toRadians(d);
                Double sin = Math.sin(radians);
                sinList.add(sin);

            }

        }
        while (value.compareTo(value2) < 0);
        max = Collections.max(sinList);
        System.out.println("max value from sinList:" + max);
        for (int j = 0; j < sinList.size(); j++) {
            System.out.println("Sin:" + sinList.get(j));
        }
    }
    public static void findSin3(int a, int b, int step){
        Integer []arr = new Integer[9];
        Double []sinArr = new Double[9];
        List<Integer> list = new ArrayList<>();
       while(a<b) {a=a+step;
            System.out.println(a);
            list.add(a);
       }
        System.out.println(list);
        arr = list.toArray(new Integer[0]);
        System.out.println("Array: "+Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            Double radians = Math.toRadians(arr[i]);
            Double sin = Math.sin(radians);
            sinArr[i]=sin;
        }
        System.out.println(Arrays.toString(sinArr));
        double max=0;
        for(int j=0;j<sinArr.length;j++){
            sinArr[0]=max;
            if(sinArr[j]>max){
                max=sinArr[j];
            }

        }
        System.out.println("MAX VALUE:"+max);
    }



}






