package com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.property.cj;
import com.ss.android.ugc.aweme.property.ck;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.c.b;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.utils.ad;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static int f126256a = en.a(56.0d, i.f115645a);

    /* renamed from: b  reason: collision with root package name */
    public static int f126257b = en.a(60.0d, i.f115645a);

    /* renamed from: c  reason: collision with root package name */
    public static int f126258c = en.a(30.0d, i.f115645a);

    /* renamed from: d  reason: collision with root package name */
    public static int f126259d = en.a(35.0d, i.f115645a);

    /* renamed from: e  reason: collision with root package name */
    public static final d f126260e = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(82877);
    }

    public static final long a() {
        if (b.a()) {
            return Math.min(com.ss.android.ugc.aweme.setting.d.a(), 900000L);
        }
        if (!cj.a()) {
            g.a().B();
        }
        return ck.a();
    }

    public static final void a(Context context) {
        l.d(context, "");
        Object a2 = a(context, "vibrator");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.os.Vibrator");
        ((Vibrator) a2).vibrate(10);
    }

    public static final MediaModel a(String str, CutMultiVideoViewModel cutMultiVideoViewModel) {
        l.d(str, "");
        l.d(cutMultiVideoViewModel, "");
        if (!cutMultiVideoViewModel.f125336k) {
            return ad.a(str);
        }
        MediaModel mediaModel = new MediaModel(-1);
        mediaModel.f109390b = str;
        mediaModel.f109400l = 720;
        mediaModel.f109401m = 1280;
        mediaModel.f109396h = (long) cutMultiVideoViewModel.f125337l;
        return mediaModel;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(5839);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(5839);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static boolean a(float f2, boolean z) {
        if (z || !b.a() || f2 <= 60.0f) {
            return false;
        }
        return true;
    }

    public static String a(Activity activity, float f2, boolean z) {
        l.d(activity, "");
        if (a(f2, z)) {
            int i2 = (int) f2;
            StringBuilder sb = new StringBuilder();
            String a2 = a.a(Locale.getDefault(), "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2 / 60)}, 1));
            l.b(a2, "");
            StringBuilder append = sb.append(a2).append(':');
            String a3 = a.a(Locale.getDefault(), "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2 % 60)}, 1));
            l.b(a3, "");
            String string = activity.getString(R.string.d15, new Object[]{append.append(a3).toString()});
            l.b(string, "");
            return string;
        }
        String a4 = a.a(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
        l.b(a4, "");
        String string2 = activity.getResources().getString(R.string.d6p, a4);
        l.b(string2, "");
        return string2;
    }
}
