package com.android.billingclient.api;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final class o implements Callable<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ int f5866a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ SkuDetails f5867b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f5868c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ g f5869d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Bundle f5870e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ e f5871f;

    static {
        Covode.recordClassIndex(2457);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Bundle call() {
        return this.f5871f.f5824e.a(this.f5866a, this.f5871f.f5823d.getPackageName(), this.f5867b.a(), this.f5868c, this.f5869d.f5837a, this.f5870e);
    }

    o(e eVar, int i2, SkuDetails skuDetails, String str, g gVar, Bundle bundle) {
        this.f5871f = eVar;
        this.f5866a = i2;
        this.f5867b = skuDetails;
        this.f5868c = str;
        this.f5869d = gVar;
        this.f5870e = bundle;
    }
}
