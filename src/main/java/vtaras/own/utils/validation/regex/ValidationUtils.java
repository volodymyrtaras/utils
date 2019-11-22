package vtaras.own.utils.validation.regex;

import lombok.extern.slf4j.Slf4j;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class ValidationUtils {
    private static final String PHONE_NUMBER_PATTERN = "^((\\+?380)([0-9]{9}))$";
    private static final String EMAIL_PATTERN = "^[-a-z0-9!#$%&'*+/=?^_`{|}~]+(?:\\.[-a-z0-9!#$%&'*+/=?^_`{|}~]+)*@(?:[a-z0-9]([-a-z0-9]{0,61}[a-z0-9])?\\.)*(?:aero|arpa|asia|biz|cat|com|coop|edu|gov|info|int|jobs|mil|mobi|museum|name|net|org|pro|tel|travel|[a-z][a-z])$";
    private static final String DATE_PATTERN = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private static final String IP_PATTERN = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    public Boolean checkingPhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
        log.info("Pattern of phone number was created");
        Matcher matcher = pattern.matcher(phoneNumber);
        log.info("Matcher of phone number was created");
        if (matcher.matches()) {
            log.info("Phone number " + phoneNumber + " is correct");
            return true;
        } else {
            log.info("Phone number " + phoneNumber + " is incorrect");
            return false;
        }
    }

    public Boolean checkingEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        log.info("Pattern of email was created");
        Matcher matcher = pattern.matcher(email);
        log.info("Matcher of email was created");
        if (matcher.matches()) {
            log.info("Email " + email + " is correct");
            return true;
        } else {
            log.info("Email " + email + " is incorrect");
            return false;
        }
    }

    public Boolean checkingDate(String date) {
        Pattern pattern = Pattern.compile(DATE_PATTERN);
        log.info("Pattern of date was created");
        Matcher matcher = pattern.matcher(date);
        log.info("Matcher of date was created");
        if (matcher.matches()) {
            log.info("Date " + date + " is correct");
            return true;
        } else {
            log.info("Date " + date + " is incorrect");
            return false;
        }
    }

    public Boolean checkingIP(String ip) {
        Pattern pattern = Pattern.compile(IP_PATTERN);
        log.info("Pattern of IP-address was created");
        Matcher matcher = pattern.matcher(ip);
        log.info("Matcher of IP-address was created");
        if (matcher.matches()) {
            log.info("IP-address " + ip + " is correct");
            return true;
        } else {
            log.info("IP-address " + ip + " is incorrect");
            return false;
        }
    }
}
