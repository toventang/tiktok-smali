package okhttp3;

import com.bytedance.covode.number.Covode;
import java.nio.charset.Charset;
import k.i;
import okhttp3.internal.Util;

public final class Credentials {
    static {
        Covode.recordClassIndex(106140);
    }

    private Credentials() {
    }

    public static String basic(String str, String str2) {
        return basic(str, str2, Util.ISO_8859_1);
    }

    public static String basic(String str, String str2, Charset charset) {
        return "Basic ".concat(String.valueOf(i.encodeString(str + ":" + str2, charset).base64()));
    }
}
