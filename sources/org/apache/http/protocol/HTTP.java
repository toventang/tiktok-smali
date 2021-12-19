package org.apache.http.protocol;

import com.bytedance.covode.number.Covode;
import java.nio.charset.Charset;
import org.apache.http.Consts;

public final class HTTP {
    public static final Charset DEF_CONTENT_CHARSET = Consts.ISO_8859_1;
    public static final Charset DEF_PROTOCOL_CHARSET = Consts.ASCII;

    static {
        Covode.recordClassIndex(106433);
    }
}
