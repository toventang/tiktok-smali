package com.ss.android.ugc.aweme.inbox;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class x extends ad {

    /* renamed from: a  reason: collision with root package name */
    public final a f104498a;

    public enum a {
        HIDE,
        SHOW,
        ERROR;

        static {
            Covode.recordClassIndex(66914);
        }
    }

    static {
        Covode.recordClassIndex(66913);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof x) && l.a(this.f104498a, ((x) obj).f104498a);
        }
        return true;
    }

    public final int hashCode() {
        a aVar = this.f104498a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "LoadMorePod(state=" + this.f104498a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(a aVar) {
        super(-1);
        l.d(aVar, "");
        this.f104498a = aVar;
    }
}
