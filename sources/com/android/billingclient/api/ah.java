package com.android.billingclient.api;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.h.a;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class ah implements Callable<Integer> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f5803a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ e f5804b;

    static {
        Covode.recordClassIndex(2433);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Integer call() {
        a aVar = this.f5804b.f5824e;
        String packageName = this.f5804b.f5823d.getPackageName();
        String str = this.f5803a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("vr", true);
        return Integer.valueOf(aVar.b(packageName, str, bundle));
    }

    ah(e eVar, String str) {
        this.f5804b = eVar;
        this.f5803a = str;
    }
}
