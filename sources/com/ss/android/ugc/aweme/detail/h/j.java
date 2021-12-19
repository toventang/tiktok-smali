package com.ss.android.ugc.aweme.detail.h;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f79740a;

    static {
        Covode.recordClassIndex(49551);
    }

    j(b bVar) {
        this.f79740a = bVar;
    }

    public final void run() {
        b bVar = this.f79740a;
        if (bVar.f79693e != null && bVar.f79693e.isShowing()) {
            bVar.f79693e.dismiss();
        }
        bVar.f79693e = null;
    }
}
