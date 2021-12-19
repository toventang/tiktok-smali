package com.ss.android.ugc.aweme.feed.assem.b;

import com.bytedance.assem.arch.extensions.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f92062a;

    static {
        Covode.recordClassIndex(58032);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f92062a, ((a) obj).f92062a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f92062a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "UpvoteParam(upvoteId=" + this.f92062a + ")";
    }

    private /* synthetic */ a() {
        this(null);
    }

    public a(String str) {
        this.f92062a = str;
    }
}
