package com.ss.android.ugc.aweme.shortvideo.l;

import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements a {

    /* renamed from: a  reason: collision with root package name */
    private final q f128737a;

    static {
        Covode.recordClassIndex(84379);
    }

    r(q qVar) {
        this.f128737a = qVar;
    }

    @Override // com.ss.android.ugc.tools.view.a.a
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        q qVar = this.f128737a;
        if (i2 != 4 || !qVar.f128726f || qVar.f128728h == null) {
            return false;
        }
        qVar.f128728h.a();
        return true;
    }
}
