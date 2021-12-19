package com.ss.android.ugc.aweme.kids.commonfeed.a;

import android.app.Activity;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.kids.commonfeed.a.a;
import com.ss.android.ugc.aweme.utils.d.c;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f105970a;

    /* renamed from: b  reason: collision with root package name */
    private final int f105971b = 58;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup f105972c;

    /* renamed from: d  reason: collision with root package name */
    private final View f105973d;

    /* renamed from: e  reason: collision with root package name */
    private final View f105974e;

    /* renamed from: f  reason: collision with root package name */
    private final a.b f105975f;

    static {
        Covode.recordClassIndex(67807);
    }

    public b(Activity activity, ViewGroup viewGroup, View view, View view2, a.b bVar) {
        this.f105970a = activity;
        this.f105972c = viewGroup;
        this.f105973d = view;
        this.f105974e = view2;
        this.f105975f = bVar;
    }

    public final void run() {
        int a2;
        boolean z;
        Activity activity = this.f105970a;
        int i2 = this.f105971b;
        ViewGroup viewGroup = this.f105972c;
        View view = this.f105973d;
        View view2 = this.f105974e;
        a.b bVar = this.f105975f;
        if (activity != null) {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (a.a()) {
                try {
                    defaultDisplay.getRealMetrics(displayMetrics);
                } catch (Exception unused) {
                }
            } else {
                defaultDisplay.getMetrics(displayMetrics);
            }
            boolean z2 = true;
            boolean z3 = f.c() && a.a(activity);
            boolean z4 = f.c() && Build.VERSION.SDK_INT >= 28 && !a.a(activity);
            if (z3) {
                a2 = 0;
            } else {
                a2 = a.a(activity);
            }
            if (!c.c() || Build.VERSION.SDK_INT < 28 || (a.a() && Settings.Global.getInt(activity.getContentResolver(), "navigationbar_trigger_mode", 0) == 0 && Settings.Global.getInt(activity.getContentResolver(), "nav_fixed_mode", 0) == 0)) {
                z = false;
            } else {
                z = true;
            }
            if (!f.a() || Settings.Secure.getInt(activity.getContentResolver(), "display_notch_status", 0) != 0) {
                z2 = false;
            }
            int b2 = a.b(activity);
            int b3 = i.b();
            if ((z2 && b2 > 0) || z4 || z) {
                a2 -= b3;
            }
            com.ss.android.b.a.a.a.b(new c(activity, viewGroup, view, view2, displayMetrics, z2, a2, b3, n.a((double) i2), b2, bVar));
        }
    }
}
