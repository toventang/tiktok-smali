package com.ss.android.ugc.aweme.dsp.common.b;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.dsp.TTDspActivity;
import com.ss.android.ugc.aweme.dsp.playpage.subpage.SubPlayerActivity;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.ez;
import com.ss.android.ugc.aweme.utils.fc;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f83299a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(51932);
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo("com.moonvideo.android.resso", 0);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(Activity activity) {
        l.d(activity, "");
        if (MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(activity) || (activity instanceof SubPlayerActivity) || (activity instanceof TTDspActivity)) {
            return true;
        }
        return false;
    }

    public static void a(Activity activity, boolean z) {
        l.d(activity, "");
        if (z) {
            o.a(activity);
            ez.a(activity);
            fc.a(activity);
            return;
        }
        o.a(activity);
        o.b(activity);
        fc.b(activity);
    }
}
