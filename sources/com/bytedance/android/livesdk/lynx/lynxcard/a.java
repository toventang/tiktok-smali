package com.bytedance.android.livesdk.lynx.lynxcard;

import android.view.View;
import com.bytedance.android.livesdk.container.k.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final c f18788a;

    /* renamed from: b  reason: collision with root package name */
    public final View f18789b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18790c;

    static {
        Covode.recordClassIndex(11124);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f18788a, aVar.f18788a) && l.a(this.f18789b, aVar.f18789b) && this.f18790c == aVar.f18790c;
    }

    public final int hashCode() {
        c cVar = this.f18788a;
        int i2 = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        View view = this.f18789b;
        if (view != null) {
            i2 = view.hashCode();
        }
        return ((hashCode + i2) * 31) + this.f18790c;
    }

    public final String toString() {
        return "AddData(lynxCardView=" + this.f18788a + ", preview=" + this.f18789b + ", priority=" + this.f18790c + ")";
    }

    public a(c cVar, View view, int i2) {
        l.d(cVar, "");
        this.f18788a = cVar;
        this.f18789b = view;
        this.f18790c = i2;
    }
}
