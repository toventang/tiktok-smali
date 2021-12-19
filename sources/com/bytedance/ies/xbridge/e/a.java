package com.bytedance.ies.xbridge.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;

public final class a implements Comparable<a> {

    /* renamed from: a  reason: collision with root package name */
    public String f35901a = "";

    /* renamed from: b  reason: collision with root package name */
    public final String f35902b;

    /* renamed from: c  reason: collision with root package name */
    public final long f35903c;

    /* renamed from: d  reason: collision with root package name */
    public final n f35904d;

    static {
        Covode.recordClassIndex(21460);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f35902b, aVar.f35902b) && this.f35903c == aVar.f35903c && l.a(this.f35904d, aVar.f35904d);
    }

    public final int hashCode() {
        String str = this.f35902b;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.f35903c;
        int i3 = ((hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        n nVar = this.f35904d;
        if (nVar != null) {
            i2 = nVar.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "Event(eventName=" + this.f35902b + ", timestamp=" + this.f35903c + ", params=" + this.f35904d + ")";
    }

    public final void a(String str) {
        l.c(str, "");
        this.f35901a = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(a aVar) {
        a aVar2 = aVar;
        l.c(aVar2, "");
        if (this.f35903c != aVar2.f35903c) {
            return h.b.a.a(Long.valueOf(this.f35903c), Long.valueOf(aVar2.f35903c));
        }
        return -1;
    }

    public a(String str, long j2, n nVar) {
        l.c(str, "");
        this.f35902b = str;
        this.f35903c = j2;
        this.f35904d = nVar;
    }
}
