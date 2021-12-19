package com.ss.android.ugc.aweme.comment.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b implements com.ss.android.ugc.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final String f71744a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f71745b;

    static {
        Covode.recordClassIndex(44122);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f71744a, bVar.f71744a) && this.f71745b == bVar.f71745b;
    }

    public final int hashCode() {
        String str = this.f71744a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f71745b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "CommentBubbleClickEvent(commentId=" + this.f71744a + ", forceRefresh=" + this.f71745b + ")";
    }

    public /* synthetic */ b(String str) {
        this(str, true);
    }

    public b(String str, boolean z) {
        l.d(str, "");
        this.f71744a = str;
        this.f71745b = z;
    }
}
