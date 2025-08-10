package KataTest.JavaCore4.MegaEx;

public class UntrustworthyMailWorker implements MailService {
    private MailService ms[];
    private final RealMailService realMailService = new RealMailService();

    public UntrustworthyMailWorker(MailService[] ms) {
        this.ms = ms;
    }

    RealMailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable processedMail = mail;
        for (MailService service : ms) {
            processedMail = service.processMail(processedMail);
        }
        return realMailService.processMail(processedMail);
    }

}
