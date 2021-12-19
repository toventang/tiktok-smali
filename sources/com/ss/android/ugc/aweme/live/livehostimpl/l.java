package com.ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import com.bytedance.android.livesdkapi.depend.b;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class l implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f108487a;

    static {
        Covode.recordClassIndex(69519);
    }

    l(b bVar) {
        this.f108487a = bVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f108487a.onActivityResumed((Activity) obj);
    }
}
