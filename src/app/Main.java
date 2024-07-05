package app;

public class Main {

    public static void main(String[] args) {

        DataProvider provider = new DataProvider();
        DataHandler dataHandler = new DataHandler();

        // Обробка масиву даних найменувань товарів
        String namesOutput = dataHandler.<String>handleData(provider.getProductNames());//add type<String>
        getOutput("Products: " + namesOutput);

        // Обробка масиву даних про суми продажів
        String salesOutput = dataHandler.<Double>handleData(provider.getSalesAmounts());//add type <Double>
        getOutput("Sales, EUR: " + salesOutput);
    }

    // Виведення результату роботи програми
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
