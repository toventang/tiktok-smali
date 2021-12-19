package com.ss.android.ugc.aweme.commercialize.media.impl.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f74848a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f74849b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(46140);
    }

    public static final boolean b() {
        return SettingsManager.a().a("enable_music_legal_optimize", false);
    }

    private static boolean h() {
        com.ss.android.ugc.aweme.commercialize.media.api.a.a a2 = com.ss.android.ugc.aweme.commercialize.media.impl.a.a.a();
        if (a2 == null) {
            l.b();
        }
        return a2.e();
    }

    public static final boolean a() {
        User f2;
        com.ss.android.ugc.aweme.commercialize.media.api.a.a a2 = com.ss.android.ugc.aweme.commercialize.media.impl.a.a.a();
        if (a2 == null || (f2 = a2.f()) == null || f2.getMusicComplianceAccount() <= 0) {
            return false;
        }
        return true;
    }

    private static boolean e() {
        String str;
        com.ss.android.ugc.aweme.commercialize.media.api.a.a a2 = com.ss.android.ugc.aweme.commercialize.media.impl.a.a.a();
        if (a2 != null) {
            str = a2.b();
        } else {
            str = null;
        }
        return TextUtils.equals(str, "mission");
    }

    private static boolean f() {
        com.ss.android.ugc.aweme.commercialize.media.api.a.a a2 = com.ss.android.ugc.aweme.commercialize.media.impl.a.a.a();
        if (a2 == null || !a2.c() || !b()) {
            return false;
        }
        return true;
    }

    private static boolean g() {
        String str;
        com.ss.android.ugc.aweme.commercialize.media.api.a.a a2 = com.ss.android.ugc.aweme.commercialize.media.impl.a.a.a();
        if (a2 != null) {
            str = a2.b();
        } else {
            str = null;
        }
        return TextUtils.equals(str, "tcm_upload");
    }

    public static final boolean c() {
        com.ss.android.ugc.aweme.commercialize.media.api.a.a a2 = com.ss.android.ugc.aweme.commercialize.media.impl.a.a.a();
        if (a2 != null && a2.d()) {
            return false;
        }
        if (a() || d() || f() || g() || e() || h()) {
            return true;
        }
        return false;
    }

    private static boolean d() {
        String str;
        com.ss.android.ugc.aweme.commercialize.media.api.a.a a2;
        com.ss.android.ugc.aweme.commercialize.media.api.a.a a3 = com.ss.android.ugc.aweme.commercialize.media.impl.a.a.a();
        if (a3 != null) {
            str = a3.b();
        } else {
            str = null;
        }
        if (!TextUtils.equals(str, "challenge") || (a2 = com.ss.android.ugc.aweme.commercialize.media.impl.a.a.a()) == null || !a2.a()) {
            return false;
        }
        return true;
    }

    public static final boolean a(Music music) {
        if (music != null && !music.isCommercialMusic()) {
            return true;
        }
        return false;
    }
}
