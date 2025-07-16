package homeworks.java.cosmo.string;

/**
 * Нужно привести строку с полным именем к инициалам.
 * Например, "Носов Алексей Олегович" будет иметь вид: "Н.А.О."
 * Носов Алексей Олегович -> Н.А.О.
 * <p>
 * Подсказка: используйте методы .split() и .charAt() класса String
 */
public class ExH {
    public static void main(String[] args) {
        String fullName = "Носов Алексей Олегович";
        String[] nameArray = fullName.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for (String value : nameArray){
            stringBuilder.append(value.charAt(0)).append(".");
        }
        String result = stringBuilder.toString();
        System.out.println(result);
    }
}
