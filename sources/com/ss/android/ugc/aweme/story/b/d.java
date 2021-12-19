package com.ss.android.ugc.aweme.story.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f136845a;

    static {
        Covode.recordClassIndex(89434);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && l.a(this.f136845a, ((d) obj).f136845a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f136845a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StoryCommentBubbleClickEvent(commentId=" + this.f136845a + ")";
    }

    public d(String str) {
        l.d(str, "");
        this.f136845a = str;
    }
}
