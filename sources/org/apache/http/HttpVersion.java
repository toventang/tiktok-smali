package org.apache.http;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class HttpVersion extends ProtocolVersion implements Serializable {
    public static final HttpVersion HTTP_0_9 = new HttpVersion(0, 9);
    public static final HttpVersion HTTP_1_0 = new HttpVersion(1, 0);
    public static final HttpVersion HTTP_1_1 = new HttpVersion(1, 1);
    private static final long serialVersionUID = -5856653513894415344L;

    static {
        Covode.recordClassIndex(106372);
    }

    public HttpVersion(int i2, int i3) {
        super("HTTP", i2, i3);
    }

    @Override // org.apache.http.ProtocolVersion
    public final ProtocolVersion forVersion(int i2, int i3) {
        if (i2 == this.major && i3 == this.minor) {
            return this;
        }
        if (i2 == 1) {
            if (i3 == 0) {
                return HTTP_1_0;
            }
            if (i3 == 1) {
                return HTTP_1_1;
            }
        } else if (i2 == 0 && i3 == 9) {
            return HTTP_0_9;
        }
        return new HttpVersion(i2, i3);
    }
}
