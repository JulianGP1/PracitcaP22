package Interfaces;

import Articles.Articles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interfacee {
    static Scanner sc = new Scanner(System.in);
    static List<Articles> Larticle = new ArrayList<>();

    public static List<Articles> addArticle() {
        System.out.println("Add new code of article:");
        String code = sc.nextLine();
        System.out.println("Enter name of article:");
        String name = sc.nextLine();
        System.out.println("Enter description of article:");
        String desc = sc.nextLine();
        System.out.println("Enter price of purchase article:");
        double priceP = sc.nextDouble();
        System.out.println("Enter price of sell article:");
        double priceS = sc.nextDouble();
        System.out.println("Enter quantity of article:");
        int quantity = sc.nextInt();
        sc.nextLine();  // Consumir el salto de línea

        Articles article1 = new Articles(code, name, desc, priceP, priceS, quantity);
        Larticle.add(article1);
        return Larticle;
    }

    public static void readArticles() {
        if (Larticle.isEmpty()) {
            System.out.println("No articles in stock.");
            return;
        }

        System.out.println("The articles in stock are:");
        for (Articles article : Larticle) {
            // Mostrar el nombre del artículo, precio y cantidad en stock
            System.out.println("Name: " + article.getName() +
                    " | Price of sell: " + article.getPriceS() +
                    " | Quantity in stock: " + article.getQuantity());
        }
    }

    public static void deleteArticle() {
        System.out.println("Enter the code of the article to delete:");
        String code = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < Larticle.size(); i++) {
            Articles article = Larticle.get(i);
            if (article.getCode().equalsIgnoreCase(code)) {
                Larticle.remove(i);
                System.out.println("Article with code " + code + " has been deleted.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No article found with code " + code + ".");
        }
    }

    public static void updateArticle() {
        System.out.println("Enter the code of the article to update:");
        String code = sc.nextLine();
        boolean found = false;

        for (Articles article1 : Larticle) {
            if (article1.getCode().equalsIgnoreCase(code)) {
                System.out.println("Enter new name of article:");
                article1.setName(sc.nextLine());
                System.out.println("Enter new description of article:");
                article1.setDesc(sc.nextLine());
                System.out.println("Enter new price of purchase article:");
                article1.setPriceP(sc.nextDouble());
                System.out.println("Enter new price of sell article:");
                article1.setPriceS(sc.nextDouble());
                sc.nextLine();  // Consumir el salto de línea1
                System.out.println("Article with code " + code + " has been updated.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No article found with code " + code + ".");
        }
    }

    public static void addStock() {
        System.out.println("Enter the name of the article to add:");
        String name = sc.nextLine();

        boolean found = false;
        for (Articles article1 : Larticle) {
            if (article1.getName().equalsIgnoreCase(name)) {
                System.out.println("Enter cuantity to agree to stock of article:");
                int cuant=sc.nextInt();
                article1.setQuantity(article1.getQuantity()+ cuant);

                found = true;
                break;
            }

            if (!found) {
                System.out.println("No article found with code " + name + ".");
            }
        }
    }

    public static void removStock() {
        System.out.println("Enter the name of the article to romove stock:");
        String name = sc.nextLine();

        boolean found = false;
        for (Articles article1 : Larticle) {
            if (article1.getName().equalsIgnoreCase(name)) {
                System.out.println("Enter cuantity to agree to stock of article:");
                int cuant=sc.nextInt();
                article1.setQuantity(article1.getQuantity()- cuant);

                found = true;
                break;
            }

            if (!found) {
                System.out.println("No article found with code " + name + ".");
            }
        }
    }

}
