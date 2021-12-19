package com.ss.android.ugc.aweme.feed.x;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.main.MainPageExperimentServiceImpl;
import h.f.b.l;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public static final ad f95295a = new ad();

    private ad() {
    }

    static {
        Covode.recordClassIndex(60363);
    }

    public static final boolean a(String str) {
        l.d(str, "");
        if (TextUtils.equals(str, "homepage_hot")) {
            return true;
        }
        l.b(MainPageExperimentServiceImpl.b(), "");
        if (TextUtils.equals(str, "homepage_follow")) {
            return true;
        }
        return b.a().a(true, "show_global_multi_func", false);
    }
}
