package com.ss.android.ugc.aweme.launcher.service.account;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.component.e;
import com.ss.android.ugc.aweme.launcher.serviceimpl.account.AccountImpl;
import h.f.b.l;
import java.util.Collection;

public final class a implements IAccountApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f107290a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IAccountApi f107291b;

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void a(String str, String str2, String str3) {
        this.f107291b.a(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void a(Collection<String> collection) {
        l.d(collection, "");
        this.f107291b.a(collection);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void a(boolean z, String str) {
        l.d(str, "");
        this.f107291b.a(z, str);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final boolean a() {
        return this.f107291b.a();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final boolean a(String str) {
        return this.f107291b.a(str);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final e b() {
        return this.f107291b.b();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void b(String str) {
        this.f107291b.b(str);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final String c() {
        return this.f107291b.c();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final String d() {
        return this.f107291b.d();
    }

    static {
        Covode.recordClassIndex(68644);
    }

    private a() {
        IAccountApi e2 = AccountImpl.e();
        l.b(e2, "");
        this.f107291b = e2;
    }
}
