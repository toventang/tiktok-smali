package com.ss.android.ad.splash.core.f;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.core.e.b;
import com.ss.android.ad.splash.core.h;
import com.ss.android.ad.splash.core.k;
import com.ss.android.ad.splash.core.u;
import com.ss.android.ad.splash.core.x;
import com.ss.android.ad.splash.f.j;
import com.ss.android.ad.splash.y;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f58549a;

    static {
        Covode.recordClassIndex(36306);
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        f58549a = g.a(a2.a());
    }

    public static void a() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            /* class com.ss.android.ad.splash.core.f.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(36307);
            }

            public final void run() {
                h.f58579h.submit(new Runnable() {
                    /* class com.ss.android.ad.splash.core.f.a.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(36308);
                    }

                    public final void run() {
                        int i2;
                        Exception e2;
                        JSONArray jSONArray;
                        int i3;
                        Exception e3;
                        int i4;
                        int i5;
                        b bVar;
                        boolean z;
                        b bVar2;
                        MethodCollector.i(2339);
                        com.ss.android.ad.splash.core.a.a();
                        if (h.Y) {
                            u a2 = u.a();
                            com.ss.android.ad.splash.f.a.a(0, " in non-realtime mode, prepare to request ");
                            if (x.a().f58931h) {
                                i3 = 2339;
                            } else if (!com.ss.android.ad.splash.f.h.b(h.r)) {
                                com.ss.android.ad.splash.f.a.a(0, " network is unavailable, requesting data is impossible");
                                MethodCollector.o(2339);
                                return;
                            } else if (a2.b()) {
                                long currentTimeMillis = System.currentTimeMillis();
                                a2.f58696a = currentTimeMillis;
                                com.ss.android.ad.splash.f.g.b("preload begins...");
                                Future submit = h.f58577f.submit(
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006d: INVOKE  (r10v5 'submit' java.util.concurrent.Future) = 
                                      (wrap: java.util.concurrent.ExecutorService : 0x0063: SGET  (r1v13 java.util.concurrent.ExecutorService) =  com.ss.android.ad.splash.core.h.f java.util.concurrent.ExecutorService)
                                      (wrap: com.ss.android.ad.splash.core.u$1 : 0x006a: CONSTRUCTOR  (r0v84 com.ss.android.ad.splash.core.u$1) = (r36v0 'a2' com.ss.android.ad.splash.core.u) call: com.ss.android.ad.splash.core.u.1.<init>(com.ss.android.ad.splash.core.u):void type: CONSTRUCTOR)
                                     type: INTERFACE call: java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable):java.util.concurrent.Future in method: com.ss.android.ad.splash.core.f.a.1.1.run():void, file: classes10.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
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
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006a: CONSTRUCTOR  (r0v84 com.ss.android.ad.splash.core.u$1) = (r36v0 'a2' com.ss.android.ad.splash.core.u) call: com.ss.android.ad.splash.core.u.1.<init>(com.ss.android.ad.splash.core.u):void type: CONSTRUCTOR in method: com.ss.android.ad.splash.core.f.a.1.1.run():void, file: classes10.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                    	... 30 more
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ad.splash.core.u, state: GENERATED_AND_UNLOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                    	... 36 more
                                    */
                                /*
                                // Method dump skipped, instructions count: 1514
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.f.a.AnonymousClass1.AnonymousClass1.run():void");
                            }
                        });
                    }
                }, h.ab);
            }

            public static void a(final b bVar) {
                final Future<?> submit = h.f58577f.submit(new Runnable() {
                    /* class com.ss.android.ad.splash.core.f.a.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(36309);
                    }

                    public final void run() {
                        JSONObject jSONObject;
                        if (h.f58574c != null && k.a().f58663h) {
                            long currentTimeMillis = System.currentTimeMillis() / 1000;
                            String e2 = j.e();
                            if (!TextUtils.isEmpty(e2)) {
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    JSONArray jSONArray = new JSONArray();
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("ad_id", bVar.f58441d);
                                    jSONObject3.put("log_extra", bVar.f58447j);
                                    jSONObject3.put("timestamp", currentTimeMillis);
                                    jSONObject3.put("position", 0);
                                    jSONArray.put(jSONObject3);
                                    jSONObject2.put("ads", jSONArray);
                                } catch (Exception e3) {
                                    e3.printStackTrace();
                                }
                                int i2 = 0;
                                do {
                                    y a2 = h.f58574c.a(e2, jSONObject2);
                                    if (a2 != null && a2.f59058b && (jSONObject = a2.f59057a) != null && jSONObject.optInt("code", -1) == 30001) {
                                        i2++;
                                    } else {
                                        return;
                                    }
                                } while (i2 < 4);
                            }
                        }
                    }
                });
                f58549a.execute(new Runnable() {
                    /* class com.ss.android.ad.splash.core.f.a.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(36310);
                    }

                    public final void run() {
                        try {
                            submit.get(5, TimeUnit.SECONDS);
                            com.ss.android.ad.splash.f.g.b("show ack ends...");
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        } finally {
                            a.a();
                        }
                    }
                });
            }

            public static void a(final boolean z) {
                if (h.f58574c != null) {
                    long j2 = h.ac;
                    if (j2 <= 0) {
                        j2 = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        /* class com.ss.android.ad.splash.core.f.a.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(36311);
                        }

                        public final void run() {
                            h.f58577f.submit(new Callable<y>() {
                                /* class com.ss.android.ad.splash.core.f.a.AnonymousClass4.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(36312);
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                @Override // java.util.concurrent.Callable
                                public final /* synthetic */ y call() {
                                    if (h.f58574c == null) {
                                        return null;
                                    }
                                    String a2 = j.a(z);
                                    if (!com.ss.android.ad.splash.f.l.a(a2)) {
                                        return h.f58574c.b(a2);
                                    }
                                    return null;
                                }
                            });
                        }
                    }, j2);
                }
            }
        }
