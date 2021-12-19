package com.bytedance.creativex.recorder.sticker.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f28381a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28382b;

    /* renamed from: c  reason: collision with root package name */
    public final int f28383c;

    /* renamed from: d  reason: collision with root package name */
    public final String f28384d;

    static {
        Covode.recordClassIndex(16673);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f28381a == aVar.f28381a && this.f28382b == aVar.f28382b && this.f28383c == aVar.f28383c && l.a(this.f28384d, aVar.f28384d);
    }

    public final int hashCode() {
        int i2 = ((((this.f28381a * 31) + this.f28382b) * 31) + this.f28383c) * 31;
        String str = this.f28384d;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "EffectSDKMessage(messageType=" + this.f28381a + ", arg1=" + this.f28382b + ", arg2=" + this.f28383c + ", arg3=" + this.f28384d + ")";
    }

    public a(int i2, int i3, int i4, String str) {
        this.f28381a = i2;
        this.f28382b = i3;
        this.f28383c = i4;
        this.f28384d = str;
    }
}
