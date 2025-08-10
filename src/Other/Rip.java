package Other;

import java.util.*;

import static java.lang.Double.parseDouble;

public class Rip
{
}


 class Product implements Comparable<Product> {
    private String productName;
    private double price;

     Set<Product> products = new HashSet<>();
    @Override
    public int compareTo(Product o) {
        return Double.compare(this.price, o.price);
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

 class Humans implements Buyer {
    private String firstName;
    private String lastName;
    private double money;
    private Set<Product> products = new HashSet<>();

    @Override
    public void buyProduct(Product product, Shop shop) {
        try {
            shop.sellProduct(product, this);
            products.add(product);
            money -= product.getPrice();
        } catch (SellProductException e) {
            System.out.println(e.getMessage());
        }
    }

    // Геттеры и сеттеры
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}

interface Buyer {
    void buyProduct(Product product, Shop shop);
}
 class Shop {
    private String name;
    private double money;
    private Map<Product, Integer> products = new HashMap<>();

    public void sellProduct(Product product, Humans human) throws SellProductException {
        if (!products.containsKey(product) || products.get(product) <= 0) {
            throw new SellProductException("Продукта с именем " + product.getProductName() + " нет в наличии");
        }

        if (human.getMoney() < product.getPrice()) {
            throw new SellProductException("Уважаемый " + human.getFirstName() + " " + human.getLastName() +
                    ", для покупки товара недостаточно средств");
        }

        double ndsPrice = calculateNds(product.getPrice());
        double totalPrice = product.getPrice() + ndsPrice;

        products.put(product, products.get(product) - 1);

        this.money += totalPrice;

        System.out.println(human.getFirstName() + ", вы успешно совершили покупку! С уважением, " + name);
    }

    private double calculateNds(double price) {
        return price * 0.13;
    }
    public List<Product> printAndGetAllProductsWithCount() {
        // Создаем копию списка продуктов для безопасной работы
        List<Product> sortedProducts = new ArrayList<>(products.keySet());

        // Сортируем продукты по цене (используем уже реализованный compareTo в Product)
        Collections.sort(sortedProducts);

        // Выводим отсортированный список с нумерацией
        int index = 1;
        for (Product product : sortedProducts) {
            int count = products.get(product);
            System.out.printf("%d. %-15s %3d шт. %8.2f руб.%n",
                    index++,
                    product.getProductName(),
                    count,
                    product.getPrice());
        }

        // Возвращаем неизменяемую копию отсортированного списка
        return Collections.unmodifiableList(sortedProducts);
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}

 class SellProductException extends Exception {
    public SellProductException(String message) {
        super(message);
    }
}

class ConsoleService {
    private Shop shop = new Shop();
    private Humans human = new Humans();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        try {
            // Инициализация магазина
            initializeShop();

            // Добавление товаров
            addProducts();

            // Инициализация покупателя
            initializeCustomer();

            // Главное меню
            runMainMenu();

        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private void initializeShop() {
        while (true) {
            try {
                System.out.println("\n=== ИНИЦИАЛИЗАЦИЯ МАГАЗИНА ===");
                System.out.println("Введите название магазина и стартовый капитал через пробел");
                System.out.println("Пример: DNS 20000.00");
                System.out.print("> ");

                String[] input = scanner.nextLine().trim().split("\\s+", 2);
                if (input.length != 2) {
                    System.out.println("Ошибка: нужно ввести 2 значения через пробел");
                    continue;
                }

                shop.setName(input[0]);
                shop.setMoney(parseDouble(input[1]));
                break;

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: капитал должен быть числом (например 20000.00)");
            }
        }
    }

    private void addProducts() {
        int productCount = readPositiveInt("\n=== ДОБАВЛЕНИЕ ТОВАРОВ ===\n" +
                "Сколько товаров хотите добавить?", 1, 100);

        for (int i = 0; i < productCount; i++) {
            System.out.println("\nТовар #" + (i + 1));

            String name = readNonEmptyString("Введите название товара:");
            double price = readPositiveDouble("Введите цену товара:");
            int quantity = readPositiveInt("Введите количество товара:", 1, Integer.MAX_VALUE);

            Product product = new Product(name, price);
            shop.getProducts().put(product, quantity);
        }
    }

    private void initializeCustomer() {
        System.out.println("\n=== ДАННЫЕ ПОКУПАТЕЛЯ ===");

        String firstName = readNonEmptyString("Введите имя:");
        String lastName = readNonEmptyString("Введите фамилию:");
        double money = readPositiveDouble("Введите количество денег:");

        human.setFirstName(firstName);
        human.setLastName(lastName);
        human.setMoney(money);
    }
    private void displayProducts() {
        System.out.println("\n=== СПИСОК ТОВАРОВ ===");
        List<Product> products = shop.printAndGetAllProductsWithCount();
        if (products.isEmpty()) {
            System.out.println("В магазине нет доступных товаров");
        }
    }

    private void makePurchase() {
        // Сначала показываем список товаров
        List<Product> availableProducts = shop.printAndGetAllProductsWithCount();

        if (availableProducts.isEmpty()) {
            System.out.println("Нет товаров для покупки");
            return;
        }

        // Выбор товара
        int productChoice = readIntInRange(
                "Выберите номер товара для покупки (0 для отмены):",
                0,
                availableProducts.size()
        );

        if (productChoice == 0) {
            System.out.println("Покупка отменена");
            return;
        }

        // Получаем выбранный товар
        Product selectedProduct = availableProducts.get(productChoice - 1);

        // Проверяем наличие и достаточность средств
        try {
            human.buyProduct(selectedProduct, shop);
        } catch (Exception e) {
            System.out.println("Ошибка при покупке: " + e.getMessage());
        }
    }
    private void runMainMenu() {
        while (true) {
            System.out.println("\n=== ГЛАВНОЕ МЕНЮ ===");
            System.out.println("1. Просмотреть список товаров");
            System.out.println("2. Совершить покупку");
            System.out.println("3. Выход");

            int choice = readIntInRange("Выберите пункт меню:", 1, 3);

            switch (choice) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    makePurchase();
                    break;
                case 3:
                    System.out.println("До свидания!");
                    return;
            }
        }
    }

    // Вспомогательные методы для ввода данных
    private String readNonEmptyString(String prompt) {
        while (true) {
            System.out.println(prompt);
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Ошибка: ввод не может быть пустым");
        }
    }

    private double readPositiveDouble(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                System.out.print("> ");
                double value = parseDouble(scanner.nextLine());
                if (value > 0) {
                    return value;
                }
                System.out.println("Ошибка: значение должно быть больше 0");
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите корректное число");
            }
        }
    }

    private int readPositiveInt(String prompt, int min, int max) {
        while (true) {
            try {
                System.out.println(prompt);
                System.out.print("> ");
                int value = Integer.parseInt(scanner.nextLine());
                if (value >= min && value <= max) {
                    return value;
                }
                System.out.println("Ошибка: значение должно быть от " + min + " до " + max);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число");
            }
        }
    }

    private int readIntInRange(String prompt, int min, int max) {
        return readPositiveInt(prompt, min, max);
    }

    public static void main(String[] args) {
        new ConsoleService().start();
    }
}
