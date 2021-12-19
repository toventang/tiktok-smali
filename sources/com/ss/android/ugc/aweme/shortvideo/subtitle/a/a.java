package com.ss.android.ugc.aweme.shortvideo.subtitle.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.setting.f;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f130916a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(85810);
    }

    public static final boolean a() {
        if (!b.a().a(true, "studio_enable_auto_captions", false) || !g.a().A().b() || g.a().A().a() || f.a() == null) {
            return false;
        }
        return true;
    }
}
