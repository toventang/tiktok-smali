package com.ss.android.ugc.aweme.feed.ui.masklayer2.layout;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f94952a;

    /* renamed from: b  reason: collision with root package name */
    public final String f94953b;

    static {
        Covode.recordClassIndex(60223);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f94952a, cVar.f94952a) && l.a(this.f94953b, cVar.f94953b);
    }

    public final int hashCode() {
        String str = this.f94952a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f94953b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "DislikeReasonVO(id=" + this.f94952a + ", reason=" + this.f94953b + ")";
    }

    public c(String str, String str2) {
        this.f94952a = str;
        this.f94953b = str2;
    }
}
