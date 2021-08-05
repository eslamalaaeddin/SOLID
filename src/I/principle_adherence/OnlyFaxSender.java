package I.principle_adherence;

public class OnlyFaxSender implements IFaxSender {
    @Override
    public void fax() {
        System.out.println("Faxing...");
    }
}
