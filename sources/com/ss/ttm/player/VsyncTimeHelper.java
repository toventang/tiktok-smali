package com.ss.ttm.player;

import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.ttm.a.e;
import java.lang.reflect.Field;

public final class VsyncTimeHelper {

    /* renamed from: a  reason: collision with root package name */
    private final WindowManager f152006a;

    /* renamed from: b  reason: collision with root package name */
    private final b f152007b;

    /* renamed from: c  reason: collision with root package name */
    private final a f152008c;

    /* renamed from: d  reason: collision with root package name */
    private long f152009d;

    static {
        Covode.recordClassIndex(101324);
    }

    public final long getVsyncDurationNs() {
        return this.f152009d;
    }

    public final int getLowestUIFps() {
        return this.f152007b.f152018f;
    }

    public final int getUIFps() {
        return this.f152007b.f152017e;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Handler.Callback, Choreographer.FrameCallback {

        /* renamed from: g  reason: collision with root package name */
        public static final b f152012g = new b();

        /* renamed from: a  reason: collision with root package name */
        public volatile long f152013a = -9223372036854775807L;

        /* renamed from: b  reason: collision with root package name */
        public volatile long f152014b = -9223372036854775807L;

        /* renamed from: c  reason: collision with root package name */
        public volatile int f152015c;

        /* renamed from: d  reason: collision with root package name */
        public long f152016d;

        /* renamed from: e  reason: collision with root package name */
        public int f152017e;

        /* renamed from: f  reason: collision with root package name */
        public int f152018f;

        /* renamed from: h  reason: collision with root package name */
        final Handler f152019h;

        /* renamed from: i  reason: collision with root package name */
        public Choreographer f152020i;

        /* renamed from: j  reason: collision with root package name */
        public int f152021j;

        /* renamed from: k  reason: collision with root package name */
        private long f152022k;

        /* renamed from: l  reason: collision with root package name */
        private final Handler f152023l;

        /* renamed from: m  reason: collision with root package name */
        private final HandlerThread f152024m;
        private Bundle n;

        static {
            Covode.recordClassIndex(101326);
        }

        private b() {
            HandlerThread handlerThread = new HandlerThread("Vsync:Handler");
            this.f152024m = handlerThread;
            handlerThread.start();
            this.f152019h = new Handler(handlerThread.getLooper(), this);
            this.n = new Bundle();
            Handler handler = new Handler(Looper.getMainLooper());
            this.f152023l = handler;
            handler.post(new Runnable() {
                /* class com.ss.ttm.player.VsyncTimeHelper.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(101327);
                }

                public final void run() {
                    b.this.f152020i = Choreographer.getInstance();
                    if (b.this.f152021j > 0) {
                        b.this.f152020i.postFrameCallback(b.f152012g);
                    }
                }
            });
        }

        public final void a(long j2) {
            this.n.putLong("vsync", j2);
            Message obtainMessage = this.f152019h.obtainMessage(4);
            obtainMessage.setData(this.n);
            obtainMessage.sendToTarget();
        }

        public final void doFrame(long j2) {
            Message obtainMessage = this.f152019h.obtainMessage(2);
            this.n.putLong("time", j2);
            obtainMessage.setData(this.n);
            obtainMessage.sendToTarget();
            this.f152020i.postFrameCallback(this);
        }

        public final boolean handleMessage(Message message) {
            Choreographer choreographer;
            Choreographer choreographer2;
            int i2 = message.what;
            if (i2 != 0) {
                int i3 = 0;
                if (i2 == 1) {
                    int i4 = this.f152021j - 1;
                    this.f152021j = i4;
                    if (i4 == 0 && (choreographer2 = this.f152020i) != null) {
                        choreographer2.removeFrameCallback(this);
                        this.f152013a = -9223372036854775807L;
                        this.f152014b = -9223372036854775807L;
                        this.f152015c = 0;
                        this.f152017e = 0;
                        this.f152018f = 0;
                        this.f152022k = 0;
                    }
                    return true;
                } else if (i2 == 2) {
                    long j2 = message.getData().getLong("time");
                    if (this.f152016d != 0) {
                        this.f152022k++;
                        this.f152013a = j2;
                        if (this.f152014b == -9223372036854775807L) {
                            this.f152014b = this.f152013a;
                        } else {
                            long j3 = this.f152013a - this.f152014b;
                            if (j3 <= 0) {
                                this.f152014b = -9223372036854775807L;
                            } else {
                                long j4 = this.f152016d;
                                if (j3 - j4 > 0) {
                                    i3 = Math.round(((float) (j3 - j4)) / ((float) j4));
                                }
                                this.f152015c += i3;
                                int i5 = (int) (1000000000 / j3);
                                this.f152017e = i5;
                                int i6 = this.f152018f;
                                if (i6 != 0) {
                                    i5 = Math.min(i6, i5);
                                }
                                this.f152018f = i5;
                                this.f152014b = this.f152013a;
                            }
                        }
                    }
                    return true;
                } else if (i2 != 4) {
                    return false;
                } else {
                    this.f152016d = message.getData().getLong("vsync");
                    return true;
                }
            } else {
                int i7 = this.f152021j + 1;
                this.f152021j = i7;
                if (i7 == 1 && (choreographer = this.f152020i) != null) {
                    choreographer.postFrameCallback(this);
                }
                return true;
            }
        }
    }

    public final void disable() {
        if (this.f152006a != null) {
            a aVar = this.f152008c;
            if (aVar != null) {
                aVar.f152010a.unregisterDisplayListener(aVar);
            }
            this.f152007b.f152019h.sendEmptyMessage(1);
        }
    }

    public final void enable() {
        if (this.f152006a != null) {
            this.f152007b.f152019h.sendEmptyMessage(0);
            a aVar = this.f152008c;
            if (aVar != null) {
                aVar.f152010a.registerDisplayListener(aVar, null);
            }
            a();
        }
    }

    public final void a() {
        Display defaultDisplay = this.f152006a.getDefaultDisplay();
        if (defaultDisplay != null) {
            double refreshRate = (double) defaultDisplay.getRefreshRate();
            Double.isNaN(refreshRate);
            this.f152009d = (long) (1.0E9d / refreshRate);
        } else {
            this.f152009d = 62500000;
        }
        this.f152007b.a(this.f152009d);
    }

    final class a implements DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        final DisplayManager f152010a;

        static {
            Covode.recordClassIndex(101325);
        }

        public final void onDisplayAdded(int i2) {
        }

        public final void onDisplayRemoved(int i2) {
        }

        public final void onDisplayChanged(int i2) {
            if (i2 == 0) {
                VsyncTimeHelper.this.a();
            }
        }

        public a(DisplayManager displayManager) {
            this.f152010a = displayManager;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VsyncTimeHelper(com.ss.ttm.player.TTPlayer r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0008
            android.content.Context r0 = r2.f151988g
        L_0x0004:
            r1.<init>(r0)
            return
        L_0x0008:
            r0 = 0
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.VsyncTimeHelper.<init>(com.ss.ttm.player.TTPlayer):void");
    }

    private VsyncTimeHelper(Context context) {
        DisplayManager displayManager;
        a aVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && context == null) {
                context = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            this.f152006a = (WindowManager) a(context, "window");
        } else {
            this.f152006a = null;
        }
        if (this.f152006a != null) {
            if (e.f151888a >= 17 && (displayManager = (DisplayManager) a(context, "display")) != null) {
                aVar = new a(displayManager);
            }
            this.f152008c = aVar;
            this.f152007b = b.f152012g;
        } else {
            this.f152008c = null;
            this.f152007b = null;
        }
        this.f152009d = -9223372036854775807L;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(1803);
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
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(1803);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
