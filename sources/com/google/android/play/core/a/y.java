package com.google.android.play.core.a;

import com.bytedance.covode.number.Covode;

final class y extends d {

    /* renamed from: a  reason: collision with root package name */
    private final int f52751a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f52752b;

    static {
        Covode.recordClassIndex(32659);
    }

    /* synthetic */ y(int i2, boolean z) {
        this.f52751a = i2;
        this.f52752b = z;
    }

    @Override // com.google.android.play.core.a.d
    public final int a() {
        return this.f52751a;
    }

    @Override // com.google.android.play.core.a.d
    public final boolean b() {
        return this.f52752b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f52751a == dVar.a() && this.f52752b == dVar.b();
        }
    }

    public final int hashCode() {
        return ((this.f52751a ^ 1000003) * 1000003) ^ (true != this.f52752b ? 1237 : 1231);
    }

    public final String toString() {
        int i2 = this.f52751a;
        boolean z = this.f52752b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(i2);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
