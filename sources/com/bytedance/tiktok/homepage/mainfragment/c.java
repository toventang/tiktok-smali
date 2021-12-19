package com.bytedance.tiktok.homepage.mainfragment;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f44199a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f44200b;

    static {
        Covode.recordClassIndex(27078);
    }

    public c(a aVar, Activity activity) {
        this.f44199a = aVar;
        this.f44200b = activity;
    }

    public final void run() {
        a aVar = this.f44199a;
        Activity activity = this.f44200b;
        if (aVar.f44192a.ab_()) {
            if (!AVExternalServiceImpl.a().publishService().isPublishServiceRunning(d.a()) && (activity instanceof MainActivity) && !a.c().a(1)) {
                aVar.a(null, false, "AvApiFragmentObserver onAttach", null);
            }
        }
    }
}
