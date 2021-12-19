package com.ss.android.ugc.aweme.aabplugin.core.base.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f62477a;

    static {
        Covode.recordClassIndex(38446);
    }

    h(String str) {
        this.f62477a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return f.b(this.f62477a);
    }
}
