package com.ss.android.ugc.aweme.feed.assem.desc;

import android.text.SpannableStringBuilder;
import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;

public final class l implements j {

    /* renamed from: a  reason: collision with root package name */
    public final a<SpannableStringBuilder> f92208a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f92209b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f92210c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f92211d;

    /* renamed from: e  reason: collision with root package name */
    public final a f92212e;

    /* renamed from: f  reason: collision with root package name */
    public final a<Boolean> f92213f;

    /* renamed from: g  reason: collision with root package name */
    public final a<Boolean> f92214g;

    static {
        Covode.recordClassIndex(58190);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h.f.b.l.a(this.f92208a, lVar.f92208a) && this.f92209b == lVar.f92209b && this.f92210c == lVar.f92210c && this.f92211d == lVar.f92211d && h.f.b.l.a(this.f92212e, lVar.f92212e) && h.f.b.l.a(this.f92213f, lVar.f92213f) && h.f.b.l.a(this.f92214g, lVar.f92214g);
    }

    public final int hashCode() {
        a<SpannableStringBuilder> aVar = this.f92208a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        boolean z = this.f92209b;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode + i4) * 31;
        boolean z2 = this.f92210c;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        if (!this.f92211d) {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        a aVar2 = this.f92212e;
        int hashCode2 = (i12 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        a<Boolean> aVar3 = this.f92213f;
        int hashCode3 = (hashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        a<Boolean> aVar4 = this.f92214g;
        if (aVar4 != null) {
            i2 = aVar4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "VideoDescState(sync2StateEvent=" + this.f92208a + ", isShowVideoDesc=" + this.f92209b + ", isShowSplitVideoPartDescForFeed=" + this.f92210c + ", isShowMixDesNumForFeed=" + this.f92211d + ", toggleAnimationState=" + this.f92212e + ", needOperateDesc=" + this.f92213f + ", showNoNetWorkToast=" + this.f92214g + ")";
    }

    public /* synthetic */ l() {
        this(null, false, false, false, null, null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends android.text.SpannableStringBuilder> */
    /* JADX WARN: Multi-variable type inference failed */
    private l(a<? extends SpannableStringBuilder> aVar, boolean z, boolean z2, boolean z3, a aVar2, a<Boolean> aVar3, a<Boolean> aVar4) {
        this.f92208a = aVar;
        this.f92209b = z;
        this.f92210c = z2;
        this.f92211d = z3;
        this.f92212e = aVar2;
        this.f92213f = aVar3;
        this.f92214g = aVar4;
    }

    public static /* synthetic */ l a(l lVar, a aVar, boolean z, boolean z2, boolean z3, a aVar2, a aVar3, a aVar4, int i2) {
        a aVar5 = aVar4;
        a aVar6 = aVar3;
        a aVar7 = aVar2;
        a aVar8 = aVar;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        if ((i2 & 1) != 0) {
            aVar8 = lVar.f92208a;
        }
        if ((i2 & 2) != 0) {
            z4 = lVar.f92209b;
        }
        if ((i2 & 4) != 0) {
            z5 = lVar.f92210c;
        }
        if ((i2 & 8) != 0) {
            z6 = lVar.f92211d;
        }
        if ((i2 & 16) != 0) {
            aVar7 = lVar.f92212e;
        }
        if ((i2 & 32) != 0) {
            aVar6 = lVar.f92213f;
        }
        if ((i2 & 64) != 0) {
            aVar5 = lVar.f92214g;
        }
        return new l(aVar8, z4, z5, z6, aVar7, aVar6, aVar5);
    }
}
