package com.ss.android.ugc.aweme.search.ecom.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final UrlModel f121112a;

    /* renamed from: b  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.search.ecom.a.a> f121113b;

    static {
        Covode.recordClassIndex(78888);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f121112a, aVar.f121112a) && l.a(this.f121113b, aVar.f121113b);
    }

    public final int hashCode() {
        UrlModel urlModel = this.f121112a;
        int i2 = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        List<com.ss.android.ugc.aweme.search.ecom.a.a> list = this.f121113b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ProductAnchor(iconUrlModel=" + this.f121112a + ", productList=" + this.f121113b + ")";
    }

    private /* synthetic */ a() {
        this(null, null);
    }

    public a(UrlModel urlModel, List<com.ss.android.ugc.aweme.search.ecom.a.a> list) {
        this.f121112a = urlModel;
        this.f121113b = list;
    }
}
