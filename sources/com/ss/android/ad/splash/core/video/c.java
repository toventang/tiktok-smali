package com.ss.android.ad.splash.core.video;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.core.h;
import com.ss.android.ad.splash.core.video.a.b;
import com.ss.android.ad.splash.core.video.a.d;
import com.ss.android.ad.splash.f.g;
import com.ss.android.ad.splash.f.q;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class c implements b.a, b.AbstractC1287b, b.c, b.d, b.e, b.f, q.a {

    /* renamed from: m  reason: collision with root package name */
    private static boolean f58740m;
    private static Map<Integer, Integer> n = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public b f58741a;

    /* renamed from: b  reason: collision with root package name */
    public int f58742b;

    /* renamed from: c  reason: collision with root package name */
    long f58743c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f58744d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f58745e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f58746f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f58747g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f58748h;

    /* renamed from: i  reason: collision with root package name */
    private Handler f58749i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<Runnable> f58750j;

    /* renamed from: k  reason: collision with root package name */
    private int f58751k;

    /* renamed from: l  reason: collision with root package name */
    private int f58752l;
    private final Set<SurfaceTexture> o;
    private final Object p;
    private StringBuilder q;

    @Override // com.ss.android.ad.splash.core.video.a.b.d
    public final boolean a(int i2, int i3) {
        this.f58742b = 200;
        Integer num = n.get(Integer.valueOf(this.f58751k));
        if (num == null) {
            n.put(Integer.valueOf(this.f58751k), 1);
        } else {
            n.put(Integer.valueOf(this.f58751k), Integer.valueOf(num.intValue() + 1));
        }
        Handler handler = this.f58749i;
        if (handler == null) {
            return false;
        }
        handler.obtainMessage(303, i2, i3).sendToTarget();
        return false;
    }

    @Override // com.ss.android.ad.splash.core.video.a.b.e
    public final boolean a(b bVar, int i2, int i3) {
        Handler handler;
        if (this.f58741a == bVar && (handler = this.f58749i) != null) {
            handler.obtainMessage(304, i2, i3).sendToTarget();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a(Runnable runnable) {
        if (!this.f58748h) {
            runnable.run();
            return;
        }
        if (this.f58750j == null) {
            this.f58750j = new ArrayList<>();
        }
        this.f58750j.add(runnable);
    }

    static {
        Covode.recordClassIndex(36399);
    }

    private void g() {
        if (f58740m) {
            a(this.f58752l);
            f58740m = false;
        }
    }

    @Override // com.ss.android.ad.splash.core.video.a.b.a
    public final void f() {
        Handler handler = this.f58749i;
        if (handler != null) {
            handler.sendEmptyMessage(306);
        }
    }

    public final void b() {
        this.f58744d.removeMessages(100);
        this.f58745e = true;
        this.f58744d.sendEmptyMessage(101);
    }

    private void h() {
        MethodCollector.i(3527);
        Handler handler = this.f58744d;
        if (handler != null) {
            handler.removeMessages(201);
        }
        synchronized (this.p) {
            try {
                if (this.q != null) {
                    this.q = null;
                }
            } finally {
                MethodCollector.o(3527);
            }
        }
    }

    public final void c() {
        this.f58742b = 203;
        if (this.f58741a != null) {
            ArrayList<Runnable> arrayList = this.f58750j;
            if (arrayList != null && !arrayList.isEmpty()) {
                this.f58750j.clear();
            }
            if (this.f58744d != null) {
                try {
                    h();
                    this.f58744d.removeCallbacksAndMessages(null);
                    this.f58748h = true;
                    this.f58744d.sendEmptyMessage(103);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.ss.android.ad.splash.core.video.a.b.c
    public final void d() {
        int i2;
        if (!this.f58746f) {
            i2 = 209;
        } else {
            i2 = 206;
        }
        this.f58742b = i2;
        n.remove(Integer.valueOf(this.f58751k));
        Handler handler = this.f58749i;
        if (handler != null) {
            handler.obtainMessage(302).sendToTarget();
        }
        h();
    }

    @Override // com.ss.android.ad.splash.core.video.a.b.f
    public final void e() {
        this.f58742b = 205;
        if (this.f58745e) {
            this.f58744d.post(new Runnable() {
                /* class com.ss.android.ad.splash.core.video.c.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(36403);
                }

                public final void run() {
                    try {
                        c.this.f58741a.b();
                        c.this.f58742b = 207;
                        c.this.f58745e = false;
                    } catch (Exception unused) {
                    }
                }
            });
        } else {
            Handler handler = this.f58744d;
            handler.sendMessage(handler.obtainMessage(100, -1, -1));
        }
        n.remove(Integer.valueOf(this.f58751k));
        Handler handler2 = this.f58749i;
        if (handler2 != null) {
            handler2.sendEmptyMessage(305);
        }
    }

    public final void a() {
        if (this.f58741a == null) {
            g.b("SSMediaPlayerWrapper use System Mediaplayer");
            d dVar = new d();
            this.f58741a = dVar;
            dVar.a((b.f) this);
            this.f58741a.a((b.c) this);
            this.f58741a.a((b.d) this);
            this.f58741a.a((b.AbstractC1287b) this);
            this.f58741a.a((b.a) this);
            this.f58741a.a((b.e) this);
            this.f58741a.a(this.f58746f);
            this.f58747g = false;
        }
    }

    public c(Handler handler) {
        this(handler, (byte) 0);
    }

    private static void a(int i2) {
        AudioManager audioManager = (AudioManager) a(h.r, DataType.AUDIO);
        if (audioManager != null) {
            audioManager.setStreamVolume(3, i2, 0);
        }
    }

    private boolean a(SurfaceTexture surfaceTexture) {
        boolean contains;
        MethodCollector.i(2945);
        synchronized (this.o) {
            try {
                contains = this.o.contains(surfaceTexture);
            } finally {
                MethodCollector.o(2945);
            }
        }
        return contains;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0233, code lost:
        if (0 == 0) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x023d  */
    @Override // com.ss.android.ad.splash.f.q.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.os.Message r17) {
        /*
        // Method dump skipped, instructions count: 616
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.video.c.a(android.os.Message):void");
    }

    private c(Handler handler, byte b2) {
        this.f58742b = 201;
        this.f58743c = -1;
        this.o = new HashSet();
        this.p = new Object();
        this.q = null;
        this.f58751k = 0;
        this.f58749i = handler;
        HandlerThread handlerThread = new HandlerThread("VideoManager");
        handlerThread.start();
        this.f58744d = new q(handlerThread.getLooper(), this);
        a();
    }

    private void a(int i2, Object obj) {
        if (i2 == 309) {
            g();
        }
        Handler handler = this.f58749i;
        if (handler != null) {
            handler.obtainMessage(i2, obj).sendToTarget();
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3526);
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
                    MethodCollector.o(3526);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.ss.android.ad.splash.core.video.a.b.AbstractC1287b
    public final void a(b bVar, int i2) {
        Handler handler;
        if (this.f58741a == bVar && (handler = this.f58749i) != null) {
            handler.obtainMessage(301, Integer.valueOf(i2)).sendToTarget();
        }
    }
}
