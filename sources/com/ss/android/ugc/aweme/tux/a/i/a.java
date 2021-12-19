package com.ss.android.ugc.aweme.tux.a.i;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.view.d;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.tux.c.e;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.lang.reflect.Field;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C3761a f141581b = new C3761a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private static long f141582e;

    /* renamed from: f  reason: collision with root package name */
    private static String f141583f;

    /* renamed from: g  reason: collision with root package name */
    private static final int f141584g = R.style.o1;

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.tux.g.b f141585a;

    /* renamed from: c  reason: collision with root package name */
    private String f141586c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f141587d;

    /* renamed from: com.ss.android.ugc.aweme.tux.a.i.a$a  reason: collision with other inner class name */
    public static final class C3761a {
        static {
            Covode.recordClassIndex(92515);
        }

        private C3761a() {
        }

        public /* synthetic */ C3761a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(92514);
    }

    private final boolean b() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f141582e <= InteractFirstFrameTimeOutDurationSetting.DEFAULT && TextUtils.equals(f141583f, this.f141586c)) {
            return true;
        }
        f141583f = this.f141586c;
        f141582e = currentTimeMillis;
        return false;
    }

    private final void c() {
        int i2;
        MethodCollector.i(5947);
        Context context = this.f141587d;
        if (context == null) {
            MethodCollector.o(5947);
        } else if (f.f34637l) {
            MethodCollector.o(5947);
        } else {
            d dVar = new d(context, f141584g);
            Toast toast = new Toast(dVar);
            toast.setDuration(0);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            toast.setGravity(55, 0, h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())));
            Object a2 = a(context, "layout_inflater");
            if (a2 != null) {
                View inflate = ((LayoutInflater) a2).inflate(R.layout.bhx, (ViewGroup) null);
                inflate.findViewById(R.id.dp0).setBackgroundDrawable(com.bytedance.tux.c.f.a(b.f141588a).a(dVar));
                TuxTextView tuxTextView = (TuxTextView) inflate.findViewById(R.id.exf);
                tuxTextView.setText(this.f141586c);
                Integer a3 = com.bytedance.tux.h.d.a(dVar, R.attr.aa);
                if (a3 != null) {
                    i2 = a3.intValue();
                } else {
                    i2 = -1;
                }
                tuxTextView.setTextColor(i2);
                toast.setView(inflate);
                a(toast);
                MethodCollector.o(5947);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
            MethodCollector.o(5947);
            throw nullPointerException;
        }
    }

    public final void a() {
        String str;
        if (!b() && (str = this.f141586c) != null && str.length() != 0) {
            com.bytedance.tux.g.b bVar = this.f141585a;
            if (bVar != null) {
                bVar.b();
                return;
            }
            try {
                c();
            } catch (Exception unused) {
            }
        }
    }

    public final a a(long j2) {
        com.bytedance.tux.g.b bVar = this.f141585a;
        if (bVar != null) {
            bVar.a(j2);
        }
        return this;
    }

    private static void a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            ic.a(toast);
        }
        toast.show();
    }

    public final a a(int i2) {
        String str;
        Resources resources;
        com.bytedance.tux.g.b bVar = this.f141585a;
        if (bVar != null) {
            bVar.e(i2);
        }
        Context context = this.f141587d;
        if (context == null || (resources = context.getResources()) == null) {
            str = null;
        } else {
            str = resources.getString(i2);
        }
        this.f141586c = str;
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            r3.f141587d = r4
            r0 = 0
            if (r4 == 0) goto L_0x0025
        L_0x0008:
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0026
            android.app.Activity r4 = (android.app.Activity) r4
            if (r4 == 0) goto L_0x0025
            com.bytedance.tux.g.b r1 = new com.bytedance.tux.g.b
            r1.<init>(r4)
            r3.f141585a = r1
            int r0 = com.ss.android.ugc.aweme.tux.a.i.a.f141584g
            r1.a(r0)
            com.bytedance.tux.g.b r2 = r3.f141585a
            if (r2 == 0) goto L_0x0025
            r0 = 2000(0x7d0, double:9.88E-321)
            r2.a(r0)
        L_0x0025:
            return
        L_0x0026:
            boolean r0 = r4 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x0025
            android.content.ContextWrapper r4 = (android.content.ContextWrapper) r4
            android.content.Context r4 = r4.getBaseContext()
            if (r4 == 0) goto L_0x0025
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tux.a.i.a.<init>(android.content.Context):void");
    }

    public final a a(CharSequence charSequence) {
        if (charSequence == null) {
            return this;
        }
        com.bytedance.tux.g.b bVar = this.f141585a;
        if (bVar != null) {
            bVar.a(charSequence);
        }
        this.f141586c = charSequence.toString();
        return this;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f141588a = new b();

        static {
            Covode.recordClassIndex(92516);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44776b = Integer.valueOf((int) R.attr.bl);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44777c = Float.valueOf(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            eVar2.f44782h = h.g.a.a(TypedValue.applyDimension(1, 36.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            eVar2.f44781g = h.g.a.a(TypedValue.applyDimension(1, 18.0f, system3.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(5997);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
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
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(5997);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
