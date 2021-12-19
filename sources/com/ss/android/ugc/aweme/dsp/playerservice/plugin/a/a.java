package com.ss.android.ugc.aweme.dsp.playerservice.plugin.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f83578a;

    static {
        Covode.recordClassIndex(52162);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && this.f83578a == ((a) obj).f83578a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f83578a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "ExpiredPlayableChangeEvent(dayChange=" + this.f83578a + ")";
    }

    public /* synthetic */ a() {
        this(false);
    }

    public a(boolean z) {
        this.f83578a = z;
    }
}
