package com.google.android.gms.common.internal;

import com.a;
import com.bytedance.covode.number.Covode;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final int f50422a = 15;

    /* renamed from: b  reason: collision with root package name */
    private final String f50423b;

    /* renamed from: c  reason: collision with root package name */
    private final String f50424c;

    static {
        Covode.recordClassIndex(31406);
    }

    private j(String str) {
        boolean z;
        r.a((Object) str, (Object) "log tag cannot be null");
        if (str.length() <= 23) {
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = {str, 23};
        if (z) {
            this.f50423b = str;
            this.f50424c = null;
            return;
        }
        throw new IllegalArgumentException(a.a("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public j(String str, byte b2) {
        this(str);
    }
}
