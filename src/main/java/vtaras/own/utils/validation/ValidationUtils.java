package vtaras.own.utils.validation;

import lombok.extern.slf4j.Slf4j;

import java.util.regex.Pattern;

@Slf4j
public class ValidationUtils {

    public static final String PHONE_NUMBER_PATTERN = "^((\\+?380)([0-9]{9}))$";
    public static final String EMAIL_PATTERN = "^[-a-z0-9!#$%&'*+/=?^_`{|}~]+(?:\\.[-a-z0-9!#$%&'*+/=?^_`{|}~]+)*@" +
        "(?:[a-z0-9]([-a-z0-9]{0,61}[a-z0-9])?\\.)*(?:aero|arpa|asia|biz|cat|com|coop|edu|gov|info|int|jobs|mil|mobi|" +
        "museum|name|net|org|pro|tel|travel|[a-z][a-z])$";
    public static final String DATE_PATTERN = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)" +
        "(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?" +
        "(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])" +
        "(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    public static final String IP_PATTERN = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.)" +
        "{3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    /**
     * Checks if given String can be interpreted as given pattern.
     * If so, returns true.
     *
     * @param given           String
     * @param patternAsString String
     * @return boolean
     */
    public static boolean isStringMatchesPattern(String given, String patternAsString) {
        return Pattern.compile(patternAsString).matcher(given).matches();
    }
}
