package net.openid.appauth.c;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Map;
import net.openid.appauth.p;

public final class b {
    static {
        Covode.recordClassIndex(106073);
    }

    private static String a(String str) {
        p.a(str);
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalStateException("Unable to encode using UTF-8");
        }
    }

    public static String a(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(entry.getKey() + "=" + a(entry.getValue()));
        }
        return TextUtils.join("&", arrayList);
    }

    public static Long a(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            return Long.valueOf(Long.parseLong(queryParameter));
        }
        return null;
    }

    public static void a(Uri.Builder builder, String str, Object obj) {
        if (obj != null && obj.toString() != null) {
            builder.appendQueryParameter(str, obj.toString());
        }
    }
}
