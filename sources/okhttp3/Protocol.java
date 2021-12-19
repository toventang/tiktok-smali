package okhttp3;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    private final String protocol;

    public final String toString() {
        return this.protocol;
    }

    static {
        Covode.recordClassIndex(106168);
    }

    public static Protocol get(String str) {
        Protocol protocol2 = HTTP_1_0;
        if (str.equals(protocol2.protocol)) {
            return protocol2;
        }
        Protocol protocol3 = HTTP_1_1;
        if (str.equals(protocol3.protocol)) {
            return protocol3;
        }
        Protocol protocol4 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(protocol4.protocol)) {
            return protocol4;
        }
        Protocol protocol5 = HTTP_2;
        if (str.equals(protocol5.protocol)) {
            return protocol5;
        }
        Protocol protocol6 = SPDY_3;
        if (str.equals(protocol6.protocol)) {
            return protocol6;
        }
        Protocol protocol7 = QUIC;
        if (str.equals(protocol7.protocol)) {
            return protocol7;
        }
        throw new IOException("Unexpected protocol: ".concat(String.valueOf(str)));
    }

    private Protocol(String str) {
        this.protocol = str;
    }
}
