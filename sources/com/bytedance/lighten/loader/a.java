package com.bytedance.lighten.loader;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.facebook.c.a.e;
import com.facebook.c.a.j;
import com.facebook.imagepipeline.d.d;
import com.facebook.imagepipeline.d.h;
import com.facebook.imagepipeline.d.i;
import com.facebook.imagepipeline.d.q;
import com.facebook.imagepipeline.d.w;
import com.facebook.imagepipeline.j.c;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public h<e, c> f39951a;

    /* renamed from: b  reason: collision with root package name */
    public int f39952b;

    /* renamed from: c  reason: collision with root package name */
    private j f39953c;

    static {
        Covode.recordClassIndex(24635);
    }

    /* renamed from: com.bytedance.lighten.loader.a$a  reason: collision with other inner class name */
    public static final class C0978a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39959a = new a((byte) 0);

        static {
            Covode.recordClassIndex(24639);
        }
    }

    public final void a() {
        h<e, c> hVar = this.f39951a;
        if (hVar != null) {
            try {
                hVar.a();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private a() {
        int memoryClass;
        Context context = com.bytedance.lighten.a.h.f39857a;
        ActivityManager activityManager = (ActivityManager) z.a(context, "activity");
        if ((context.getApplicationInfo().flags & 1048576) != 0) {
            memoryClass = activityManager.getLargeMemoryClass();
        } else {
            memoryClass = activityManager.getMemoryClass();
        }
        int i2 = (int) ((((long) memoryClass) * 1048576) / 10);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) z.a(context, "window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i3 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4 * 4;
        if (i2 > i3) {
            i2 = i3;
        } else if (i2 < 6291456) {
            i2 = 6291456;
        }
        this.f39952b = i2;
        this.f39951a = new h<>(new w<c>() {
            /* class com.bytedance.lighten.loader.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(24637);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.facebook.imagepipeline.d.w
            public final /* synthetic */ int a(c cVar) {
                return cVar.b();
            }
        }, new d(), new i((ActivityManager) a(com.bytedance.lighten.a.h.f39857a, "activity")) {
            /* class com.bytedance.lighten.loader.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(24638);
            }

            @Override // com.facebook.imagepipeline.d.i
            /* renamed from: a */
            public final q b() {
                return new q(a.this.f39952b, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            }
        });
        l.a a2 = l.a(o.SERIAL);
        a2.f79173b = "bitmap-cache";
        this.f39953c = new j(g.a(a2.a()));
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final com.facebook.common.h.a<Bitmap> a(String str) {
        com.facebook.common.h.a<c> a2 = this.f39951a.a(new j(str));
        if (a2 != null) {
            return a(a2);
        }
        return null;
    }

    private static com.facebook.common.h.a<Bitmap> a(com.facebook.common.h.a<c> aVar) {
        com.facebook.imagepipeline.j.d dVar;
        try {
            if (com.facebook.common.h.a.a((com.facebook.common.h.a<?>) aVar) && (aVar.a() instanceof com.facebook.imagepipeline.j.d) && (dVar = (com.facebook.imagepipeline.j.d) aVar.a()) != null) {
                return dVar.f();
            }
            com.facebook.common.h.a.c(aVar);
            return null;
        } finally {
            com.facebook.common.h.a.c(aVar);
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9937);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
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
                    MethodCollector.o(9937);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r2 = r5.d().a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(final java.lang.String r4, com.facebook.imagepipeline.j.a r5) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            if (r5 == 0) goto L_0x0029
            com.facebook.imagepipeline.a.a.e r0 = r5.d()
            if (r0 == 0) goto L_0x0029
            com.facebook.imagepipeline.a.a.e r0 = r5.d()
            com.facebook.common.h.a r2 = r0.a()
            if (r2 == 0) goto L_0x0029
            boolean r0 = r2.d()
            if (r0 == 0) goto L_0x0029
            com.bytedance.lighten.loader.a$1 r1 = new com.bytedance.lighten.loader.a$1
            r1.<init>(r2, r4)
            com.bytedance.lighten.loader.j r0 = r3.f39953c
            b.i.b(r1, r0)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lighten.loader.a.a(java.lang.String, com.facebook.imagepipeline.j.a):void");
    }
}
