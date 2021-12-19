package com.ss.android.ugc.awemepushlib.manager;

import com.bytedance.covode.number.Covode;
import com.bytedance.push.b;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Map f145513a;

    static {
        Covode.recordClassIndex(95142);
    }

    c(Map map) {
        this.f145513a = map;
    }

    public final void run() {
        b.f42047a.a(this.f145513a);
    }
}
