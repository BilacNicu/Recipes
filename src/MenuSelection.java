import java.util.Scanner;

public class MenuSelection {

    public static void main(String[] args) {
        int userSelected;
        do {
            userSelected = MenuData();
            switch (userSelected) {
                case 1:
                    Breakfast BreakfastObject = new Breakfast("Fried Egg", 5,"\nINGREDIENTS\n" +
                            "1 tbsp. butter, or fat of your choice\n" +
                            "large egg\n" +
                            "Kosher salt\n" +
                            "Freshly ground black pepper\n" +
                            "DIRECTIONS\n" +
                            "FOR SUNNY-SIDE UP:\n" +
                            "In a small nonstick over medium heat, melt butter (or heat oil).\n" +
                            "Crack egg into pan. Cook 3 minutes, or until white is completely set.\n" +
                            "Remove from pan and season with salt and pepper.\n");
                    System.out.println("Reteta zilei este: \n");
                    System.out.println(BreakfastObject.toString());
                    break;
                case 2:
                    Lunch LunchObject = new Lunch("Creamy Pasta", 10,"\nIngredients\n" +
                            "1/2 lb (225 grams) pasta (spaghetti, penne, fusilli...)\n" +
                            "3/4 cup (160 grams) cream cheese*\n" +
                            "1/4 cup (30 grams) grated parmesan, plus more to serve\n" +
                            "1 Tbsp olive oil, plus more to serve\n" +
                            "1-2 garlic cloves, minced or pressed\n" +
                            "1/2 cup (120 ml) cooking water, plus more if needed\n" +
                            "salt and pepper, to taste\n" +
                            "1/4-1/2 tsp chili flakes, or according to taste (optional)\n" +
                            "Instructions\n" +
                            "In a large pot of boiling salted water, cook pasta according to package directions until al dente.\n" +
                            "Right before draining, reserve a cup of starchy pasta water.\n" +
                            "Meanwhile, in a large skillet warm 1 Tbsp of olive oil and gently fry the garlic (plus a good pinch of chili flakes if you like) for 2-3 minutes.\n" +
                            "Use a low flame, do not let the garlic burn.\n" +
                            "Drain and add your pasta to the skillet.\n" +
                            "Serve immediately with a drizzle of good olive oil or extra virgin olive oil, freshly grated parmesan, and freshly ground black pepper (if you don't use chili flakes). Enjoy!");
                    System.out.println("Reteta zilei este: \n");
                    System.out.println(LunchObject.toString());
                    break;
                case 3:
                    Dinner DinnerObject = new Dinner("Honey Salmon", 40,"\nINGREDIENTS\n" +
                            "1/3 c. honey\n" +
                            "1/4 c. soy sauce\n" +
                            "2 tbsp. lemon juice\n" +
                            "1 tsp. red pepper flakes\n" +
                            "3 tbsp. extra-virgin olive oil, divided\n" +
                            "4 6-oz. salmon fillets, patted dry with a paper towel\n" +
                            "Kosher salt\n" +
                            "Freshly ground black pepper\n" +
                            "3 cloves garlic, minced\n" +
                            "1 lemon, sliced into rounds\n" +
                            " \n" +
                            "DIRECTIONS\n" +
                            "In a medium bowl, whisk together honey, soy sauce, lemon juice and red pepper flakes.\n" +
                            "In a large skillet over medium-high heat, heat two tablespoons oil.\n" +
                            "Cook salmon until deeply golden, about 6 minutes, then flip over and add remaining tablespoon of oil.\n" +
                            "Add garlic to the skillet and cook until fragrant, 1 minute.\n" +
                            "Add the honey mixture and sliced lemons and cook until sauce is reduced by about 1/3.\n" +
                            "Baste salmon with the sauce.\n" +
                            "Garnish with sliced lemon and serve");
                    System.out.println("Reteta zilei este: \n");
                    System.out.println(DinnerObject.toString());
                    break;
                default:
                    break;
            }
        }
        while (userSelected > 3);
    }


    public static int MenuData() {
        int selection;
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your option: ");
        System.out.println("----------------------\n");
        System.out.println("1 - Breakfast ");
        System.out.println("2 - Lunch");
        System.out.println("3 - Dinner");

        System.out.println("Your selected option is: ");

        selection = sc.nextInt();
        return selection;
    }
}