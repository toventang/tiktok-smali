package com.ss.android.ugc.aweme.feed.background;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.ies.xelement.b.c;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.lang.reflect.Field;
import java.util.Objects;

public final class d implements com.bytedance.ies.xelement.b.c, ActivityStack.b {

    /* renamed from: a  reason: collision with root package name */
    private final h f92669a = i.a((h.f.a.a) a.f92670a);

    static {
        Covode.recordClassIndex(58773);
    }

    private final com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a<c.a> c() {
        return (com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a) this.f92669a.getValue();
    }

    static final class a extends m implements h.f.a.a<com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a<c.a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f92670a = new a();

        static {
            Covode.recordClassIndex(58774);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a<c.a> invoke() {
            return new com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a();
        }
    }

    @Override // com.bytedance.ies.xelement.b.c
    public final boolean bk_() {
        return ActivityStack.isAppBackGround();
    }

    public d() {
        ActivityStack.addAppBackGroundListener(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.ActivityStack.b
    public final void a() {
        c().a(b.f92671a);
    }

    @Override // com.ss.android.ugc.aweme.utils.ActivityStack.b
    public final void b() {
        c().a(c.f92672a);
    }

    @Override // com.bytedance.ies.xelement.b.c
    public final void bl_() {
        if (f.f34637l) {
            Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
            Object a3 = a(a2, "activity");
            Objects.requireNonNull(a3, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager activityManager = (ActivityManager) a3;
            Activity topActivity = ActivityStack.getTopActivity();
            if (topActivity != null) {
                activityManager.moveTaskToFront(topActivity.getTaskId(), 0);
                return;
            }
            Intent launchIntentForPackage = a2.getPackageManager().getLaunchIntentForPackage(a2.getPackageName());
            if (launchIntentForPackage != null) {
                com.ss.android.ugc.tiktok.security.a.a.a(launchIntentForPackage, a2);
                a2.startActivity(launchIntentForPackage);
            }
        }
    }

    static final class c extends m implements h.f.a.b<c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f92672a = new c();

        static {
            Covode.recordClassIndex(58776);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            l.d(aVar, "");
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f92671a = new b();

        static {
            Covode.recordClassIndex(58775);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.c();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.xelement.b.c
    public final void a(c.a aVar) {
        l.d(aVar, "");
        c().a(aVar);
    }

    @Override // com.bytedance.ies.xelement.b.c
    public final void b(c.a aVar) {
        l.d(aVar, "");
        c().b(aVar);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(8283);
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
                    MethodCollector.o(8283);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
