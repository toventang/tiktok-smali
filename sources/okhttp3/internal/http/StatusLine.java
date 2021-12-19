package okhttp3.internal.http;

import com.bytedance.covode.number.Covode;
import java.net.ProtocolException;
import okhttp3.Protocol;
import okhttp3.Response;

public final class StatusLine {
    public final int code;
    public final String message;
    public final Protocol protocol;

    static {
        Covode.recordClassIndex(106238);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            str = "HTTP/1.0";
        } else {
            str = "HTTP/1.1";
        }
        sb.append(str);
        sb.append(' ').append(this.code);
        if (this.message != null) {
            sb.append(' ').append(this.message);
        }
        return sb.toString();
    }

    public static StatusLine get(Response response) {
        return new StatusLine(response.protocol(), response.code(), response.message());
    }

    public static StatusLine parse(String str) {
        Protocol protocol2;
        String str2;
        int i2 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                protocol2 = Protocol.HTTP_1_0;
            } else if (charAt == 1) {
                protocol2 = Protocol.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
        } else if (str.startsWith("ICY ")) {
            protocol2 = Protocol.HTTP_1_0;
            i2 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
        }
        int i3 = i2 + 3;
        if (str.length() >= i3) {
            try {
                int parseInt = Integer.parseInt(str.substring(i2, i3));
                if (str.length() <= i3) {
                    str2 = "";
                } else if (str.charAt(i3) == ' ') {
                    str2 = str.substring(i2 + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
                }
                return new StatusLine(protocol2, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
        }
    }

    public StatusLine(Protocol protocol2, int i2, String str) {
        this.protocol = protocol2;
        this.code = i2;
        this.message = str;
    }
}
