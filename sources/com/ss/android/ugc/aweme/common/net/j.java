package com.ss.android.ugc.aweme.common.net;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import com.ss.android.websocket.a.b.c;
import h.f.b.l;

public final class j implements b {

    /* renamed from: a  reason: collision with root package name */
    public final c f76476a;

    static {
        Covode.recordClassIndex(47225);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof j) && l.a(this.f76476a, ((j) obj).f76476a);
        }
        return true;
    }

    public final int hashCode() {
        c cVar = this.f76476a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReceivedMsgEvent(event=" + this.f76476a + ")";
    }

    public j(c cVar) {
        l.d(cVar, "");
        this.f76476a = cVar;
    }
}
