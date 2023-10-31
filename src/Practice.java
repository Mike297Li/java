import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        /*int num=12;

        System.out.println( getNextEvenNumber(num));*/
        Scanner scanner=new Scanner(System.in);
        int x1=scanner.nextInt();
        int y1=scanner.nextInt();
        int x2=scanner.nextInt();
        int y2=scanner.nextInt();

        System.out.println(getDistance(x1,y1,x2,y2));

        System.out.println(getSlop(x1,y1,x2,y2));
        System.out.println(4/3);
    }

    private static double getSlop(int x1, int y1, int x2, int y2) {
        return (y2-y1)/(x2-x1);
    }

    private static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.pow((x2-x1),2)+ Math.pow((y2-y1),2);
    }

    private static int getNextEvenNumber(int num) {
        if(num%2==0){
            return num+2;
        }else {
            return num+1;
        }
    }

    private static String getMonthName(int month) {
        switch (month){
            case 1:
                return "January";
            case 2:
                return "February";
            default:
                return "No corresponding month name";
        }
    }
}
