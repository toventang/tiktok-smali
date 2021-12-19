package com.ss.android.ugc.aweme.homepage.story.feed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class c {

    /* renamed from: a */
    public final List<Long> f99399a;

    /* renamed from: b */
    public final List<Aweme> f99400b;

    /* renamed from: c */
    public final String f99401c;

    static {
        Covode.recordClassIndex(63326);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f99399a, cVar.f99399a) && l.a(this.f99400b, cVar.f99400b) && l.a(this.f99401c, cVar.f99401c);
    }

    public final int hashCode() {
        List<Long> list = this.f99399a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Aweme> list2 = this.f99400b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.f99401c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "SidebarPreloadData(uidList=" + this.f99399a + ", preloadUserStories=" + this.f99400b + ", reqId=" + this.f99401c + ")";
    }

    public /* synthetic */ c() {
        this(z.INSTANCE, z.INSTANCE, "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    private c(List<Long> list, List<? extends Aweme> list2, String str) {
        l.d(list, "");
        l.d(list2, "");
        l.d(str, "");
        this.f99399a = list;
        this.f99400b = list2;
        this.f99401c = str;
    }

    public static /* synthetic */ c a(c cVar, List list, List list2, String str, int i2) {
        if ((i2 & 1) != 0) {
            list = cVar.f99399a;
        }
        if ((i2 & 2) != 0) {
            list2 = cVar.f99400b;
        }
        if ((i2 & 4) != 0) {
            str = cVar.f99401c;
        }
        l.d(list, "");
        l.d(list2, "");
        l.d(str, "");
        return new c(list, list2, str);
    }
}
