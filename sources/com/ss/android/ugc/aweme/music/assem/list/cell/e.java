package com.ss.android.ugc.aweme.music.assem.list.cell;

import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f111241a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f111242b;

    static {
        Covode.recordClassIndex(71466);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f111241a == eVar.f111241a && this.f111242b == eVar.f111242b;
    }

    public final int hashCode() {
        boolean z = this.f111241a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.f111242b) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "MusicStatusDiff(isPinStatusChange=" + this.f111241a + ", isCollectionStatusChange=" + this.f111242b + ")";
    }

    private /* synthetic */ e() {
        this(false, false);
    }

    public e(boolean z, boolean z2) {
        this.f111241a = z;
        this.f111242b = z2;
    }
}
