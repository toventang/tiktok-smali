package com.bytedance.common.jato.graphics;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.common.jato.b.a;
import com.bytedance.common.jato.c;
import com.bytedance.common.jato.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.lang.reflect.Method;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class GraphicsMemShrink {

    /* renamed from: a  reason: collision with root package name */
    public static ScheduledFuture<?> f26868a;

    /* renamed from: b  reason: collision with root package name */
    public static Handler f26869b;

    /* renamed from: c  reason: collision with root package name */
    private static Object f26870c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f26871d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f26872e;

    static {
        Covode.recordClassIndex(15851);
    }

    public static native int tryShrink();

    public static void a() {
        Method method;
        try {
            Object obj = f26870c;
            if (obj != null && (method = f26871d) != null) {
                Object[] objArr = {80};
                Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_common_jato_graphics_GraphicsMemShrink_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a2.first).booleanValue()) {
                    Object obj2 = a2.second;
                } else {
                    a.a(method.invoke(obj, objArr), method, new Object[]{obj, objArr}, "com_bytedance_common_jato_graphics_GraphicsMemShrink_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean b() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            f26870c = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            f26871d = (Method) declaredMethod.invoke(cls, "trimMemory", new Class[]{Integer.TYPE});
        } catch (Throwable unused) {
        }
        if (f26870c == null || f26871d == null) {
            return false;
        }
        return true;
    }

    public static synchronized void a(Context context) {
        synchronized (GraphicsMemShrink.class) {
            MethodCollector.i(7212);
            if (context == null) {
                MethodCollector.o(7212);
            } else if (f26872e) {
                MethodCollector.o(7212);
            } else if (Build.VERSION.SDK_INT <= 20) {
                MethodCollector.o(7212);
            } else if (!c.a()) {
                MethodCollector.o(7212);
            } else {
                boolean b2 = b();
                a.a("init_success_".concat(String.valueOf(b2)));
                if (!b2) {
                    f26872e = true;
                    MethodCollector.o(7212);
                    return;
                }
                f26869b = new Handler(Looper.getMainLooper());
                context.registerComponentCallbacks(new ComponentCallbacks2() {
                    /* class com.bytedance.common.jato.graphics.GraphicsMemShrink.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(15852);
                    }

                    public final void onConfigurationChanged(Configuration configuration) {
                    }

                    public final void onLowMemory() {
                    }

                    public final void onTrimMemory(int i2) {
                        GraphicsMemShrink.f26869b.post(new Runnable() {
                            /* class com.bytedance.common.jato.graphics.GraphicsMemShrink.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(15853);
                            }

                            public final void run() {
                                if (!a.C0575a.f26784a.f26778a) {
                                    GraphicsMemShrink.a();
                                    a.a("background_trim");
                                }
                            }
                        });
                    }
                });
                AnonymousClass2 r1 = new ThreadFactory() {
                    /* class com.bytedance.common.jato.graphics.GraphicsMemShrink.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(15854);
                    }

                    public final Thread newThread(Runnable runnable) {
                        MethodCollector.i(14529);
                        Thread thread = new Thread(runnable);
                        thread.setName("graphics_mem_release");
                        thread.setPriority(1);
                        MethodCollector.o(14529);
                        return thread;
                    }
                };
                l.a a2 = l.a(o.SCHEDULED);
                a2.f79174c = 1;
                a2.f79178g = r1;
                f26868a = ((ScheduledExecutorService) g.a(a2.a())).scheduleWithFixedDelay(new Runnable() {
                    /* class com.bytedance.common.jato.graphics.GraphicsMemShrink.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(15855);
                    }

                    public final void run() {
                        MethodCollector.i(14531);
                        int tryShrink = GraphicsMemShrink.tryShrink();
                        d.b().execute(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0012: INVOKE  
                              (wrap: java.util.concurrent.ExecutorService : 0x0009: INVOKE  (r1v0 java.util.concurrent.ExecutorService) =  type: STATIC call: com.bytedance.common.jato.d.b():java.util.concurrent.ExecutorService)
                              (wrap: com.bytedance.common.jato.graphics.a$2 : 0x000f: CONSTRUCTOR  (r0v0 com.bytedance.common.jato.graphics.a$2) = (r2v0 'tryShrink' int) call: com.bytedance.common.jato.graphics.a.2.<init>(int):void type: CONSTRUCTOR)
                             type: INTERFACE call: java.util.concurrent.ExecutorService.execute(java.lang.Runnable):void in method: com.bytedance.common.jato.graphics.GraphicsMemShrink.3.run():void, file: classes7.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000f: CONSTRUCTOR  (r0v0 com.bytedance.common.jato.graphics.a$2) = (r2v0 'tryShrink' int) call: com.bytedance.common.jato.graphics.a.2.<init>(int):void type: CONSTRUCTOR in method: com.bytedance.common.jato.graphics.GraphicsMemShrink.3.run():void, file: classes7.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 14 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.common.jato.graphics.a, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 20 more
                            */
                        /*
                            this = this;
                            r3 = 14531(0x38c3, float:2.0362E-41)
                            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
                            int r2 = com.bytedance.common.jato.graphics.GraphicsMemShrink.tryShrink()
                            java.util.concurrent.ExecutorService r1 = com.bytedance.common.jato.d.b()
                            com.bytedance.common.jato.graphics.a$2 r0 = new com.bytedance.common.jato.graphics.a$2
                            r0.<init>(r2)
                            r1.execute(r0)
                            r0 = 3
                            if (r2 != r0) goto L_0x002b
                            java.lang.String r0 = "foreground_try_trim"
                            com.bytedance.common.jato.graphics.a.a(r0)
                            android.os.Handler r1 = com.bytedance.common.jato.graphics.GraphicsMemShrink.f26869b
                            com.bytedance.common.jato.graphics.GraphicsMemShrink$3$1 r0 = new com.bytedance.common.jato.graphics.GraphicsMemShrink$3$1
                            r0.<init>()
                            r1.post(r0)
                        L_0x0027:
                            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                            return
                        L_0x002b:
                            if (r2 != 0) goto L_0x0027
                            java.util.concurrent.ScheduledFuture<?> r1 = com.bytedance.common.jato.graphics.GraphicsMemShrink.f26868a
                            r0 = 1
                            r1.cancel(r0)
                            goto L_0x0027
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.graphics.GraphicsMemShrink.AnonymousClass3.run():void");
                    }
                }, 30000, 30000, TimeUnit.MILLISECONDS);
                f26872e = true;
                MethodCollector.o(7212);
            }
        }
    }
}
