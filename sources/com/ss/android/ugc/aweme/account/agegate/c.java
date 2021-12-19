package com.ss.android.ugc.aweme.account.agegate;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.account.agegate.b;

public final /* synthetic */ class c implements OnActivityResultCallback {

    /* renamed from: a  reason: collision with root package name */
    private final b f62695a;

    static {
        Covode.recordClassIndex(38623);
    }

    public c(b bVar) {
        this.f62695a = bVar;
    }

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i2, int i3, Intent intent) {
        b bVar = this.f62695a;
        if (i2 == 998 && bVar.f62629a != null) {
            if (i3 == -1) {
                bVar.f62629a.d();
            } else if (i3 == 0) {
                bVar.f62629a.c();
            } else {
                b.a aVar = bVar.f62629a;
                new Exception();
                aVar.b();
            }
        }
    }
}
