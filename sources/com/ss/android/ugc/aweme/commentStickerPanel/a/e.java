package com.ss.android.ugc.aweme.commentStickerPanel.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class e {
    @c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f73131a = null;
    @c(a = "collection")

    /* renamed from: b  reason: collision with root package name */
    public final List<c> f73132b = null;

    static {
        Covode.recordClassIndex(45055);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f73131a, eVar.f73131a) && l.a(this.f73132b, eVar.f73132b);
    }

    public final int hashCode() {
        Integer num = this.f73131a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        List<c> list = this.f73132b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "CommentStickerPanelResponse(statusCode=" + this.f73131a + ", collection=" + this.f73132b + ")";
    }

    private e() {
    }
}
