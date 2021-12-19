package okhttp3.internal.http;

import com.bytedance.covode.number.Covode;
import java.net.Proxy;
import okhttp3.HttpUrl;
import okhttp3.Request;

public final class RequestLine {
    static {
        Covode.recordClassIndex(106236);
    }

    private RequestLine() {
    }

    public static String requestPath(HttpUrl httpUrl) {
        String encodedPath = httpUrl.encodedPath();
        String encodedQuery = httpUrl.encodedQuery();
        if (encodedQuery != null) {
            return encodedPath + '?' + encodedQuery;
        }
        return encodedPath;
    }

    private static boolean includeAuthorityInRequestLine(Request request, Proxy.Type type) {
        if (request.isHttps() || type != Proxy.Type.HTTP) {
            return false;
        }
        return true;
    }

    public static String get(Request request, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(request.method());
        sb.append(' ');
        if (includeAuthorityInRequestLine(request, type)) {
            sb.append(request.url());
        } else {
            sb.append(requestPath(request.url()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }
}
