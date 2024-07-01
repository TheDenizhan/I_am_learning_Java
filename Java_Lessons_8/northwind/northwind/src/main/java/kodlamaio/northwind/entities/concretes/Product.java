import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Data
@Entity
@Table(name = "products")
public class Product {
        @Id
        @GeneratedValue
        @Column(name = "product_id")
        private Long id;

        @Column(name = "category_id")
        private int categoryId;

        @Column(name = "product_name")
        private String productName;

        @Column(name = "unit_price")
        private double unitPrice;

        @Column(name = "unit_in_stock")
        private short unitInStock;

        @Column(name = "quantity_per_unit")
        private String quantityPerUnit;

        public Product() {
                // Boş yapıcı metod
        }

        public Product(int categoryId, String productName, double unitPrice, short unitInStock, String quantityPerUnit) {
                this.categoryId = categoryId;
                this.productName = productName;
                this.unitPrice = unitPrice;
                this.unitInStock = unitInStock;
                this.quantityPerUnit = quantityPerUnit;
        }

        // Getter ve Setter metotları
}
