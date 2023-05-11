package week07;

public class P02_Menu {

    // create 2D array of food:
    // print all the foods sorted
        /*
        steak
        hot dog
        cheeseburger
        -----------------------
        pizza
        pasta
        canoli
        -----------------------
        sushi
        ramen
        fried rice
        dumplings
        -----------------------
        kebab
        manto
        -----------------------
        beriyani
        masal
        curry
        chicken tikka masala
        -----------------------
        */
    public static void main(String[] args) {
        String[][] food = {{"steak", "hot dog", "cheeseburger"},
                {"pizza", "pasta", "canoli"},
                {"sushi", "ramen", "fried rice", "dumplings"},
                {"kebab", "manto",},
                {"beriyani", "masal", "curry", "chicken tikka masala"},};


        for (int i = 0; i < food.length; i++) {
            for (int j = 0; j < food[i].length; j++) {
                System.out.println(food[i][j]);

            }
            System.out.println("-----------------------");

        }

        System.out.println("**************** For each ile cozum ****************");
        for (String[] each : food) {
            for (String foodOfCountries : each) {
                System.out.println(foodOfCountries);
            }
            System.out.println("-----------------------");

        }


    }

}
