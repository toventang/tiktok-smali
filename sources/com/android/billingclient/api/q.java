package com.android.billingclient.api;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final class q implements Callable<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ SkuDetails f5874a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5875b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ e f5876c;

    static {
        Covode.recordClassIndex(2459);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Bundle call() {
        return this.f5876c.f5824e.a(this.f5876c.f5823d.getPackageName(), this.f5874a.a(), this.f5875b);
    }

    q(e eVar, SkuDetails skuDetails, String str) {
        this.f5876c = eVar;
        this.f5874a = skuDetails;
        this.f5875b = str;
    }
}
