package com.ss.android.ugc.aweme.common.net;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.websocket.a.b.b f76475a;

    static {
        Covode.recordClassIndex(47224);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof i) && l.a(this.f76475a, ((i) obj).f76475a);
        }
        return true;
    }

    public final int hashCode() {
        com.ss.android.websocket.a.b.b bVar = this.f76475a;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OpenWSSuccessEvent(event=" + this.f76475a + ")";
    }

    public i(com.ss.android.websocket.a.b.b bVar) {
        l.d(bVar, "");
        this.f76475a = bVar;
    }
}
