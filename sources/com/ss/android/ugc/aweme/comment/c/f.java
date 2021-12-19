package com.ss.android.ugc.aweme.comment.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class f implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Comment f71754a;

    /* renamed from: b  reason: collision with root package name */
    public final String f71755b;

    static {
        Covode.recordClassIndex(44127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f71754a, fVar.f71754a) && l.a(this.f71755b, fVar.f71755b);
    }

    public final int hashCode() {
        Comment comment = this.f71754a;
        int i2 = 0;
        int hashCode = (comment != null ? comment.hashCode() : 0) * 31;
        String str = this.f71755b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "EnterTextEvent(comment=" + this.f71754a + ", enterMethod=" + this.f71755b + ")";
    }

    public f(Comment comment, String str) {
        this.f71754a = comment;
        this.f71755b = str;
    }
}
