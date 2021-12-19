package com.ss.android.ugc.aweme.commentStickerPanel.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class j {
    @c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f73143a;
    @c(a = "question_collection")

    /* renamed from: b  reason: collision with root package name */
    public final List<g> f73144b;

    static {
        Covode.recordClassIndex(45060);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f73143a, jVar.f73143a) && l.a(this.f73144b, jVar.f73144b);
    }

    public final int hashCode() {
        Integer num = this.f73143a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        List<g> list = this.f73144b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "QuestionStickerPanelResponseModel(statusCode=" + this.f73143a + ", questionCollectionList=" + this.f73144b + ")";
    }

    private /* synthetic */ j() {
        this(z.INSTANCE);
    }

    private j(List<g> list) {
        l.d(list, "");
        this.f73143a = null;
        this.f73144b = list;
    }
}
