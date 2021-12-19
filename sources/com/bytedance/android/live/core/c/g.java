package com.bytedance.android.live.core.c;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f8946a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8947b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f8948c;

    static {
        Covode.recordClassIndex(4566);
    }

    g(b bVar, String str, Map map) {
        this.f8946a = bVar;
        this.f8947b = str;
        this.f8948c = map;
    }

    public final void run() {
        b bVar = this.f8946a;
        String str = this.f8947b;
        a.a(6, str, bVar.c(str, b.a(this.f8948c)));
    }
}
