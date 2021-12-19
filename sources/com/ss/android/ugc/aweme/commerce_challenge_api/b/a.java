package com.ss.android.ugc.aweme.commerce_challenge_api.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f73510a;

    /* renamed from: b  reason: collision with root package name */
    public String f73511b;

    static {
        Covode.recordClassIndex(45246);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f73510a == aVar.f73510a && l.a(this.f73511b, aVar.f73511b);
    }

    public final int hashCode() {
        int i2 = this.f73510a * 31;
        String str = this.f73511b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CommerceHeaderParam(buttonType=" + this.f73510a + ", enterFrom=" + this.f73511b + ")";
    }

    private /* synthetic */ a() {
        this(0, null);
    }

    public a(int i2, String str) {
        this.f73510a = i2;
        this.f73511b = str;
    }
}
