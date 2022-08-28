public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("========BILANGAN PRIMA===========");

        Number number = new Number();
        System.out.println("1 adalah " + number.primeNumber(1));
        System.out.println("2 adalah " + number.primeNumber(2));
        System.out.println("3 adalah " +  number.primeNumber(3));
        System.out.println("4 adalah " + number.primeNumber(4));
        System.out.println("5 adalah " + number.primeNumber(5));
        System.out.println( "1000000007 adalah " + number.primeNumber(1000000007));
        System.out.println( "1500450271 adalah " + number.primeNumber(1500450271));
        System.out.println( "10000000 adalah " + number.primeNumber(10000000));


        System.out.println("========FAST EXPONEN===========");
        Exponen input = new Exponen();
        input.fastExp(7, 8);

    }
}