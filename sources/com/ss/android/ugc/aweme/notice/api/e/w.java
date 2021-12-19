package com.ss.android.ugc.aweme.notice.api.e;

import com.bytedance.common.wschannel.b.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final b f112765a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f112766b;

    static {
        Covode.recordClassIndex(72474);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return l.a(this.f112765a, wVar.f112765a) && l.a(this.f112766b, wVar.f112766b);
    }

    public final int hashCode() {
        b bVar = this.f112765a;
        int i2 = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        JSONObject jSONObject = this.f112766b;
        if (jSONObject != null) {
            i2 = jSONObject.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "WsConnectState(connectEvent=" + this.f112765a + ", connectJson=" + this.f112766b + ")";
    }

    public w(b bVar, JSONObject jSONObject) {
        this.f112765a = bVar;
        this.f112766b = jSONObject;
    }
}
