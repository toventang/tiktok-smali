package com.bytedance.globalpayment.iap.common.ability.g.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.d;
import java.util.List;

final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e f30326a;

    /* renamed from: b  reason: collision with root package name */
    private final d f30327b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f30328c;

    /* renamed from: d  reason: collision with root package name */
    private final List f30329d;

    static {
        Covode.recordClassIndex(17587);
    }

    l(e eVar, d dVar, boolean z, List list) {
        this.f30326a = eVar;
        this.f30327b = dVar;
        this.f30328c = z;
        this.f30329d = list;
    }

    public final void run() {
        this.f30326a.a(this.f30329d);
    }
}
