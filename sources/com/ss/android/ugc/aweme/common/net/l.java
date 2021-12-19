package com.ss.android.ugc.aweme.common.net;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import com.ss.android.websocket.a.b.d;

public final class l implements b {

    /* renamed from: a  reason: collision with root package name */
    public final d f76478a;

    static {
        Covode.recordClassIndex(47227);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof l) && h.f.b.l.a(this.f76478a, ((l) obj).f76478a);
        }
        return true;
    }

    public final int hashCode() {
        d dVar = this.f76478a;
        if (dVar != null) {
            return dVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WSFailEvent(event=" + this.f76478a + ")";
    }

    public l(d dVar) {
        h.f.b.l.d(dVar, "");
        this.f76478a = dVar;
    }
}
