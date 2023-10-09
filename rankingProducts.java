package projectOne;



import java.io.*;

import java.util.*;

 

class Product implements Comparable<ProductData> {

    String name;

    int rating;

 

    public Product(String name, int rating) {

        this.name = name;

        this.rating = rating;

    }


    public int compareTo(Product other) {


        return Integer.compare(other.rating, this.rating);

    }

}

 

public class rankingProducts {

    public static void main(String[] args) {

        String inputFile = "input.txt";

        String outputFile = "output.txt";

 

        List<Product> products = readProductsFromFile(inputFile);

        if (products.isEmpty()) {

            System.out.println("No products found in the input file.");

            return;

        }

        Collections.sort(products);

        List<String> rankedProducts = assignRanks(products);

 

        writeRankedProductsToFile(rankedProducts, outputFile);

    }

    private static List<Product> readProductsFromFile(String filename) {

        List<Product> products = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(", ");

                if (parts.length == 2) {

                    String name = parts[0].trim();

                    int rating = Integer.parseInt(parts[1].trim());

                    products.add(new Product(name, rating));

                }

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

        return products;

    }

   private static List<String> assignRanks(List<Product> products) {

        List<String> rankedProducts = new ArrayList<>();

        int rank = 1;

        int count = 1;

 

        for (int i = 0; i < products.size(); i++) {

            Product currentProduct = products.get(i);

            String rankEntry = rank + ", " + currentProduct.name;

 

            if (i + 1 < products.size()) {

                Product nextProduct = products.get(i + 1);

                if (currentProduct.rating == nextProduct.rating) {

                    count++;

                } else {

                    rank += count;

                    count = 1;

                }

            }

 

            rankedProducts.add(rankEntry);

        }

        return rankedProducts;

    }

 

    private static void writeRankedProductsToFile(List<String> rankedProducts, String filename) {


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {

            for (String rankEntry : rankedProducts) {

                writer.write(rankEntry);

                writer.newLine();

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}