package com.ss.android.ugc.aweme.journey.step.d;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f104977a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f104978b;

    static {
        Covode.recordClassIndex(67304);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f104977a == bVar.f104977a && l.a(this.f104978b, bVar.f104978b);
    }

    public final int hashCode() {
        boolean z = this.f104977a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        Intent intent = this.f104978b;
        return i5 + (intent != null ? intent.hashCode() : 0);
    }

    public final String toString() {
        return "DeeplinkData(isLoginRequired=" + this.f104977a + ", intent=" + this.f104978b + ")";
    }

    public b(boolean z, Intent intent) {
        l.d(intent, "");
        this.f104977a = z;
        this.f104978b = intent;
    }
}
