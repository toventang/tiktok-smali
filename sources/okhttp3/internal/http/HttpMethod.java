package okhttp3.internal.http;

import com.bytedance.covode.number.Covode;
import com.bytedance.d.a.a.a.a.a;

public final class HttpMethod {
    static {
        Covode.recordClassIndex(106233);
    }

    private HttpMethod() {
    }

    public static boolean redirectsWithBody(String str) {
        return str.equals("PROPFIND");
    }

    public static boolean redirectsToGet(String str) {
        if (!str.equals("PROPFIND")) {
            return true;
        }
        return false;
    }

    public static boolean permitsRequestBody(String str) {
        if (str.equals("GET") || str.equals("HEAD")) {
            return false;
        }
        return true;
    }

    public static boolean invalidatesCache(String str) {
        if (str.equals("POST") || str.equals("PATCH") || str.equals(a.f28513c) || str.equals(a.f28514d) || str.equals("MOVE")) {
            return true;
        }
        return false;
    }

    public static boolean requiresRequestBody(String str) {
        if (str.equals("POST") || str.equals(a.f28513c) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            return true;
        }
        return false;
    }
}
