package vtaras.own.utils.validation;

import org.junit.Assert;
import org.junit.Test;

public class ValidationUtilsTest {

    @Test
    public void isStringMatchesPattern() {
        Assert.assertTrue(ValidationUtils
            .isStringMatchesPattern("10.10.1995", ValidationUtils.DATE_PATTERN));
        Assert.assertFalse(ValidationUtils
            .isStringMatchesPattern("10.10..10", ValidationUtils.DATE_PATTERN));

        Assert.assertTrue(ValidationUtils
            .isStringMatchesPattern("vasyl@gmail.com", ValidationUtils.EMAIL_PATTERN));
        Assert.assertFalse(ValidationUtils
            .isStringMatchesPattern("vasyl@gmail.com@com", ValidationUtils.EMAIL_PATTERN));

        Assert.assertTrue(ValidationUtils
            .isStringMatchesPattern("10.10.10.10", ValidationUtils.IP_PATTERN));
        Assert.assertFalse(ValidationUtils
            .isStringMatchesPattern("10.1111.111111", ValidationUtils.IP_PATTERN));

        Assert.assertTrue(ValidationUtils
            .isStringMatchesPattern("+380954803459", ValidationUtils.PHONE_NUMBER_PATTERN));
        Assert.assertFalse(ValidationUtils
            .isStringMatchesPattern("+3809548034595", ValidationUtils.PHONE_NUMBER_PATTERN));
    }
}
