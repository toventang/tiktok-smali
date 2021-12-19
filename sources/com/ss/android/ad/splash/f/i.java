package com.ss.android.ad.splash.f;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.m.p;
import h.w;
import java.lang.reflect.Field;
import java.util.Locale;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f58953a = {new y(ab.a(i.class), "isXm", "isXm()Z"), new y(ab.a(i.class), "isOplus", "isOplus()Z"), new y(ab.a(i.class), "isVi", "isVi()Z"), new y(ab.a(i.class), "isOp", "isOp()Z"), new y(ab.a(i.class), "isHave", "isHave()Z"), new y(ab.a(i.class), "isSsung", "isSsung()Z"), new y(ab.a(i.class), "isGoogle", "isGoogle()Z")};

    /* renamed from: b  reason: collision with root package name */
    static String f58954b;

    /* renamed from: c  reason: collision with root package name */
    public static final i f58955c = new i();

    /* renamed from: d  reason: collision with root package name */
    private static final h f58956d = h.i.a((h.f.a.a) g.f58969a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f58957e = h.i.a((h.f.a.a) d.f58966a);

    /* renamed from: f  reason: collision with root package name */
    private static final h f58958f = h.i.a((h.f.a.a) f.f58968a);

    /* renamed from: g  reason: collision with root package name */
    private static final h f58959g = h.i.a((h.f.a.a) c.f58965a);

    /* renamed from: h  reason: collision with root package name */
    private static final h f58960h = h.i.a((h.f.a.a) b.f58964a);

    /* renamed from: i  reason: collision with root package name */
    private static final h f58961i = h.i.a((h.f.a.a) e.f58967a);

    /* renamed from: j  reason: collision with root package name */
    private static final h f58962j = h.i.a((h.f.a.a) a.f58963a);

    private i() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f58963a = new a();

        static {
            Covode.recordClassIndex(36476);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(p.a((CharSequence) i.f58954b, (CharSequence) "google", false));
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f58966a = new d();

        static {
            Covode.recordClassIndex(36479);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(p.a((CharSequence) i.f58954b, (CharSequence) "oneplus", false));
        }
    }

    static final class e extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f58967a = new e();

        static {
            Covode.recordClassIndex(36480);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(p.a((CharSequence) i.f58954b, (CharSequence) "samsung", false));
        }
    }

    static final class f extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f58968a = new f();

        static {
            Covode.recordClassIndex(36481);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(p.a((CharSequence) i.f58954b, (CharSequence) "vivo", false));
        }
    }

    static final class g extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f58969a = new g();

        static {
            Covode.recordClassIndex(36482);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(p.a((CharSequence) i.f58954b, (CharSequence) "xiaomi", false));
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f58964a = new b();

        static {
            Covode.recordClassIndex(36477);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (p.a((CharSequence) i.f58954b, (CharSequence) "huawei", false) || p.a((CharSequence) i.f58954b, (CharSequence) "honor", false)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f58965a = new c();

        static {
            Covode.recordClassIndex(36478);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (p.a((CharSequence) i.f58954b, (CharSequence) "oppo", false) || p.a((CharSequence) i.f58954b, (CharSequence) "realme", false)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(36475);
        String str = Build.BRAND;
        l.a((Object) str, "");
        Locale locale = Locale.getDefault();
        l.a((Object) locale, "");
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            l.a((Object) lowerCase, "");
            f58954b = lowerCase;
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    public static int a(Context context) {
        int identifier;
        com.ss.android.ad.splash.core.w a2 = com.ss.android.ad.splash.core.h.a();
        l.a((Object) a2, "");
        if (!a2.r) {
            return o.c(context);
        }
        if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        if (android.provider.Settings.Secure.getInt(r9.getContentResolver(), "buttons_show_on_screen_navkeys", 0) != 0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        if (r1 != 0) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0100, code lost:
        if (((java.lang.Boolean) com.ss.android.ad.splash.f.i.f58962j.getValue()).booleanValue() != false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(android.content.Context r9) {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.f.i.b(android.content.Context):int");
    }

    static int a(Context context, boolean z) {
        if (context == null) {
            return 0;
        }
        Object a2 = a(context, "window");
        if (a2 != null) {
            Display defaultDisplay = ((WindowManager) a2).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            int i2 = Build.VERSION.SDK_INT;
            defaultDisplay.getRealMetrics(displayMetrics);
            if (z) {
                int i3 = displayMetrics.heightPixels;
                if (i3 != 0) {
                    return i3;
                }
                Resources resources = context.getResources();
                l.a((Object) resources, "");
                DisplayMetrics displayMetrics2 = resources.getDisplayMetrics();
                if (displayMetrics2 != null) {
                    return displayMetrics2.heightPixels;
                }
                return 0;
            }
            int i4 = displayMetrics.widthPixels;
            if (i4 != 0) {
                return i4;
            }
            com.ss.android.ad.splash.core.w a3 = com.ss.android.ad.splash.core.h.a();
            l.a((Object) a3, "");
            if (!a3.r) {
                return o.a(context);
            }
            Resources resources2 = context.getResources();
            l.a((Object) resources2, "");
            DisplayMetrics displayMetrics3 = resources2.getDisplayMetrics();
            if (displayMetrics3 != null) {
                return displayMetrics3.widthPixels;
            }
            return 0;
        }
        throw new w("null cannot be cast to non-null type");
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3642);
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
                            com.bytedance.crash.c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(3642);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
