package restaurant;

public class RestaurantMain {

    public static void main(String[] args) {

        //   public static void main () {
        MenuItem HotDog = new MenuItem("Hot Dog", 2.99, "Meat with Bread", "appetizer", true);
        MenuItem pizza = new MenuItem("Pizza", 11.99, "Cheese with Sauce", "main", false);

        Menu restaurantMenu = new Menu();
        restaurantMenu.addMenuItem(HotDog);
        restaurantMenu.addMenuItem(pizza);
        // System.out.println("PIZza");
        for (MenuItem item : restaurantMenu.getMenuItems()) {
            System.out.println(item.getName());
        }

        restaurantMenu.setLastUpdated();
        System.out.println(restaurantMenu.getLastUpdated());
    }
}
