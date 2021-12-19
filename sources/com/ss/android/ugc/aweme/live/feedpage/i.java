package com.ss.android.ugc.aweme.live.feedpage;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.live.feedpage.e;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements f {

    /* renamed from: a  reason: collision with root package name */
    private final e.a f108404a;

    static {
        Covode.recordClassIndex(69451);
    }

    i(e.a aVar) {
        this.f108404a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        e.a aVar = this.f108404a;
        a.b("LiveStateManager", "refresh net:" + Log.getStackTraceString((Throwable) obj));
        aVar.f108390a = false;
        e.this.a();
    }
}
