package com.ss.android.ugc.tiktok.seclink.impl.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class a {
    @c(a = "handleOverrideUrlScenes")

    /* renamed from: a  reason: collision with root package name */
    public List<String> f149005a;
    @c(a = "blockList")

    /* renamed from: b  reason: collision with root package name */
    public List<b> f149006b;

    static {
        Covode.recordClassIndex(98145);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f149005a, aVar.f149005a) && l.a(this.f149006b, aVar.f149006b);
    }

    public final int hashCode() {
        List<String> list = this.f149005a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<b> list2 = this.f149006b;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SecLinkConfig(handleOverrideUrlScenes=" + this.f149005a + ", blockList=" + this.f149006b + ")";
    }

    private a() {
        this.f149005a = null;
        this.f149006b = null;
    }

    public /* synthetic */ a(byte b2) {
        this();
    }
}
