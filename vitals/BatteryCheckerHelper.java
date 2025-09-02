package paradigm_shift_java;

import static paradigm_shift_java.DisplayMessages.*;

public class BatteryCheckerHelper {

    private static final float MIN_TEMPERATURE = 0;
    private static final float MAX_TEMPERATURE = 45;
    private static final float MIN_SOC = 20;
    private static final float MAX_SOC = 80;
    private static final float MIN_CHARGE = 0.1f;
    private static final float MAX_CHARGE = 0.8f;

    public static boolean batteryIsOk(float temperature, float stateOfCharge, float chargeRate) {
        boolean temperatureOk = checkParameterOk(temperature, MIN_TEMPERATURE, MAX_TEMPERATURE, "temperature");
        boolean socOk = checkParameterOk(stateOfCharge, MIN_SOC, MAX_SOC, "charge state");
        boolean chargeRateOk = checkParameterOk(chargeRate, MIN_CHARGE, MAX_CHARGE, "charge rate");
        return temperatureOk && socOk && chargeRateOk;
    }

    private static boolean checkParameterOk(float parameterValue, float minValue, float maxValue, String parameterName) {
        if (isValueInRange(parameterValue, minValue, maxValue)) {
            printOkMessage(parameterName, LanguageOption.ENGLISH);
            return true;
        }

        if (isValueInToleranceRange(parameterValue, minValue, maxValue)) {
            printWarnMessage(parameterName, LanguageOption.ENGLISH);
            return true;
        } else {
            printErrorMessage(parameterName, LanguageOption.ENGLISH);
            return false;
        }
    }

    private static boolean isValueInRange(float value, float minValue, float maxValue) {
        return value >= minValue && value <= maxValue;
    }

    private static boolean isValueInToleranceRange(float value, float minValue, float maxValue) {
        float tolerance = (maxValue - minValue) * 0.05f;
        return value >= (maxValue - tolerance) || value <= (minValue + tolerance);
    }
}
