package com.ss.android.ugc.aweme.commentStickerPanel.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;

public final class k {
    @c(a = "uid")

    /* renamed from: a  reason: collision with root package name */
    public final String f73145a = null;
    @c(a = "unique_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f73146b = null;
    @c(a = "avatar_thumb")

    /* renamed from: c  reason: collision with root package name */
    public final UrlModel f73147c = null;

    static {
        Covode.recordClassIndex(45061);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return l.a(this.f73145a, kVar.f73145a) && l.a(this.f73146b, kVar.f73146b) && l.a(this.f73147c, kVar.f73147c);
    }

    public final int hashCode() {
        String str = this.f73145a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f73146b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f73147c;
        if (urlModel != null) {
            i2 = urlModel.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "UserForPanel(commentUserId=" + this.f73145a + ", userName=" + this.f73146b + ", avatarThumb=" + this.f73147c + ")";
    }

    private k() {
    }
}
