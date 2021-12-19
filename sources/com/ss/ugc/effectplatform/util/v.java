package com.ss.ugc.effectplatform.util;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f153994a = new v();

    private v() {
    }

    static {
        Covode.recordClassIndex(102691);
    }

    public static String a(String str) {
        l.c(str, "");
        String uri = Uri.parse(str).toString();
        l.a((Object) uri, "");
        return uri;
    }
}
