package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.crossplatform.activity.v;
import com.ss.android.ugc.aweme.crossplatform.activity.w;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final g f44254a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f44255b;

    /* renamed from: c  reason: collision with root package name */
    private final String f44256c;

    static {
        Covode.recordClassIndex(27118);
    }

    j(g gVar, boolean z, String str) {
        this.f44254a = gVar;
        this.f44255b = z;
        this.f44256c = str;
    }

    public final void run() {
        MethodCollector.i(4432);
        g gVar = this.f44254a;
        boolean z = this.f44255b;
        String str = this.f44256c;
        if (gVar.e()) {
            if (z) {
                gVar.f44248a = v.a().b(gVar.f44249b.getActivity());
                if (!(gVar.f44249b.h() == null || gVar.f44248a == null)) {
                    gVar.f44249b.h().addView(gVar.f44248a);
                    gVar.f44248a.loadUrl(str + "&cov_webview_prerender_time=" + System.currentTimeMillis() + "&cov19_render_no_need_load=1");
                    MethodCollector.o(4432);
                    return;
                }
            } else {
                v a2 = v.a();
                if (Build.VERSION.SDK_INT >= 23 && !a2.c() && a2.f78577a.size() < a2.f78580d) {
                    d.a().getMainLooper().getQueue().addIdleHandler(new w(a2));
                }
            }
        }
        MethodCollector.o(4432);
    }
}
