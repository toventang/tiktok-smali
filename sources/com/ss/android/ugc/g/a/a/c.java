package com.ss.android.ugc.g.a.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f145587a;

    /* renamed from: b  reason: collision with root package name */
    public final int f145588b;

    static {
        Covode.recordClassIndex(95626);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!l.a((Object) this.f145587a, (Object) cVar.f145587a) || this.f145588b != cVar.f145588b) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f145587a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f145588b;
    }

    public final String toString() {
        return "IPPort(ip=" + this.f145587a + ", port=" + this.f145588b + ")";
    }

    public c(String str, int i2) {
        l.c(str, "");
        this.f145587a = str;
        this.f145588b = i2;
    }
}
