package com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.b;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.utils.hh;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f34967a;

    /* renamed from: b  reason: collision with root package name */
    private View f34968b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f34969c;

    /* renamed from: d  reason: collision with root package name */
    private int f34970d = -1;

    static {
        Covode.recordClassIndex(20983);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.b
    public final void b() {
        View view;
        MethodCollector.i(11102);
        ViewGroup viewGroup = this.f34967a;
        if (!(viewGroup == null || (view = this.f34968b) == null)) {
            viewGroup.removeView(view);
            int i2 = this.f34970d;
            if (i2 != -1) {
                hh.a(this.f34969c, i2);
                this.f34970d = -1;
            }
        }
        ALog.d("awesome_splash", "removeSplashLoadMask");
        MethodCollector.o(11102);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0069, code lost:
        if (r0 == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009f, code lost:
        if (r5.equals("honor") != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c8, code lost:
        if (r5.equals("huawei") != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ca, code lost:
        r0 = com.bytedance.ies.ugc.aweme.commercialize.splash.f.h.b(r4);
     */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 264
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.a.a():void");
    }

    public a(Activity activity) {
        this.f34969c = activity;
    }
}
