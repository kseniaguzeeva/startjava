import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. ВЫВОД ASCII-ГРАФИКИ");
        String line1 = String.join(" ", "                        /\\");
        String line2 = String.join(" ", "   J    a  v     v     /  \\");
        String line3 = String.join(" ", "   J   a a  v   v     /_( )\\");
        String line4 = String.join(" ", "J  J  aaaaa  V V     /      \\");
        String line5 = String.join(" ", " JJ  a     a  V     /___/\\___\\");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println();
        String block = """
                 /\\            \s
           J    /  \\  v     v  a
           J   /_( )\\  v   v  a a
        J  J  /      \\  V V  aaaaa
         JJ  /___/\\___\\  V  a     a

                """;
        System.out.println(block);
        System.out.println("2. РАСЧЕТ СТОИМОСТИ ТОВАРА");
        float penPrice = 10.5f;
        float bookPrice = 235.23f;
        int percent = 11;
        float totalFullPrice = penPrice + bookPrice;
        float totalPercent = totalFullPrice * percent / 100;
        float totalPriceWithDiscount = totalFullPrice - totalPercent;
        System.out.println(totalFullPrice);
        System.out.println(totalPercent);
        System.out.println(totalPriceWithDiscount);
        BigDecimal penPriceBd = new BigDecimal("10.5");
        BigDecimal bookPriceBd = new BigDecimal("235.23");
        BigDecimal percentBd = new BigDecimal("11");
        BigDecimal totalFullPriceBd = penPriceBd.add(bookPriceBd)
                .setScale(2, RoundingMode.HALF_UP);
        BigDecimal totalPercentBd = totalFullPriceBd.multiply(percentBd)
                .divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);
        BigDecimal totalPriceWithDiscountBd = totalFullPriceBd
                .subtract(totalPercentBd).setScale(2, RoundingMode.HALF_UP);
        System.out.println(totalFullPriceBd);
        System.out.println(totalPercentBd);
        System.out.println(totalPriceWithDiscountBd);
        System.out.println("3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");
        System.out.println("A1 = 2, B1 = 5");
        System.out.println("третья переменная");
        int a1 = 2;
        int b1 = 5;
        int temp = a1;
        a1 = b1;
        b1 = temp;
        System.out.println("Результат: A1 = " + a1);
        System.out.println("Результат: B1 = " + b1);
        System.out.println("арифметические операции");
        a1 = a1 + b1; 
        b1 = a1 - b1;  
        a1 = a1 - b1;  
        a1 = a1 + b1;
        b1 = a1 - b1;
        a1 = a1 - b1; 
        System.out.println("Результат: A1 = " + a1);
        System.out.println("Результат: B1 = " + b1);
        System.out.println("побитовая операция ^");
        a1 = a1 ^ b1;
        b1 = a1 ^ b1;
        a1 = a1 ^ b1;
        a1 = a1 ^ b1;
        b1 = a1 ^ b1;
        a1 = a1 ^ b1;
        System.out.println("Результат: A1 = " + a1);
        System.out.println("Результат: B1 = " + b1);
        System.out.println("4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ");
        int[] asciiCodes = {1055, 1088, 1080, 1074, 1077, 1090};
        char[] characters = new char[asciiCodes.length];
        for (int i = 0; i < asciiCodes.length; i++) {
            characters[i] = (char) asciiCodes[i];
        }
        System.out.println("Коды ASCII:");
        for (int i = 0; i < asciiCodes.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
            }
            System.out.printf("%-6d", asciiCodes[i]);
        }
        System.out.println();
        System.out.println("Символы:");
        for (int i = 0; i < characters.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
            }
            System.out.printf("%-6c", characters[i]);
        }
        
        System.out.println();
        System.out.println("5. АНАЛИЗ КОДА ТОВАРА");
        String itemCode = "234";
        System.out.println("категория товара" + itemCode.charAt(0));
        System.out.println("подкатегория" + itemCode.charAt(1));
        System.out.println("тип упаковки" + itemCode.charAt(2));
        int checkSum = 0;
        for (int i = 0; i < itemCode.length(); i++) {
            checkSum += itemCode.charAt(i) - '0';
        }
        System.out.println("Контрольная сумма: " + checkSum);
        int checkCode = 1;
        for (int i = 0; i < itemCode.length(); i++) {
            checkCode *= itemCode.charAt(i) - '0';
        }
        System.out.println("Проверочный код:" + checkCode);
        System.out.println("6. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ");
        byte temperature = Byte.MAX_VALUE;
        short pressure = Short.MAX_VALUE;
        char systemCode = Character.MAX_VALUE;
        int distance = Integer.MAX_VALUE;
        long time = Long.MAX_VALUE;
        System.out.println("""
                [Температура, °C]
                  Исходное: %d
                  +1: %d
                  -1: %d
                """.formatted(temperature, ++temperature, --temperature));
        System.out.println("""
                [Давление, psi]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """.formatted(pressure, ++pressure, --pressure));
        System.out.println("""
                [Код состояния, код]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """.formatted((int) systemCode, (int) ++systemCode, 
                        (int) --systemCode));
        System.out.println("""
                [Пройденное расстояние, м]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """.formatted(distance, ++distance, --distance));
        System.out.println("""
                [Время с момента старта, мс]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """.formatted(time, ++time, --time));
        System.out.println("7. ВЫВОД ПАРАМЕТРОВ JVM И ОС");
        
        Runtime runtime = Runtime.getRuntime();
        System.out.println("========================================");
        System.out.println("ХАРАКТЕРИСТИКИ JVM");
        System.out.printf("Доступное число ядер:   %d%n", 
                runtime.availableProcessors());
        
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long maxMemory = runtime.maxMemory();
        long usedMemory = totalMemory - freeMemory;
        
        double totalMemoryMb = totalMemory / (1024.0 * 1024.0);
        double freeMemoryMb = freeMemory / (1024.0 * 1024.0);
        double usedMemoryMb = usedMemory / (1024.0 * 1024.0);
        double maxMemoryMb = maxMemory / (1024.0 * 1024.0);
        
        System.out.printf("Выделенная память:      %.1f МБ%n", totalMemoryMb);
        System.out.printf("Свободная память:       %.1f МБ%n", freeMemoryMb);
        System.out.printf("Используемая память:    %.1f МБ%n", usedMemoryMb);
        System.out.printf("Максимальная память:    %.1f МБ%n", maxMemoryMb);
        
        System.out.println();
        System.out.println("ПАРАМЕТРЫ ОС");
        
        // Получаем и сразу используем параметры ОС
        String systemDrive = System.getenv("SystemDrive");
        if (systemDrive == null || systemDrive.isEmpty()) {
            systemDrive = "C:";
        }
        System.out.printf("Системный диск:         %s%n", systemDrive);
        
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        System.out.printf("Версия ОС:              %s %s%n", osName, osVersion);
        
        final String javaVersion = System.getProperty("java.version");
        System.out.printf("Версия Java:            %s%n", javaVersion);
        
        final String fileSeparator = System.getProperty("file.separator");
        System.out.printf("Разделитель пути:       %s%n", fileSeparator);
        
        System.out.println("8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА");
        
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
                +----------------+--------------+
                | Финиш проверки | %s |
                +----------------+--------------+
                | Время работы   | %.3f сек    |
                """, startTimeFormatted, endTimeFormatted, executionTimeSeconds);
        
        System.out.print(result);
    }
}