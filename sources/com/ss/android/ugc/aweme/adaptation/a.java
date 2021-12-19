package com.ss.android.ugc.aweme.adaptation;

import android.app.Application;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.dg;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.ugc.tools.view.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f66177a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Keva f66178b;

    /* renamed from: c  reason: collision with root package name */
    private static Application f66179c = i.f115645a;

    private static boolean a(int i2, int i3) {
        return i3 * 9 > i2 * 16;
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(40687);
        Keva repo = Keva.getRepo("screen_adapt_repo");
        l.b(repo, "");
        f66178b = repo;
    }

    public static int c() {
        Application application = f66179c;
        l.b(application, "");
        return application.getResources().getDimensionPixelSize(R.dimen.e1);
    }

    public final synchronized int a() {
        int i2;
        MethodCollector.i(10659);
        i2 = f66178b.getInt("key_adapt_plan", 0);
        MethodCollector.o(10659);
        return i2;
    }

    public final synchronized int b() {
        int i2;
        MethodCollector.i(10660);
        i2 = f66178b.getInt("key_navibar_height", -1);
        MethodCollector.o(10660);
        return i2;
    }

    @Override // com.ss.android.ugc.tools.view.b
    public final int d() {
        int c2 = dh.c(f66179c);
        int a2 = a();
        if (a2 == 1 || a2 == 6 || a2 == 3 || a2 == 4) {
            return c2;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.tools.view.b
    public final boolean e() {
        if (a() == 1 || a() == 3 || a() == 4 || a() == 6) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.tools.view.b
    public final int f() {
        int c2 = c();
        int a2 = a();
        if (a2 == 1 || a2 == 2) {
            return c2;
        }
        if (a2 == 4 || a2 == 5) {
            return b() + c2;
        }
        if (a2 == 6 || a2 == 7) {
            return b();
        }
        return 0;
    }

    public final int b(int i2) {
        int c2 = dh.c(f66179c);
        int e2 = dh.e(f66179c);
        switch (a()) {
            case 1:
                return (e2 - c2) - i2;
            case 2:
                return e2 - i2;
            case 3:
                return e2 - c2;
            case 4:
                return ((e2 - b()) - c2) - i2;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return (e2 - b()) - i2;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return (e2 - b()) - c2;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                if (a(dh.b(f66179c), e2)) {
                    return e2 - b();
                }
                return e2;
            default:
                return e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r3 < r8) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        if (r3 < r8) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(int r11) {
        /*
        // Method dump skipped, instructions count: 175
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.adaptation.a.a(int):void");
    }

    @Override // com.ss.android.ugc.tools.view.b
    public final void a(View view, int i2, int i3) {
        int i4;
        int i5;
        if (view != null && i2 != 0 && i3 != 0) {
            int e2 = dh.e(f66179c);
            int b2 = dh.b(f66179c);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (a(b2, e2)) {
                i4 = d();
                e2 = b(c());
            } else {
                i4 = 0;
            }
            if (dg.a(i2, i3)) {
                layoutParams.height = e2;
                layoutParams.topMargin = i4;
                layoutParams.width = (e2 * i2) / i3;
                layoutParams.leftMargin = (dh.b(f66179c) - layoutParams.width) / 2;
            } else {
                layoutParams.width = b2;
                layoutParams.height = (b2 * i3) / i2;
                layoutParams.topMargin = i4 + ((e2 - layoutParams.height) / 2);
                if (layoutParams.topMargin >= 0) {
                    i5 = layoutParams.topMargin;
                } else {
                    i5 = 0;
                }
                layoutParams.topMargin = i5;
                layoutParams.leftMargin = 0;
            }
            q.a("ScreenSizeCompat: surfaceView height:" + layoutParams.height + ", width:" + layoutParams.width + ",plan=" + a() + " videoWidth：" + i2 + " x " + i3 + ", topMargin=" + layoutParams.topMargin);
            int i6 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(layoutParams.leftMargin);
            view.setLayoutParams(layoutParams);
        }
    }
}
