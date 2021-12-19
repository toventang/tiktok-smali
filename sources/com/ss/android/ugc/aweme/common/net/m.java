package com.ss.android.ugc.aweme.common.net;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import com.ss.android.websocket.a.b.e;
import h.f.b.l;

public final class m implements b {

    /* renamed from: a  reason: collision with root package name */
    public final e f76479a;

    static {
        Covode.recordClassIndex(47228);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof m) && l.a(this.f76479a, ((m) obj).f76479a);
        }
        return true;
    }

    public final int hashCode() {
        e eVar = this.f76479a;
        if (eVar != null) {
            return eVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WSStatusChangeEvent(event=" + this.f76479a + ")";
    }

    public m(e eVar) {
        l.d(eVar, "");
        this.f76479a = eVar;
    }
}
