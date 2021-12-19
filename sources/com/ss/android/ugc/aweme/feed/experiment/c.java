package com.ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.keva.Keva;
import h.f.b.l;
import h.n;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f93055a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(59016);
    }

    public static Keva a() {
        Keva repo = Keva.getRepo("TTSettingData");
        l.b(repo, "");
        return repo;
    }

    public static boolean b() {
        return a().getBoolean("IsBackgroundAudioEnabled", false);
    }

    public static boolean c() {
        if (!b() || !b.a()) {
            return false;
        }
        return true;
    }

    private static a f() {
        if (b.c()) {
            return a.PLAY_IN_ORDER;
        }
        return a.REPEAT;
    }

    public enum a {
        PLAY_IN_ORDER,
        REPEAT;

        static {
            Covode.recordClassIndex(59017);
        }

        public final String toMobString() {
            int i2 = d.f93057a[ordinal()];
            if (i2 == 1) {
                return "order";
            }
            if (i2 == 2) {
                return "repeat";
            }
            throw new n();
        }
    }

    public static boolean d() {
        if (!b() || !b.a() || !f.f34637l) {
            return false;
        }
        return true;
    }

    public static a e() {
        return a.values()[a().getInt("BackgroundAudioPlayOrder", f().ordinal())];
    }
}
