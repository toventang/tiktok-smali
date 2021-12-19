package com.ss.android.ugc.aweme.live.alphaplayer.c;

import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public float f108191a;

    /* renamed from: b  reason: collision with root package name */
    public float f108192b;

    /* renamed from: c  reason: collision with root package name */
    public float f108193c;

    /* renamed from: d  reason: collision with root package name */
    public float f108194d;

    static {
        Covode.recordClassIndex(69343);
    }

    public final void b() {
        this.f108191a = 0.0f;
        this.f108192b = 0.0f;
        this.f108193c = 0.0f;
        this.f108194d = 0.0f;
    }

    public final boolean a() {
        if (this.f108191a == 0.0f || this.f108192b == 0.0f || this.f108193c == 0.0f || this.f108194d == 0.0f) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.f108191a + " " + this.f108192b + " " + this.f108193c + " " + this.f108194d;
    }

    public final void a(float f2, float f3, float f4, float f5) {
        this.f108191a = f2;
        this.f108192b = f3;
        this.f108193c = f4;
        this.f108194d = f5;
    }
}
