import Articles.Articles;
import Interfaces.Interfacee;

import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("**MENU** \n 1)Stock \n 2)add article \n 3)delate aticle \n 4)modfify article \n 5)add cuantity article \n 6)out stock cuantity article \n 7)exit");
            String scs=sc.nextLine();
            switch (scs){
                case "1":
                    Interfacee.readArticles();
                    break;
                    case "2":
                        Interfacee.addArticle();
                        break;
                        case "3":

                           Interfacee.deleteArticle();
                            break;
                            case "4":
                                Interfacee.updateArticle();
                                break;
                                case "5":
                                    Interfacee.addStock();
                                    break;
                                    case "6":
                                        Interfacee.removStock();
                                        break;
                                        case "7":
                                            return;
            }

        }
    }
}