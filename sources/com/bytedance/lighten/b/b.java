package com.bytedance.lighten.b;

import com.bytedance.covode.number.Covode;
import com.facebook.h.c;
import com.facebook.h.e;

public final class b implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final c f39920a = new c("DNG", "dng");

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f39921b = {73, 73, 42, 0};

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f39922c = {77, 77, 0, 42};

    @Override // com.facebook.h.c.a
    public final int a() {
        return f39921b.length;
    }

    static {
        Covode.recordClassIndex(24624);
    }

    @Override // com.facebook.h.c.a
    public final c a(byte[] bArr, int i2) {
        byte[] bArr2 = f39921b;
        if (i2 < bArr2.length) {
            return null;
        }
        if (e.a(bArr, bArr2) || e.a(bArr, f39922c)) {
            return f39920a;
        }
        return null;
    }
}
