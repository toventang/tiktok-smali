package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;

/* access modifiers changed from: package-private */
public final class hg implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ gk f51759a;

    static {
        Covode.recordClassIndex(32282);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    private hg(gk gkVar) {
        this.f51759a = gkVar;
    }

    public final void onActivityDestroyed(Activity activity) {
        MethodCollector.i(7611);
        hq h2 = this.f51759a.h();
        synchronized (h2.f51792j) {
            try {
                if (activity == h2.f51787e) {
                    h2.f51787e = null;
                }
            } finally {
                MethodCollector.o(7611);
            }
        }
        if (h2.s().h().booleanValue()) {
            h2.f51786d.remove(activity);
        }
    }

    public final void onActivityPaused(Activity activity) {
        MethodCollector.i(7681);
        hq h2 = this.f51759a.h();
        if (h2.s().d(null, p.aD)) {
            synchronized (h2.f51792j) {
                try {
                    h2.f51791i = false;
                    h2.f51788f = true;
                } catch (Throwable th) {
                    MethodCollector.o(7681);
                    throw th;
                }
            }
        }
        long b2 = h2.l().b();
        if (!h2.s().d(null, p.aC) || h2.s().h().booleanValue()) {
            hn a2 = h2.a(activity);
            h2.f51784b = h2.f51783a;
            h2.f51783a = null;
            h2.p().a(new ht(h2, a2, b2));
        } else {
            h2.f51783a = null;
            h2.p().a(new hu(h2, b2));
        }
        iz j2 = this.f51759a.j();
        j2.p().a(new jb(j2, j2.l().b()));
        MethodCollector.o(7681);
    }

    public final void onActivityResumed(Activity activity) {
        MethodCollector.i(7757);
        iz j2 = this.f51759a.j();
        j2.p().a(new jc(j2, j2.l().b()));
        hq h2 = this.f51759a.h();
        if (h2.s().d(null, p.aD)) {
            synchronized (h2.f51792j) {
                try {
                    h2.f51791i = true;
                    if (activity != h2.f51787e) {
                        synchronized (h2.f51792j) {
                            try {
                                h2.f51787e = activity;
                                h2.f51788f = false;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (h2.s().d(null, p.aC) && h2.s().h().booleanValue()) {
                            h2.f51789g = null;
                            h2.p().a(new hw(h2));
                        }
                    }
                } finally {
                    MethodCollector.o(7757);
                }
            }
        }
        if (!h2.s().d(null, p.aC) || h2.s().h().booleanValue()) {
            h2.a(activity, h2.a(activity), false);
            a d2 = h2.d();
            d2.p().a(new dc(d2, d2.l().b()));
            MethodCollector.o(7757);
            return;
        }
        h2.f51783a = h2.f51789g;
        h2.p().a(new hr(h2));
        MethodCollector.o(7757);
    }

    /* synthetic */ hg(gk gkVar, byte b2) {
        this(gkVar);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        hn hnVar;
        hq h2 = this.f51759a.h();
        if (h2.s().h().booleanValue() && bundle != null && (hnVar = h2.f51786d.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", hnVar.f51774c);
            bundle2.putString(StringSet.name, hnVar.f51772a);
            bundle2.putString("referrer_name", hnVar.f51773b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
        try {
            this.f51759a.q().f51476k.a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data == null || !data.isHierarchical()) {
                    this.f51759a.h().a(activity, bundle);
                    return;
                }
                this.f51759a.o();
                String a2 = jz.a(intent, "android.intent.extra.REFERRER_NAME");
                boolean z = true;
                if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(a2) || "https://www.google.com".equals(a2) || "android-app://com.google.appcrawler".equals(a2)) {
                    str = "gs";
                } else {
                    str = "auto";
                }
                String queryParameter = data.getQueryParameter("referrer");
                if (bundle != null) {
                    z = false;
                }
                this.f51759a.p().a(new hf(this, z, data, str, queryParameter));
                this.f51759a.h().a(activity, bundle);
            }
        } catch (Exception e2) {
            this.f51759a.q().f51468c.a("Throwable caught in onActivityCreated", e2);
        } finally {
            this.f51759a.h().a(activity, bundle);
        }
    }
}
