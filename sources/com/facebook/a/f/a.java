package com.facebook.a.f;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public float[] f46762a;

    /* renamed from: b  reason: collision with root package name */
    int[] f46763b;

    /* renamed from: c  reason: collision with root package name */
    private int f46764c;

    static {
        Covode.recordClassIndex(28490);
    }

    public a(int[] iArr) {
        this.f46763b = iArr;
        int b2 = b(iArr);
        this.f46764c = b2;
        this.f46762a = new float[b2];
    }

    private static int b(int[] iArr) {
        int i2 = 1;
        for (int i3 : iArr) {
            i2 *= i3;
        }
        return i2;
    }

    public final void a(int[] iArr) {
        this.f46763b = iArr;
        int b2 = b(iArr);
        float[] fArr = new float[b2];
        System.arraycopy(this.f46762a, 0, fArr, 0, Math.min(this.f46764c, b2));
        this.f46762a = fArr;
        this.f46764c = b2;
    }
}
