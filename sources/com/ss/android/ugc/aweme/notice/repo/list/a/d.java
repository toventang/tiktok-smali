package com.ss.android.ugc.aweme.notice.repo.list.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.util.List;

public final class d {
    @c(a = "content")

    /* renamed from: a  reason: collision with root package name */
    public final String f112815a;
    @c(a = StringSet.type)

    /* renamed from: b  reason: collision with root package name */
    public final Integer f112816b;
    @c(a = "schema_url")

    /* renamed from: c  reason: collision with root package name */
    public final String f112817c;
    @c(a = "actions")

    /* renamed from: d  reason: collision with root package name */
    public final List<Integer> f112818d;

    static {
        Covode.recordClassIndex(72510);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f112815a, dVar.f112815a) && l.a(this.f112816b, dVar.f112816b) && l.a(this.f112817c, dVar.f112817c) && l.a(this.f112818d, dVar.f112818d);
    }

    public final int hashCode() {
        String str = this.f112815a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f112816b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f112817c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<Integer> list = this.f112818d;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "NoticeUITemplateButton(content=" + this.f112815a + ", type=" + this.f112816b + ", schemaUrl=" + this.f112817c + ", actions=" + this.f112818d + ")";
    }
}
