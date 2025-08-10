package Test;

import java.util.*;

public class New {
}



 class Product implements Comparable<Product> {
    private String productName;
    private double price;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, price);
    }

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

class Human implements Buyer {
    private String firstName;
    private String lastName;
    private double money;
    private Set<Product> products = new HashSet<>();

    @Override


    public void buyProduct(Product product, Shop shop) {
        try {

            // Пытаемся продать продукт
            shop.sellProduct(product, this);

            // Если исключения не было, вычисляем сколько денег нужно списать (с НДС)

            // Добавляем продукт в список покупок
            products.add(product);
        } catch (SellProductException e) {
            // Выводим сообщение об ошибке, если что-то пошло не так
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

    public void sellProduct(Product product, Human human) throws SellProductException {
        // Проверяем наличие товара
        if (!products.containsKey(product) || products.get(product) <= 0) {
            throw new SellProductException("Продукта с именем " + product.getProductName() + " нет в наличии");
        }

        // Рассчитываем полную стоимость с НДС



        // Проверяем достаточно ли средств у покупателя (учитываем цену с НДС)
        if (human.getMoney() < product.getPrice()) {
            throw new SellProductException("Уважаемый " + human.getFirstName() + " " + human.getLastName() +
                    ", для покупки товара недостаточно средств");
        }

        // Уменьшаем количество товара
        products.put(product, products.get(product) - 1);

        // Уменьшаем деньги покупателя на полную стоимость с НДС

        human.setMoney(human.getMoney()-product.getPrice());

        // Увеличиваем прибыль магазина на сумму без НДС (чистую прибыль)
        double moneyz = product.getPrice() - calculateNds(product.getPrice());
        this.money += moneyz;

        System.out.println(human.getFirstName() + ", вы успешно совершили покупку! С уважением, " + name);
    }



    private double calculateNds(double price) {
        return price * 0.13;
    }
    Set<Product> produc = new HashSet<>();
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
    private Human human = new Human();


    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Задайте имя и стартовый капитал магазина (например: DNS 20000.00)");
        String[] shopInput = scanner.nextLine().split(" ");
        shop.setName(shopInput[0]);
        shop.setMoney(Double.parseDouble(shopInput[1]));

        System.out.println("2. Укажите количество товаров (например: 3)");
        int productCount = Integer.parseInt(scanner.nextLine());

        System.out.println("3. Введите товары в формате: название цена количество (например: Пылесос 6000.00 34)");
        for (int i = 0; i < productCount; i++) {
            String[] productInput = scanner.nextLine().split(" ");
            Product product = new Product(productInput[0], Double.parseDouble(productInput[1]));
            shop.getProducts().put(product, Integer.parseInt(productInput[2]));
        }

        System.out.println("4. Введите данные человека: имя фамилия деньги (например: Иван Иванов 200000.00)");
        String[] humanInput = scanner.nextLine().split(" ");
        human.setFirstName(humanInput[0]);
        human.setLastName(humanInput[1]);
        human.setMoney(Double.parseDouble(humanInput[2]));

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Посмотреть список товаров");
            System.out.println("2. Выход");
            System.out.print("Выберите пункт: ");

            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1) {
                List<Product> productList = shop.printAndGetAllProductsWithCount();
                System.out.print("Выберите товар для покупки (номер) или 0 для возврата: ");
                int productChoice = Integer.parseInt(scanner.nextLine());

                if (productChoice > 0 && productChoice <= productList.size()) {
                    Product selectedProduct = productList.get(productChoice - 1);
                    human.buyProduct(selectedProduct, shop);
                    return;
                }
            } else if (choice == 2) {
                return;
            }
        }
    }
}