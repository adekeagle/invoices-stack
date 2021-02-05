public interface InvoiceStackInt {

    boolean isEmpty();
    Invoice top();
    void push(Invoice invoice);
    void pop();

}
