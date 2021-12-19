package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;
import h.p;
import java.util.List;

public final class b implements j {

    /* renamed from: a  reason: collision with root package name */
    public final a<List<IMUser>> f102787a;

    /* renamed from: b  reason: collision with root package name */
    public final a<IMUser> f102788b;

    /* renamed from: c  reason: collision with root package name */
    public final p<List<IMUser>, String> f102789c;

    static {
        Covode.recordClassIndex(65899);
    }

    private static b a(a<? extends List<? extends IMUser>> aVar, a<? extends IMUser> aVar2, p<? extends List<? extends IMUser>, String> pVar) {
        l.d(aVar, "");
        l.d(pVar, "");
        return new b(aVar, aVar2, pVar);
    }

    public static /* synthetic */ b a(b bVar, a aVar, a aVar2, p pVar, int i2) {
        if ((i2 & 1) != 0) {
            aVar = bVar.f102787a;
        }
        if ((i2 & 2) != 0) {
            aVar2 = bVar.f102788b;
        }
        if ((i2 & 4) != 0) {
            pVar = bVar.f102789c;
        }
        return a(aVar, aVar2, pVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f102787a, bVar.f102787a) && l.a(this.f102788b, bVar.f102788b) && l.a(this.f102789c, bVar.f102789c);
    }

    public final int hashCode() {
        a<List<IMUser>> aVar = this.f102787a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        a<IMUser> aVar2 = this.f102788b;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        p<List<IMUser>, String> pVar = this.f102789c;
        if (pVar != null) {
            i2 = pVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "SelectorState(contactList=" + this.f102787a + ", isSelectedChangedUser=" + this.f102788b + ", searchResult=" + this.f102789c + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.p<? extends java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(a<? extends List<? extends IMUser>> aVar, a<? extends IMUser> aVar2, p<? extends List<? extends IMUser>, String> pVar) {
        l.d(aVar, "");
        l.d(pVar, "");
        this.f102787a = aVar;
        this.f102788b = aVar2;
        this.f102789c = pVar;
    }
}
