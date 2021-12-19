package com.bytedance.android.live.liveinteract.multilive.e;

import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11827a;

    static {
        Covode.recordClassIndex(6450);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && this.f11827a == ((e) obj).f11827a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f11827a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "MultiLiveAnchorWindowParam(isMuteVideo=" + this.f11827a + ")";
    }

    public e(boolean z) {
        this.f11827a = z;
    }

    public final boolean a(boolean z) {
        if (this.f11827a == z) {
            return true;
        }
        return false;
    }
}
