package com.ss.android.ugc.aweme.ecommerce.pdp.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import h.f.b.l;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<Image> f86448a;

    static {
        Covode.recordClassIndex(54148);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f86448a, ((b) obj).f86448a);
        }
        return true;
    }

    public final int hashCode() {
        List<Image> list = this.f86448a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "HeaderBannerVO(images=" + this.f86448a + ")";
    }

    public b(List<Image> list) {
        l.d(list, "");
        this.f86448a = list;
    }
}
