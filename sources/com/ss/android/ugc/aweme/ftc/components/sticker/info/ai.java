package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.i;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class ai implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final i.AnonymousClass4 f98027a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f98028b = true;

    static {
        Covode.recordClassIndex(62312);
    }

    ai(i.AnonymousClass4 r2) {
        this.f98027a = r2;
    }

    public final void run() {
        i.AnonymousClass4 r3 = this.f98027a;
        boolean z = this.f98028b;
        i.this.N.a();
        i.this.a(true);
        i.this.h();
        i.this.f98069d.invalidate();
        if (z) {
            new a(i.this.f98078m.getContext()).a(R.string.bp0).a();
        }
    }
}
