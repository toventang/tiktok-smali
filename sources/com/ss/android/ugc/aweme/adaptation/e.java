package com.ss.android.ugc.aweme.adaptation;

import android.app.Activity;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.framework.a.a;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f66227a;

    /* renamed from: b  reason: collision with root package name */
    private final int f66228b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup f66229c;

    /* renamed from: d  reason: collision with root package name */
    private final View f66230d;

    /* renamed from: e  reason: collision with root package name */
    private final View f66231e;

    /* renamed from: f  reason: collision with root package name */
    private final c.e f66232f;

    static {
        Covode.recordClassIndex(40702);
    }

    public e(Activity activity, int i2, ViewGroup viewGroup, View view, View view2, c.e eVar) {
        this.f66227a = activity;
        this.f66228b = i2;
        this.f66229c = viewGroup;
        this.f66230d = view;
        this.f66231e = view2;
        this.f66232f = eVar;
    }

    public final void run() {
        int a2;
        Activity activity = this.f66227a;
        int i2 = this.f66228b;
        ViewGroup viewGroup = this.f66229c;
        View view = this.f66230d;
        View view2 = this.f66231e;
        c.e eVar = this.f66232f;
        if (activity != null) {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (c.b()) {
                try {
                    defaultDisplay.getRealMetrics(displayMetrics);
                } catch (Exception e2) {
                    a.a((Throwable) e2);
                }
            } else {
                defaultDisplay.getMetrics(displayMetrics);
            }
            boolean z = true;
            boolean z2 = f.c() && c.a(activity);
            boolean z3 = f.c() && Build.VERSION.SDK_INT >= 28 && !c.a(activity);
            if (z2) {
                a2 = 0;
            } else {
                a2 = c.a(activity);
            }
            if (!com.ss.android.ugc.aweme.utils.d.c.c() || Build.VERSION.SDK_INT < 28 || (c.b() && Settings.Global.getInt(activity.getContentResolver(), "navigationbar_trigger_mode", 0) == 0 && Settings.Global.getInt(activity.getContentResolver(), "nav_fixed_mode", 0) == 0)) {
                z = false;
            }
            boolean b2 = c.b(activity);
            int c2 = c.c(activity);
            int b3 = i.b();
            if ((b2 && c2 > 0) || z3 || z) {
                a2 -= b3;
            }
            com.ss.android.b.a.a.a.b(new g(activity, viewGroup, view, view2, displayMetrics, b2, a2, b3, n.a((double) i2), c2, eVar));
        }
    }
}
