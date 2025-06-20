package week1.Ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shirt", "Clothing"),
                new Product(103, "Book", "Stationery"),
                new Product(104, "Mobile", "Electronics"),
                new Product(105, "Pen", "Stationery")
        };

        // Linear Search
        Product result1 = SearchUtils.linearSearch(products, "Mobile");
        System.out.println("Linear Search Result: " + result1);

        // Sort the array for Binary Search (by productName)
        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        // Binary Search
        Product result2 = SearchUtils.binarySearch(products, "Mobile");
        System.out.println("Binary Search Result: " + result2);
    }
}
