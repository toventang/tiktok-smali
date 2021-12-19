package com.ss.android.ugc.aweme.feed.helper;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.adaptation.j;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.feed.model.OcrLocation;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.sticker.k.d;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    protected static int f93317a;

    /* renamed from: b  reason: collision with root package name */
    protected static int f93318b;

    /* renamed from: c  reason: collision with root package name */
    public static int f93319c;

    /* renamed from: f  reason: collision with root package name */
    private static int f93320f;

    /* renamed from: g  reason: collision with root package name */
    private static int f93321g;

    /* renamed from: d  reason: collision with root package name */
    public int f93322d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f93323e = -1;

    static {
        Covode.recordClassIndex(59158);
    }

    public static int a() {
        return f93317a;
    }

    public final void a(Context context, Video video, View view, OcrLocation ocrLocation) {
        if (video != null) {
            if (com.ss.android.ugc.aweme.adaptation.c.f66194d) {
                b(context, view, video.getWidth(), video.getHeight());
            } else {
                a(context, view, video.getWidth(), video.getHeight());
            }
        }
    }

    private static int c() {
        return (b() - com.ss.android.ugc.aweme.adaptation.c.a()) - c.b.f66221a.f66200i;
    }

    private static int d() {
        return b() - c.b.f66221a.f66198g;
    }

    public static int b() {
        if (Build.VERSION.SDK_INT < 28 || !c.b.f66221a.r) {
            return f93321g;
        }
        return f93318b;
    }

    public static void a(Context context) {
        try {
            f93319c = n.e(context);
            f93320f = i.c();
            c(context);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(View view) {
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        }
        if (view.getLayoutParams().width != -1 || view.getLayoutParams().height != -1) {
            view.getLayoutParams().width = -1;
            view.getLayoutParams().height = -1;
            view.requestLayout();
        }
    }

    public static int b(Context context) {
        if (context == null) {
            return 3;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (f93318b == 0 || f93317a == 0) {
            c(context);
        }
        int i3 = f93317a;
        double d2 = (double) i3;
        int i4 = f93318b;
        double d3 = (double) i4;
        Double.isNaN(d2);
        Double.isNaN(d3);
        if (d2 / d3 <= 0.5d) {
            return 1;
        }
        double d4 = (double) i3;
        double d5 = (double) i4;
        Double.isNaN(d4);
        Double.isNaN(d5);
        if (d4 / d5 >= 0.6666666666666666d) {
            return 2;
        }
        return 3;
    }

    private static void c(Context context) {
        if (j.a()) {
            int i2 = Build.VERSION.SDK_INT;
            Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            f93321g = displayMetrics.heightPixels;
            f93318b = j.b();
            f93317a = j.c();
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        Display defaultDisplay2 = ((Activity) context).getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay2.getRealMetrics(displayMetrics2);
        f93321g = displayMetrics2.heightPixels;
        f93318b = displayMetrics2.heightPixels + f93319c;
        f93317a = displayMetrics2.widthPixels;
    }

    public final d.a a(Context context, Video video) {
        MethodCollector.i(8947);
        if (video == null) {
            MethodCollector.o(8947);
            return null;
        }
        d.a aVar = new d.a(video.getWidth(), video.getHeight());
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(0, 0));
        if (com.ss.android.ugc.aweme.adaptation.c.f66194d) {
            b(context, view, video.getWidth(), video.getHeight(), aVar);
        } else {
            a(context, view, video.getWidth(), video.getHeight(), aVar);
        }
        MethodCollector.o(8947);
        return aVar;
    }

    private static void a(View view, int i2, int i3) {
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.width == i3 && marginLayoutParams.height == i2) {
                int i4 = Build.VERSION.SDK_INT;
                return;
            }
            marginLayoutParams.width = i3;
            marginLayoutParams.height = i2;
            view.setLayoutParams(marginLayoutParams);
            view.setRotation(0.0f);
        }
    }

    private void b(Context context, View view, int i2, int i3) {
        b(context, view, i2, i3, null);
    }

    public final void a(Context context, View view, int i2, int i3) {
        a(context, view, i2, i3, (d.a) null);
    }

    private void b(Context context, View view, int i2, int i3, d.a aVar) {
        int i4 = Build.VERSION.SDK_INT;
        if (f93318b == 0 || f93317a == 0) {
            c(context);
        }
        int i5 = c.b.f66221a.f66201j;
        int i6 = f93317a;
        double d2 = (double) i6;
        int i7 = f93318b;
        double d3 = (double) i7;
        Double.isNaN(d2);
        Double.isNaN(d3);
        if (d2 / d3 <= 0.5d) {
            c(view, i2, i3, i5, i6, aVar);
            return;
        }
        double d4 = (double) i6;
        double d5 = (double) i7;
        Double.isNaN(d4);
        Double.isNaN(d5);
        if (d4 / d5 >= 0.6666666666666666d) {
            a(view, i2, i3, i6, i7, aVar);
        } else {
            b(view, i2, i3, i5, i6, aVar);
        }
    }

    private void a(Context context, View view, int i2, int i3, d.a aVar) {
        int i4;
        int i5 = Build.VERSION.SDK_INT;
        if (f93318b == 0 || f93317a == 0) {
            c(context);
        }
        int i6 = f93317a;
        double d2 = (double) i6;
        int i7 = f93318b;
        double d3 = (double) i7;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 / d3;
        int i8 = 0;
        if (d4 <= 0.5d) {
            if (c.b.f66221a.f66199h != 0) {
                i4 = c.b.f66221a.f66201j;
                if (i4 == 0) {
                    i4 = b() - c.b.f66221a.f66198g;
                }
                c(view, i2, i3, i4, f93317a, aVar);
            } else if (c.b.f66221a.q) {
                i4 = c();
            } else {
                i4 = d();
            }
            if (!c.b.f66221a.f66202k) {
                i4 -= c.b.f66221a.f66199h;
            }
            c(view, i2, i3, i4, f93317a, aVar);
        } else if (d4 >= 0.6666666666666666d) {
            a(view, i2, i3, i6, i7, aVar);
        } else {
            int i9 = f93321g;
            if (c.b.f66221a.q) {
                i8 = com.ss.android.ugc.aweme.adaptation.c.a();
            }
            b(view, i2, i3, (i9 - i8) - c.b.f66221a.f66198g, f93317a, aVar);
        }
    }

    public final void a(Context context, Video video, View view, View view2, OcrLocation ocrLocation) {
        if (video != null) {
            if (com.ss.android.ugc.aweme.adaptation.c.f66194d) {
                b(context, view, video.getWidth(), video.getHeight());
                b(context, view2, video.getWidth(), video.getHeight());
                return;
            }
            a(context, view, video.getWidth(), video.getHeight());
            a(context, view2, video.getWidth(), video.getHeight());
        }
    }

    private void b(View view, int i2, int i3, int i4, int i5, d.a aVar) {
        double d2 = (double) i2;
        double d3 = (double) i3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 / d3;
        double d5 = (double) i5;
        double d6 = (double) i4;
        Double.isNaN(d5);
        Double.isNaN(d6);
        double d7 = d5 / d6;
        if (d4 > 0.5625d || d7 > 0.5625d || d4 < 0.4699999988079071d) {
            if (i2 <= 0 || i3 <= 0) {
                i4 = i5;
            } else {
                i4 = (i3 * i5) / i2;
            }
        } else if (i2 <= 0 || i3 <= 0) {
            i5 = i4;
        } else {
            i5 = (i2 * i4) / i3;
        }
        if (aVar != null) {
            aVar.f134941a = i5;
            aVar.f134942b = i4;
        }
        this.f93323e = i5;
        this.f93322d = i4;
        if (view != null) {
            a(view, i4, i5);
        }
    }

    private void c(View view, int i2, int i3, int i4, int i5, d.a aVar) {
        double d2 = (double) i2;
        double d3 = (double) i3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 / d3;
        double d5 = (double) i5;
        double d6 = (double) i4;
        Double.isNaN(d5);
        Double.isNaN(d6);
        double d7 = d5 / d6;
        if (d4 > 0.625d || d7 > 0.625d || d4 < 0.4699999988079071d) {
            if (i2 <= 0 || i3 <= 0) {
                i4 = i5;
            } else {
                i4 = (i3 * i5) / i2;
            }
        } else if (i2 <= 0 || i3 <= 0) {
            i5 = i4;
        } else {
            i5 = (i2 * i4) / i3;
        }
        if (aVar != null) {
            aVar.f134941a = i5;
            aVar.f134942b = i4;
        }
        this.f93322d = i4;
        this.f93323e = i5;
        if (view != null) {
            a(view, i4, i5);
        }
    }

    private static void a(View view, int i2, int i3, int i4, int i5, d.a aVar) {
        double d2 = (double) i2;
        double d3 = (double) i3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        if (d2 / d3 > 1.0d) {
            if (i2 <= 0 || i3 <= 0) {
                i5 = i4;
            } else {
                i5 = (i3 * i4) / i2;
            }
        } else if (i2 <= 0 || i3 <= 0) {
            i4 = i5;
        } else {
            i4 = (i2 * i5) / i3;
        }
        if (aVar != null) {
            aVar.f134941a = i4;
            aVar.f134942b = i5;
        }
        a(view, i5, i4);
    }
}
