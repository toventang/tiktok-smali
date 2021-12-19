package com.ss.android.ugc.aweme.common.net;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.websocket.a.a.a f76469a;

    static {
        Covode.recordClassIndex(47216);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f76469a, ((a) obj).f76469a);
        }
        return true;
    }

    public final int hashCode() {
        com.ss.android.websocket.a.a.a aVar = this.f76469a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CloseWSEvent(event=" + this.f76469a + ")";
    }

    public a(com.ss.android.websocket.a.a.a aVar) {
        l.d(aVar, "");
        this.f76469a = aVar;
    }
}
