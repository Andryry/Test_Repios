//package KataTest.JavaCore4.MegaEx;
//
//import java.util.logging.Logger;
//
//public class Spy implements MailService{
//    private final Logger logger;
//
//    public Spy(Logger logger) {
//        this.logger = logger;
//    }
//
//    @Override
//    public Sendable processMail(Sendable mail) {
//        if (mail instanceof MailMessage) {
//            MailMessage message = (MailMessage) mail;
//
//
//            if (message.getFrom().equals(AUSTIN_POWERS) || message.getTo().equals(AUSTIN_POWERS)) {
//                logger.warning(String.format(
//                        "Detected target mail correspondence: from %s to %s \"%s\"",
//                        message.getFrom(), message.getTo(), message.getMessage()));
//            } else {
//                logger.info(String.format(
//                        "Usual correspondence: from %s to %s",
//                        message.getFrom(), message.getTo()));
//            }
//        }
//        return mail;
//    }
//}
//
