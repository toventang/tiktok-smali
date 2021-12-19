package com.ss.android.ugc.aweme.story.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public final String f136848a;

    static {
        Covode.recordClassIndex(89436);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof f) && l.a(this.f136848a, ((f) obj).f136848a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f136848a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StoryEventParam(event=" + this.f136848a + ")";
    }

    public f(String str) {
        l.d(str, "");
        this.f136848a = str;
    }
}
