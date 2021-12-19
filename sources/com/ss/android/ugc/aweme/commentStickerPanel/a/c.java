package com.ss.android.ugc.aweme.commentStickerPanel.a;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.util.List;

public final class c {
    @com.google.gson.a.c(a = "comment_list")

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f73123a = null;
    @com.google.gson.a.c(a = "cursor")

    /* renamed from: b  reason: collision with root package name */
    public final Integer f73124b = null;
    @com.google.gson.a.c(a = "has_more")

    /* renamed from: c  reason: collision with root package name */
    public final Integer f73125c = null;
    @com.google.gson.a.c(a = "count")

    /* renamed from: d  reason: collision with root package name */
    public final Integer f73126d = null;
    @com.google.gson.a.c(a = StringSet.type)

    /* renamed from: e  reason: collision with root package name */
    public final Integer f73127e = null;

    static {
        Covode.recordClassIndex(45053);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f73123a, cVar.f73123a) && l.a(this.f73124b, cVar.f73124b) && l.a(this.f73125c, cVar.f73125c) && l.a(this.f73126d, cVar.f73126d) && l.a(this.f73127e, cVar.f73127e);
    }

    public final int hashCode() {
        List<b> list = this.f73123a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Integer num = this.f73124b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f73125c;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f73126d;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.f73127e;
        if (num4 != null) {
            i2 = num4.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "CommentStickerPanelData(commentStickerPanelList=" + this.f73123a + ", cursor=" + this.f73124b + ", hasMore=" + this.f73125c + ", count=" + this.f73126d + ", tabType=" + this.f73127e + ")";
    }

    private c() {
    }
}
