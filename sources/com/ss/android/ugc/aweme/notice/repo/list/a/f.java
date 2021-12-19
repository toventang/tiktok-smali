package com.ss.android.ugc.aweme.notice.repo.list.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.List;

public final class f {
    @c(a = "from_users")

    /* renamed from: a  reason: collision with root package name */
    public final List<User> f112824a;
    @c(a = "merge_count")

    /* renamed from: b  reason: collision with root package name */
    public final int f112825b;
    @c(a = "extra_schema_url")

    /* renamed from: c  reason: collision with root package name */
    public final String f112826c;
    @c(a = "title")

    /* renamed from: d  reason: collision with root package name */
    public final String f112827d;
    @c(a = "title_append_info")

    /* renamed from: e  reason: collision with root package name */
    public final a f112828e;

    static {
        Covode.recordClassIndex(72512);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f112824a, fVar.f112824a) && this.f112825b == fVar.f112825b && l.a(this.f112826c, fVar.f112826c) && l.a(this.f112827d, fVar.f112827d) && l.a(this.f112828e, fVar.f112828e);
    }

    public final int hashCode() {
        List<User> list = this.f112824a;
        int i2 = 0;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f112825b) * 31;
        String str = this.f112826c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f112827d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        a aVar = this.f112828e;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "TitleTemplate(fromUsers=" + this.f112824a + ", mergeCount=" + this.f112825b + ", extraSchemaUrl=" + this.f112826c + ", title=" + this.f112827d + ", extraAction=" + this.f112828e + ")";
    }
}
