package com.ss.android.ugc.aweme.creatortools.creatorplus;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;

public final class h {
    @c(a = "image")

    /* renamed from: a  reason: collision with root package name */
    public final UrlModel f78435a;
    @c(a = "message_key")

    /* renamed from: b  reason: collision with root package name */
    public final String f78436b;
    @c(a = "title_key")

    /* renamed from: c  reason: collision with root package name */
    public final String f78437c;

    static {
        Covode.recordClassIndex(48711);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f78435a, hVar.f78435a) && l.a(this.f78436b, hVar.f78436b) && l.a(this.f78437c, hVar.f78437c);
    }

    public final int hashCode() {
        UrlModel urlModel = this.f78435a;
        int i2 = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.f78436b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f78437c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ModalInfo(image=" + this.f78435a + ", messageKey=" + this.f78436b + ", titleKey=" + this.f78437c + ")";
    }
}
