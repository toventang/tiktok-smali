package com.bytedance.android.monitorV2.lynx.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;
import java.util.WeakHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f24073a = new WeakHashMap();

    static {
        Covode.recordClassIndex(14185);
    }

    public final String a(String str) {
        return this.f24073a.get(str);
    }

    public final void a(String str, String str2) {
        l.c(str2, "");
        if (str != null && str.length() != 0) {
            this.f24073a.put(str, str2);
        }
    }
}
