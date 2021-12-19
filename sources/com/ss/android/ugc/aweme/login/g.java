package com.ss.android.ugc.aweme.login;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ac.b;
import java.util.concurrent.Callable;

public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f109025a;

    /* renamed from: b  reason: collision with root package name */
    private final b f109026b;

    static {
        Covode.recordClassIndex(69816);
    }

    public g(Bundle bundle, b bVar) {
        this.f109025a = bundle;
        this.f109026b = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return d.b(this.f109025a, this.f109026b);
    }
}
