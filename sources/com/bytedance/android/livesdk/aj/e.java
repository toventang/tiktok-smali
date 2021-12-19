package com.bytedance.android.livesdk.aj;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.view.ViewGroup;
import com.bytedance.android.live.i.a.b;
import com.bytedance.android.livesdk.aj.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final d.AnonymousClass1 f13827a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13828b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f13829c;

    /* renamed from: d  reason: collision with root package name */
    private final GLSurfaceView f13830d;

    static {
        Covode.recordClassIndex(7688);
    }

    e(d.AnonymousClass1 r1, String str, Activity activity, GLSurfaceView gLSurfaceView) {
        this.f13827a = r1;
        this.f13828b = str;
        this.f13829c = activity;
        this.f13830d = gLSurfaceView;
    }

    public final void run() {
        ViewGroup viewGroup;
        MethodCollector.i(2530);
        d.AnonymousClass1 r4 = this.f13827a;
        String str = this.f13828b;
        Activity activity = this.f13829c;
        GLSurfaceView gLSurfaceView = this.f13830d;
        b.a aVar = null;
        if (str != null) {
            d.f13821a = str;
            com.bytedance.ies.f.b.a(activity, com.bytedance.ies.f.b.f33816b).a("hardware_info_gpu_name", (Object) str).a();
            if (d.this.f13824d != null) {
                aVar = d.this.f13824d.get();
            }
            d.a(aVar, d.f13821a);
        }
        if (!(d.this.f13823c == null || (viewGroup = d.this.f13823c.get()) == null)) {
            viewGroup.removeView(gLSurfaceView);
        }
        MethodCollector.o(2530);
    }
}
