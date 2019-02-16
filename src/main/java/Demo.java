

public class Demo {


    public int testJenkins(int a, int b) {

        System.out.println("AJ test");


        int sum = a + b;
        return sum;

    }

    public static void main(String arg[]){

        Demo test = new Demo();
        int sum1 = test.testJenkins(1,4);
        System.out.println("AJ " + sum1);

    }

}