package com.ss.android.ugc.aweme.bitrateselector.a.b;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f68696a = new HashMap();

    static {
        Covode.recordClassIndex(42279);
    }

    public final Map<String, Object> a() {
        try {
            int indexOf = Build.VERSION.RELEASE.indexOf(".");
            if (indexOf < 0) {
                indexOf = Build.VERSION.RELEASE.length();
            }
            a(Integer.valueOf(Build.VERSION.RELEASE.substring(0, indexOf)).intValue());
        } catch (NumberFormatException unused) {
            a(0);
        }
        return this.f68696a;
    }

    private a a(int i2) {
        this.f68696a.put("os_ver", Integer.valueOf(i2));
        return this;
    }
}
