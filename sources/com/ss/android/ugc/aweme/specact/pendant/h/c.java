package com.ss.android.ugc.aweme.specact.pendant.h;

import android.app.Activity;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f134286a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(87820);
    }

    public static Aweme a() {
        Activity j2 = f.j();
        if (j2 instanceof e) {
            return AwemeChangeCallBack.a((e) j2);
        }
        return null;
    }

    public static boolean a(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        return b.s(aweme);
    }

    public static boolean b(Aweme aweme) {
        if (aweme != null && aweme.getAwemeType() == 101) {
            return true;
        }
        return false;
    }
}
