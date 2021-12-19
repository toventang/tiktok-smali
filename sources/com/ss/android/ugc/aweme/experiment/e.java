package com.ss.android.ugc.aweme.experiment;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.ies.ugc.appcontext.d;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f89879a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f89880b;

    /* renamed from: c  reason: collision with root package name */
    public static final e f89881c = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(56444);
        boolean z = true;
        if (b.a().a(true, "ad_opt_webview_preload", 0) != 1 && !TextUtils.equals(d.s, "local_test")) {
            z = false;
        }
        f89880b = z;
    }
}
