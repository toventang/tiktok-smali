package com.ss.android.ugc.aweme.shortvideo.upload.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final List<Integer> f132042a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Integer> f132043b;

    /* renamed from: c  reason: collision with root package name */
    public final String f132044c;

    /* renamed from: d  reason: collision with root package name */
    public final String f132045d;

    /* renamed from: e  reason: collision with root package name */
    public final String f132046e;

    static {
        Covode.recordClassIndex(86512);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f132042a, gVar.f132042a) && l.a(this.f132043b, gVar.f132043b) && l.a(this.f132044c, gVar.f132044c) && l.a(this.f132045d, gVar.f132045d) && l.a(this.f132046e, gVar.f132046e);
    }

    public final int hashCode() {
        List<Integer> list = this.f132042a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Integer> list2 = this.f132043b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.f132044c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f132045d;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f132046e;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "PublishEndingWatermarkParam(sourceVideoSize=" + this.f132042a + ", outputVideoSize=" + this.f132043b + ", outputVideoPath=" + this.f132044c + ", workspace=" + this.f132045d + ", watermarkVideoPath=" + this.f132046e + ")";
    }

    public g(List<Integer> list, List<Integer> list2, String str, String str2, String str3) {
        l.d(list, "");
        l.d(list2, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f132042a = list;
        this.f132043b = list2;
        this.f132044c = str;
        this.f132045d = str2;
        this.f132046e = str3;
    }
}
