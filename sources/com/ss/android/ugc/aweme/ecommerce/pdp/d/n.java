package com.ss.android.ugc.aweme.ecommerce.pdp.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.api.model.Video;
import h.f.b.l;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Video f86479a;

    static {
        Covode.recordClassIndex(54161);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof n) && l.a(this.f86479a, ((n) obj).f86479a);
        }
        return true;
    }

    public final int hashCode() {
        Video video = this.f86479a;
        if (video != null) {
            return video.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProductVideoVO(video=" + this.f86479a + ")";
    }

    public n(Video video) {
        l.d(video, "");
        this.f86479a = video;
    }
}
