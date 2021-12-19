package com.ss.android.ugc.aweme.commentStickerPanel.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class g {
    @c(a = "collection_category")

    /* renamed from: a  reason: collision with root package name */
    public final int f73134a;
    @c(a = "question_sticker_list")

    /* renamed from: b  reason: collision with root package name */
    public final List<QaStruct> f73135b;
    @c(a = "cursor")

    /* renamed from: c  reason: collision with root package name */
    public final int f73136c;
    @c(a = "has_more")

    /* renamed from: d  reason: collision with root package name */
    public final int f73137d;

    static {
        Covode.recordClassIndex(45057);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f73134a == gVar.f73134a && l.a(this.f73135b, gVar.f73135b) && this.f73136c == gVar.f73136c && this.f73137d == gVar.f73137d;
    }

    public final int hashCode() {
        int i2 = this.f73134a * 31;
        List<QaStruct> list = this.f73135b;
        return ((((i2 + (list != null ? list.hashCode() : 0)) * 31) + this.f73136c) * 31) + this.f73137d;
    }

    public final String toString() {
        return "QuestionCollection(category=" + this.f73134a + ", questionStickerStruct=" + this.f73135b + ", cursor=" + this.f73136c + ", hasMore=" + this.f73137d + ")";
    }

    private /* synthetic */ g() {
        this(h.QuestionCollectionUNKNOWN.ordinal(), z.INSTANCE);
    }

    private g(int i2, List<QaStruct> list) {
        l.d(list, "");
        this.f73134a = i2;
        this.f73135b = list;
        this.f73136c = 0;
        this.f73137d = 0;
    }
}
