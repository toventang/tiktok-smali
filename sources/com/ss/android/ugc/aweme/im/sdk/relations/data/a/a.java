package com.ss.android.ugc.aweme.im.sdk.relations.data.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.service.c.j;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Keva f102974a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f102975b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(66015);
        Keva repo = Keva.getRepo("repo_mention_privacy_update");
        l.b(repo, "");
        f102974a = repo;
    }

    public static boolean a() {
        if (!com.ss.android.ugc.aweme.im.service.c.a.a() || (System.currentTimeMillis() - f102974a.getLong("key_cold_start_time", 0)) / 1000 < j.a()) {
            return false;
        }
        return true;
    }

    public static void a(int i2) {
        if (i2 == 0) {
            f102974a.storeLong("key_cold_start_time", System.currentTimeMillis());
        } else if (i2 != 1) {
            com.ss.android.ugc.aweme.im.service.m.a.b("MentionPrivacyUpdate", "Illegal argument of startType=".concat(String.valueOf(i2)));
        } else {
            f102974a.storeLong("key_warm_start_time", System.currentTimeMillis());
        }
    }
}
