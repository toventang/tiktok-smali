package com.google.android.gms.common;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class u {

    /* renamed from: a  reason: collision with root package name */
    static final u f50490a = new u(true, null, null);

    /* renamed from: b  reason: collision with root package name */
    final boolean f50491b;

    /* renamed from: c  reason: collision with root package name */
    final Throwable f50492c;

    /* renamed from: d  reason: collision with root package name */
    private final String f50493d;

    /* access modifiers changed from: package-private */
    public String a() {
        return this.f50493d;
    }

    static {
        Covode.recordClassIndex(31457);
    }

    static u a(String str) {
        return new u(false, str, null);
    }

    static u a(String str, Throwable th) {
        return new u(false, str, th);
    }

    u(boolean z, String str, Throwable th) {
        this.f50491b = z;
        this.f50493d = str;
        this.f50492c = th;
    }
}
