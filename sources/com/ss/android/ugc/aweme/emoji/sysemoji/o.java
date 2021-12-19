package com.ss.android.ugc.aweme.emoji.sysemoji;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class o {
    @c(a = "enable_business")

    /* renamed from: a  reason: collision with root package name */
    public final int f89407a = -1;
    @c(a = "res_version")

    /* renamed from: b  reason: collision with root package name */
    public final String f89408b;
    @c(a = "mt_enable_big_text_emoji")

    /* renamed from: c  reason: collision with root package name */
    public final int f89409c;

    static {
        Covode.recordClassIndex(56180);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f89407a == oVar.f89407a && l.a(this.f89408b, oVar.f89408b) && this.f89409c == oVar.f89409c;
    }

    public final int hashCode() {
        int i2 = this.f89407a * 31;
        String str = this.f89408b;
        return ((i2 + (str != null ? str.hashCode() : 0)) * 31) + this.f89409c;
    }

    public final String toString() {
        return "SystemEmojiVersionId(bussinessCode=" + this.f89407a + ", versionId=" + this.f89408b + ", bigTextEmojiEnable=" + this.f89409c + ")";
    }

    public o(String str) {
        l.d(str, "");
        this.f89408b = str;
        this.f89409c = 1;
    }
}
