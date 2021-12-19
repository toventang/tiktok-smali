package com.bytedance.android.live.liveinteract.multilive.a.a;

import com.bytedance.covode.number.Covode;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public int f11486a;

    /* renamed from: b  reason: collision with root package name */
    public int f11487b;

    static {
        Covode.recordClassIndex(6204);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f11486a == iVar.f11486a && this.f11487b == iVar.f11487b;
    }

    public final int hashCode() {
        return (this.f11486a * 31) + this.f11487b;
    }

    public final String toString() {
        return "GuestApplyInfo(position=" + this.f11486a + ", seiVersion=" + this.f11487b + ")";
    }

    public /* synthetic */ i(int i2) {
        this(i2, 0);
    }

    public i(int i2, int i3) {
        this.f11486a = i2;
        this.f11487b = i3;
    }
}
