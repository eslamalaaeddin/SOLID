package I.principle_violation;

public class OnlyFaxSender implements IPrinter {
    @Override
    public void print() { }

    @Override
    public void scan() { }

    @Override
    public void fax() {
        System.out.println("Faxing...");
    }
}
