package com.bytedance.lynx.hybrid.resource.h;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f41200a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(25236);
    }

    public static boolean a(Uri uri) {
        l.c(uri, "");
        return uri.isHierarchical();
    }
}
