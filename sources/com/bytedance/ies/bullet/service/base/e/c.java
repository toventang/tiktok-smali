package com.bytedance.ies.bullet.service.base.e;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {
    static {
        Covode.recordClassIndex(19353);
    }

    public static final Long a(String str) {
        boolean z;
        l.c(str, "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (Throwable unused) {
            return null;
        }
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
