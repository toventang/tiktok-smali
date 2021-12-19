package com.ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final String f110818a;

    /* renamed from: b  reason: collision with root package name */
    private final String f110819b;

    static {
        Covode.recordClassIndex(71107);
    }

    public final int a() {
        try {
            return Integer.parseInt(this.f110819b);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public t(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f110819b = str;
        this.f110818a = str2;
    }
}
