package com.ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.y;
import com.ss.android.ugc.aweme.shortvideo.record.u;

final /* synthetic */ class ao implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final u.AnonymousClass9 f130051a;

    /* renamed from: b  reason: collision with root package name */
    private final float f130052b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f130053c;

    /* renamed from: d  reason: collision with root package name */
    private final k f130054d;

    static {
        Covode.recordClassIndex(85337);
    }

    ao(u.AnonymousClass9 r1, float f2, boolean z, k kVar) {
        this.f130051a = r1;
        this.f130052b = f2;
        this.f130053c = z;
        this.f130054d = kVar;
    }

    public final void run() {
        u.AnonymousClass9 r5 = this.f130051a;
        float f2 = this.f130052b;
        boolean z = this.f130053c;
        k kVar = this.f130054d;
        if (f2 == 0.0f) {
            u.this.aR();
        }
        if (z) {
            kVar.a(new y(f2 == 0.0f));
        }
    }
}
