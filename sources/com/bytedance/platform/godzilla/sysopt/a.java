package com.bytedance.platform.godzilla.sysopt;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a extends com.bytedance.platform.godzilla.c.a {

    /* renamed from: b  reason: collision with root package name */
    private int f41989b;

    static {
        Covode.recordClassIndex(25666);
    }

    @Override // com.bytedance.platform.godzilla.c.a
    public final void a(Application application) {
    }

    @Override // com.bytedance.platform.godzilla.c.a
    public final String b() {
        return "PthreadCreateHookPlugin";
    }

    public a() {
        this.f41989b = 1048576;
        this.f41989b = 536576;
    }

    @Override // com.bytedance.platform.godzilla.c.a
    public final void a() {
        MethodCollector.i(3318);
        PthreadCreateHook.start(this.f41989b);
        MethodCollector.o(3318);
    }
}
