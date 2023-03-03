public class test0002{
    public static void main(String[] args) {
        test0003 human1 = new test0003("Man", 180, 80);
        test0003 human2;
        human2 = human1;
        human2.printHight();
        human2.printWeight();
    }
}
