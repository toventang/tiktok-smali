package com.bytedance.apm.trace.b;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.apm.block.a.f;
import com.bytedance.apm.block.g;
import com.bytedance.apm.trace.b.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.LinkedList;
import org.json.JSONObject;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static boolean f25309c;
    public static final Long n = 200L;
    public static final Long o = 1000L;

    /* renamed from: a  reason: collision with root package name */
    public String f25310a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f25311b;

    /* renamed from: d  reason: collision with root package name */
    public d f25312d;

    /* renamed from: e  reason: collision with root package name */
    public c f25313e;

    /* renamed from: f  reason: collision with root package name */
    public e f25314f;

    /* renamed from: g  reason: collision with root package name */
    LinkedList<Integer> f25315g;

    /* renamed from: h  reason: collision with root package name */
    public float f25316h;

    /* renamed from: i  reason: collision with root package name */
    public float f25317i;

    /* renamed from: j  reason: collision with root package name */
    public float f25318j;

    /* renamed from: k  reason: collision with root package name */
    public float f25319k;

    /* renamed from: l  reason: collision with root package name */
    public a f25320l;

    /* renamed from: m  reason: collision with root package name */
    WindowManager f25321m;
    public final JSONObject p;
    public long q;
    public long r;
    public int s;
    private c t;
    private Choreographer.FrameCallback u;
    private boolean v;

    /* renamed from: com.bytedance.apm.trace.b.b$b  reason: collision with other inner class name */
    public interface AbstractC0534b {
        static {
            Covode.recordClassIndex(14741);
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(14742);
        }

        void a(JSONObject jSONObject);
    }

    public interface d {
        static {
            Covode.recordClassIndex(14743);
        }

        void a(double d2);
    }

    public interface e {
        static {
            Covode.recordClassIndex(14744);
        }
    }

    static void a(WindowManager windowManager, View view) {
        if (!((Boolean) com.bytedance.helios.sdk.a.a(windowManager, new Object[]{view}, 102801, "void", false, null).first).booleanValue()) {
            windowManager.removeView(view);
            com.bytedance.helios.sdk.a.a(null, windowManager, new Object[]{view}, 102801, "com_bytedance_apm_trace_fps_FpsTracer_android_view_WindowManager_removeView(Landroid/view/WindowManager;Landroid/view/View;)V");
        }
    }

    static {
        Covode.recordClassIndex(14736);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        com.bytedance.apm.p.b.a.f25210a.a(new com.bytedance.apm.trace.b.b.AnonymousClass3(r7));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b() {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.trace.b.b.b():void");
    }

    public final void a() {
        c cVar = this.t;
        if (cVar != null) {
            if (cVar.f25330b) {
                return;
            }
            if (cVar.t || com.bytedance.apm.c.p || com.bytedance.apm.n.c.a("fps_drop", cVar.f25329a) || com.bytedance.apm.n.c.a("fps", cVar.f25329a)) {
                cVar.f25337i = 0.0f;
                cVar.f25338j = 0.0f;
                cVar.f25339k = 0.0f;
                cVar.f25340l = 0.0f;
                cVar.f25341m = 0;
                int i2 = Build.VERSION.SDK_INT;
                if (c.s != null) {
                    cVar.f25330b = true;
                    f.r.o.a(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0054: INVOKE  
                          (wrap: com.bytedance.apm.p.d : 0x004d: IGET  (r1v3 com.bytedance.apm.p.d) = 
                          (wrap: com.bytedance.apm.block.a.f : 0x004b: SGET  (r0v25 com.bytedance.apm.block.a.f) =  com.bytedance.apm.block.a.f.r com.bytedance.apm.block.a.f)
                         com.bytedance.apm.block.a.f.o com.bytedance.apm.p.d)
                          (wrap: com.bytedance.apm.block.a.b$2 : 0x0051: CONSTRUCTOR  (r0v26 com.bytedance.apm.block.a.b$2) = 
                          (wrap: com.bytedance.apm.block.a.b : 0x0049: SGET  (r2v1 com.bytedance.apm.block.a.b) =  com.bytedance.apm.trace.b.c.s com.bytedance.apm.block.a.b)
                          (r9v0 'cVar' com.bytedance.apm.trace.b.c)
                         call: com.bytedance.apm.block.a.b.2.<init>(com.bytedance.apm.block.a.b, com.bytedance.apm.trace.b.c):void type: CONSTRUCTOR)
                         type: VIRTUAL call: com.bytedance.apm.p.d.a(java.lang.Runnable):boolean in method: com.bytedance.apm.trace.b.b.a():void, file: classes.dex
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
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0051: CONSTRUCTOR  (r0v26 com.bytedance.apm.block.a.b$2) = 
                          (wrap: com.bytedance.apm.block.a.b : 0x0049: SGET  (r2v1 com.bytedance.apm.block.a.b) =  com.bytedance.apm.trace.b.c.s com.bytedance.apm.block.a.b)
                          (r9v0 'cVar' com.bytedance.apm.trace.b.c)
                         call: com.bytedance.apm.block.a.b.2.<init>(com.bytedance.apm.block.a.b, com.bytedance.apm.trace.b.c):void type: CONSTRUCTOR in method: com.bytedance.apm.trace.b.b.a():void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 35 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.apm.block.a.b, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 41 more
                        */
                    /*
                    // Method dump skipped, instructions count: 196
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.trace.b.b.a():void");
                }

                public static void a(String str) {
                    g.a(str);
                }

                public static void b(String str) {
                    g.b(str);
                }

                public b(String str) {
                    this(str, true);
                }

                public final void a(c cVar) {
                    c cVar2 = this.t;
                    if (cVar2 != null) {
                        cVar2.f25334f = cVar;
                    }
                    this.f25313e = cVar;
                }

                public final void a(d dVar) {
                    c cVar = this.t;
                    if (cVar != null) {
                        cVar.f25332d = dVar;
                    }
                    this.f25312d = dVar;
                }

                class a extends View {

                    /* renamed from: a  reason: collision with root package name */
                    public long f25326a = -1;

                    /* renamed from: b  reason: collision with root package name */
                    public int f25327b;

                    static {
                        Covode.recordClassIndex(14740);
                    }

                    /* access modifiers changed from: protected */
                    public final void onDraw(Canvas canvas) {
                        if (this.f25326a == -1) {
                            this.f25326a = SystemClock.elapsedRealtime();
                            this.f25327b = 0;
                        } else {
                            this.f25327b++;
                        }
                        if (b.this.f25314f != null) {
                            SystemClock.elapsedRealtime();
                        }
                        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f25326a;
                        if (elapsedRealtime > b.n.longValue()) {
                            double d2 = (double) this.f25327b;
                            double d3 = (double) elapsedRealtime;
                            Double.isNaN(d2);
                            Double.isNaN(d3);
                            double d4 = d2 / d3;
                            double longValue = (double) b.o.longValue();
                            Double.isNaN(longValue);
                            double d5 = d4 * longValue;
                            if (b.this.f25312d != null) {
                                b.this.f25312d.a(d5);
                            }
                            a.b.f25308a.a(b.this.f25310a, (float) d5);
                            b bVar = b.this;
                            if (bVar.f25311b) {
                                try {
                                    b.a(bVar.f25321m, bVar.f25320l);
                                    bVar.f25320l.f25326a = -1;
                                    bVar.f25320l.f25327b = 0;
                                } catch (Exception unused) {
                                }
                                bVar.f25311b = false;
                            }
                        }
                    }

                    public a(Context context) {
                        super(context);
                    }
                }

                public b(String str, boolean z) {
                    this(str, z, (byte) 0);
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
                                    com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                                }
                            }
                            i.f107219a = false;
                        }
                        return systemService;
                    }
                }

                private b(String str, boolean z, byte b2) {
                    this.q = -1;
                    this.r = -1;
                    this.p = null;
                    if (f25309c) {
                        this.t = new c(str, z);
                        return;
                    }
                    this.f25310a = str;
                    this.v = z;
                    this.f25315g = new LinkedList<>();
                    int i2 = Build.VERSION.SDK_INT;
                }
            }
