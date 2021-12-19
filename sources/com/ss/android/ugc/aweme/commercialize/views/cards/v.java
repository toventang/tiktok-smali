package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.a.a;

final /* synthetic */ class v implements a {

    /* renamed from: a  reason: collision with root package name */
    private final p f76128a;

    static {
        Covode.recordClassIndex(46955);
    }

    v(p pVar) {
        this.f76128a = pVar;
    }

    @Override // com.ss.android.ugc.aweme.base.a.a
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        p pVar = this.f76128a;
        if (i2 != 4) {
            return false;
        }
        pVar.f76109j.a("ACTION_TOP_WEB_PAGE_HIDE", (Object) null);
        return true;
    }
}
