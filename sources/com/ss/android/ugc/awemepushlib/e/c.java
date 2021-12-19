package com.ss.android.ugc.awemepushlib.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.awemepushlib.c.b;
import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final b f145391a;

    static {
        Covode.recordClassIndex(95067);
    }

    public c(b bVar) {
        this.f145391a = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return b.a(this.f145391a);
    }
}
