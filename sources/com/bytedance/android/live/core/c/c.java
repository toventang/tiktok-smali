package com.bytedance.android.live.core.c;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f8936a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8937b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f8938c;

    static {
        Covode.recordClassIndex(4562);
    }

    c(b bVar, String str, Map map) {
        this.f8936a = bVar;
        this.f8937b = str;
        this.f8938c = map;
    }

    public final void run() {
        this.f8936a.a(this.f8937b, b.a(this.f8938c));
    }
}
