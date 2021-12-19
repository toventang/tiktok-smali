package com.ss.android.ugc.aweme.find.viewmodel;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f96141a = 20;

    /* renamed from: b  reason: collision with root package name */
    public final int f96142b;

    /* renamed from: c  reason: collision with root package name */
    public final String f96143c;

    static {
        Covode.recordClassIndex(60913);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f96141a == dVar.f96141a && this.f96142b == dVar.f96142b && l.a(this.f96143c, dVar.f96143c);
    }

    public final int hashCode() {
        int i2 = ((this.f96141a * 31) + this.f96142b) * 31;
        String str = this.f96143c;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FindFriendsRequestParam(count=" + this.f96141a + ", cursor=" + this.f96142b + ", recImprUsers=" + this.f96143c + ")";
    }

    public d(int i2, String str) {
        l.d(str, "");
        this.f96142b = i2;
        this.f96143c = str;
    }
}
