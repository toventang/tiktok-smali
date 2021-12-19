package com.android.billingclient.api;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.concurrent.Callable;

final class n implements Callable<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ g f5863a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ SkuDetails f5864b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ e f5865c;

    static {
        Covode.recordClassIndex(2456);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Bundle call() {
        return this.f5865c.f5824e.a(this.f5865c.f5823d.getPackageName(), Arrays.asList(this.f5863a.f5839c), this.f5864b.a(), "subs");
    }

    n(e eVar, g gVar, SkuDetails skuDetails) {
        this.f5865c = eVar;
        this.f5863a = gVar;
        this.f5864b = skuDetails;
    }
}
