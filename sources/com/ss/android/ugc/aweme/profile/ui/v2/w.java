package com.ss.android.ugc.aweme.profile.ui.v2;

import android.content.Intent;
import com.bytedance.assem.arch.service.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import h.u;
import h.z;

public final class w implements a {

    /* renamed from: a */
    public final com.bytedance.assem.arch.extensions.a<User> f117297a;

    /* renamed from: b */
    public final com.bytedance.assem.arch.extensions.a<z> f117298b;

    /* renamed from: c */
    public final com.bytedance.assem.arch.extensions.a<Boolean> f117299c;

    /* renamed from: d */
    public final com.bytedance.assem.arch.extensions.a<u<Integer, Integer, Intent>> f117300d;

    /* renamed from: e */
    public final boolean f117301e;

    /* renamed from: f */
    public final boolean f117302f;

    static {
        Covode.recordClassIndex(75804);
    }

    private static w a(com.bytedance.assem.arch.extensions.a<? extends User> aVar, com.bytedance.assem.arch.extensions.a<z> aVar2, com.bytedance.assem.arch.extensions.a<Boolean> aVar3, com.bytedance.assem.arch.extensions.a<? extends u<Integer, Integer, ? extends Intent>> aVar4, boolean z, boolean z2) {
        return new w(aVar, aVar2, aVar3, aVar4, z, z2);
    }

    public static /* synthetic */ w a(w wVar, com.bytedance.assem.arch.extensions.a aVar, com.bytedance.assem.arch.extensions.a aVar2, com.bytedance.assem.arch.extensions.a aVar3, com.bytedance.assem.arch.extensions.a aVar4, boolean z, boolean z2, int i2) {
        boolean z3 = z2;
        boolean z4 = z;
        com.bytedance.assem.arch.extensions.a aVar5 = aVar;
        com.bytedance.assem.arch.extensions.a aVar6 = aVar2;
        com.bytedance.assem.arch.extensions.a aVar7 = aVar3;
        com.bytedance.assem.arch.extensions.a aVar8 = aVar4;
        if ((i2 & 1) != 0) {
            aVar5 = wVar.f117297a;
        }
        if ((i2 & 2) != 0) {
            aVar6 = wVar.f117298b;
        }
        if ((i2 & 4) != 0) {
            aVar7 = wVar.f117299c;
        }
        if ((i2 & 8) != 0) {
            aVar8 = wVar.f117300d;
        }
        if ((i2 & 16) != 0) {
            z4 = wVar.f117301e;
        }
        if ((i2 & 32) != 0) {
            z3 = wVar.f117302f;
        }
        return a(aVar5, aVar6, aVar7, aVar8, z4, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return l.a(this.f117297a, wVar.f117297a) && l.a(this.f117298b, wVar.f117298b) && l.a(this.f117299c, wVar.f117299c) && l.a(this.f117300d, wVar.f117300d) && this.f117301e == wVar.f117301e && this.f117302f == wVar.f117302f;
    }

    public final int hashCode() {
        com.bytedance.assem.arch.extensions.a<User> aVar = this.f117297a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        com.bytedance.assem.arch.extensions.a<z> aVar2 = this.f117298b;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        com.bytedance.assem.arch.extensions.a<Boolean> aVar3 = this.f117299c;
        int hashCode3 = (hashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        com.bytedance.assem.arch.extensions.a<u<Integer, Integer, Intent>> aVar4 = this.f117300d;
        if (aVar4 != null) {
            i2 = aVar4.hashCode();
        }
        int i3 = (hashCode3 + i2) * 31;
        boolean z = this.f117301e;
        int i4 = 1;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = (i3 + i5) * 31;
        if (!this.f117302f) {
            i4 = 0;
        }
        return i8 + i4;
    }

    public final String toString() {
        return "MineProfileCommonData(refreshUIEvent=" + this.f117297a + ", bindCouponEntranceGifEvent=" + this.f117298b + ", onHiddenChangedEvent=" + this.f117299c + ", onActivityResultEvent=" + this.f117300d + ", userVisibleHint=" + this.f117301e + ", visibleToUserInFeed=" + this.f117302f + ")";
    }

    public /* synthetic */ w() {
        this(null, null, null, null, true, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends h.u<java.lang.Integer, java.lang.Integer, ? extends android.content.Intent>> */
    /* JADX WARN: Multi-variable type inference failed */
    private w(com.bytedance.assem.arch.extensions.a<? extends User> aVar, com.bytedance.assem.arch.extensions.a<z> aVar2, com.bytedance.assem.arch.extensions.a<Boolean> aVar3, com.bytedance.assem.arch.extensions.a<? extends u<Integer, Integer, ? extends Intent>> aVar4, boolean z, boolean z2) {
        this.f117297a = aVar;
        this.f117298b = aVar2;
        this.f117299c = aVar3;
        this.f117300d = aVar4;
        this.f117301e = z;
        this.f117302f = z2;
    }
}
