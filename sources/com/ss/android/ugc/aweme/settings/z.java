package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.Arrays;

public final class z {
    @c(a = "dimensional")

    /* renamed from: a  reason: collision with root package name */
    public final int f123148a = 0;
    @c(a = "keyword_list")

    /* renamed from: b  reason: collision with root package name */
    public final String[] f123149b = null;

    static {
        Covode.recordClassIndex(80875);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f123148a == zVar.f123148a && l.a(this.f123149b, zVar.f123149b);
    }

    public final int hashCode() {
        int i2 = this.f123148a * 31;
        String[] strArr = this.f123149b;
        return i2 + (strArr != null ? Arrays.hashCode(strArr) : 0);
    }

    public final String toString() {
        return "PopupBlockList(dimensional=" + this.f123148a + ", keywordList=" + Arrays.toString(this.f123149b) + ")";
    }

    private z() {
    }
}
