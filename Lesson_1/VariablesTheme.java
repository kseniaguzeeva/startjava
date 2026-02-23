import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. ВЫВОД ASCII-ГРАФИКИ");
        System.out.println(String.join("\n",
                "                     /\\",
                "   J    a  v     v  /  \\",
                "   J   a a  v   v  /_( )\\",
                "J  J  aaaaa  V V  /      \\",
                " JJ  a     a  V  /___/\\___\\"
        ));
        String block = """
                 /\\            \s
           J    /  \\  v     v  a
           J   /_( )\\  v   v  a a
        J  J  /      \\  V V  aaaaa
         JJ  /___/\\___\\  V  a     a""";
        System.out.println(block);
        
        System.out.println("\n2. РАСЧЕТ СТОИМОСТИ ТОВАРА");
        float penPrice = 10.5f;
        float bookPrice = 235.23f;
        int percent = 11;
        float basePrice = penPrice + bookPrice;
        float discountSum = basePrice * percent / 100;
        float basePriceWithDiscount = basePrice - discountSum;
        System.out.println("стоимость товаров без скидки " + basePrice);
        System.out.println("сумма скидки " + discountSum);
        System.out.println("стоимость товаров со скидкой " + basePriceWithDiscount);
        BigDecimal penPriceBd = new BigDecimal("10.5");
        BigDecimal bookPriceBd = new BigDecimal("235.23");
        BigDecimal percentBd = new BigDecimal("11");
        BigDecimal basePriceBd = penPriceBd.add(bookPriceBd)
                .setScale(2, RoundingMode.HALF_UP);
        BigDecimal discountSumBd = basePriceBd.multiply(percentBd)
                .divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);
        BigDecimal basePriceWithDiscountBd = basePriceBd
                .subtract(discountSumBd).setScale(2, RoundingMode.HALF_UP);
        System.out.println("стоимость товаров без скидки в BigDecimal " + basePriceBd);
        System.out.println("сумма скидки в BigDecimal " + discountSumBd);
        System.out.println("стоимость товаров со скидкой в  BigDecimal " + basePriceWithDiscountBd);
        
        System.out.println("\n3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");
        System.out.println("третья переменная");
        System.out.println("a1 = 2, b1 = 5");
        int a1 = 2;
        int b1 = 5;
        int temp = a1;
        a1 = b1;
        b1 = temp;
        System.out.println("Результат: a1 = " + a1);
        System.out.println("Результат: b1 = " + b1);
        System.out.println("арифметические операции");
        System.out.println("a1 = 5, b1 = 2");
        a1 = a1 + b1; 
        b1 = a1 - b1;  
        a1 = a1 - b1;   
        System.out.println("Результат: a1 = " + a1);
        System.out.println("Результат: b1 = " + b1);
        System.out.println("побитовая операция ^");
        System.out.println("a1 = 2, b1 = 5");
        a1 = a1 ^ b1;
        b1 = a1 ^ b1;
        a1 = a1 ^ b1;
        System.out.println("Результат: a1 = " + a1);
        System.out.println("Результат: b1 = " + b1);
        
        System.out.println("\n4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ");
        int[] asciiCodes = {1055, 1088, 1080, 1074, 1077, 1090};
        char[] characters = new char[asciiCodes.length];
        for (int i = 0; i < asciiCodes.length; i++) {
            characters[i] = (char) asciiCodes[i];
        }
        System.out.println("Коды ASCII:");
        int code1 = 1055;
        int code2 = 1088;
        int code3 = 1080;
        int code4 = 1074;
        int code5 = 1077;
        int code6 = 1090;
        System.out.printf("%-6d%-6d%-6d%-6d%-6d%-6d%n", 
                code1, code2, code3, code4, code5, code6);
        System.out.printf("%-6c%-6c%-6c%-6c%-6c%-6c%n", 
                (char) code1, (char) code2, (char) code3, 
                (char) code4, (char) code5, (char) code6);
        
        System.out.println("\n5. АНАЛИЗ КОДА ТОВАРА");
        int itemCode = 234;
        int category = itemCode / 100;
        int subcategory = itemCode / 10 % 10;
        int packageType = itemCode % 10;
        System.out.println("категория товара - " + category);
        System.out.println("подкатегория - " + subcategory);
        System.out.println("тип упаковки - " + packageType);
        int numberSum = category + subcategory + packageType;
        System.out.println("Контрольная сумма = " + numberSum);
        int verificationCode = category * subcategory * packageType;
        System.out.println("Проверочный код = " + verificationCode);

        System.out.println("\n6. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ");
        byte temperature = Byte.MAX_VALUE;
        short pressure = Short.MAX_VALUE;
        char statusCode = Character.MAX_VALUE;
        int distanceTraveled = Integer.MAX_VALUE;
        long timeFromStart = Long.MAX_VALUE;
        System.out.println("[Температура, °C]:" + "\n" +
                "  Исходное: " + temperature + "\n" +
                "  +1: " + (temperature + 1) + "\n" +
                "  -1: " + (temperature - 1));
        System.out.println("[Давление, psi]:" + "\n" +
                "  Исходное: " + pressure + "\n" +
                "  +1: " + (pressure + 1) + "\n" +
                "  -1: " + (pressure - 1));
        System.out.println("[Код состояния, код]:" + "\n" +
                "  Исходное: " + statusCode + "\n" +
                "  +1: " + (statusCode + 1) + "\n" +
                "  -1: " + (statusCode - 1));
        System.out.println("[Пройденное расстояние, м]:" + "\n" +
                "  Исходное: " + distanceTraveled + "\n" +
                "  +1: " + (distanceTraveled + 1) + "\n" +
                "  -1: " + (distanceTraveled - 1));
        System.out.println("[Время с момента старта, мс]:" + "\n" +
                "  Исходное: " + timeFromStart + "\n" +
                "  +1: " + (timeFromStart + 1) + "\n" +
                "  -1: " + (timeFromStart - 1));
        //
        System.out.println("\n7. ВЫВОД ПАРАМЕТРОВ JVM И ОС");
        Runtime runtime = Runtime.getRuntime();
        int availableProcessors = runtime.availableProcessors();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long maxMemory = runtime.maxMemory();
        long usedMemory = totalMemory - freeMemory;
        System.out.println("Характеристики JVM");
        System.out.println("Доступное число ядер:" + runtime.availableProcessors());
        System.out.println("выделенная память (МБ): " + (totalMemory / 1048576));
        System.out.println("Свободная память (Мб): " + (freeMemory / 1048576));
        System.out.println("Используемая память (Мб): " + (usedMemory / 1048576));
        System.out.println("Максимальная память (Мб): " + (maxMemory / 1048576));
        String systemDrive = System.getProperty("user.dir");
        String osVersion = System.getProperty("os.version");
        String javaVersion = System.getProperty("java.version");
        String fileSeparator = System.getProperty("file.separator");
        System.out.println("\nПАРАМЕТРЫ ОС");
        System.out.println("системный диск: " + systemDrive);
        System.out.println("версия ОС: " + osVersion);
        System.out.println("версия Java: " + javaVersion);
        System.out.println("символ разделения пути (сепаратор). И это не точка с запятой: " + fileSeparator);

        System.out.println("\n8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА");
        long startTime = System.nanoTime();
        LocalTime startLocalTime = LocalTime.now();
        long endTime = System.nanoTime();
        LocalTime endLocalTime = LocalTime.now();
        double executionTimeSeconds = (endTime - startTime) / 1_000_000_000.0;
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        String startTimeFormatted = startLocalTime.format(timeFormatter);
        String endTimeFormatted = endLocalTime.format(timeFormatter);
        String result = String.format("""
                | Старт проверки | %s |
                | Финиш проверки | %s |
                | Время работы   | %.3f сек    |
                """, startTimeFormatted, endTimeFormatted, executionTimeSeconds);
        System.out.print(result);
    }
}