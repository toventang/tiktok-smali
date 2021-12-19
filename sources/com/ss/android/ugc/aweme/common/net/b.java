package com.ss.android.ugc.aweme.common.net;

import com.bytedance.covode.number.Covode;
import com.ss.android.websocket.a.b.a;
import h.f.b.l;

public final class b implements com.ss.android.ugc.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final a f76470a;

    static {
        Covode.recordClassIndex(47217);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f76470a, ((b) obj).f76470a);
        }
        return true;
    }

    public final int hashCode() {
        a aVar = this.f76470a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CloseWSSuccessEvent(event=" + this.f76470a + ")";
    }

    public b(a aVar) {
        l.d(aVar, "");
        this.f76470a = aVar;
    }
}
