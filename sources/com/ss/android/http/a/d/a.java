package com.ss.android.http.a.d;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f59538a;

    /* renamed from: b  reason: collision with root package name */
    public int f59539b;

    static {
        Covode.recordClassIndex(36767);
    }

    public a(int i2) {
        if (i2 >= 0) {
            this.f59538a = new byte[i2];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }
}
