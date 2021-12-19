package com.ss.android.legoapi.abtest;

import com.bytedance.covode.number.Covode;
import com.ss.android.legoimpl.ABLegoTaskImpl;
import com.ss.android.ugc.aweme.lego.w;
import h.f.b.l;

public final class a implements IABLegoTaskApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f59609a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IABLegoTaskApi f59610b;

    @Override // com.ss.android.legoapi.abtest.IABLegoTaskApi
    public final w a() {
        return this.f59610b.a();
    }

    @Override // com.ss.android.legoapi.abtest.IABLegoTaskApi
    public final w b() {
        return this.f59610b.b();
    }

    @Override // com.ss.android.legoapi.abtest.IABLegoTaskApi
    public final w c() {
        return this.f59610b.c();
    }

    @Override // com.ss.android.legoapi.abtest.IABLegoTaskApi
    public final w d() {
        return this.f59610b.d();
    }

    static {
        Covode.recordClassIndex(36797);
    }

    private a() {
        IABLegoTaskApi e2 = ABLegoTaskImpl.e();
        l.b(e2, "");
        this.f59610b = e2;
    }
}
