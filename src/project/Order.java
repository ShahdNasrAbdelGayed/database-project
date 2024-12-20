package project;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {
    @Id 
    private long id;
    private long personId;
    private long productId;

    // Constructors, getters, and setters
    public Order() {}

    public Order(long id, long personId, long productId) {
        this.id = id;
        this.personId = personId;
        this.productId = productId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }
}
