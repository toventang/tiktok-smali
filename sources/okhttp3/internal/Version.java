package okhttp3.internal;

import com.bytedance.covode.number.Covode;

public class Version {
    static {
        Covode.recordClassIndex(106196);
    }

    public static String userAgent() {
        return "okhttp/3.12.13.1";
    }

    private Version() {
    }
}
