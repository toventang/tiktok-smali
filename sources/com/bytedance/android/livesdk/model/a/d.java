package com.bytedance.android.livesdk.model.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class d {
    @c(a = "multi_live")

    /* renamed from: a  reason: collision with root package name */
    public c f18940a;

    static {
        Covode.recordClassIndex(11297);
    }

    public d(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && l.a(this.f18940a, ((d) obj).f18940a);
        }
        return true;
    }

    public final int hashCode() {
        c cVar = this.f18940a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MultiLiveUserSettings(multiLiveUserApplySettings=" + this.f18940a + ")";
    }

    private d() {
        this.f18940a = null;
    }

    private /* synthetic */ d(byte b2) {
        this();
    }
}
