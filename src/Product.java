import java.math.BigDecimal;
import java.util.UUID;

public class Product {

    private final UUID productId;
    private String productName;
    private Double productPrice;
    private Integer productStockNumber;
    private Integer productRemainingStock;
    private UUID productCategoryId;

    public Product(UUID productId, String productName, Double productPrice, Integer productStockNumber, Integer productRemainingStock, UUID productCategoryId) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStockNumber = productStockNumber;
        this.productRemainingStock = productRemainingStock;
        this.productCategoryId = productCategoryId;
    }

    public UUID getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public Integer getProductStockNumber() {
        return productStockNumber;
    }

    public Integer getProductRemainingStock() {
        return productRemainingStock;
    }

    public UUID getProductCategoryId() {
        return productCategoryId;
    }
}
