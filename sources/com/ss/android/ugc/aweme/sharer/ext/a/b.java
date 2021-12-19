package com.ss.android.ugc.aweme.sharer.ext.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f124532a = "com.twitter.composer.ComposerActivity";

    /* renamed from: b  reason: collision with root package name */
    public static final b f124533b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(81809);
    }

    public static String a() {
        try {
            String a2 = SettingsManager.a().a("share_twitter_target_type", "com.twitter.composer.ComposerActivity");
            l.b(a2, "");
            return a2;
        } catch (Throwable unused) {
            return f124532a;
        }
    }
}
