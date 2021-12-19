package com.ss.android.ugc.aweme.compliance.business.banappeal.c;

import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f76794a;

    /* renamed from: b  reason: collision with root package name */
    public final b<View, z> f76795b;

    static {
        Covode.recordClassIndex(47468);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f76794a, cVar.f76794a) && l.a(this.f76795b, cVar.f76795b);
    }

    public final int hashCode() {
        String str = this.f76794a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        b<View, z> bVar = this.f76795b;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AppealSecondButtonState(title=" + this.f76794a + ", listener=" + this.f76795b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super android.view.View, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(String str, b<? super View, z> bVar) {
        l.d(str, "");
        l.d(bVar, "");
        this.f76794a = str;
        this.f76795b = bVar;
    }
}
