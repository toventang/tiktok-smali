package com.ss.ttvideoengine.l;

import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.j.e;
import com.ss.ttvideoengine.q.a;
import java.util.Map;
import java.util.Objects;

public final class c extends b {

    /* renamed from: e  reason: collision with root package name */
    public e f153064e;

    /* renamed from: f  reason: collision with root package name */
    public a f153065f;

    /* renamed from: g  reason: collision with root package name */
    public Map<String, String> f153066g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f153067h;

    static {
        Covode.recordClassIndex(101712);
    }

    @Override // com.ss.ttvideoengine.l.b
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f153064e);
    }

    @Override // com.ss.ttvideoengine.l.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && super.equals(obj)) {
            return Objects.equals(this.f153064e, ((c) obj).f153064e);
        }
        return false;
    }
}
