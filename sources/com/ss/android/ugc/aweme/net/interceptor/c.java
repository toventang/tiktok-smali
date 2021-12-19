package com.ss.android.ugc.aweme.net.interceptor;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.net.f.h;
import okhttp3.HttpUrl;

public final class c {
    static {
        Covode.recordClassIndex(72243);
    }

    public static String a(String str, HttpUrl.Builder builder) {
        String str2;
        if (!str.contains("/service/settings/v2")) {
            return str;
        }
        if (h.a()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        builder.addQueryParameter("googleServiceEnable", str2);
        return builder.build().url().toString();
    }
}
