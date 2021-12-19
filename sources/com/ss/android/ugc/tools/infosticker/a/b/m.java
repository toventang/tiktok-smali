package com.ss.android.ugc.tools.infosticker.a.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f149480a;

    /* renamed from: b  reason: collision with root package name */
    public final String f149481b;

    static {
        Covode.recordClassIndex(98425);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return l.a(this.f149480a, mVar.f149480a) && l.a(this.f149481b, mVar.f149481b);
    }

    public final int hashCode() {
        Integer num = this.f149480a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f149481b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "InfoStickerDownloadInfo(errorCode=" + this.f149480a + ", errorMsg=" + this.f149481b + ")";
    }

    public /* synthetic */ m() {
        this(null, null);
    }

    public m(Integer num, String str) {
        this.f149480a = num;
        this.f149481b = str;
    }
}
