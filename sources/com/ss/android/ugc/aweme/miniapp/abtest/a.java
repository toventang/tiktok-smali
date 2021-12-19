package com.ss.android.ugc.aweme.miniapp.abtest;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.miniapp.utils.MiniAppInitTask;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f109638a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f109639b;

    private a() {
    }

    static {
        Covode.recordClassIndex(70163);
    }

    static void a(ae aeVar) {
        if (!f109639b) {
            f.e().a(new MiniAppInitTask(aeVar)).a();
            f109639b = true;
        }
    }
}
