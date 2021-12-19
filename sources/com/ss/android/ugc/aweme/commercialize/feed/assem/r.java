package com.ss.android.ugc.aweme.commercialize.feed.assem;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b;
import h.f.b.l;
import h.z;

public final class r implements j {

    /* renamed from: a  reason: collision with root package name */
    public final a<b> f74148a;

    /* renamed from: b  reason: collision with root package name */
    public final a<Boolean> f74149b;

    /* renamed from: c  reason: collision with root package name */
    public final a<z> f74150c;

    /* renamed from: d  reason: collision with root package name */
    public final a<b> f74151d;

    /* renamed from: e  reason: collision with root package name */
    public final a<Boolean> f74152e;

    static {
        Covode.recordClassIndex(45746);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return l.a(this.f74148a, rVar.f74148a) && l.a(this.f74149b, rVar.f74149b) && l.a(this.f74150c, rVar.f74150c) && l.a(this.f74151d, rVar.f74151d) && l.a(this.f74152e, rVar.f74152e);
    }

    public final int hashCode() {
        a<b> aVar = this.f74148a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        a<Boolean> aVar2 = this.f74149b;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        a<z> aVar3 = this.f74150c;
        int hashCode3 = (hashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        a<b> aVar4 = this.f74151d;
        int hashCode4 = (hashCode3 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        a<Boolean> aVar5 = this.f74152e;
        if (aVar5 != null) {
            i2 = aVar5.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "FeedAdEventState(showAdPopUpWebPageEvent=" + this.f74148a + ", setClickFromButtonEvent=" + this.f74149b + ", showAdFakePopUpWebPageEvent=" + this.f74150c + ", showAdProfilePopUpWebPageEvent=" + this.f74151d + ", dismissAdProfilePopUpWebPageEvent=" + this.f74152e + ")";
    }

    public /* synthetic */ r() {
        this(null, null, null, null, null);
    }

    private r(a<b> aVar, a<Boolean> aVar2, a<z> aVar3, a<b> aVar4, a<Boolean> aVar5) {
        this.f74148a = aVar;
        this.f74149b = aVar2;
        this.f74150c = aVar3;
        this.f74151d = aVar4;
        this.f74152e = aVar5;
    }

    public static /* synthetic */ r a(r rVar, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, int i2) {
        a aVar6 = aVar5;
        a aVar7 = aVar;
        a aVar8 = aVar2;
        a aVar9 = aVar3;
        a aVar10 = aVar4;
        if ((i2 & 1) != 0) {
            aVar7 = rVar.f74148a;
        }
        if ((i2 & 2) != 0) {
            aVar8 = rVar.f74149b;
        }
        if ((i2 & 4) != 0) {
            aVar9 = rVar.f74150c;
        }
        if ((i2 & 8) != 0) {
            aVar10 = rVar.f74151d;
        }
        if ((i2 & 16) != 0) {
            aVar6 = rVar.f74152e;
        }
        return new r(aVar7, aVar8, aVar9, aVar10, aVar6);
    }
}
