package com.ss.android.ugc.aweme.main;

import android.view.View;
import androidx.core.g.a;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ah implements a {

    /* renamed from: a  reason: collision with root package name */
    private final float f109155a;

    static {
        Covode.recordClassIndex(69895);
    }

    ah(float f2) {
        this.f109155a = f2;
    }

    @Override // androidx.core.g.a
    public final void a(Object obj) {
        ((View) obj).setAlpha(this.f109155a);
    }
}
