package com.google.android.gms.common;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class w extends u {

    /* renamed from: d  reason: collision with root package name */
    private final Callable<String> f50527d;

    static {
        Covode.recordClassIndex(31482);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.u
    public final String a() {
        try {
            return this.f50527d.call();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private w(Callable<String> callable) {
        super(false, null, null);
        this.f50527d = callable;
    }

    /* synthetic */ w(Callable callable, byte b2) {
        this(callable);
    }
}
