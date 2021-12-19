package com.ss.android.ugc.aweme.setting;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bz implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final by f122135a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f122136b;

    static {
        Covode.recordClassIndex(80075);
    }

    bz(by byVar, Context context) {
        this.f122135a = byVar;
        this.f122136b = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f122135a.b(this.f122136b);
    }
}
