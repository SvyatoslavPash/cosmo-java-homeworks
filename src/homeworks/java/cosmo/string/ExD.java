package homeworks.java.cosmo.string;

/**
 * Напишите программу,
 * которая на вход получает строку “Мама мыла Милу мылом!”
 * и выводит каждый символ строки на отдельной строке.
 * <p>
 * Подсказка: используйте метод .toCharArray() класса String
 */
public class ExD {
    public static void main(String[] args) {
        String input = "Мама мыла Милу мылом!";
        char[] inputArray = input.toCharArray();
        /*for (int i = 0; i < inputArray.length; i++){
            System.out.println(inputArray[i]);
        }*/
        for (char ch : inputArray){
            System.out.println(ch);
        }
    }
}