package com.ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class k {
    @c(a = "groups")

    /* renamed from: a  reason: collision with root package name */
    public List<Integer> f112693a;
    @c(a = "filter_type")

    /* renamed from: b  reason: collision with root package name */
    public int f112694b;

    /* renamed from: c  reason: collision with root package name */
    public int f112695c;

    static {
        Covode.recordClassIndex(72426);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return l.a(this.f112693a, kVar.f112693a) && this.f112694b == kVar.f112694b && this.f112695c == kVar.f112695c;
    }

    public final int hashCode() {
        List<Integer> list = this.f112693a;
        return ((((list != null ? list.hashCode() : 0) * 31) + this.f112694b) * 31) + this.f112695c;
    }

    public final String toString() {
        return "NoticeInboxFilterGroups(groups=" + this.f112693a + ", filterType=" + this.f112694b + ", innerFilterType=" + this.f112695c + ")";
    }
}
