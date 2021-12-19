package com.ss.android.ugc.awemepushlib.manager;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Map f145512a;

    static {
        Covode.recordClassIndex(95141);
    }

    b(Map map) {
        this.f145512a = map;
    }

    public final void run() {
        com.bytedance.push.b.f42047a.a(this.f145512a);
    }
}
