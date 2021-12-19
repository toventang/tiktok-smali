package com.ss.android.ugc.aweme.story.archive;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f136756a;

    static {
        Covode.recordClassIndex(89345);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof g) && l.a(this.f136756a, ((g) obj).f136756a);
        }
        return true;
    }

    public final int hashCode() {
        Aweme aweme = this.f136756a;
        if (aweme != null) {
            return aweme.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StoryArchListItem(aweme=" + this.f136756a + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }

    public g(Aweme aweme) {
        l.d(aweme, "");
        this.f136756a = aweme;
    }
}
