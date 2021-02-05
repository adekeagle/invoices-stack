import java.math.BigDecimal;
import java.util.StringJoiner;

public class Invoice {

    private String name;
    private BigDecimal total;

    public Invoice(String name, BigDecimal total) {
        this.name = name;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Invoice.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("total=" + total)
                .toString();
    }
}
