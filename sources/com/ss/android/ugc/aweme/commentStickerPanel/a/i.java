package com.ss.android.ugc.aweme.commentStickerPanel.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class i {
    @c(a = "cursor")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f73139a;
    @c(a = "count")

    /* renamed from: b  reason: collision with root package name */
    public final Integer f73140b;
    @c(a = "collection_category")

    /* renamed from: c  reason: collision with root package name */
    public final int f73141c;
    @c(a = "forum_recommend_scene")

    /* renamed from: d  reason: collision with root package name */
    public final int f73142d;

    static {
        Covode.recordClassIndex(45059);
    }

    public i() {
        this(null, null, 0, 0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f73139a, iVar.f73139a) && l.a(this.f73140b, iVar.f73140b) && this.f73141c == iVar.f73141c && this.f73142d == iVar.f73142d;
    }

    public final int hashCode() {
        Integer num = this.f73139a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f73140b;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return ((((hashCode + i2) * 31) + this.f73141c) * 31) + this.f73142d;
    }

    public final String toString() {
        return "QuestionStickerPanelRequestModel(cursor=" + this.f73139a + ", count=" + this.f73140b + ", type=" + this.f73141c + ", scene=" + this.f73142d + ")";
    }

    private i(Integer num, Integer num2, int i2, int i3) {
        this.f73139a = num;
        this.f73140b = num2;
        this.f73141c = i2;
        this.f73142d = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Integer num, Integer num2, int i2, int i3, int i4) {
        this((i4 & 1) != 0 ? null : num, (i4 & 2) != 0 ? null : num2, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? f.ForumRecommendSceneCAMERA.ordinal() : i3);
    }
}
