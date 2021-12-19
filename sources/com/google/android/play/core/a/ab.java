package com.google.android.play.core.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bi;
import com.google.android.play.core.b.bk;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    bk<b> f52696a;

    /* renamed from: b  reason: collision with root package name */
    private bk<Context> f52697b;

    /* renamed from: c  reason: collision with root package name */
    private bk<u> f52698c;

    /* renamed from: d  reason: collision with root package name */
    private bk<s> f52699d;

    /* renamed from: e  reason: collision with root package name */
    private bk<e> f52700e;

    /* renamed from: f  reason: collision with root package name */
    private bk<h> f52701f;

    static {
        Covode.recordClassIndex(32634);
    }

    /* synthetic */ ab(j jVar) {
        l lVar = new l(jVar);
        this.f52697b = lVar;
        bk<u> a2 = bi.a(new v(lVar));
        this.f52698c = a2;
        this.f52699d = bi.a(new t(this.f52697b, a2));
        bk<e> a3 = bi.a(new f(this.f52697b));
        this.f52700e = a3;
        bk<h> a4 = bi.a(new i(this.f52699d, a3, this.f52697b));
        this.f52701f = a4;
        this.f52696a = bi.a(new k(a4));
    }
}
