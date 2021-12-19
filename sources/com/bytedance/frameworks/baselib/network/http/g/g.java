package com.bytedance.frameworks.baselib.network.http.g;

import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import java.net.URI;
import java.net.URISyntaxException;

public final class g {
    static {
        Covode.recordClassIndex(17125);
    }

    public static URI a(String str) {
        if (m.a(str)) {
            return null;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException unused) {
            try {
                return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused2) {
                return b(str);
            }
        }
    }

    public static URI b(String str) {
        if (m.a(str)) {
            return null;
        }
        try {
            int indexOf = str.indexOf("?");
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            return URI.create(str);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
