package com.ss.android.ugc.aweme.story.avatar;

import com.bytedance.assem.arch.extensions.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class q implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f136842a;

    static {
        Covode.recordClassIndex(89428);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof q) && l.a(this.f136842a, ((q) obj).f136842a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f136842a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StoryRingAssemEnterParams(identifier=" + this.f136842a + ")";
    }

    public q(String str) {
        l.d(str, "");
        this.f136842a = str;
    }
}
