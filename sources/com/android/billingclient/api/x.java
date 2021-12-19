package com.android.billingclient.api;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class x implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f5899a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5900b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ List f5901c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f5902d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ e f5903e;

    static {
        Covode.recordClassIndex(2466);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Void call() {
        this.f5903e.a(new z(this, this.f5903e.a(this.f5900b, this.f5901c, this.f5902d)));
        return null;
    }

    x(e eVar, String str, List list, String str2, m mVar) {
        this.f5903e = eVar;
        this.f5900b = str;
        this.f5901c = list;
        this.f5902d = str2;
        this.f5899a = mVar;
    }
}
