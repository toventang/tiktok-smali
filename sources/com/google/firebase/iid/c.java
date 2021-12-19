package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f54454a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f54455b;

    static {
        Covode.recordClassIndex(33799);
    }

    c(Context context, Intent intent) {
        this.f54454a = context;
        this.f54455b = intent;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = this.f54454a;
        Intent intent = this.f54455b;
        ap a2 = ap.a();
        a2.f54422c.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return Integer.valueOf(a2.a(context, intent2));
    }
}
