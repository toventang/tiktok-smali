package com.ss.android.ugc.tools.infosticker.a.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final n f149374a;

    /* renamed from: b  reason: collision with root package name */
    public final String f149375b;

    static {
        Covode.recordClassIndex(98365);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return l.a(this.f149374a, mVar.f149374a) && l.a(this.f149375b, mVar.f149375b);
    }

    public final int hashCode() {
        n nVar = this.f149374a;
        int i2 = 0;
        int hashCode = (nVar != null ? nVar.hashCode() : 0) * 31;
        String str = this.f149375b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ProviderStickerInfo(state=" + this.f149374a + ", filePath=" + this.f149375b + ")";
    }

    public m(n nVar, String str) {
        l.d(nVar, "");
        l.d(str, "");
        this.f149374a = nVar;
        this.f149375b = str;
    }
}
