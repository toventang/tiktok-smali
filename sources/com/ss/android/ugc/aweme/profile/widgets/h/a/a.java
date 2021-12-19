package com.ss.android.ugc.aweme.profile.widgets.h.a;

import com.bytedance.assem.arch.extensions.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f117876a;

    /* renamed from: b  reason: collision with root package name */
    public final String f117877b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f117878c;

    /* renamed from: d  reason: collision with root package name */
    public final String f117879d;

    /* renamed from: e  reason: collision with root package name */
    public final String f117880e;

    static {
        Covode.recordClassIndex(76387);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f117876a, aVar.f117876a) && l.a(this.f117877b, aVar.f117877b) && this.f117878c == aVar.f117878c && l.a(this.f117879d, aVar.f117879d) && l.a(this.f117880e, aVar.f117880e);
    }

    public final int hashCode() {
        String str = this.f117876a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f117877b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.f117878c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        String str3 = this.f117879d;
        int hashCode3 = (i6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f117880e;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "MineProfileInitData(from=" + this.f117876a + ", enterFrom=" + this.f117877b + ", isMine=" + this.f117878c + ", uid=" + this.f117879d + ", secUid=" + this.f117880e + ")";
    }

    private /* synthetic */ a() {
        this(null, null, false, null, null);
    }

    public a(String str, String str2, boolean z, String str3, String str4) {
        this.f117876a = str;
        this.f117877b = str2;
        this.f117878c = z;
        this.f117879d = str3;
        this.f117880e = str4;
    }
}
