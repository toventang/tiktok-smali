package com.ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.content.Intent;
import b.j;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class q implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f132356a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f132357b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f132358c;

    /* renamed from: d  reason: collision with root package name */
    private final j f132359d;

    static {
        Covode.recordClassIndex(86672);
    }

    q(String str, Intent intent, Context context, j jVar) {
        this.f132356a = str;
        this.f132357b = intent;
        this.f132358c = context;
        this.f132359d = jVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return f.a(this.f132356a, this.f132357b, this.f132358c, this.f132359d);
    }
}
