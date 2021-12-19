package com.ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class o implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f145462a;

    static {
        Covode.recordClassIndex(95117);
    }

    o(Context context) {
        this.f145462a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return j.c(this.f145462a);
    }
}
