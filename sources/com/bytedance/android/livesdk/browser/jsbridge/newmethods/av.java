package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class av implements f {

    /* renamed from: a  reason: collision with root package name */
    private final au f14517a;

    static {
        Covode.recordClassIndex(8080);
    }

    av(au auVar) {
        this.f14517a = auVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        au auVar = this.f14517a;
        if (auVar.f14515a != null) {
            auVar.f14515a.dismiss();
        }
    }
}
