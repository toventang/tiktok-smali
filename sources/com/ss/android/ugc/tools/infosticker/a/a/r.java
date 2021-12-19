package com.ss.android.ugc.tools.infosticker.a.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final l f149381a;

    /* renamed from: b  reason: collision with root package name */
    public final String f149382b;

    static {
        Covode.recordClassIndex(98370);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return l.a(this.f149381a, rVar.f149381a) && l.a(this.f149382b, rVar.f149382b);
    }

    public final int hashCode() {
        l lVar = this.f149381a;
        int i2 = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        String str = this.f149382b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "StickerStateInfo(state=" + this.f149381a + ", filePath=" + this.f149382b + ")";
    }
}
