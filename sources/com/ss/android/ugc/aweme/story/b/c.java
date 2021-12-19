package com.ss.android.ugc.aweme.story.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f136844a;

    static {
        Covode.recordClassIndex(89433);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && l.a(this.f136844a, ((c) obj).f136844a);
        }
        return true;
    }

    public final int hashCode() {
        Aweme aweme = this.f136844a;
        if (aweme != null) {
            return aweme.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StoryAwemeParam(aweme=" + this.f136844a + ")";
    }

    public c(Aweme aweme) {
        l.d(aweme, "");
        this.f136844a = aweme;
    }
}
