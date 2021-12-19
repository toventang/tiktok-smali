package com.snapchat.kit.sdk;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import dagger.a.c;
import dagger.a.f;

public final class g implements c<Handler> {

    /* renamed from: a  reason: collision with root package name */
    private final n f57322a;

    static {
        Covode.recordClassIndex(35843);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return f.a(new Handler(Looper.getMainLooper()), "Cannot return null from a non-@Nullable @Provides method");
    }

    g(n nVar) {
        this.f57322a = nVar;
    }
}
