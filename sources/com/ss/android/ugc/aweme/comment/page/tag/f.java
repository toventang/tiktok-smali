package com.ss.android.ugc.aweme.comment.page.tag;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f72256a;

    /* renamed from: b  reason: collision with root package name */
    public final String f72257b;

    static {
        Covode.recordClassIndex(44544);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f72256a, fVar.f72256a) && l.a(this.f72257b, fVar.f72257b);
    }

    public final int hashCode() {
        Aweme aweme = this.f72256a;
        int i2 = 0;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        String str = this.f72257b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FeedTaggedParam(aweme=" + this.f72256a + ", enterFrom=" + this.f72257b + ")";
    }

    private /* synthetic */ f() {
        this(null, "");
    }

    public f(Aweme aweme, String str) {
        this.f72256a = aweme;
        this.f72257b = str;
    }
}
