package com.ss.android.ugc.aweme.discover.mixfeed.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import h.f.b.l;

public final class g {
    @c(a = "related_word")

    /* renamed from: a  reason: collision with root package name */
    public final String f81747a;
    @c(a = "word_record")

    /* renamed from: b  reason: collision with root package name */
    public final Word f81748b;
    @c(a = "related_word_bg_img")

    /* renamed from: c  reason: collision with root package name */
    public final String f81749c;

    static {
        Covode.recordClassIndex(50784);
    }

    public final String toString() {
        return "RelatedWord(text=" + this.f81747a + ", wordRecord=" + this.f81748b + ", backgroundImageUrl=" + this.f81749c + ")";
    }

    private /* synthetic */ g() {
        this("", "");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    private g(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f81747a = str;
        this.f81748b = null;
        this.f81749c = str2;
    }
}
