package com.ss.android.ugc.aweme.effect;

import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.a.a;

final /* synthetic */ class ad implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ac f88802a;

    static {
        Covode.recordClassIndex(55857);
    }

    ad(ac acVar) {
        this.f88802a = acVar;
    }

    @Override // com.ss.android.ugc.tools.view.a.a
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ac acVar = this.f88802a;
        if (i2 != 4 || !acVar.K) {
            return false;
        }
        if (acVar.t == null) {
            return true;
        }
        acVar.t.performClick();
        return true;
    }
}
