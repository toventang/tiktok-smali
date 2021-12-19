package com.ss.android.ugc.aweme.search.i;

import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final e f121147a;

    /* renamed from: b  reason: collision with root package name */
    public final d f121148b;

    /* renamed from: c  reason: collision with root package name */
    public final String f121149c;

    /* renamed from: d  reason: collision with root package name */
    public final int f121150d;

    /* renamed from: e  reason: collision with root package name */
    public final View f121151e;

    static {
        Covode.recordClassIndex(78918);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f121147a, aVar.f121147a) && l.a(this.f121148b, aVar.f121148b) && l.a(this.f121149c, aVar.f121149c) && this.f121150d == aVar.f121150d && l.a(this.f121151e, aVar.f121151e);
    }

    public final int hashCode() {
        e eVar = this.f121147a;
        int i2 = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        d dVar = this.f121148b;
        int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        String str = this.f121149c;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f121150d) * 31;
        View view = this.f121151e;
        if (view != null) {
            i2 = view.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "DynamicMaskData(activity=" + this.f121147a + ", patch=" + this.f121148b + ", scenario=" + this.f121149c + ", pageIndex=" + this.f121150d + ", rootView=" + this.f121151e + ")";
    }

    public a(e eVar, d dVar, String str, int i2, View view) {
        this.f121147a = eVar;
        this.f121148b = dVar;
        this.f121149c = str;
        this.f121150d = i2;
        this.f121151e = view;
    }
}
