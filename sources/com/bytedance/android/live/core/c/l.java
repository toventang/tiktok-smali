package com.bytedance.android.live.core.c;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f8960a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8961b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f8962c;

    static {
        Covode.recordClassIndex(4571);
    }

    l(b bVar, String str, Map map) {
        this.f8960a = bVar;
        this.f8961b = str;
        this.f8962c = map;
    }

    public final void run() {
        b bVar = this.f8960a;
        String str = this.f8961b;
        a.a(3, str, bVar.c(str, b.a(this.f8962c)));
    }
}
