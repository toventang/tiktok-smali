package com.ss.android.ugc.aweme.feed.guide;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.experiment.cn;
import com.ss.android.ugc.aweme.lego.p;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f93251a = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(59134);
    }

    public static final boolean b() {
        return a().getBoolean("hasShowedSwipeUpGuideAfterVideoPlay", false);
    }

    public static final boolean d() {
        return a().getBoolean("shouldShowSwipeUpGuide1", true);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f93252a = false;

        static {
            Covode.recordClassIndex(59135);
        }

        a() {
        }

        public final void run() {
            i.a().edit().putBoolean("shouldShowSwipeUpGuide1", this.f93252a).apply();
        }
    }

    public static SharedPreferences a() {
        SharedPreferences a2 = d.a(com.bytedance.ies.ugc.appcontext.d.a(), "MainTabPreferences", 0);
        l.b(a2, "");
        return a2;
    }

    public static final void e() {
        if (cn.f89704b) {
            p.f107614a.post(new a());
        } else {
            a().edit().putBoolean("shouldShowSwipeUpGuide1", false).apply();
        }
    }
}
