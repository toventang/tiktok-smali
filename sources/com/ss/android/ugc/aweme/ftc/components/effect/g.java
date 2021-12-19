package com.ss.android.ugc.aweme.ftc.components.effect;

import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements a {

    /* renamed from: a  reason: collision with root package name */
    private final f f97872a;

    static {
        Covode.recordClassIndex(62199);
    }

    g(f fVar) {
        this.f97872a = fVar;
    }

    @Override // com.ss.android.ugc.tools.view.a.a
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        f fVar = this.f97872a;
        if (i2 != 4 || !fVar.K) {
            return false;
        }
        if (fVar.t == null) {
            return true;
        }
        fVar.t.performClick();
        return true;
    }
}
