package com.ss.android.ugc.aweme.inbox.widget.multi;

import com.bytedance.covode.number.Covode;

public abstract class k {

    /* renamed from: j  reason: collision with root package name */
    public final int f104493j;

    static {
        Covode.recordClassIndex(66908);
    }

    public abstract boolean a();

    public int hashCode() {
        int i2;
        int i3 = this.f104493j;
        if (a()) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return i3 + i2;
    }

    public k(int i2) {
        this.f104493j = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (kVar.f104493j == this.f104493j && kVar.a() == a()) {
            return true;
        }
        return false;
    }
}
