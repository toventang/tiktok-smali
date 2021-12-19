package com.bytedance.android.livesdk.model.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class b {
    @c(a = "multi_live_apply_permission")

    /* renamed from: a  reason: collision with root package name */
    public int f18938a;

    static {
        Covode.recordClassIndex(11295);
    }

    public b(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && this.f18938a == ((b) obj).f18938a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f18938a;
    }

    public final String toString() {
        return "MultiLiveUserApplyPermission(multiLiveApplyPermission=" + this.f18938a + ")";
    }

    private b() {
        this.f18938a = 0;
    }

    private /* synthetic */ b(byte b2) {
        this();
    }
}
