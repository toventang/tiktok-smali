package com.ss.android.ugc.aweme.sticker.panel.guide;

import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.panel.guide.c;

final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c.AnonymousClass3 f135166a;

    /* renamed from: b  reason: collision with root package name */
    private final Animatable f135167b;

    static {
        Covode.recordClassIndex(88353);
    }

    e(c.AnonymousClass3 r1, Animatable animatable) {
        this.f135166a = r1;
        this.f135167b = animatable;
    }

    public final void run() {
        c.AnonymousClass3 r2 = this.f135166a;
        Animatable animatable = this.f135167b;
        if (animatable.isRunning()) {
            animatable.stop();
            if (c.this.f135154g) {
                c.this.f135151d.post(c.this.f135156i);
            }
        }
    }
}
