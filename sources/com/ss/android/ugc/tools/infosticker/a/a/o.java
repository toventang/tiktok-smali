package com.ss.android.ugc.tools.infosticker.a.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final p f149377a;

    /* renamed from: b  reason: collision with root package name */
    public final String f149378b;

    static {
        Covode.recordClassIndex(98367);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return l.a(this.f149377a, oVar.f149377a) && l.a(this.f149378b, oVar.f149378b);
    }

    public final int hashCode() {
        p pVar = this.f149377a;
        int i2 = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        String str = this.f149378b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SearchStickerInfo(state=" + this.f149377a + ", filePath=" + this.f149378b + ")";
    }

    public o(p pVar, String str) {
        l.d(pVar, "");
        l.d(str, "");
        this.f149377a = pVar;
        this.f149378b = str;
    }
}
