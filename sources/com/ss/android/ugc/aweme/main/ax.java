package com.ss.android.ugc.aweme.main;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.lego.p;
import h.f.b.l;

public final class ax {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f109172a = a().getBoolean("hasSwipedUp", false);

    /* renamed from: b  reason: collision with root package name */
    public static final ax f109173b = new ax();

    private ax() {
    }

    public static /* synthetic */ void b() {
        f109172a = true;
        p.f107614a.post(new a());
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f109174a = true;

        static {
            Covode.recordClassIndex(69912);
        }

        a() {
        }

        public final void run() {
            ax.a().edit().putBoolean("hasSwipedUp", this.f109174a).apply();
        }
    }

    static {
        Covode.recordClassIndex(69911);
    }

    public static SharedPreferences a() {
        SharedPreferences a2 = d.a(com.bytedance.ies.ugc.appcontext.d.a(), "MainTabPreferences", 0);
        l.b(a2, "");
        return a2;
    }

    public static final void c() {
        a().edit().putBoolean("shouldShowScrollToFeedFollowGuideMT", false).apply();
    }
}
