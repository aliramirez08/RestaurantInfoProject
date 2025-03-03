public class RestaurantInfo {
    public static void main(String[] args) {
        // Declare and initialize variables
        String restaurantName = "The Gourmet Bistro";
        String businessAddress = "123 Culinary Way";
        String city = "Foodtown";
        String state = "TX";
        String zipCode = "78901";

        // Print restaurant details to the console
        System.out.println("Restaurant Name: " + restaurantName);
        System.out.println("Business Address: " + businessAddress);

        // Using String.format() for better formatting
        System.out.println(String.format("City, State, Zip Code: %s, %s %s", city, state, zipCode));
    }
}
