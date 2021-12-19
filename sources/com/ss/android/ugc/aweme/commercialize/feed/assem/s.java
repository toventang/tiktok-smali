package com.ss.android.ugc.aweme.commercialize.feed.assem;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.model.ao;
import h.f.b.l;
import h.z;

public final class s implements j {

    /* renamed from: a  reason: collision with root package name */
    public final a<ao> f74153a;

    /* renamed from: b  reason: collision with root package name */
    public final a<Boolean> f74154b;

    /* renamed from: c  reason: collision with root package name */
    public final a<z> f74155c;

    /* renamed from: d  reason: collision with root package name */
    public final a<z> f74156d;

    /* renamed from: e  reason: collision with root package name */
    public final a<z> f74157e;

    /* renamed from: f  reason: collision with root package name */
    public final a<z> f74158f;

    static {
        Covode.recordClassIndex(45747);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return l.a(this.f74153a, sVar.f74153a) && l.a(this.f74154b, sVar.f74154b) && l.a(this.f74155c, sVar.f74155c) && l.a(this.f74156d, sVar.f74156d) && l.a(this.f74157e, sVar.f74157e) && l.a(this.f74158f, sVar.f74158f);
    }

    public final int hashCode() {
        a<ao> aVar = this.f74153a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        a<Boolean> aVar2 = this.f74154b;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        a<z> aVar3 = this.f74155c;
        int hashCode3 = (hashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        a<z> aVar4 = this.f74156d;
        int hashCode4 = (hashCode3 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        a<z> aVar5 = this.f74157e;
        int hashCode5 = (hashCode4 + (aVar5 != null ? aVar5.hashCode() : 0)) * 31;
        a<z> aVar6 = this.f74158f;
        if (aVar6 != null) {
            i2 = aVar6.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "FeedAdState(onBindTextureSizeEvent=" + this.f74153a + ", onPopUpWebPageShowEvent=" + this.f74154b + ", onPagerResumeEvent=" + this.f74155c + ", onPagerPauseEvent=" + this.f74156d + ", onAdVideoResumeEvent=" + this.f74157e + ", onAdVideoPauseEvent=" + this.f74158f + ")";
    }

    public /* synthetic */ s() {
        this(null, null, null, null, null, null);
    }

    private s(a<ao> aVar, a<Boolean> aVar2, a<z> aVar3, a<z> aVar4, a<z> aVar5, a<z> aVar6) {
        this.f74153a = aVar;
        this.f74154b = aVar2;
        this.f74155c = aVar3;
        this.f74156d = aVar4;
        this.f74157e = aVar5;
        this.f74158f = aVar6;
    }

    public static /* synthetic */ s a(s sVar, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, int i2) {
        a aVar7 = aVar6;
        a aVar8 = aVar5;
        a aVar9 = aVar;
        a aVar10 = aVar2;
        a aVar11 = aVar3;
        a aVar12 = aVar4;
        if ((i2 & 1) != 0) {
            aVar9 = sVar.f74153a;
        }
        if ((i2 & 2) != 0) {
            aVar10 = sVar.f74154b;
        }
        if ((i2 & 4) != 0) {
            aVar11 = sVar.f74155c;
        }
        if ((i2 & 8) != 0) {
            aVar12 = sVar.f74156d;
        }
        if ((i2 & 16) != 0) {
            aVar8 = sVar.f74157e;
        }
        if ((i2 & 32) != 0) {
            aVar7 = sVar.f74158f;
        }
        return new s(aVar9, aVar10, aVar11, aVar12, aVar8, aVar7);
    }
}
