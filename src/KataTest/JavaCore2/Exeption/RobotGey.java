package KataTest.JavaCore2.Exeption;

interface RobotConnectionManager {
    RobotConnection getConnection();
}

interface RobotConnection extends AutoCloseable {
    void moveRobotTo(int x, int y);

    @Override
    void close();
}

class Test {
    public static void main(String[] args) {
        moveRobot(new RobotCon(), 1, 2);
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
//        RobotConnection rConnecti = null;

        for (int i = 0; i < 3; i++) {
            try (RobotConnection rConnecti = robotConnectionManager.getConnection() ) {
//                rConnecti = robotConnectionManager.getConnection();
                rConnecti.moveRobotTo(toX, toY);
                if (rConnecti != null) {
                    i=4;
                }
            } catch (RobotConnectionException e) {
                if (i == 2) {
                    throw new RobotConnectionException(e.getMessage());
                }

            }
        }
    }
}

class Robot implements RobotConnection {
    public void close() {
        System.err.println("Close");
    }

    public void moveRobotTo(int x, int y) {
        System.err.println("move " + x + " ^ " + y);
    }
}

class RobotCon implements RobotConnectionManager {
    static int k = 1;

    public RobotConnection getConnection() { // бросает k эксепшенов тебе в метод
        System.err.println("k = " + k);
        if (k != 3) { // меняй как смотри что будет меняться, попробуй 3-ку и 2-ку
            throw new RobotConnectionException("" + k);
        } else {
            return new Robot();
        }
    }
}

class RobotConnectionException extends RuntimeException {
    public RobotConnectionException(String message) {
        super(message);
    }

    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}