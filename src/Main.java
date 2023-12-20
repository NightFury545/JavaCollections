public class Main {

    public static void main(String[] args) {
        TestingJavaCollections testingJavaCollections = new TestingJavaCollections();
        testingJavaCollections.fillAllCollections(50000);
        System.out.println(" ");
        testingJavaCollections.showTimeFillResults();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        TestingJavaCollections testingJavaCollections2 = new TestingJavaCollections();
        testingJavaCollections2.fillAllCollections(500000);
        System.out.println(" ");
        testingJavaCollections2.showTimeFillResults();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        TestingJavaCollections testingJavaCollections3 = new TestingJavaCollections();
        testingJavaCollections3.fillAllCollections(5000000);
        System.out.println(" ");
        testingJavaCollections3.showTimeFillResults();
        System.out.println(" ");
        System.out.println("---------------------------------------------------------");
        System.out.println(" ");
        testingJavaCollections.testAllCollections(50000);
        System.out.println(" ");
        testingJavaCollections.showTimeTestResults();
        System.out.println("+++++++++++++++++++++++++++++++++++");
        testingJavaCollections2.testAllCollections(500000);
        System.out.println(" ");
        testingJavaCollections2.showTimeTestResults();
        System.out.println("+++++++++++++++++++++++++++++++++++");
        testingJavaCollections3.testAllCollections(5000000);
        System.out.println(" ");
        testingJavaCollections3.showTimeTestResults();
    }
}