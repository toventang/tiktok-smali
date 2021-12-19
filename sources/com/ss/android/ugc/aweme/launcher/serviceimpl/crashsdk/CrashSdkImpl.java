package com.ss.android.ugc.aweme.launcher.serviceimpl.crashsdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.j.d;
import com.bytedance.crash.runtime.n;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ag.a;
import com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class CrashSdkImpl implements ICrashSdkApi {
    static {
        Covode.recordClassIndex(68654);
    }

    public static ICrashSdkApi b() {
        MethodCollector.i(6133);
        Object a2 = b.a(ICrashSdkApi.class, false);
        if (a2 != null) {
            ICrashSdkApi iCrashSdkApi = (ICrashSdkApi) a2;
            MethodCollector.o(6133);
            return iCrashSdkApi;
        }
        if (b.cd == null) {
            synchronized (ICrashSdkApi.class) {
                try {
                    if (b.cd == null) {
                        b.cd = new CrashSdkImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6133);
                    throw th;
                }
            }
        }
        CrashSdkImpl crashSdkImpl = (CrashSdkImpl) b.cd;
        MethodCollector.o(6133);
        return crashSdkImpl;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final void a() {
        com.ss.android.ugc.aweme.ag.b bVar = new com.ss.android.ugc.aweme.ag.b();
        a.f66287a = bVar;
        if (d.f27660a == null) {
            return;
        }
        if (d.f27661b) {
            n.b().a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0018: INVOKE  
                  (wrap: com.bytedance.crash.runtime.s : 0x000f: INVOKE  (r1v0 com.bytedance.crash.runtime.s) =  type: STATIC call: com.bytedance.crash.runtime.n.b():com.bytedance.crash.runtime.s)
                  (wrap: com.bytedance.crash.j.d$1 : 0x0015: CONSTRUCTOR  (r0v3 com.bytedance.crash.j.d$1) = (r2v0 'bVar' com.ss.android.ugc.aweme.ag.b) call: com.bytedance.crash.j.d.1.<init>(com.bytedance.crash.j.d):void type: CONSTRUCTOR)
                 type: VIRTUAL call: com.bytedance.crash.runtime.s.a(java.lang.Runnable):boolean in method: com.ss.android.ugc.aweme.launcher.serviceimpl.crashsdk.CrashSdkImpl.a():void, file: classes9.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0015: CONSTRUCTOR  (r0v3 com.bytedance.crash.j.d$1) = (r2v0 'bVar' com.ss.android.ugc.aweme.ag.b) call: com.bytedance.crash.j.d.1.<init>(com.bytedance.crash.j.d):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.launcher.serviceimpl.crashsdk.CrashSdkImpl.a():void, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 23 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.crash.j.d, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 29 more
                */
            /*
                this = this;
                com.ss.android.ugc.aweme.ag.b r2 = new com.ss.android.ugc.aweme.ag.b
                r2.<init>()
                com.ss.android.ugc.aweme.ag.a.f66287a = r2
                java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.crash.j.d> r0 = com.bytedance.crash.j.d.f27660a
                if (r0 == 0) goto L_0x0021
                boolean r0 = com.bytedance.crash.j.d.f27661b
                if (r0 == 0) goto L_0x001c
                com.bytedance.crash.runtime.s r1 = com.bytedance.crash.runtime.n.b()
                com.bytedance.crash.j.d$1 r0 = new com.bytedance.crash.j.d$1
                r0.<init>(r2)
                r1.a(r0)
                return
            L_0x001c:
                java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.crash.j.d> r0 = com.bytedance.crash.j.d.f27660a
                r0.add(r2)
            L_0x0021:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.launcher.serviceimpl.crashsdk.CrashSdkImpl.a():void");
        }

        @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
        public final boolean a(long j2) {
            Keva repo;
            long j3 = 0;
            if (!(a.f66287a == null || (repo = Keva.getRepo("crash_marker_repo")) == null)) {
                j3 = repo.getLong("key_last_time", 0);
            }
            if (System.currentTimeMillis() - j3 > j2) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
        public final void a(Throwable th, String str) {
            l.d(th, "");
            l.d(str, "");
            com.bytedance.crash.d.a(th, str);
        }
    }
