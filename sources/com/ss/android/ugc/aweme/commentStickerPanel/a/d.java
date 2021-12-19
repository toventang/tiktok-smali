package com.ss.android.ugc.aweme.commentStickerPanel.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class d {
    @c(a = "cursor")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f73128a;
    @c(a = "count")

    /* renamed from: b  reason: collision with root package name */
    public final Integer f73129b;
    @c(a = StringSet.type)

    /* renamed from: c  reason: collision with root package name */
    public final Integer f73130c;

    static {
        Covode.recordClassIndex(45054);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f73128a, dVar.f73128a) && l.a(this.f73129b, dVar.f73129b) && l.a(this.f73130c, dVar.f73130c);
    }

    public final int hashCode() {
        Integer num = this.f73128a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f73129b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f73130c;
        if (num3 != null) {
            i2 = num3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "CommentStickerPanelRequest(cursor=" + this.f73128a + ", count=" + this.f73129b + ", type=" + this.f73130c + ")";
    }

    private /* synthetic */ d() {
        this(null, null, null);
    }

    public d(Integer num, Integer num2, Integer num3) {
        this.f73128a = num;
        this.f73129b = num2;
        this.f73130c = num3;
    }
}
