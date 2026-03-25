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
                 /\\            
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
        System.out.println("Коды ASCII:");
        int asciiCode1 = 1055;
        int asciiCode2 = 1088;
        int asciiCode3 = 1080;
        int asciiCode4 = 1074;
        int asciiCode5 = 1077;
        int asciiCode6 = 1090;
        System.out.printf("%-6d%-6d%-6d%-6d%-6d%-6d%n", 
                asciiCode1, asciiCode2, asciiCode3, asciiCode4, asciiCode5, asciiCode6);
        char asciiSymbol1 = (char) asciiCode1;
        char asciiSymbol2 = (char) asciiCode2;
        char asciiSymbol3 = (char) asciiCode3;
        char asciiSymbol4 = (char) asciiCode4;
        char asciiSymbol5 = (char) asciiCode5;
        char asciiSymbol6 = (char) asciiCode6;
        System.out.printf("%-6c%-6c%-6c%-6c%-6c%-6c%n", 
                asciiSymbol1, asciiSymbol2, asciiSymbol3, asciiSymbol4, asciiSymbol5, asciiSymbol6);
        
        System.out.println("\n5. АНАЛИЗ КОДА ТОВАРА");
        int itemCode = 234;
        int category = itemCode / 100;
        int subcategory = itemCode / 10 % 10;
        int packageType = itemCode % 10;
        int digitSum = category + subcategory + packageType;
        int verificationCode = category * subcategory * packageType;
                System.out.println("""
                        категория: %d
                        подкатегория: %d
                        тип упаковки: %d
                        Контрольная сумма: %d
                        Проверочный код: %d
                        """.formatted(category, subcategory, packageType, digitSum, verificationCode));

        System.out.println("\n6. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ");
        byte temperature = Byte.MAX_VALUE;
                System.out.println("""
                        [Температура, °C]:
                        Исходное: %d
                        +1: %d
                        -1: %d
                        """.formatted(temperature, ++temperature, --temperature));
        short pressure = Short.MAX_VALUE;
                System.out.println("""
                        [Давление, psi]:
                        Исходное: %d
                        +1: %d
                        -1: %d
                        """.formatted(pressure, ++pressure, --pressure--));
        char statusCode = Character.MAX_VALUE;
                System.out.println("""
                        [Код состояния, код]:
                        Исходное: %c
                        +1: %c
                        -1: %c
                        """.formatted(statusCode, ++statusCode, --statusCode));
        int distanceTraveled = Integer.MAX_VALUE;
                System.out.println("""
                        [Пройденное расстояние, м]:
                        Исходное: %d
                        +1: %d
                        -1: %d
                        """.formatted(distanceTraveled, ++distanceTraveled, --distanceTraveled));
        long timeFromStart = Long.MAX_VALUE;
                System.out.println("""
                        [Время с момента старта, мс]:
                        Исходное: %d
                        +1: %d
                        -1: %d
                        """.formatted(timeFromStart, ++timeFromStart, --timeFromStart));

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
        System.out.println("""
                        Характеристики JVM
                        Доступное число ядер: %d
                        выделенная память (МБ): %d
                        """);

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