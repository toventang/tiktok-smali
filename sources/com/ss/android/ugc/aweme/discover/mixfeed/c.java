package com.ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.List;

public final class c {
    @com.google.gson.a.c(a = "lives")

    /* renamed from: a  reason: collision with root package name */
    public final List<Aweme> f81644a;
    @com.google.gson.a.c(a = "doc_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f81645b;
    @com.google.gson.a.c(a = "is_more")

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f81646c;
    @com.google.gson.a.c(a = "cursor")

    /* renamed from: d  reason: collision with root package name */
    public final Long f81647d;

    static {
        Covode.recordClassIndex(50738);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f81644a, cVar.f81644a) && l.a(this.f81645b, cVar.f81645b) && l.a(this.f81646c, cVar.f81646c) && l.a(this.f81647d, cVar.f81647d);
    }

    public final int hashCode() {
        List<Aweme> list = this.f81644a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f81645b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.f81646c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l2 = this.f81647d;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "CollectionLive(lives=" + this.f81644a + ", docId=" + this.f81645b + ", isMore=" + this.f81646c + ", cursor=" + this.f81647d + ")";
    }

    private /* synthetic */ c() {
        this("", true);
    }

    private c(String str, Boolean bool) {
        this.f81644a = null;
        this.f81645b = str;
        this.f81646c = bool;
        this.f81647d = null;
    }
}
