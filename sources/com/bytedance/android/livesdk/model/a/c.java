package com.bytedance.android.livesdk.model.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {
    @com.google.gson.a.c(a = "user_settings")

    /* renamed from: a  reason: collision with root package name */
    public b f18939a;

    static {
        Covode.recordClassIndex(11296);
    }

    public c(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && l.a(this.f18939a, ((c) obj).f18939a);
        }
        return true;
    }

    public final int hashCode() {
        b bVar = this.f18939a;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MultiLiveUserApplySettings(multiLiveUserApplyPermission=" + this.f18939a + ")";
    }

    private c() {
        this.f18939a = null;
    }

    private /* synthetic */ c(byte b2) {
        this();
    }
}
