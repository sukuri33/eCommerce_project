package category;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Category {

    private String categoryName;
    private UUID categoryId;

    public Category(String categoryName, UUID categoryId) {
        this.categoryName = categoryName;
        this.categoryId = categoryId;
    }
    //This abstract method should be overridden for each prospective category since each has different delivery speed as per biz rule
    public abstract LocalDateTime categoryDeliverySpeed();
    //Since only Electronic category needs different category id than the others we didn't declare it as an abstract method
    //It should be overridden only for Electronic category as per the biz rule, rest of the category just need to inherent this method as is
    public String categoryIdGenerator(){
        return categoryId.toString().substring(0,8).concat("-").concat(categoryName.substring(0,2));
    }

    public String getCategoryName() {
        return categoryName;
    }

    public UUID getCategoryId() {
        return categoryId;
    }
}
