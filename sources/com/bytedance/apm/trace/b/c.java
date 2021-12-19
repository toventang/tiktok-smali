package com.bytedance.apm.trace.b;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.apm.block.a.b;
import com.bytedance.apm.block.a.f;
import com.bytedance.apm.trace.b.a;
import com.bytedance.apm.trace.b.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.LinkedList;
import org.json.JSONObject;

public final class c {
    public static final Long q = 200L;
    public static final Long r = 1000L;
    public static b s;

    /* renamed from: a  reason: collision with root package name */
    public final String f25329a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f25330b;

    /* renamed from: c  reason: collision with root package name */
    public b.a f25331c = new b.a();

    /* renamed from: d  reason: collision with root package name */
    public b.d f25332d;

    /* renamed from: e  reason: collision with root package name */
    public b.e f25333e = null;

    /* renamed from: f  reason: collision with root package name */
    public volatile b.c f25334f;

    /* renamed from: g  reason: collision with root package name */
    public volatile b.AbstractC0534b f25335g;

    /* renamed from: h  reason: collision with root package name */
    public LinkedList<Integer> f25336h;

    /* renamed from: i  reason: collision with root package name */
    public float f25337i = 0.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f25338j = 0.0f;

    /* renamed from: k  reason: collision with root package name */
    public float f25339k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    public float f25340l = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    long f25341m = 0;
    public long n = 0;
    public a o = null;
    WindowManager p = null;
    final boolean t;
    public final JSONObject u;

    static void a(WindowManager windowManager, View view) {
        if (!((Boolean) com.bytedance.helios.sdk.a.a(windowManager, new Object[]{view}, 102801, "void", false, null).first).booleanValue()) {
            windowManager.removeView(view);
            com.bytedance.helios.sdk.a.a(null, windowManager, new Object[]{view}, 102801, "com_bytedance_apm_trace_fps_RealFpsTracer_android_view_WindowManager_removeView(Landroid/view/WindowManager;Landroid/view/View;)V");
        }
    }

    static {
        Covode.recordClassIndex(14745);
    }

    public final synchronized void a() {
        int i2 = Build.VERSION.SDK_INT;
        com.bytedance.apm.block.a.b bVar = s;
        if (bVar != null) {
            f.r.o.a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0012: INVOKE  
                  (wrap: com.bytedance.apm.p.d : 0x000b: IGET  (r1v0 com.bytedance.apm.p.d) = 
                  (wrap: com.bytedance.apm.block.a.f : 0x0009: SGET  (r0v4 com.bytedance.apm.block.a.f) =  com.bytedance.apm.block.a.f.r com.bytedance.apm.block.a.f)
                 com.bytedance.apm.block.a.f.o com.bytedance.apm.p.d)
                  (wrap: com.bytedance.apm.block.a.b$3 : 0x000f: CONSTRUCTOR  (r0v5 com.bytedance.apm.block.a.b$3) = (r2v0 'bVar' com.bytedance.apm.block.a.b), (r4v0 'this' com.bytedance.apm.trace.b.c A[IMMUTABLE_TYPE, THIS]) call: com.bytedance.apm.block.a.b.3.<init>(com.bytedance.apm.block.a.b, com.bytedance.apm.trace.b.c):void type: CONSTRUCTOR)
                 type: VIRTUAL call: com.bytedance.apm.p.d.a(java.lang.Runnable):boolean in method: com.bytedance.apm.trace.b.c.a():void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000f: CONSTRUCTOR  (r0v5 com.bytedance.apm.block.a.b$3) = (r2v0 'bVar' com.bytedance.apm.block.a.b), (r4v0 'this' com.bytedance.apm.trace.b.c A[IMMUTABLE_TYPE, THIS]) call: com.bytedance.apm.block.a.b.3.<init>(com.bytedance.apm.block.a.b, com.bytedance.apm.trace.b.c):void type: CONSTRUCTOR in method: com.bytedance.apm.trace.b.c.a():void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 23 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.apm.block.a.b, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 29 more
                */
            /*
                this = this;
                monitor-enter(r4)
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0056 }
                r0 = 16
                com.bytedance.apm.block.a.b r2 = com.bytedance.apm.trace.b.c.s     // Catch:{ all -> 0x0056 }
                if (r2 == 0) goto L_0x004f
                com.bytedance.apm.block.a.f r0 = com.bytedance.apm.block.a.f.r     // Catch:{ all -> 0x0056 }
                com.bytedance.apm.p.d r1 = r0.o     // Catch:{ all -> 0x0056 }
                com.bytedance.apm.block.a.b$3 r0 = new com.bytedance.apm.block.a.b$3     // Catch:{ all -> 0x0056 }
                r0.<init>(r4)     // Catch:{ all -> 0x0056 }
                r1.a(r0)     // Catch:{ all -> 0x0056 }
                boolean r0 = r4.f25330b     // Catch:{ all -> 0x0056 }
                if (r0 == 0) goto L_0x004f
                android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0056 }
                monitor-enter(r4)     // Catch:{ all -> 0x0056 }
                java.util.LinkedList<java.lang.Integer> r0 = r4.f25336h     // Catch:{ all -> 0x003f }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003f }
                if (r0 == 0) goto L_0x0027
                monitor-exit(r4)     // Catch:{ all -> 0x003f }
                goto L_0x004c
            L_0x0027:
                r0 = 0
                r4.n = r0     // Catch:{ all -> 0x003f }
                java.util.LinkedList<java.lang.Integer> r3 = r4.f25336h     // Catch:{ all -> 0x003f }
                java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x003f }
                r0.<init>()     // Catch:{ all -> 0x003f }
                r4.f25336h = r0     // Catch:{ all -> 0x003f }
                com.bytedance.apm.block.a.b$a r2 = r4.f25331c     // Catch:{ all -> 0x003f }
                com.bytedance.apm.block.a.b$a r0 = new com.bytedance.apm.block.a.b$a     // Catch:{ all -> 0x003f }
                r0.<init>()     // Catch:{ all -> 0x003f }
                r4.f25331c = r0     // Catch:{ all -> 0x003f }
                monitor-exit(r4)     // Catch:{ all -> 0x003f }
                goto L_0x0042
            L_0x003f:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            L_0x0042:
                com.bytedance.apm.p.b r1 = com.bytedance.apm.p.b.a.f25210a
                com.bytedance.apm.trace.b.c$2 r0 = new com.bytedance.apm.trace.b.c$2
                r0.<init>(r3, r2)
                r1.a(r0)
            L_0x004c:
                r0 = 0
                r4.f25330b = r0
            L_0x004f:
                java.lang.String r0 = r4.f25329a
                com.bytedance.apm.block.g.b(r0)
                monitor-exit(r4)
                return
            L_0x0056:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.trace.b.c.a():void");
        }

        class a extends View {

            /* renamed from: a  reason: collision with root package name */
            public long f25346a = -1;

            /* renamed from: b  reason: collision with root package name */
            public int f25347b;

            static {
                Covode.recordClassIndex(14748);
            }

            /* access modifiers changed from: protected */
            public final void onDraw(Canvas canvas) {
                if (this.f25346a == -1) {
                    this.f25346a = SystemClock.elapsedRealtime();
                    this.f25347b = 0;
                } else {
                    this.f25347b++;
                }
                if (c.this.f25333e != null) {
                    SystemClock.elapsedRealtime();
                }
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f25346a;
                if (elapsedRealtime > c.q.longValue()) {
                    double d2 = (double) this.f25347b;
                    double d3 = (double) elapsedRealtime;
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    double d4 = d2 / d3;
                    double longValue = (double) c.r.longValue();
                    Double.isNaN(longValue);
                    double d5 = d4 * longValue;
                    if (c.this.f25332d != null) {
                        c.this.f25332d.a(d5);
                    }
                    a.b.f25308a.a(c.this.f25329a, (float) d5);
                    c cVar = c.this;
                    if (cVar.f25330b) {
                        try {
                            c.a(cVar.p, cVar.o);
                            cVar.o.f25346a = -1;
                            cVar.o.f25347b = 0;
                        } catch (Exception unused) {
                        }
                        cVar.f25330b = false;
                    }
                }
            }

            public a(Context context) {
                super(context);
            }
        }

        public c(String str, boolean z) {
            this.f25329a = str;
            this.t = z;
            this.u = null;
            this.f25336h = new LinkedList<>();
            int i2 = Build.VERSION.SDK_INT;
        }

        private static Object a(Context context, String str) {
            Object systemService;
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        i.f107220b = true;
                        return context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                return context.getSystemService(str);
            } else if (!i.f107219a) {
                return context.getSystemService(str);
            } else {
                synchronized (ClipboardManager.class) {
                    systemService = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                }
                return systemService;
            }
        }
    }
