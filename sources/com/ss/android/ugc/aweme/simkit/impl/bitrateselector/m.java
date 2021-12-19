package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bitrateselector.a.a.f;
import com.ss.android.ugc.aweme.player.sdk.b.c;
import com.ss.android.ugc.aweme.simkit.api.b;
import com.ss.android.ugc.aweme.simkit.d;
import com.ss.android.ugc.playerkit.simapicommon.a.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* access modifiers changed from: package-private */
public final class m implements b {

    /* renamed from: a  reason: collision with root package name */
    private static int f133556a = -1;

    /* renamed from: b  reason: collision with root package name */
    private static ConcurrentHashMap<String, Float> f133557b = new ConcurrentHashMap<>(50);

    /* renamed from: c  reason: collision with root package name */
    private static ConcurrentLinkedQueue<String> f133558c = new ConcurrentLinkedQueue<>();

    /* renamed from: d  reason: collision with root package name */
    private h f133559d = new h();

    /* renamed from: e  reason: collision with root package name */
    private f f133560e;

    /* renamed from: f  reason: collision with root package name */
    private com.ss.android.ugc.aweme.bitrateselector.a.b f133561f;

    static {
        Covode.recordClassIndex(87369);
    }

    m(com.ss.android.ugc.aweme.bitrateselector.a.b bVar) {
        this.f133561f = bVar;
        if (bVar != null) {
            f fVar = new f(bVar);
            this.f133560e = fVar;
            fVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.b
    public final com.ss.android.ugc.aweme.player.sdk.b.b a(String str, c cVar) {
        f a2;
        if (cVar == null || !this.f133560e.a()) {
            return null;
        }
        int a3 = (int) d.a().f().a();
        if (d.a().b().getCommonConfig().isUseLastNetworkSpeed()) {
            if (((double) a3) <= 0.0d) {
                a3 = f133556a;
                if (a3 <= 0) {
                    a3 = d.a().b().getCommonConfig().getLastNetworkSpeed();
                }
                d.a().f().a((double) a3);
            } else {
                f133556a = a3;
            }
        }
        List<Pair<com.ss.android.ugc.aweme.player.sdk.b.b, Integer>> a4 = cVar.a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Pair<com.ss.android.ugc.aweme.player.sdk.b.b, Integer> pair : a4) {
            e eVar = new e();
            eVar.setBitRate(((Integer) pair.second).intValue());
            arrayList.add(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: INVOKE  
                  (r6v0 'arrayList' java.util.ArrayList)
                  (wrap: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a$d$2 : 0x0073: CONSTRUCTOR  (r0v34 com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a$d$2) = (r1v9 'eVar' com.ss.android.ugc.playerkit.simapicommon.a.e) call: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a.d.2.<init>(com.ss.android.ugc.f.a.a.a.a.c):void type: CONSTRUCTOR)
                 type: INTERFACE call: java.util.List.add(java.lang.Object):boolean in method: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.m.a(java.lang.String, com.ss.android.ugc.aweme.player.sdk.b.c):com.ss.android.ugc.aweme.player.sdk.b.b, file: classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:67)
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0073: CONSTRUCTOR  (r0v34 com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a$d$2) = (r1v9 'eVar' com.ss.android.ugc.playerkit.simapicommon.a.e) call: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a.d.2.<init>(com.ss.android.ugc.f.a.a.a.a.c):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.m.a(java.lang.String, com.ss.android.ugc.aweme.player.sdk.b.c):com.ss.android.ugc.aweme.player.sdk.b.b, file: classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 23 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 29 more
                */
            /*
            // Method dump skipped, instructions count: 276
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.m.a(java.lang.String, com.ss.android.ugc.aweme.player.sdk.b.c):com.ss.android.ugc.aweme.player.sdk.b.b");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
            if (r2.size() != 0) goto L_0x007b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x029e, code lost:
            if (r0 == null) goto L_0x02a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x02a0, code lost:
            r11 = r0.intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x02a4, code lost:
            r25 = r18;
            r26 = "use_cache1";
         */
        @Override // com.ss.android.ugc.aweme.simkit.api.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.f.a.a.a.a.c a(com.ss.android.ugc.playerkit.simapicommon.a.i r31, boolean r32) {
            /*
            // Method dump skipped, instructions count: 1186
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.m.a(com.ss.android.ugc.playerkit.simapicommon.a.i, boolean):com.ss.android.ugc.f.a.a.a.a.c");
        }
    }
