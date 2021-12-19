package com.ss.android.ugc.aweme.comment;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final t<Boolean> f72113a;

    /* renamed from: b  reason: collision with root package name */
    public int f72114b;

    static {
        Covode.recordClassIndex(44316);
    }

    public n() {
        t<Boolean> tVar = new t<>();
        this.f72113a = tVar;
        tVar.setValue(false);
    }

    public final void a() {
        int i2 = this.f72114b + 1;
        this.f72114b = i2;
        if (i2 == 1) {
            this.f72113a.setValue(true);
        }
    }
}
