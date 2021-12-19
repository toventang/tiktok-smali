package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f107963a;

    static {
        Covode.recordClassIndex(69208);
    }

    public c(Context context) {
        this.f107963a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return CleanEffectsTask.b(this.f107963a);
    }
}
