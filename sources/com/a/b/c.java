package com.a.b;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.nita.api.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static Context f4931a;

    /* renamed from: b  reason: collision with root package name */
    public static d f4932b;

    static {
        Covode.recordClassIndex(2040);
    }

    public static void a(int i2) {
        a a2 = b.a(i2);
        if (a2 != null) {
            com.bytedance.nita.c.a.a(a2.f41611a, i2);
        }
    }

    public static void a(Context context) {
        a(context, (int) R.layout.a3e);
        d dVar = f4932b;
        if (dVar != null && dVar.f4935c && f4932b.f4936d) {
            com.bytedance.nita.e.a.f41650b.a().execute(new Runnable() {
                /* class com.a.b.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(2041);
                }

                public final void run() {
                    if (a.f4925b) {
                        try {
                            Class.forName("androidx.core.h.v");
                            Class.forName("androidx.appcompat.widget.j");
                            Class.forName("androidx.appcompat.widget.AppCompatImageView");
                            Class.forName("androidx.appcompat.widget.AppCompatTextView");
                            Class.forName("androidx.appcompat.widget.ContentFrameLayout");
                            Class.forName("androidx.appcompat.widget.FitWindowsFrameLayout");
                            Class.forName("androidx.appcompat.widget.ai");
                            Class.forName("androidx.appcompat.widget.ViewStubCompat");
                            Class.forName("androidx.appcompat.widget.s");
                            Class.forName("androidx.appcompat.widget.t");
                        } catch (Exception e2) {
                            e2.getCause();
                        }
                        try {
                            Class.forName("android.widget.LinearLayout");
                            Class.forName("com.ss.android.ugc.aweme.tux.a.j.a");
                            Class.forName("com.bytedance.android.livesdk.ui.a.a");
                            Class.forName("android.widget.FrameLayout");
                            Class.forName("com.a.a.a.a.a");
                            Class.forName("com.ss.android.ugc.aweme.tux.a.j.b");
                            Class.forName("com.ss.android.ugc.aweme.tux.a.j.d");
                            Class.forName("com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout");
                            Class.forName("com.ss.android.ugc.aweme.tux.a.j.f");
                            Class.forName("com.ss.android.ugc.aweme.ecommerce.review.view.b");
                            Class.forName("com.bytedance.ies.uikit.tabhost.FragmentTabHost");
                            Class.forName("androidx.constraintlayout.widget.ConstraintLayout");
                            Class.forName("com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer");
                            Class.forName("com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer");
                            Class.forName("com.bytedance.ies.dmt.ui.gesture.GestureFrameLayout");
                            Class.forName("android.widget.RelativeLayout");
                            Class.forName("com.bytedance.lighten.loader.SmartImageView");
                            Class.forName("com.bytedance.tux.badge.TuxAlertBadgeLayout");
                            Class.forName("com.bytedance.android.livesdk.widget.GestureDetectLayout");
                            Class.forName("com.ss.android.ugc.aweme.tux.a.j.e");
                            Class.forName("com.ss.android.ugc.aweme.tux.business.a.a");
                            Class.forName("com.bytedance.android.livesdk.widget.SafeFrameLayout");
                            Class.forName("android.view.a");
                            Class.forName("com.a.b.b.a");
                            Class.forName("com.a.b.a.a");
                            Class.forName("com.a.b.a.a$c");
                            Class.forName("com.a.b.a.a$b");
                            Class.forName("com.a.b.a.a$d");
                            Class.forName("com.a.b.a.a$a");
                            Class.forName("h.f.b.l");
                            Class.forName("h.m.y");
                            Class.forName("h.m.z");
                        } catch (Exception e3) {
                            e3.getCause();
                            e3.getMessage();
                        }
                    }
                }
            });
        }
    }

    public static void a(String str) {
        a a2 = b.a(str);
        if (a2 != null) {
            com.bytedance.nita.c.a.a(a2.f41611a, a2.f41612b[0]);
        }
    }

    public static View a(Activity activity, int i2) {
        MethodCollector.i(6871);
        View a2 = a(activity, i2, new FrameLayout(activity), false);
        MethodCollector.o(6871);
        return a2;
    }

    public static boolean b(Context context, String str) {
        a a2 = b.a(str);
        if (a2 == null) {
            return false;
        }
        String str2 = a2.f41611a;
        int i2 = a2.f41612b[0];
        l.c(str2, "");
        return com.bytedance.nita.c.a.a(str2, i2, context);
    }

    public static void a(Context context, int i2) {
        a a2;
        d dVar = f4932b;
        if (dVar != null && dVar.f4937e && (a2 = b.a(i2)) != null) {
            a2.a(context);
        }
    }

    public static void a(Context context, String str) {
        d dVar = f4932b;
        if (dVar != null && dVar.f4937e && b.a(str) != null) {
            b.a(str).a(context);
        }
    }

    public static View a(Activity activity, int i2, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(6877);
        a a2 = b.a(i2);
        if (f4932b == null || a2 == null) {
            View a3 = com.a.a(LayoutInflater.from(activity), i2, viewGroup, z);
            MethodCollector.o(6877);
            return a3;
        }
        View a4 = b.a(i2).a(i2, activity);
        if (viewGroup == null || !z) {
            MethodCollector.o(6877);
            return a4;
        }
        viewGroup.addView(a4, a4.getLayoutParams());
        MethodCollector.o(6877);
        return viewGroup;
    }
}
