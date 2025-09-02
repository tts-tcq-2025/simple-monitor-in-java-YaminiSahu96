package paradigm_shift_java;

import static paradigm_shift_java.BatteryCheckerHelper.*;

public class BatteryCheckerTests {

    public static void batteryCheckTests() {
        expectTrue(batteryIsOk(25, 70, 0.7f));
        expectTrue(batteryIsOk(0, 80, 0.7f));
        expectTrue(batteryIsOk(45, 20, 0.7f));
        expectFalse(batteryIsOk(-1, 80, 0.7f));
        expectFalse(batteryIsOk(10, 85, 0.7f));
        expectFalse(batteryIsOk(50, 70, 0.0f));
        expectFalse(batteryIsOk(30, 70, 0.9f));
        System.out.println("All ok");
    }

    private static void expectTrue(boolean batteryCondition) {
        if (!batteryCondition) {
            System.out.println("Expected true, but got false");
        }
    }

    public static void expectFalse(boolean expression) {
        if (expression) {
            System.out.println("Expected false, but got true");
        }
    }
}
