package com.ss.android.ugc.aweme.common.net;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.websocket.a.a.b f76474a;

    static {
        Covode.recordClassIndex(47223);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof h) && l.a(this.f76474a, ((h) obj).f76474a);
        }
        return true;
    }

    public final int hashCode() {
        com.ss.android.websocket.a.a.b bVar = this.f76474a;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OpenWSEvent(event=" + this.f76474a + ")";
    }

    public h(com.ss.android.websocket.a.a.b bVar) {
        l.d(bVar, "");
        this.f76474a = bVar;
    }
}
