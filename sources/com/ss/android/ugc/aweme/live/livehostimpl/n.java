package com.ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import com.bytedance.android.livesdkapi.depend.b;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class n implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f108489a;

    static {
        Covode.recordClassIndex(69521);
    }

    n(b bVar) {
        this.f108489a = bVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f108489a.onActivityStopped((Activity) obj);
    }
}
