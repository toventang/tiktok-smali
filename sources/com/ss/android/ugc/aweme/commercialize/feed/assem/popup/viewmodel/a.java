package com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;

public final class a implements j {

    /* renamed from: a */
    public final com.bytedance.assem.arch.extensions.a<Boolean> f74142a;

    /* renamed from: b */
    public final com.bytedance.assem.arch.extensions.a<z> f74143b;

    /* renamed from: c */
    public final com.bytedance.assem.arch.extensions.a<z> f74144c;

    /* renamed from: d */
    public final com.bytedance.assem.arch.extensions.a<Boolean> f74145d;

    /* renamed from: e */
    public final com.bytedance.assem.arch.extensions.a<z> f74146e;

    /* renamed from: f */
    public final com.bytedance.assem.arch.extensions.a<z> f74147f;

    static {
        Covode.recordClassIndex(45744);
    }

    private static a a(com.bytedance.assem.arch.extensions.a<Boolean> aVar, com.bytedance.assem.arch.extensions.a<z> aVar2, com.bytedance.assem.arch.extensions.a<z> aVar3, com.bytedance.assem.arch.extensions.a<Boolean> aVar4, com.bytedance.assem.arch.extensions.a<z> aVar5, com.bytedance.assem.arch.extensions.a<z> aVar6) {
        return new a(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static /* synthetic */ a a(a aVar, com.bytedance.assem.arch.extensions.a aVar2, com.bytedance.assem.arch.extensions.a aVar3, com.bytedance.assem.arch.extensions.a aVar4, com.bytedance.assem.arch.extensions.a aVar5, com.bytedance.assem.arch.extensions.a aVar6, com.bytedance.assem.arch.extensions.a aVar7, int i2) {
        com.bytedance.assem.arch.extensions.a aVar8 = aVar7;
        com.bytedance.assem.arch.extensions.a aVar9 = aVar6;
        com.bytedance.assem.arch.extensions.a aVar10 = aVar2;
        com.bytedance.assem.arch.extensions.a aVar11 = aVar3;
        com.bytedance.assem.arch.extensions.a aVar12 = aVar4;
        com.bytedance.assem.arch.extensions.a aVar13 = aVar5;
        if ((i2 & 1) != 0) {
            aVar10 = aVar.f74142a;
        }
        if ((i2 & 2) != 0) {
            aVar11 = aVar.f74143b;
        }
        if ((i2 & 4) != 0) {
            aVar12 = aVar.f74144c;
        }
        if ((i2 & 8) != 0) {
            aVar13 = aVar.f74145d;
        }
        if ((i2 & 16) != 0) {
            aVar9 = aVar.f74146e;
        }
        if ((i2 & 32) != 0) {
            aVar8 = aVar.f74147f;
        }
        return a(aVar10, aVar11, aVar12, aVar13, aVar9, aVar8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f74142a, aVar.f74142a) && l.a(this.f74143b, aVar.f74143b) && l.a(this.f74144c, aVar.f74144c) && l.a(this.f74145d, aVar.f74145d) && l.a(this.f74146e, aVar.f74146e) && l.a(this.f74147f, aVar.f74147f);
    }

    public final int hashCode() {
        com.bytedance.assem.arch.extensions.a<Boolean> aVar = this.f74142a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        com.bytedance.assem.arch.extensions.a<z> aVar2 = this.f74143b;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        com.bytedance.assem.arch.extensions.a<z> aVar3 = this.f74144c;
        int hashCode3 = (hashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        com.bytedance.assem.arch.extensions.a<Boolean> aVar4 = this.f74145d;
        int hashCode4 = (hashCode3 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        com.bytedance.assem.arch.extensions.a<z> aVar5 = this.f74146e;
        int hashCode5 = (hashCode4 + (aVar5 != null ? aVar5.hashCode() : 0)) * 31;
        com.bytedance.assem.arch.extensions.a<z> aVar6 = this.f74147f;
        if (aVar6 != null) {
            i2 = aVar6.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "AdPopUpWebPageState(onPopUpWebPageShowEvent=" + this.f74142a + ", popUpShowPauseEvent=" + this.f74143b + ", popUpDismissResumeEvent=" + this.f74144c + ", isPopUpShow=" + this.f74145d + ", showView=" + this.f74146e + ", sendStatusEvent=" + this.f74147f + ")";
    }

    public /* synthetic */ a() {
        this(null, null, null, null, null, null);
    }

    private a(com.bytedance.assem.arch.extensions.a<Boolean> aVar, com.bytedance.assem.arch.extensions.a<z> aVar2, com.bytedance.assem.arch.extensions.a<z> aVar3, com.bytedance.assem.arch.extensions.a<Boolean> aVar4, com.bytedance.assem.arch.extensions.a<z> aVar5, com.bytedance.assem.arch.extensions.a<z> aVar6) {
        this.f74142a = aVar;
        this.f74143b = aVar2;
        this.f74144c = aVar3;
        this.f74145d = aVar4;
        this.f74146e = aVar5;
        this.f74147f = aVar6;
    }
}
