import java.util.Map;

public class Main {

    public static void print(TV tv) {
        System.out.println("TV Properties: ");
        tv.getModel().ifPresent(System.out::println);
        tv.getScreenSize().ifPresent(System.out::println);
        tv.getPrice().ifPresent(System.out::println);
        System.out.println("============");
    }

    public static void main(String[] args) {

        // TV 1
        Map<String, Object> props1 = Map.of(Property.MODEL.toString(), "Samsung",
                                            Property.PRICE.toString(), 2000);
        var tv1 = new TV(props1);
        print(tv1);

        // TV 2
        Map<String, Object> props2 = Map.of(Property.MODEL.toString(), "Samsung",
                                            Property.PRICE.toString(), 2000,
                                            Property.SCREEN_SIZE.toString(), 32);
        var tv2 = new TV(props2);
        print(tv2);
    }
}
