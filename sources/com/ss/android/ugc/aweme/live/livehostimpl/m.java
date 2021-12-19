package com.ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import com.bytedance.android.livesdkapi.depend.b;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class m implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f108488a;

    static {
        Covode.recordClassIndex(69520);
    }

    m(b bVar) {
        this.f108488a = bVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f108488a.onActivityPaused((Activity) obj);
    }
}
