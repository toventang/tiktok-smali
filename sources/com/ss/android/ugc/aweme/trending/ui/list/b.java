package com.ss.android.ugc.aweme.trending.ui.list;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.l;

public final class b implements com.bytedance.ies.powerlist.b.a {

    /* renamed from: a  reason: collision with root package name */
    public l f141155a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f141156b;

    /* renamed from: c  reason: collision with root package name */
    public a f141157c;

    public interface a {
        static {
            Covode.recordClassIndex(92169);
        }

        void a(View view, b bVar);

        void a(boolean z, l lVar);
    }

    static {
        Covode.recordClassIndex(92168);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(com.bytedance.ies.powerlist.b.a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.f.b.l.a(this.f141155a, bVar.f141155a) && this.f141156b == bVar.f141156b && h.f.b.l.a(this.f141157c, bVar.f141157c);
    }

    public final int hashCode() {
        l lVar = this.f141155a;
        int i2 = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        boolean z = this.f141156b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        a aVar = this.f141157c;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "TrendingSheetItem(model=" + this.f141155a + ", isSelected=" + this.f141156b + ", listener=" + this.f141157c + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(com.bytedance.ies.powerlist.b.a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(com.bytedance.ies.powerlist.b.a aVar) {
        return aVar.equals(this);
    }

    public b(l lVar, boolean z, a aVar) {
        h.f.b.l.d(lVar, "");
        this.f141155a = lVar;
        this.f141156b = z;
        this.f141157c = aVar;
    }
}
