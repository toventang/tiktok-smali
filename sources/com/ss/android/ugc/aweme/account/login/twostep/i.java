package com.ss.android.ugc.aweme.account.login.twostep;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import h.f.b.l;
import h.f.b.m;
import h.h;

public final class i implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static long f63937a;

    /* renamed from: b  reason: collision with root package name */
    public static Intent f63938b;

    /* renamed from: c  reason: collision with root package name */
    public static String f63939c;

    /* renamed from: d  reason: collision with root package name */
    public static final i f63940d = new i();

    /* renamed from: e  reason: collision with root package name */
    private static final h f63941e = h.i.a((h.f.a.a) a.f63942a);

    public static Keva a() {
        return (Keva) f63941e.getValue();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        l.d(activity, "");
    }

    public final void onActivityDestroyed(Activity activity) {
        l.d(activity, "");
    }

    public final void onActivityPaused(Activity activity) {
        l.d(activity, "");
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        l.d(activity, "");
        l.d(bundle, "");
    }

    public final void onActivityStarted(Activity activity) {
        l.d(activity, "");
    }

    public final void onActivityStopped(Activity activity) {
        l.d(activity, "");
    }

    private i() {
    }

    static final class a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f63942a = new a();

        static {
            Covode.recordClassIndex(39400);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("aweme_open_push_challenge_page_list");
        }
    }

    static {
        Covode.recordClassIndex(39399);
    }

    public static void a(String str) {
        l.d(str, "");
        new Exception();
        a().storeLong(str, System.currentTimeMillis());
    }

    public final void onActivityResumed(Activity activity) {
        l.d(activity, "");
        if (System.currentTimeMillis() - f63937a < 120000 && f63938b != null && !TextUtils.isEmpty(f63939c) && !a().contains(f63939c)) {
            String str = f63939c;
            if (str == null) {
                l.b();
            }
            a(str);
            a(d.a(), f63938b);
            f63938b = null;
            f63939c = "";
        }
    }

    public static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }
}
