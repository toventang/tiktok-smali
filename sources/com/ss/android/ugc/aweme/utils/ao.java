package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.tux.tooltip.a.b.a;
import com.bytedance.tux.tooltip.h;
import com.ss.android.ugc.aweme.setting.bk;
import com.ss.android.ugc.aweme.setting.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ao {

    /* renamed from: a  reason: collision with root package name */
    public static final ao f142645a = new ao();

    private ao() {
    }

    static {
        Covode.recordClassIndex(93310);
    }

    public static boolean a(boolean z) {
        String str;
        if (bk.a()) {
            return false;
        }
        Keva repo = Keva.getRepo("repo_cur_video_page_i18n");
        if (z) {
            str = "multi_video_drag_showed";
        } else {
            str = "single_video_drag_showed";
        }
        if (!repo.getBoolean(str, false)) {
            return true;
        }
        return false;
    }

    public static void a(Activity activity, View view, boolean z) {
        String str;
        l.d(activity, "");
        l.d(view, "");
        if (z) {
            str = "multi_video_drag_showed";
        } else {
            str = "single_video_drag_showed";
        }
        Keva.getRepo("repo_cur_video_page_i18n").storeBoolean(str, true);
        a aVar = new a(activity);
        String string = activity.getString(R.string.d14, new Object[]{Long.valueOf(d.a() / 60000)});
        l.b(string, "");
        aVar.a(string).a(5000L).b(view).a(h.TOP).d().a();
    }
}
