package com.ss.android.ugc.aweme.homepage.story.sidebar;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class n implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f99486a;

    static {
        Covode.recordClassIndex(63456);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof n) && l.a(this.f99486a, ((n) obj).f99486a);
        }
        return true;
    }

    public final int hashCode() {
        Aweme aweme = this.f99486a;
        if (aweme != null) {
            return aweme.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StorySidebarListItem(aweme=" + this.f99486a + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }

    public n(Aweme aweme) {
        l.d(aweme, "");
        this.f99486a = aweme;
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        l.d(aVar, "");
        if ((aVar instanceof n) && this.f99486a == ((n) aVar).f99486a) {
            return true;
        }
        return false;
    }
}
