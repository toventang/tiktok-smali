package com.ss.android.ugc.aweme.login;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ac.b;
import java.util.concurrent.Callable;

public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f109027a;

    /* renamed from: b  reason: collision with root package name */
    private final b f109028b;

    static {
        Covode.recordClassIndex(69817);
    }

    public h(Bundle bundle, b bVar) {
        this.f109027a = bundle;
        this.f109028b = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return d.a(this.f109027a, this.f109028b);
    }
}
