package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class l {
    @c(a = "btn_content")

    /* renamed from: a  reason: collision with root package name */
    public final String f76680a;
    @c(a = "btn_url")

    /* renamed from: b  reason: collision with root package name */
    public final String f76681b;
    @c(a = "btn_type")

    /* renamed from: c  reason: collision with root package name */
    public final Integer f76682c;

    static {
        Covode.recordClassIndex(47356);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h.f.b.l.a(this.f76680a, lVar.f76680a) && h.f.b.l.a(this.f76681b, lVar.f76681b) && h.f.b.l.a(this.f76682c, lVar.f76682c);
    }

    public final int hashCode() {
        String str = this.f76680a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f76681b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f76682c;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "PopButton(btnContent=" + this.f76680a + ", btnUrl=" + this.f76681b + ", btnType=" + this.f76682c + ")";
    }
}
