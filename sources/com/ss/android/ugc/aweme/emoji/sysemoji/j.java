package com.ss.android.ugc.aweme.emoji.sysemoji;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class j extends BaseResponse {
    @c(a = "is_update")

    /* renamed from: a  reason: collision with root package name */
    public final int f89401a;
    @c(a = "system_emoji_resource")

    /* renamed from: b  reason: collision with root package name */
    public final l f89402b;

    static {
        Covode.recordClassIndex(56175);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f89401a == jVar.f89401a && l.a(this.f89402b, jVar.f89402b);
    }

    public final int hashCode() {
        int i2 = this.f89401a * 31;
        l lVar = this.f89402b;
        return i2 + (lVar != null ? lVar.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ImSysEmojiResponse(isUpdate=" + this.f89401a + ", systemEmojiResource=" + this.f89402b + ")";
    }
}
