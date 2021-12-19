package com.bytedance.tiktok.homepage.mainactivity;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.journey.z;
import com.ss.android.ugc.aweme.logger.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class i {

    /* renamed from: a  reason: collision with root package name */
    final Activity f44168a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f44169b;

    /* renamed from: c  reason: collision with root package name */
    public Future<?> f44170c;

    static {
        Covode.recordClassIndex(27065);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        boolean z = false;
        if (p.a.a().h() || (this.f44168a.getIntent() != null && this.f44168a.getIntent().getBooleanExtra("from_new_user_journey", false))) {
            z = true;
        }
        this.f44169b = z;
    }

    public final void a() {
        a.b.f109011a.a("method_create_calculate_newuser_value", false);
        if (!com.ss.android.ugc.aweme.s.a.m()) {
            z zVar = z.f105220a;
            Activity activity = this.f44168a;
            zVar.a(activity, activity.getIntent());
            b();
        } else {
            try {
                Future<?> future = this.f44170c;
                if (future != null) {
                    future.get();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        a.b.f109011a.b("method_create_calculate_newuser_value", false);
        a.b.f109011a.a("method_create_welcome_duration", false);
        if (((int) d.d()) > s.a.f66880a.v().c().intValue()) {
            Keva.getRepo("repo_new_version_journey").storeBoolean("key_new_version", true);
            Keva repo = Keva.getRepo("repo_story_cold_start");
            if (repo.getBoolean("key_new_user", false)) {
                repo.storeBoolean("key_new_user", false);
            } else {
                repo.storeBoolean("key_new_version", true);
            }
        }
        p.a.a().a(p.a.a(this.f44168a.getIntent()));
        if (p.a.a().h()) {
            z.f105220a.a(this.f44168a, true, false);
        }
        a.b.f109011a.b("method_create_welcome_duration", false);
    }

    public i(Activity activity) {
        this.f44168a = activity;
    }
}
