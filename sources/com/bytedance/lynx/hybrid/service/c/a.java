package com.bytedance.lynx.hybrid.service.c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(25273);
    }

    public static final String a(Uri uri, String str) {
        l.c(uri, "");
        l.c(str, "");
        try {
            return uri.getQueryParameter(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
