package com.ss.android.ugc.aweme.search.ecom.live;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Aweme f121104a;

    /* renamed from: b  reason: collision with root package name */
    public int f121105b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f121106c;

    static {
        Covode.recordClassIndex(78885);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f121104a, bVar.f121104a) && this.f121105b == bVar.f121105b && l.a(this.f121106c, bVar.f121106c);
    }

    public final int hashCode() {
        Aweme aweme = this.f121104a;
        int i2 = 0;
        int hashCode = (((aweme != null ? aweme.hashCode() : 0) * 31) + this.f121105b) * 31;
        List<String> list = this.f121106c;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "LiveWithProductModel(aweme=" + this.f121104a + ", productIndex=" + this.f121105b + ", hasLogAnchorShow=" + this.f121106c + ")";
    }

    public /* synthetic */ b(Aweme aweme) {
        this(aweme, new ArrayList());
    }

    private b(Aweme aweme, List<String> list) {
        l.d(aweme, "");
        l.d(list, "");
        this.f121104a = aweme;
        this.f121105b = 0;
        this.f121106c = list;
    }
}
