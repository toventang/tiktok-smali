package com.android.billingclient.api;

import com.android.billingclient.api.Purchase;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final class p implements Callable<Purchase.a> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f5872a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ e f5873b;

    static {
        Covode.recordClassIndex(2458);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Purchase.a call() {
        return this.f5873b.c(this.f5872a);
    }

    p(e eVar, String str) {
        this.f5873b = eVar;
        this.f5872a = str;
    }
}
