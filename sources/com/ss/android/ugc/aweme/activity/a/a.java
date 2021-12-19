package com.ss.android.ugc.aweme.activity.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.b;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.ft;
import h.f.b.l;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f65526a = new a();

    @Override // com.bytedance.ies.foundation.activity.b
    public final void a() {
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void a(int i2, int i3, Intent intent) {
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void a(int i2, Intent intent) {
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final boolean a(int i2, KeyEvent keyEvent) {
        return false;
    }

    private a() {
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void a(com.bytedance.ies.foundation.activity.a aVar, boolean z) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    static {
        Covode.recordClassIndex(40306);
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final Resources a(Resources resources) {
        l.d(resources, "");
        l.d(resources, "");
        return resources;
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void b(Activity activity) {
        l.d(activity, "");
        l.d(activity, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void c(Activity activity) {
        l.d(activity, "");
        l.d(activity, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void d(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void e(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void g(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void h(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void i(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void j(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void k(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void l(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void m(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void n(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void o(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void p(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void q(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void r(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final Context a(Context context) {
        if (context == null) {
            return context;
        }
        IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        if (createIMainServicebyMonsterPlugin != null) {
            return createIMainServicebyMonsterPlugin.interceptActivityAttachBaseContext(context);
        }
        return null;
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void b(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
        ft.f142952a = getClass();
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void c(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void f(com.bytedance.ies.foundation.activity.a aVar) {
        w ameActivityResumeRunTask;
        l.d(aVar, "");
        l.d(aVar, "");
        IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        if (createIMainServicebyMonsterPlugin != null && (ameActivityResumeRunTask = createIMainServicebyMonsterPlugin.getAmeActivityResumeRunTask(aVar)) != null) {
            new f.c().b(ameActivityResumeRunTask).a();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void a(Activity activity) {
        l.d(activity, "");
        l.d(activity, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void a(Bundle bundle) {
        l.d(bundle, "");
        l.d(bundle, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void a(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void d(com.bytedance.ies.foundation.activity.a aVar, Bundle bundle) {
        l.d(aVar, "");
        l.d(bundle, "");
        b.a.c(aVar, bundle);
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void b(com.bytedance.ies.foundation.activity.a aVar, Bundle bundle) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void c(com.bytedance.ies.foundation.activity.a aVar, Bundle bundle) {
        l.d(aVar, "");
        l.d(bundle, "");
        b.a.b(aVar, bundle);
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void a(com.bytedance.ies.foundation.activity.a aVar, Configuration configuration) {
        l.d(aVar, "");
        l.d(configuration, "");
        b.a.a(aVar, configuration);
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void a(com.bytedance.ies.foundation.activity.a aVar, Bundle bundle) {
        l.d(aVar, "");
        l.d(bundle, "");
        b.a.a(aVar, bundle);
    }
}
