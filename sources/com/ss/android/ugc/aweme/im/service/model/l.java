package com.ss.android.ugc.aweme.im.service.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;

public final class l implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f103924a;

    /* renamed from: b  reason: collision with root package name */
    public final String f103925b;

    /* renamed from: c  reason: collision with root package name */
    public final long f103926c = 3000;

    /* renamed from: d  reason: collision with root package name */
    public final IMContact f103927d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f103928e;

    /* renamed from: f  reason: collision with root package name */
    public final k f103929f;

    /* renamed from: g  reason: collision with root package name */
    public final String f103930g;

    /* renamed from: h  reason: collision with root package name */
    public final String f103931h;

    static {
        Covode.recordClassIndex(66572);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h.f.b.l.a(this.f103924a, lVar.f103924a) && h.f.b.l.a(this.f103925b, lVar.f103925b) && this.f103926c == lVar.f103926c && h.f.b.l.a(this.f103927d, lVar.f103927d) && this.f103928e == lVar.f103928e && h.f.b.l.a(this.f103929f, lVar.f103929f) && h.f.b.l.a(this.f103930g, lVar.f103930g) && h.f.b.l.a(this.f103931h, lVar.f103931h);
    }

    public final String toString() {
        return "ShareSendingEvent(awemeId=" + this.f103924a + ", identity=" + this.f103925b + ", duration=" + this.f103926c + ", contact=" + this.f103927d + ", isMulti=" + this.f103928e + ", undoCallback=" + this.f103929f + ", enterFrom=" + this.f103930g + ", enterMethod=" + this.f103931h + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str = this.f103924a;
        int i7 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = i2 * 31;
        String str2 = this.f103925b;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        long j2 = this.f103926c;
        int i9 = (((i8 + i3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        IMContact iMContact = this.f103927d;
        if (iMContact != null) {
            i4 = iMContact.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        boolean z = this.f103928e;
        if (z) {
            z = true;
        }
        int i11 = z ? 1 : 0;
        int i12 = z ? 1 : 0;
        int i13 = z ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        k kVar = this.f103929f;
        if (kVar != null) {
            i5 = kVar.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (i14 + i5) * 31;
        String str3 = this.f103930g;
        if (str3 != null) {
            i6 = str3.hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 31;
        String str4 = this.f103931h;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i16 + i7;
    }

    public l(String str, String str2, IMContact iMContact, boolean z, k kVar, String str3, String str4) {
        h.f.b.l.d(str2, "");
        h.f.b.l.d(iMContact, "");
        h.f.b.l.d(kVar, "");
        this.f103924a = str;
        this.f103925b = str2;
        this.f103927d = iMContact;
        this.f103928e = z;
        this.f103929f = kVar;
        this.f103930g = str3;
        this.f103931h = str4;
    }
}
