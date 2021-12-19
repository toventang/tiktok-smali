package com.bytedance.apm.block.a;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Pair;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window;
import com.bytedance.apm.block.a;
import com.bytedance.apm.c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.h;
import com.bytedance.monitor.collector.k;
import com.bytedance.services.apm.api.d;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class f implements d {
    public static final f r = new f();

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f24582a;

    /* renamed from: b  reason: collision with root package name */
    public final e f24583b = new e();

    /* renamed from: c  reason: collision with root package name */
    long[] f24584c = new long[4];

    /* renamed from: d  reason: collision with root package name */
    public final List<a> f24585d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    public boolean f24586e = false;

    /* renamed from: f  reason: collision with root package name */
    boolean f24587f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f24588g = false;

    /* renamed from: h  reason: collision with root package name */
    public Object f24589h;

    /* renamed from: i  reason: collision with root package name */
    public Object[] f24590i;

    /* renamed from: j  reason: collision with root package name */
    public long[] f24591j;

    /* renamed from: k  reason: collision with root package name */
    public Object f24592k;

    /* renamed from: l  reason: collision with root package name */
    public Method f24593l;

    /* renamed from: m  reason: collision with root package name */
    public Choreographer f24594m;
    boolean n = false;
    public final com.bytedance.apm.p.d o = new com.bytedance.apm.p.d("looper_monitor");
    Runnable p;
    long q = -1;
    public boolean s;

    @Override // com.bytedance.services.apm.api.d
    public final void a(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public final void c(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public final void l_() {
    }

    static {
        Covode.recordClassIndex(14473);
    }

    private f() {
    }

    private synchronized void c() {
        if (c.c()) {
            if (this.s) {
                if (!this.f24582a) {
                    this.f24582a = true;
                }
                if (this.f24586e) {
                    int i2 = Build.VERSION.SDK_INT;
                    a(this.p);
                }
                return;
            }
            throw new RuntimeException("never init!");
        }
    }

    private synchronized void d() {
        if (c.b()) {
            if (this.s) {
                if (this.f24582a) {
                    this.f24582a = false;
                }
                return;
            }
            throw new RuntimeException("MainThreadMonitor is never init!");
        }
    }

    public final void a() {
        if (!this.s) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                ActivityLifeObserver.getInstance().register(this);
                h.a();
                h.f41519b = new com.bytedance.monitor.collector.a() {
                    /* class com.bytedance.apm.block.a.f.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(14474);
                    }

                    @Override // com.bytedance.monitor.collector.a
                    public final boolean a() {
                        return f.this.f24582a;
                    }

                    @Override // com.bytedance.monitor.collector.a
                    public final void a(String str) {
                        super.a(str);
                        f fVar = f.this;
                        fVar.f24588g = true;
                        fVar.f24584c[0] = com.bytedance.monitor.collector.a.f41431b;
                        fVar.f24584c[2] = com.bytedance.monitor.collector.a.f41432c;
                        List<a> list = fVar.f24585d;
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            a aVar = list.get(i2);
                            if (!aVar.f24552a) {
                                aVar.a(str);
                            }
                        }
                    }

                    @Override // com.bytedance.monitor.collector.a
                    public final void b(String str) {
                        super.b(str);
                        f fVar = f.this;
                        boolean z = fVar.f24587f;
                        char c2 = 0;
                        if (fVar.f24586e && fVar.f24587f) {
                            int i2 = Build.VERSION.SDK_INT;
                            fVar.a(fVar.p);
                            fVar.f24587f = false;
                            long j2 = com.bytedance.monitor.collector.a.f41431b;
                            long j3 = fVar.q;
                            if (fVar.f24591j != null) {
                                if (k.a().d() != null) {
                                    k.a().d().a(fVar.f24591j);
                                }
                                f.r.o.a(
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004f: INVOKE  
                                      (wrap: com.bytedance.apm.p.d : 0x0048: IGET  (r4v3 com.bytedance.apm.p.d) = 
                                      (wrap: com.bytedance.apm.block.a.f : 0x0046: SGET  (r0v24 com.bytedance.apm.block.a.f) =  com.bytedance.apm.block.a.f.r com.bytedance.apm.block.a.f)
                                     com.bytedance.apm.block.a.f.o com.bytedance.apm.p.d)
                                      (wrap: com.bytedance.apm.block.a.d$1 : 0x004c: CONSTRUCTOR  (r0v25 com.bytedance.apm.block.a.d$1) = 
                                      (wrap: com.bytedance.apm.block.a.d : 0x0040: INVOKE  (r10v0 com.bytedance.apm.block.a.d) =  type: STATIC call: com.bytedance.apm.block.a.d.a():com.bytedance.apm.block.a.d)
                                      (r1v4 'j2' long)
                                      (wrap: long[] : 0x0044: IGET  (r9v1 long[]) = (r3v0 'fVar' com.bytedance.apm.block.a.f) com.bytedance.apm.block.a.f.j long[])
                                     call: com.bytedance.apm.block.a.d.1.<init>(com.bytedance.apm.block.a.d, long, long[]):void type: CONSTRUCTOR)
                                     type: VIRTUAL call: com.bytedance.apm.p.d.a(java.lang.Runnable):boolean in method: com.bytedance.apm.block.a.f.1.b(java.lang.String):void, file: classes.dex
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
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004c: CONSTRUCTOR  (r0v25 com.bytedance.apm.block.a.d$1) = 
                                      (wrap: com.bytedance.apm.block.a.d : 0x0040: INVOKE  (r10v0 com.bytedance.apm.block.a.d) =  type: STATIC call: com.bytedance.apm.block.a.d.a():com.bytedance.apm.block.a.d)
                                      (r1v4 'j2' long)
                                      (wrap: long[] : 0x0044: IGET  (r9v1 long[]) = (r3v0 'fVar' com.bytedance.apm.block.a.f) com.bytedance.apm.block.a.f.j long[])
                                     call: com.bytedance.apm.block.a.d.1.<init>(com.bytedance.apm.block.a.d, long, long[]):void type: CONSTRUCTOR in method: com.bytedance.apm.block.a.f.1.b(java.lang.String):void, file: classes.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                    	... 24 more
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.apm.block.a.d, state: GENERATED_AND_UNLOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                    	... 30 more
                                    */
                                /*
                                // Method dump skipped, instructions count: 191
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.block.a.f.AnonymousClass1.b(java.lang.String):void");
                            }
                        };
                        this.s = true;
                        return;
                    }
                    throw new AssertionError("must be init in main thread!");
                }
            }

            @Override // com.bytedance.services.apm.api.d
            public final void b(Activity activity) {
                int i2 = Build.VERSION.SDK_INT;
                if (this.f24594m == null && this.f24586e) {
                    try {
                        this.f24594m = Choreographer.getInstance();
                    } catch (Exception unused) {
                    }
                    b.a.f25210a.a(new Runnable() {
                        /* class com.bytedance.apm.block.a.f.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(14476);
                        }

                        public final void run() {
                            try {
                                f.this.p = new Runnable() {
                                    /* class com.bytedance.apm.block.a.f.AnonymousClass3.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(14477);
                                    }

                                    public final void run() {
                                        try {
                                            f fVar = f.this;
                                            try {
                                                if (Build.VERSION.SDK_INT <= 22) {
                                                    fVar.q = ((Long) f.a(fVar.f24592k, "mTimestampNanos")).longValue();
                                                    fVar.q /= 1000000;
                                                } else if (fVar.f24591j == null) {
                                                    fVar.q = com.bytedance.monitor.collector.a.f41431b;
                                                } else {
                                                    fVar.q = fVar.f24591j[1] / 1000000;
                                                }
                                                fVar.f24587f = true;
                                            } finally {
                                                fVar.n = false;
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                };
                                f fVar = f.this;
                                fVar.f24589h = f.a(fVar.f24594m, "mLock");
                                if (f.this.f24589h == null) {
                                    f fVar2 = f.this;
                                    fVar2.f24589h = f.b(fVar2.f24594m, "mLock");
                                }
                                f fVar3 = f.this;
                                fVar3.f24590i = (Object[]) f.a(fVar3.f24594m, "mCallbackQueues");
                                if (f.this.f24590i == null) {
                                    f fVar4 = f.this;
                                    fVar4.f24590i = (Object[]) f.b(fVar4.f24594m, "mCallbackQueues");
                                }
                                if (Build.VERSION.SDK_INT == 28) {
                                    f fVar5 = f.this;
                                    fVar5.f24591j = (long[]) f.b(f.b(fVar5.f24594m, "mFrameInfo"), "mFrameInfo");
                                } else if (Build.VERSION.SDK_INT > 28) {
                                    f fVar6 = f.this;
                                    fVar6.f24591j = (long[]) f.b(f.b(fVar6.f24594m, "mFrameInfo"), "frameInfo");
                                } else if (Build.VERSION.SDK_INT > 22) {
                                    f fVar7 = f.this;
                                    fVar7.f24591j = (long[]) f.a(f.a(fVar7.f24594m, "mFrameInfo"), "mFrameInfo");
                                } else {
                                    f fVar8 = f.this;
                                    fVar8.f24592k = f.a(fVar8.f24594m, "mDisplayEventReceiver");
                                }
                                if (f.this.f24591j == null && Build.VERSION.SDK_INT > 22) {
                                    com.bytedance.services.apm.api.a.a("FrameInfoIsNull");
                                }
                                if (f.this.f24589h == null) {
                                    com.bytedance.services.apm.api.a.a("CallbackQueueLockIsNull");
                                }
                                if (f.this.f24590i == null) {
                                    com.bytedance.services.apm.api.a.a("callbackQueuesIsNull");
                                }
                                f fVar9 = f.this;
                                fVar9.f24593l = f.a(fVar9.f24590i[0], "addCallbackLocked", Long.TYPE, Object.class, Object.class);
                                int i2 = Build.VERSION.SDK_INT;
                                f fVar10 = f.this;
                                fVar10.a(fVar10.p);
                            } catch (Exception e2) {
                                com.bytedance.services.apm.api.a.a((Throwable) e2, "MainThreadMonitor_fullFps");
                            }
                        }
                    });
                }
            }

            public final void b(a aVar) {
                this.f24585d.remove(aVar);
                if (this.f24585d.isEmpty()) {
                    d();
                }
            }

            public final void a(a aVar) {
                if (!this.f24582a) {
                    c();
                }
                if (!this.f24585d.contains(aVar)) {
                    this.f24585d.add(aVar);
                }
            }

            public final synchronized void a(Runnable runnable) {
                if (this.f24582a) {
                    if (!this.n) {
                        try {
                            synchronized (this.f24589h) {
                                Method method = this.f24593l;
                                if (method != null) {
                                    Object obj = this.f24590i[0];
                                    Object[] objArr = {-1L, runnable, null};
                                    Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_apm_block_trace_MainThreadMonitor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                                    if (((Boolean) a2.first).booleanValue()) {
                                        Object obj2 = a2.second;
                                    } else {
                                        com.bytedance.helios.sdk.a.a(method.invoke(obj, objArr), method, new Object[]{obj, objArr}, "com_bytedance_apm_block_trace_MainThreadMonitor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                                    }
                                    this.n = true;
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }

            public static <T> T a(Object obj, String str) {
                try {
                    Field declaredField = obj.getClass().getDeclaredField(str);
                    declaredField.setAccessible(true);
                    return (T) declaredField.get(obj);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return null;
                }
            }

            public static <T> T b(Object obj, String str) {
                try {
                    Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(obj.getClass(), str);
                    field.setAccessible(true);
                    return (T) field.get(obj);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return null;
                }
            }

            @Override // com.bytedance.services.apm.api.d
            public final void a(Activity activity, Bundle bundle) {
                try {
                    if (Build.VERSION.SDK_INT >= 23) {
                        Window window = activity.getWindow();
                        window.setCallback(new j(window.getCallback()) {
                            /* class com.bytedance.apm.block.a.f.AnonymousClass4 */

                            static {
                                Covode.recordClassIndex(14478);
                            }

                            public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
                                if (!f.this.f24588g) {
                                    f.this.f24583b.a(keyEvent.getEventTime());
                                }
                                return this.f24639b.dispatchKeyEvent(keyEvent);
                            }

                            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                                if (!f.this.f24588g) {
                                    f.this.f24583b.a(motionEvent.getEventTime());
                                }
                                return this.f24639b.dispatchTouchEvent(motionEvent);
                            }
                        });
                    }
                } catch (Exception unused) {
                }
            }

            public static Method a(Object obj, String str, Class<?>... clsArr) {
                try {
                    Method declaredMethod = obj.getClass().getDeclaredMethod(str, clsArr);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Exception unused) {
                    return null;
                }
            }

            public static Method a(Class cls, String str, Class<?>... clsArr) {
                try {
                    Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
                    method.setAccessible(true);
                    return method;
                } catch (Exception unused) {
                    return null;
                }
            }
        }
