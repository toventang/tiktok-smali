package com.ss.android.ugc.aweme.choosemusic.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f70829a;

    static {
        Covode.recordClassIndex(43641);
    }

    e(c cVar) {
        this.f70829a = cVar;
    }

    public final void run() {
        c cVar = this.f70829a;
        if (cVar.f70819j != null) {
            cVar.f70819j.requestFocus();
            KeyboardUtils.b(cVar.f70819j);
        }
    }
}
