package com.ss.android.ugc.aweme.i18n.musically.cut;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity;

final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AvatarCutActivity.AnonymousClass1 f99856a;

    /* renamed from: b  reason: collision with root package name */
    private final int f99857b;

    static {
        Covode.recordClassIndex(63660);
    }

    i(AvatarCutActivity.AnonymousClass1 r1, int i2) {
        this.f99856a = r1;
        this.f99857b = i2;
    }

    public final void run() {
        this.f99856a.a(this.f99857b);
    }
}
