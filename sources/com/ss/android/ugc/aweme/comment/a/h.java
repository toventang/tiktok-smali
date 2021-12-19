package com.ss.android.ugc.aweme.comment.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;

public final class h {
    @c(a = StringSet.type)

    /* renamed from: a  reason: collision with root package name */
    public int f71286a = 0;
    @c(a = "icon")

    /* renamed from: b  reason: collision with root package name */
    public UrlModel f71287b = null;

    static {
        Covode.recordClassIndex(43883);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f71286a == hVar.f71286a && l.a(this.f71287b, hVar.f71287b);
    }

    public final int hashCode() {
        int i2 = this.f71286a * 31;
        UrlModel urlModel = this.f71287b;
        return i2 + (urlModel != null ? urlModel.hashCode() : 0);
    }

    public final String toString() {
        return "NewStyleBubbleConfig(type=" + this.f71286a + ", icon=" + this.f71287b + ")";
    }

    private h() {
    }
}
