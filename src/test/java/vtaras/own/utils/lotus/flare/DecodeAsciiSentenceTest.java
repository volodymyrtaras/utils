package vtaras.own.utils.lotus.flare;

import org.junit.Assert;
import org.junit.Test;

public class DecodeAsciiSentenceTest {

    @Test
    public void testEncoding() {
        Assert.assertEquals("Have a Nice Day ",
                DecodeAsciiSentence.decode("2312179862310199501872379231018117927"));
        Assert.assertEquals("Truth Always Wins ",
                DecodeAsciiSentence.decode("23511011501782351112179911801562340161171141148"));
    }
}
