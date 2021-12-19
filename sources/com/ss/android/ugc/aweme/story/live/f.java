package com.ss.android.ugc.aweme.story.live;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements f.a.d.f {

    /* renamed from: a  reason: collision with root package name */
    static final f.a.d.f f137979a = new f();

    static {
        Covode.recordClassIndex(90245);
    }

    private f() {
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        if (th == null) {
            th = new IllegalStateException("unknown error");
        }
        a.b("Live", Log.getStackTraceString(th));
    }
}
