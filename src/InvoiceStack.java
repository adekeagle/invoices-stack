public class InvoiceStack implements InvoiceStackInt {

    Invoice[] invoices = new Invoice[10];
    private int pointer = 0;

    @Override
    public boolean isEmpty() {
        return pointer == 0;
    }

    @Override
    public Invoice top(){
        if(!isEmpty()){
            return invoices[pointer-1];
        }
        return null;
    }

    @Override
    public void push(Invoice invoice){
        if(pointer != invoices.length){
            invoices[pointer++] = invoice;
        }
    }

    @Override
    public void pop(){
        if (pointer > 0){
            pointer--;
        }
    }
}
