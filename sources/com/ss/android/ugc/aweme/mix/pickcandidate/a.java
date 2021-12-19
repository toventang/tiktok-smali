package com.ss.android.ugc.aweme.mix.pickcandidate;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class a implements com.bytedance.ies.powerlist.b.a {

    /* renamed from: a  reason: collision with root package name */
    public UrlModel f110216a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f110217b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f110218c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f110219d;

    /* renamed from: e  reason: collision with root package name */
    public Aweme f110220e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f110221f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f110222g;

    static {
        Covode.recordClassIndex(70743);
    }

    /* access modifiers changed from: private */
    public static a a(UrlModel urlModel, boolean z, boolean z2, boolean z3, Aweme aweme, boolean z4, boolean z5) {
        return new a(urlModel, z, z2, z3, aweme, z4, z5);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(com.bytedance.ies.powerlist.b.a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f110216a, aVar.f110216a) && this.f110217b == aVar.f110217b && this.f110218c == aVar.f110218c && this.f110219d == aVar.f110219d && l.a(this.f110220e, aVar.f110220e) && this.f110221f == aVar.f110221f && this.f110222g == aVar.f110222g;
    }

    public final int hashCode() {
        UrlModel urlModel = this.f110216a;
        int i2 = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        boolean z = this.f110217b;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode + i4) * 31;
        boolean z2 = this.f110218c;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.f110219d;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        Aweme aweme = this.f110220e;
        if (aweme != null) {
            i2 = aweme.hashCode();
        }
        int i16 = (i15 + i2) * 31;
        boolean z4 = this.f110221f;
        if (z4) {
            z4 = true;
        }
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = z4 ? 1 : 0;
        int i20 = (i16 + i17) * 31;
        if (!this.f110222g) {
            i3 = 0;
        }
        return i20 + i3;
    }

    public final String toString() {
        return "MixPickCandidatePowerItem(cover=" + this.f110216a + ", selected=" + this.f110217b + ", gray=" + this.f110218c + ", inOtherList=" + this.f110219d + ", video=" + this.f110220e + ", selectedGray=" + this.f110221f + ", isBlocked=" + this.f110222g + ")";
    }

    public /* synthetic */ a() {
        this(null, false, false, false, null, false, false);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(com.bytedance.ies.powerlist.b.a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(com.bytedance.ies.powerlist.b.a aVar) {
        l.d(aVar, "");
        if (aVar instanceof a) {
            return l.a(this.f110220e, ((a) aVar).f110220e);
        }
        return aVar.equals(this);
    }

    private a(UrlModel urlModel, boolean z, boolean z2, boolean z3, Aweme aweme, boolean z4, boolean z5) {
        this.f110216a = urlModel;
        this.f110217b = z;
        this.f110218c = z2;
        this.f110219d = z3;
        this.f110220e = aweme;
        this.f110221f = z4;
        this.f110222g = z5;
    }
}
