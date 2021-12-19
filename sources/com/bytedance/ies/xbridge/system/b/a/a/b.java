package com.bytedance.ies.xbridge.system.b.a.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final long f36445a;

    /* renamed from: b  reason: collision with root package name */
    public final String f36446b;

    /* renamed from: c  reason: collision with root package name */
    public final String f36447c;

    /* renamed from: d  reason: collision with root package name */
    public final String f36448d;

    /* renamed from: e  reason: collision with root package name */
    public final String f36449e;

    /* renamed from: f  reason: collision with root package name */
    public final int f36450f;

    /* renamed from: g  reason: collision with root package name */
    public final String f36451g;

    static {
        Covode.recordClassIndex(21862);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f36445a == bVar.f36445a && l.a(this.f36446b, bVar.f36446b) && l.a(this.f36447c, bVar.f36447c) && l.a(this.f36448d, bVar.f36448d) && l.a(this.f36449e, bVar.f36449e) && this.f36450f == bVar.f36450f && l.a(this.f36451g, bVar.f36451g);
    }

    public final int hashCode() {
        long j2 = this.f36445a;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        String str = this.f36446b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f36447c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f36448d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f36449e;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f36450f) * 31;
        String str5 = this.f36451g;
        if (str5 != null) {
            i3 = str5.hashCode();
        }
        return hashCode4 + i3;
    }

    public final String toString() {
        return "CalendarModel(id=" + this.f36445a + ", name=" + this.f36446b + ", displayName=" + this.f36447c + ", accountType=" + this.f36448d + ", accountName=" + this.f36449e + ", visible=" + this.f36450f + ", ownerAccount=" + this.f36451g + ")";
    }

    private /* synthetic */ b() {
        this(0, null, null, null, null, 0, null);
    }

    public b(long j2, String str, String str2, String str3, String str4, int i2, String str5) {
        this.f36445a = j2;
        this.f36446b = str;
        this.f36447c = str2;
        this.f36448d = str3;
        this.f36449e = str4;
        this.f36450f = i2;
        this.f36451g = str5;
    }
}
