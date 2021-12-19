package com.bytedance.globalpayment.iap.common.ability.g.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.d;
import java.util.List;

final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e f30319a;

    /* renamed from: b  reason: collision with root package name */
    private final d f30320b;

    /* renamed from: c  reason: collision with root package name */
    private final List f30321c;

    static {
        Covode.recordClassIndex(17585);
    }

    j(e eVar, d dVar, List list) {
        this.f30319a = eVar;
        this.f30320b = dVar;
        this.f30321c = list;
    }

    public final void run() {
        this.f30319a.c(this.f30320b, this.f30321c);
    }
}
