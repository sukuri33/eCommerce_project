package category;

import java.time.LocalDateTime;
import java.util.UUID;

public class Electronic extends Category{

    public Electronic(String categoryName, UUID categoryId) {
        super(categoryName, categoryId);
    }
    //Deliver speed for products fall under this category is 4 days
    @Override
    public LocalDateTime categoryDeliverySpeed() {
        return LocalDateTime.now().plusDays(1);
    }
    //Because we want to distinguish products under Electronic category uniquely by its category ID
    //hence the below implementation different from the other categories
    @Override
    public String categoryIdGenerator(){
        return "EL-" + getCategoryId().toString().substring(0,8);
    }


}
