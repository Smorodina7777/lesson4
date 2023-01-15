public class Recursion {
    //Задача 6
    static String bin = "";

    public static int decToBin(int dec) {


        if (dec == 0) {

            System.out.println(bin);
            return dec;
        }

        bin = (dec % 2) + bin;

        decToBin(dec / 2);
        return dec;
    }

    //Задача 7
    public static int stepen(int N) {
        if (N == 1) {
            return 5;
        }
        int i = 5 * stepen(N - 1);
        return i;
    }
    //Задача 8
    static int sumN = 0;
public static int summa(int num){
    if (num <10){
        System.out.println(num+" = "+(sumN+num));
        return num;
    }
    int n= num%10;
    System.out.print(n+" + ");
    sumN+=n;
    summa(num/10);
    return num;
}


}
