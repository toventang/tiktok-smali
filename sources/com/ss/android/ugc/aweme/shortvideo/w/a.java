package com.ss.android.ugc.aweme.shortvideo.w;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f132671a;

    static {
        Covode.recordClassIndex(86806);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && this.f132671a == ((a) obj).f132671a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f132671a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "CloseRecordingEvent(closeTrimmingActivity=" + this.f132671a + ")";
    }

    public a(boolean z) {
        this.f132671a = z;
    }
}
