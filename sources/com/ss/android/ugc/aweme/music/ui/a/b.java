package com.ss.android.ugc.aweme.music.ui.a;

import com.bytedance.covode.number.Covode;

public final class b implements com.ss.android.ugc.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f111829a;

    static {
        Covode.recordClassIndex(71887);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && this.f111829a == ((b) obj).f111829a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f111829a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "ChangeRecordVisibilityEvent(showRecordBtn=" + this.f111829a + ")";
    }
}
