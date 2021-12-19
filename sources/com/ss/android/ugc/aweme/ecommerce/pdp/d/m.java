package com.ss.android.ugc.aweme.ecommerce.pdp.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f86477a;

    /* renamed from: b  reason: collision with root package name */
    public final String f86478b;

    static {
        Covode.recordClassIndex(54160);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return l.a(this.f86477a, mVar.f86477a) && l.a(this.f86478b, mVar.f86478b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f86477a;
        int i2 = 0;
        int hashCode = (charSequence != null ? charSequence.hashCode() : 0) * 31;
        String str = this.f86478b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ProductTextVO(text=" + this.f86477a + ", style=" + this.f86478b + ")";
    }

    public m(CharSequence charSequence, String str) {
        l.d(charSequence, "");
        l.d(str, "");
        this.f86477a = charSequence;
        this.f86478b = str;
    }
}
