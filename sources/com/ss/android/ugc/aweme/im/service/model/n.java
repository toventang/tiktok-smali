package com.ss.android.ugc.aweme.im.service.model;

import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class n implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f103933a;

    /* renamed from: b  reason: collision with root package name */
    public final String f103934b;

    /* renamed from: c  reason: collision with root package name */
    public final long f103935c = InteractFirstFrameTimeOutDurationSetting.DEFAULT;

    static {
        Covode.recordClassIndex(66574);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return l.a(this.f103933a, nVar.f103933a) && l.a(this.f103934b, nVar.f103934b) && this.f103935c == nVar.f103935c;
    }

    public final int hashCode() {
        String str = this.f103933a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f103934b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        long j2 = this.f103935c;
        return ((hashCode + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "ShareUndoEvent(awemeId=" + this.f103933a + ", identity=" + this.f103934b + ", duration=" + this.f103935c + ")";
    }

    public n(String str, String str2) {
        l.d(str2, "");
        this.f103933a = str;
        this.f103934b = str2;
    }
}
