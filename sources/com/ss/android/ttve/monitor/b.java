package com.ss.android.ttve.monitor;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.common.IESAppLogger;
import com.ss.android.vesdk.an;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f61192a;

    /* renamed from: b  reason: collision with root package name */
    private static a f61193b;

    public interface a {
        static {
            Covode.recordClassIndex(37678);
        }

        void a(String str, JSONObject jSONObject, String str2);
    }

    static {
        Covode.recordClassIndex(37677);
    }

    public static synchronized void a(a aVar) {
        synchronized (b.class) {
            MethodCollector.i(2693);
            f61193b = aVar;
            IESAppLogger.sharedInstance().setAppLogCallback("", 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0016: INVOKE  
                  (wrap: com.bytedance.ies.common.IESAppLogger : 0x000c: INVOKE  (r2v0 com.bytedance.ies.common.IESAppLogger) =  type: STATIC call: com.bytedance.ies.common.IESAppLogger.sharedInstance():com.bytedance.ies.common.IESAppLogger)
                  ("")
                  (wrap: com.ss.android.ttve.monitor.a$1 : 0x0012: CONSTRUCTOR  (r1v0 com.ss.android.ttve.monitor.a$1) = (r6v0 'aVar' com.ss.android.ttve.monitor.b$a) call: com.ss.android.ttve.monitor.a.1.<init>(com.ss.android.ttve.monitor.b$a):void type: CONSTRUCTOR)
                  true
                 type: VIRTUAL call: com.bytedance.ies.common.IESAppLogger.setAppLogCallback(java.lang.String, com.bytedance.ies.common.IESAppLogger$a, boolean):void in method: com.ss.android.ttve.monitor.b.a(com.ss.android.ttve.monitor.b$a):void, file: classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:249)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:71)
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0012: CONSTRUCTOR  (r1v0 com.ss.android.ttve.monitor.a$1) = (r6v0 'aVar' com.ss.android.ttve.monitor.b$a) call: com.ss.android.ttve.monitor.a.1.<init>(com.ss.android.ttve.monitor.b$a):void type: CONSTRUCTOR in method: com.ss.android.ttve.monitor.b.a(com.ss.android.ttve.monitor.b$a):void, file: classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ttve.monitor.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
                java.lang.Class<com.ss.android.ttve.monitor.b> r5 = com.ss.android.ttve.monitor.b.class
                monitor-enter(r5)
                r4 = 2693(0xa85, float:3.774E-42)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)     // Catch:{ all -> 0x001e }
                com.ss.android.ttve.monitor.b.f61193b = r6     // Catch:{ all -> 0x001e }
                java.lang.String r3 = ""
                com.bytedance.ies.common.IESAppLogger r2 = com.bytedance.ies.common.IESAppLogger.sharedInstance()     // Catch:{ all -> 0x001e }
                com.ss.android.ttve.monitor.a$1 r1 = new com.ss.android.ttve.monitor.a$1     // Catch:{ all -> 0x001e }
                r1.<init>(r6)     // Catch:{ all -> 0x001e }
                r0 = 1
                r2.setAppLogCallback(r3, r1, r0)     // Catch:{ all -> 0x001e }
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)     // Catch:{ all -> 0x001e }
                monitor-exit(r5)
                return
            L_0x001e:
                r0 = move-exception
                monitor-exit(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.monitor.b.a(com.ss.android.ttve.monitor.b$a):void");
        }

        public static void a(String str, JSONObject jSONObject, String str2) {
            a(str, jSONObject, str2, true, false);
        }

        private static void a(String str, String str2, JSONObject jSONObject, boolean z) {
            an.b("ApplogUtils", "onEventReport " + str + ": " + jSONObject);
            a.a(str, jSONObject, str2, z);
        }

        public static void a(String str, JSONObject jSONObject, String str2, boolean z, boolean z2) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("sdkVersion", "10.6.0.132-mt");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            if (f61192a || z2) {
                a(str, str2, jSONObject, true);
            }
            if (z) {
                try {
                    jSONObject.put("second_appid", "2780");
                    jSONObject.put("second_appname", "vesdk_abroad");
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
                a(str, str2, jSONObject, false);
            }
        }
    }
