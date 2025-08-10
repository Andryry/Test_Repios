package KataTest.JavaCore4.MegaEx;

public class Thief implements MailService{
    private int minPrise;
    private int stolenValue = 0;

    public Thief(int minPrise) {
        this.minPrise = minPrise;
    }

    public int getStolenValue() {
        return stolenValue;
    }


    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage pkg = (MailPackage) mail;
            if (pkg.getContent().getPrice() >= minPrise) {
                stolenValue += pkg.getContent().getPrice();
                return new MailPackage(pkg.getFrom(),pkg.getTo(), new Package("stones instead of" + pkg.getContent().getContent(),0));
            }
        }
        return mail;
    }
}
