package com.ss.android.ugc.aweme.setting.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.login.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final v f122872a;

    static {
        Covode.recordClassIndex(80658);
    }

    bn(v vVar) {
        this.f122872a = vVar;
    }

    public final void run() {
        v vVar = this.f122872a;
        if (vVar.ak == null) {
            vVar.ak = new a(vVar);
        }
        vVar.ak.show();
    }
}
