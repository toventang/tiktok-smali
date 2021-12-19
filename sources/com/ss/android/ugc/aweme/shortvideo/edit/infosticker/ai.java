package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class ai implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final i.AnonymousClass4 f127110a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f127111b = true;

    static {
        Covode.recordClassIndex(83392);
    }

    ai(i.AnonymousClass4 r2) {
        this.f127110a = r2;
    }

    public final void run() {
        i.AnonymousClass4 r3 = this.f127110a;
        boolean z = this.f127111b;
        i.this.O.b();
        i.this.a(true);
        i.this.j();
        i.this.f127155d.invalidate();
        if (z) {
            new a(i.this.f127164m.getContext()).a(R.string.bp0).a();
        }
    }
}
