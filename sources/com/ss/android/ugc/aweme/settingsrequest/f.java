package com.ss.android.ugc.aweme.settingsrequest;

import android.content.SharedPreferences;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.experiment.gi;
import com.ss.android.ugc.aweme.global.config.settings.a;
import com.ss.android.ugc.aweme.global.config.settings.d;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.im.service.model.i;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.settingsrequest.c.c;
import f.a.b;
import f.a.t;
import java.util.concurrent.ExecutorService;

public abstract class f implements a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile f f123222c;

    /* renamed from: a  reason: collision with root package name */
    public i f123223a;

    /* renamed from: b  reason: collision with root package name */
    protected com.google.gson.f f123224b = new com.google.gson.f();

    static {
        Covode.recordClassIndex(80927);
    }

    /* access modifiers changed from: protected */
    public abstract void b(IESSettingsProxy iESSettingsProxy);

    public static f a() {
        if (f123222c == null) {
            synchronized (f.class) {
                if (f123222c == null) {
                    f123222c = new m();
                }
            }
        }
        return f123222c;
    }

    private static void e(IESSettingsProxy iESSettingsProxy) {
        AVExternalServiceImpl.a().configService().updateServerSettings(iESSettingsProxy);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(IESSettingsProxy iESSettingsProxy) {
        d.a().a(true);
        b(iESSettingsProxy);
    }

    /* access modifiers changed from: package-private */
    public final void c(IESSettingsProxy iESSettingsProxy) {
        SharedPreferences.Editor edit = SharePrefCache.inst().getSharePref().edit();
        if (c.a()) {
            b.b(new j(this, edit, iESSettingsProxy)).b(f.a.h.a.b(f.a.k.a.f158006c)).cG_();
        } else {
            this.f123223a = SettingsRequestServiceImpl.i().a(edit, iESSettingsProxy);
        }
        e(iESSettingsProxy);
    }

    @Override // com.ss.android.ugc.aweme.global.config.settings.a
    public final void a(IESSettingsProxy iESSettingsProxy) {
        boolean z;
        if (gi.a()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z = true;
            } else {
                z = false;
            }
            t a2 = t.a(new g(this, iESSettingsProxy));
            if (com.bytedance.aweme.b.a.f25787a == null) {
                l.a a3 = l.a(o.FIXED);
                a3.f79174c = 1;
                com.bytedance.aweme.b.a.f25787a = g.a(a3.a());
            }
            ExecutorService executorService = com.bytedance.aweme.b.a.f25787a;
            if (executorService == null) {
                h.f.b.l.a();
            }
            t b2 = a2.b(f.a.k.a.a(executorService));
            if (z) {
                b2 = b2.a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
            }
            b2.a(new h(this, iESSettingsProxy), i.f123229a);
            return;
        }
        c(iESSettingsProxy);
        d.a().a(true);
        b(iESSettingsProxy);
    }
}
