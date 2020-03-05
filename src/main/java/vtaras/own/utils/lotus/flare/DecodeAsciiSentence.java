package vtaras.own.utils.lotus.flare;

public class DecodeAsciiSentence {

    public static String decode(String encoded) {
        StringBuilder decoded = new StringBuilder();
        encoded = new StringBuilder(encoded)
                .reverse()
                .toString();

        int num = 0;

        for (int i = 0; i < encoded.length(); i++) {
            num = num * 10 + (encoded.charAt(i) - '0');

            if (num >= 32 && num <= 122) {
                char c = (char) num;
                decoded.append(c);
                num = 0;
            }
        }

        return decoded.toString();
    }
}

