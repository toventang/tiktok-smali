package com.ss.android.ugc.aweme.trending.ui.list;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.l;

public final class c implements com.bytedance.ies.powerlist.b.a {

    /* renamed from: a  reason: collision with root package name */
    public l f141158a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f141159b;

    /* renamed from: c  reason: collision with root package name */
    public a f141160c;

    public interface a {
        static {
            Covode.recordClassIndex(92171);
        }

        void a(View view, c cVar);

        void a(boolean z, l lVar);
    }

    static {
        Covode.recordClassIndex(92170);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(com.bytedance.ies.powerlist.b.a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.f.b.l.a(this.f141158a, cVar.f141158a) && this.f141159b == cVar.f141159b && h.f.b.l.a(this.f141160c, cVar.f141160c);
    }

    public final int hashCode() {
        l lVar = this.f141158a;
        int i2 = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        boolean z = this.f141159b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        a aVar = this.f141160c;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "TrendingSheetRichItem(model=" + this.f141158a + ", isSelected=" + this.f141159b + ", listener=" + this.f141160c + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(com.bytedance.ies.powerlist.b.a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(com.bytedance.ies.powerlist.b.a aVar) {
        return aVar.equals(this);
    }

    public c(l lVar, boolean z, a aVar) {
        h.f.b.l.d(lVar, "");
        this.f141158a = lVar;
        this.f141159b = z;
        this.f141160c = aVar;
    }
}
