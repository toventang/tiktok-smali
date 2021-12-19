package com.bytedance.android.livesdk.lynx.lynxcard;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f18800a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Object> f18801b;

    static {
        Covode.recordClassIndex(11132);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f18800a, hVar.f18800a) && l.a(this.f18801b, hVar.f18801b);
    }

    public final int hashCode() {
        String str = this.f18800a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, Object> map = this.f18801b;
        if (map != null) {
            i2 = map.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "UpdateLynxCardData(containerId=" + this.f18800a + ", data=" + this.f18801b + ")";
    }

    public h(String str, Map<String, ? extends Object> map) {
        l.d(str, "");
        l.d(map, "");
        this.f18800a = str;
        this.f18801b = map;
    }
}
