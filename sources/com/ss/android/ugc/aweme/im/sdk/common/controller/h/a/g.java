package com.ss.android.ugc.aweme.im.sdk.common.controller.h.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.g.b;
import h.f.b.l;

public final class g extends b {

    /* renamed from: a  reason: collision with root package name */
    public final String f102309a;

    static {
        Covode.recordClassIndex(65469);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof g) && l.a(this.f102309a, ((g) obj).f102309a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f102309a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.im.service.g.b
    public final String toString() {
        return "ImageShowEventKey(imageId=" + this.f102309a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(String str) {
        super("aweme_im_image_show", str);
        l.d(str, "");
        this.f102309a = str;
    }
}
