package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ca implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final by f122151a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f122152b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f122153c;

    static {
        Covode.recordClassIndex(80080);
    }

    ca(by byVar, Object obj, boolean z) {
        this.f122151a = byVar;
        this.f122152b = obj;
        this.f122153c = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        by byVar = this.f122151a;
        Object obj = this.f122152b;
        boolean z = this.f122153c;
        if (obj == null || !(obj instanceof o)) {
            return null;
        }
        byVar.a((o) obj, z);
        byVar.a(obj);
        return null;
    }
}
