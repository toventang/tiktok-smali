package com.ss.android.ugc.aweme.choosemusic.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;

final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f70836a;

    static {
        Covode.recordClassIndex(43644);
    }

    h(c cVar) {
        this.f70836a = cVar;
    }

    public final void run() {
        c cVar = this.f70836a;
        if (cVar.f70819j != null) {
            cVar.f70819j.requestFocus();
            KeyboardUtils.b(cVar.f70819j);
        }
    }
}
