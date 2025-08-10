package KataTest.JavaCore2.Exeption.Two;

public class test {
}
class BadCreditHistoryException extends RuntimeException {}

class ProblemWithLawException extends RuntimeException {}

class BankWorker {
    public boolean checkClientForCredit(BankClient bankClient) throws ProblemWithLawException, BadCreditHistoryException {
        switch (bankClient.getNumber()) {
            case BankClient.GOOD_CLIENT:
                return true;
            case BankClient.BAD_CREDIT:
                throw new BadCreditHistoryException();
            case BankClient.CRIMINAL:
                throw new ProblemWithLawException();
        }
        return false;
    }
}

class BankClient {
    public final static int GOOD_CLIENT = 0;
    public final static int BAD_CREDIT = 1;
    public final static int CRIMINAL = 2;
    private int number;

    public BankClient(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) {
        try {
            return bankWorker.checkClientForCredit(bankClient);
        } catch (ProblemWithLawException e) {
            System.out.println("Проблемы с банковской историей");

        }
        catch (BadCreditHistoryException e) {

        }
        return false;

    }




    public static void main(String[] args) {
        BankClient b = new BankClient(2);
        BankWorker b1 = new BankWorker();
        b.getCreditForClient(b1,b);

    }
}
