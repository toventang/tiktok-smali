package com.ss.android.ugc.aweme.comment.supporterpanel;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class d {
    @c(a = "user")

    /* renamed from: a  reason: collision with root package name */
    public final User f72372a;
    @c(a = "comment_id")

    /* renamed from: b  reason: collision with root package name */
    public final Long f72373b;
    @c(a = "comment_text")

    /* renamed from: c  reason: collision with root package name */
    public final String f72374c;

    static {
        Covode.recordClassIndex(44622);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f72372a, dVar.f72372a) && l.a(this.f72373b, dVar.f72373b) && l.a(this.f72374c, dVar.f72374c);
    }

    public final int hashCode() {
        User user = this.f72372a;
        int i2 = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        Long l2 = this.f72373b;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str = this.f72374c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "GiftSender(user=" + this.f72372a + ", commentID=" + this.f72373b + ", commentText=" + this.f72374c + ")";
    }
}
