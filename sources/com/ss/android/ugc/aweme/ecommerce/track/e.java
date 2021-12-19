package com.ss.android.ugc.aweme.ecommerce.track;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f87542a;

    static {
        Covode.recordClassIndex(55032);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && l.a(this.f87542a, ((e) obj).f87542a);
        }
        return true;
    }

    public final int hashCode() {
        Map<String, Object> map = this.f87542a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TrackParams(params=" + this.f87542a + ")";
    }

    private /* synthetic */ e() {
        this(new HashMap());
    }

    public e(Map<String, ? extends Object> map) {
        l.d(map, "");
        this.f87542a = map;
    }
}
