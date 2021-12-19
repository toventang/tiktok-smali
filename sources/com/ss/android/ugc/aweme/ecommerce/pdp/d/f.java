package com.ss.android.ugc.aweme.ecommerce.pdp.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Image f86459a;

    static {
        Covode.recordClassIndex(54153);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof f) && l.a(this.f86459a, ((f) obj).f86459a);
        }
        return true;
    }

    public final int hashCode() {
        Image image = this.f86459a;
        if (image != null) {
            return image.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProductImageVO(image=" + this.f86459a + ")";
    }

    public f(Image image) {
        l.d(image, "");
        this.f86459a = image;
    }
}
