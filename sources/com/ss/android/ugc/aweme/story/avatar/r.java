package com.ss.android.ugc.aweme.story.avatar;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class r implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f136843a;

    static {
        Covode.recordClassIndex(89429);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof r) && l.a(this.f136843a, ((r) obj).f136843a);
        }
        return true;
    }

    public final int hashCode() {
        Aweme aweme = this.f136843a;
        if (aweme != null) {
            return aweme.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "UserStoryItem(aweme=" + this.f136843a + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }

    public r(Aweme aweme) {
        l.d(aweme, "");
        this.f136843a = aweme;
    }
}
