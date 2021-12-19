package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;

final /* synthetic */ class t implements ICrashCallback {

    /* renamed from: a  reason: collision with root package name */
    private final Context f107995a;

    static {
        Covode.recordClassIndex(69232);
    }

    t(Context context) {
        this.f107995a = context;
    }

    @Override // com.bytedance.crash.ICrashCallback
    public final void onCrash(CrashType crashType, String str, Thread thread) {
        Context context = this.f107995a;
        if (str != null) {
            SplashAdServiceImpl.h().a(context, str);
        }
    }
}
