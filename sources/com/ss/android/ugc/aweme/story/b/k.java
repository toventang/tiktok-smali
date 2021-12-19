package com.ss.android.ugc.aweme.story.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class k implements a {

    /* renamed from: a  reason: collision with root package name */
    public final String f136859a;

    static {
        Covode.recordClassIndex(89441);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof k) && l.a(this.f136859a, ((k) obj).f136859a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f136859a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StoryPlayCompletedParam(sourceId=" + this.f136859a + ")";
    }

    public k(String str) {
        this.f136859a = str;
    }
}
