package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.services.NewUserMainModuleService;
import com.ss.android.ugc.aweme.journey.INewUserMainModuleService;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.r;
import h.f.b.l;

public final class cq implements INewUserMainModuleService {

    /* renamed from: a  reason: collision with root package name */
    public static final cq f78276a = new cq();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ INewUserMainModuleService f78277b;

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final r a(aa aaVar) {
        l.d(aaVar, "");
        return this.f78277b.a(aaVar);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final Class<? extends Activity> a() {
        return this.f78277b.a();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final void a(Context context, boolean z) {
        l.d(context, "");
        this.f78277b.a(context, z);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final void a(String str) {
        l.d(str, "");
        this.f78277b.a(str);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final Class<? extends Activity> b() {
        return this.f78277b.b();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final boolean c() {
        return this.f78277b.c();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final r d() {
        return this.f78277b.d();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final r e() {
        return this.f78277b.e();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final Class<? extends Activity> f() {
        return this.f78277b.f();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final void g() {
        this.f78277b.g();
    }

    static {
        Covode.recordClassIndex(48532);
    }

    private cq() {
        INewUserMainModuleService h2 = NewUserMainModuleService.h();
        l.b(h2, "");
        this.f78277b = h2;
    }
}
