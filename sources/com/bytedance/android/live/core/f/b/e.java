package com.bytedance.android.live.core.f.b;

import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public int f9056a;

    /* renamed from: b  reason: collision with root package name */
    public int f9057b;

    /* renamed from: c  reason: collision with root package name */
    public int f9058c;

    static {
        Covode.recordClassIndex(4632);
    }

    public e(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f9056a == eVar.f9056a && this.f9057b == eVar.f9057b && this.f9058c == eVar.f9058c;
    }

    public final int hashCode() {
        return (((this.f9056a * 31) + this.f9057b) * 31) + this.f9058c;
    }

    public final String toString() {
        return "ScreenInfo(dpi=" + this.f9056a + ", width=" + this.f9057b + ", height=" + this.f9058c + ")";
    }

    private e() {
        this.f9056a = -1;
        this.f9057b = -1;
        this.f9058c = -1;
    }

    private /* synthetic */ e(byte b2) {
        this();
    }
}
