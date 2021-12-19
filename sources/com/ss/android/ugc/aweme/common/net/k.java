package com.ss.android.ugc.aweme.common.net;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import com.ss.android.websocket.a.a.d;
import h.f.b.l;

public final class k implements b {

    /* renamed from: a  reason: collision with root package name */
    public final d f76477a;

    static {
        Covode.recordClassIndex(47226);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof k) && l.a(this.f76477a, ((k) obj).f76477a);
        }
        return true;
    }

    public final int hashCode() {
        d dVar = this.f76477a;
        if (dVar != null) {
            return dVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SendWSMsgEvent(event=" + this.f76477a + ")";
    }

    public k(d dVar) {
        l.d(dVar, "");
        this.f76477a = dVar;
    }
}
