import java.util.Map;

public class TV extends AbstractDocument implements HasModel, HasPrice, HasScreenSize{
    protected TV(Map<String, Object> properties) {
        super(properties);
    }
}
