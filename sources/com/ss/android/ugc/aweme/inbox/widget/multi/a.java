package com.ss.android.ugc.aweme.inbox.widget.multi;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;

public final class a {
    @c(a = "url_model")

    /* renamed from: a  reason: collision with root package name */
    public final UrlModel f104411a;
    @c(a = "res_id")

    /* renamed from: b  reason: collision with root package name */
    public final int f104412b;
    @c(a = "url")

    /* renamed from: c  reason: collision with root package name */
    public final String f104413c;

    static {
        Covode.recordClassIndex(66855);
    }

    public a() {
        this(null, 0, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f104411a, aVar.f104411a) && this.f104412b == aVar.f104412b && l.a(this.f104413c, aVar.f104413c);
    }

    public final int hashCode() {
        UrlModel urlModel = this.f104411a;
        int i2 = 0;
        int hashCode = (((urlModel != null ? urlModel.hashCode() : 0) * 31) + this.f104412b) * 31;
        String str = this.f104413c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ActivityIcon(urlModel=" + this.f104411a + ", resId=" + this.f104412b + ", url=" + this.f104413c + ")";
    }

    private a(UrlModel urlModel, int i2, String str) {
        this.f104411a = urlModel;
        this.f104412b = i2;
        this.f104413c = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(UrlModel urlModel, int i2, String str, int i3) {
        this((i3 & 1) != 0 ? null : urlModel, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? null : str);
    }
}
