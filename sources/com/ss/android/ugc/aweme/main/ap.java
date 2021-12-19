package com.ss.android.ugc.aweme.main;

import android.view.View;
import androidx.core.g.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.f.d;

final /* synthetic */ class ap implements a {

    /* renamed from: a  reason: collision with root package name */
    private final float f109164a;

    static {
        Covode.recordClassIndex(69903);
    }

    ap(float f2) {
        this.f109164a = f2;
    }

    @Override // androidx.core.g.a
    public final void a(Object obj) {
        View view = (View) obj;
        d.a(view, view.getAlpha(), this.f109164a);
    }
}
