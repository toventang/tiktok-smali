package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class fn {

    /* renamed from: a  reason: collision with root package name */
    public final ft f50864a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f50865b;

    static {
        Covode.recordClassIndex(31791);
    }

    public final fe a() {
        this.f50864a.b();
        return new fp(this.f50865b);
    }

    private fn(int i2) {
        byte[] bArr = new byte[i2];
        this.f50865b = bArr;
        this.f50864a = ft.a(bArr);
    }

    /* synthetic */ fn(int i2, byte b2) {
        this(i2);
    }
}
