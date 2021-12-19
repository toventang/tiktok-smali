package com.d.a.a.a.b;

import com.bytedance.covode.number.Covode;
import com.d.a.a.a.e.d;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f46350a;

    /* renamed from: b  reason: collision with root package name */
    public final String f46351b;

    static {
        Covode.recordClassIndex(28307);
    }

    private j(String str, String str2) {
        this.f46350a = str;
        this.f46351b = str2;
    }

    public static j a(String str, String str2) {
        d.a(str, "Name is null or empty");
        d.a(str2, "Version is null or empty");
        return new j(str, str2);
    }
}
