package com.google.android.play.core.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bi;
import com.google.android.play.core.b.bk;
import com.google.android.play.core.e.b.a;
import com.google.android.play.core.e.b.l;
import java.io.File;

public final class y implements ai {

    /* renamed from: a  reason: collision with root package name */
    private bk<Context> f53350a;

    /* renamed from: b  reason: collision with root package name */
    private bk<t> f53351b;

    /* renamed from: c  reason: collision with root package name */
    private bk<ap> f53352c;

    /* renamed from: d  reason: collision with root package name */
    private bk<al> f53353d = bi.a(am.a(this.f53350a));

    /* renamed from: e  reason: collision with root package name */
    private bk<v> f53354e;

    /* renamed from: f  reason: collision with root package name */
    private bk<as> f53355f;

    /* renamed from: g  reason: collision with root package name */
    private bk<File> f53356g;

    /* renamed from: h  reason: collision with root package name */
    private bk<a> f53357h;

    /* renamed from: i  reason: collision with root package name */
    private bk<ae> f53358i;

    /* renamed from: j  reason: collision with root package name */
    private bk<c> f53359j;

    static {
        Covode.recordClassIndex(32953);
    }

    /* synthetic */ y(au auVar) {
        av avVar = new av(auVar);
        this.f53350a = avVar;
        this.f53351b = bi.a(new u(avVar));
        this.f53352c = bi.a(new j(auVar));
        bk<v> a2 = bi.a(new w(this.f53350a));
        this.f53354e = a2;
        this.f53355f = bi.a(new at(this.f53351b, this.f53352c, this.f53353d, a2));
        bk<File> a3 = bi.a(new i(this.f53350a));
        this.f53356g = a3;
        bk<a> a4 = bi.a(new l(this.f53350a, a3, this.f53353d));
        this.f53357h = a4;
        bk<ae> a5 = bi.a(new af(this.f53355f, a4, this.f53356g));
        this.f53358i = a5;
        this.f53359j = bi.a(new k(auVar, a5));
    }

    @Override // com.google.android.play.core.e.ai
    public final c a() {
        return this.f53359j.a();
    }
}
