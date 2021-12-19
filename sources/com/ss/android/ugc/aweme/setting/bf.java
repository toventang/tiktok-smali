package com.ss.android.ugc.aweme.setting;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.ss.android.ugc.aweme.utils.fy;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class bf {

    /* renamed from: a  reason: collision with root package name */
    public static final bf f122091a = new bf();

    private bf() {
    }

    static {
        Covode.recordClassIndex(80052);
    }

    private static boolean b() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a() {
        if (j.f107229h && j.b() && !j.c()) {
            return j.f107229h;
        }
        boolean b2 = b();
        j.f107229h = b2;
        return b2;
    }

    public static void a(Activity activity) {
        l.d(activity, "");
        if (!a()) {
            new a(activity).a(R.string.de8).a();
            return;
        }
        g gVar = new g(fy.a("terms-of-use"));
        gVar.a("lang", LocalServiceImpl.a().a(activity));
        SmartRouter.buildRoute(activity, "aweme://webview").withParam("url", gVar.a()).withParam("title", activity.getString(R.string.da9)).open();
    }
}
