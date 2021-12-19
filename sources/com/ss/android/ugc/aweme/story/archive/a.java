package com.ss.android.ugc.aweme.story.archive;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<Aweme> f136740a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f136741b;

    static {
        Covode.recordClassIndex(89323);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f136740a, aVar.f136740a) && this.f136741b == aVar.f136741b;
    }

    public final int hashCode() {
        List<Aweme> list = this.f136740a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.f136741b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "PrivateAwemeResult(list=" + this.f136740a + ", hasMore=" + this.f136741b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends Aweme> list, boolean z) {
        this.f136740a = list;
        this.f136741b = z;
    }
}
