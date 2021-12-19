package com.bytedance.android.livesdk.ab.c;

import com.bytedance.covode.number.Covode;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final int f13541a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13542b;

    static {
        Covode.recordClassIndex(7504);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f13541a == mVar.f13541a && this.f13542b == mVar.f13542b;
    }

    public final int hashCode() {
        return (this.f13541a * 31) + this.f13542b;
    }

    public final String toString() {
        return "RoomPositionContextLog(roomPosition=" + this.f13541a + ", isFromDrawReq=" + this.f13542b + ")";
    }

    private /* synthetic */ m() {
        this(-1, -1);
    }

    public m(int i2, int i3) {
        this.f13541a = i2;
        this.f13542b = i3;
    }
}
