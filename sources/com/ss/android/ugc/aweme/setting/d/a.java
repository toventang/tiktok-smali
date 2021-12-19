package com.ss.android.ugc.aweme.setting.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f122179a;

    static {
        Covode.recordClassIndex(80097);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && this.f122179a == ((a) obj).f122179a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f122179a;
    }

    public final String toString() {
        return "ChatControlChangeEvent(value=" + this.f122179a + ")";
    }

    public a(int i2) {
        this.f122179a = i2;
    }
}
