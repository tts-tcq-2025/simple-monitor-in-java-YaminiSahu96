package paradigm_shift_java;

import java.util.Arrays;
import java.util.List;

public class DisplayMessages {

    private static ILogger logger = new ConsoleLogger();

    private static final List<List<String>> messages = Arrays.asList(
        Arrays.asList("OK.", "OK."),
        Arrays.asList("WARNING: Parameter is in border range.", "WARNUNG: Parameter liegt im Grenzbereich."),
        Arrays.asList("ERROR: Not in Range! Please check.", "FEHLER: Nicht in Reichweite! Überprüfen Sie bitte.")
    );

    public static void printOkMessage(String valueType, LanguageOption languageOption) {
        logger.info(valueType + " " + messages.get(0).get(languageOption.ordinal()));
    }

    public static void printWarnMessage(String valueType, LanguageOption languageOption) {
        logger.info(valueType + " " + messages.get(1).get(languageOption.ordinal()));
    }

    public static void printErrorMessage(String valueType, LanguageOption languageOption) {
        logger.info(valueType + " " + messages.get(2).get(languageOption.ordinal()));
    }
}
