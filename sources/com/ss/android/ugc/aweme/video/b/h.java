package com.ss.android.ugc.aweme.video.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.player.a;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f143289a = true;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f143290b;

    /* renamed from: c  reason: collision with root package name */
    public static final h f143291c = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(93785);
    }

    public static boolean a() {
        if (!a.f114913a) {
            return b.a().a(true, "enable_ies_route", true);
        }
        if (f143290b == null) {
            f143290b = Boolean.valueOf(b.a().a(true, "enable_ies_route", true));
        }
        Boolean bool = f143290b;
        if (bool == null) {
            l.b();
        }
        return bool.booleanValue();
    }
}
