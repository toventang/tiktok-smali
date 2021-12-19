package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f102064a;

    static {
        Covode.recordClassIndex(65307);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f102064a, ((b) obj).f102064a);
        }
        return true;
    }

    public final int hashCode() {
        T t = this.f102064a;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TopNoticeEvent(content=" + ((Object) this.f102064a) + ")";
    }

    public b(T t) {
        this.f102064a = t;
    }
}
