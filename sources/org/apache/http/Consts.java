package org.apache.http;

import com.bytedance.covode.number.Covode;
import java.nio.charset.Charset;

public final class Consts {
    public static final Charset ASCII = Charset.forName("US-ASCII");
    public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    static {
        Covode.recordClassIndex(106367);
    }
}
