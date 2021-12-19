package com.ss.android.ugc.trill.c.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static final Callable f150474a = new b();

    static {
        Covode.recordClassIndex(98958);
    }

    private b() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        a.a().edit().clear().commit();
        return null;
    }
}
