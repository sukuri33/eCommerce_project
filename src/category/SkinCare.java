package category;

import java.time.LocalDateTime;
import java.util.UUID;

public class SkinCare extends Category{

    public SkinCare(String categoryName, UUID categoryId) {
        super(categoryName, categoryId);
    }

    @Override
    public LocalDateTime categoryDeliverySpeed() {
        return LocalDateTime.now();
    }
}
