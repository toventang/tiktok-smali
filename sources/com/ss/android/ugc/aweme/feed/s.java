package com.ss.android.ugc.aweme.feed;

import android.app.Activity;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.keva.Keva;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f93857a;

    /* renamed from: b  reason: collision with root package name */
    public static af f93858b = af.FEED;

    /* renamed from: c  reason: collision with root package name */
    public static long f93859c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static long f93860d = -1;

    /* renamed from: e  reason: collision with root package name */
    private static volatile Boolean f93861e;

    /* renamed from: f  reason: collision with root package name */
    private static a f93862f;

    public interface a {
        static {
            Covode.recordClassIndex(59711);
        }

        void a(af afVar);
    }

    public static long c() {
        long j2 = f93860d;
        f93860d = 0;
        return j2;
    }

    public static Boolean a() {
        if (f93861e == null) {
            d();
        }
        return f93861e;
    }

    static {
        Covode.recordClassIndex(59710);
    }

    public static String b() {
        Activity j2 = f.j();
        if (j2 != null) {
            return j2.getClass().getSimpleName();
        }
        return null;
    }

    private static boolean d() {
        if (d.a() == null) {
            return false;
        }
        SharedPreferences a2 = com.ss.android.ugc.aweme.bf.d.a(d.a(), "prefs_feed_check", 0);
        boolean z = a2.getBoolean("key_first_launch", true);
        if (f93861e == null) {
            f93861e = Boolean.valueOf(z);
        }
        if (f93861e.booleanValue()) {
            Keva.getRepo("repo_story_cold_start").storeBoolean("key_new_user", true);
        }
        a2.edit().putBoolean("key_first_launch", false).apply();
        Keva repo = Keva.getRepo("repo_new_version_journey");
        if (repo.getLong("key_first_launch_time", 0) == 0) {
            repo.storeLong("key_first_launch_time", System.currentTimeMillis());
        }
        return f93861e.booleanValue();
    }

    public static void a(a aVar) {
        if (aVar != null) {
            f93862f = aVar;
        }
    }

    public static void a(af afVar) {
        f93858b = afVar;
        a aVar = f93862f;
        if (aVar != null) {
            aVar.a(afVar);
        }
    }
}
