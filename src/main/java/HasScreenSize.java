import java.util.Optional;

public interface HasScreenSize extends Document {
    default Optional<Number> getScreenSize() {
        return Optional.ofNullable((Number) get(Property.SCREEN_SIZE.toString()));
    }
}
