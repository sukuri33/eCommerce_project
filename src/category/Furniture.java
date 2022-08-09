package category;

import java.time.LocalDateTime;
import java.util.UUID;

public class Furniture extends Category{

    public Furniture(String categoryName, UUID categoryId) {
        super(categoryName, categoryId);
    }

    @Override
    public LocalDateTime categoryDeliverySpeed() {
        return LocalDateTime.now().plusDays(4);
    }

    //Notice we didn't override categoryIdGenerator() method for this category
}
