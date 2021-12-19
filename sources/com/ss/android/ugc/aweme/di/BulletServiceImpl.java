package com.ss.android.ugc.aweme.di;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.a.a;
import com.bytedance.ies.bullet.c.d;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.bullet.views.c;
import h.f.b.l;

public class BulletServiceImpl implements IBulletService {

    /* renamed from: a  reason: collision with root package name */
    private IBulletService f80118a;

    static {
        Covode.recordClassIndex(49860);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final a b() {
        return this.f80118a.b();
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void c() {
        this.f80118a.c();
    }

    public BulletServiceImpl() {
        BulletService bulletService = new BulletService();
        this.f80118a = bulletService;
        l.d(bulletService, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final d.b a() {
        return this.f80118a.a();
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final Activity a(String str) {
        return this.f80118a.a(str);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final View a(Context context) {
        return this.f80118a.a(context);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final String b(String str) {
        return this.f80118a.b(str);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void b(Context context) {
        this.f80118a.b(context);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void a(Class<?> cls) {
        this.f80118a.a(cls);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final boolean b(Context context, String str) {
        return this.f80118a.b(context, str);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void a(Context context, String str) {
        this.f80118a.a(context, str);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void a(Context context, String str, Bundle bundle) {
        this.f80118a.a(context, str, bundle);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void a(Context context, String str, String str2, Bundle bundle) {
        this.f80118a.a(context, str, str2, bundle);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final c a(Context context, String str, String str2, int i2, int i3) {
        return this.f80118a.a(context, str, str2, i2, i3);
    }
}
