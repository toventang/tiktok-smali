package com.ss.android.ugc.aweme.video.simplayer.tt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.a.q;
import com.ss.android.ugc.aweme.player.sdk.api.j;
import com.ss.android.ugc.aweme.player.sdk.api.l;
import com.ss.android.ugc.aweme.player.sdk.b.e;
import com.ss.android.ugc.aweme.video.config.a;
import com.ss.android.ugc.aweme.video.m;
import com.ss.android.ugc.aweme.video.simplayer.aa;
import com.ss.android.ugc.aweme.video.simplayer.g;
import com.ss.android.ugc.aweme.video.simplayer.n;
import com.ss.android.ugc.aweme.video.simplayer.p;
import com.ss.android.ugc.playerkit.d.d;
import com.ss.android.ugc.playerkit.simapicommon.a.h;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import com.ss.ttvideoengine.j.s;
import java.io.File;

public final class c extends p {
    static {
        Covode.recordClassIndex(94176);
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f, com.ss.android.ugc.aweme.video.simplayer.p
    public final void l() {
        if (this.f143919a != null) {
            this.f143919a.a(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.p
    public final aa n() {
        return new f(this.f143919a, this, this.f143927i);
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.p
    public final m a(boolean z) {
        return new b(z);
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.p
    public final g a(h hVar) {
        return new g(h.a(hVar));
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f, com.ss.android.ugc.aweme.video.simplayer.p
    public final void a(int i2) {
        if (this.f143919a != null) {
            this.f143919a.c(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f, com.ss.android.ugc.aweme.video.simplayer.p
    public final void a(com.ss.android.ugc.aweme.player.sdk.api.m mVar) {
        if (this.f143919a != null) {
            this.f143919a.a(mVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f, com.ss.android.ugc.aweme.video.simplayer.p
    public final void a(float f2) {
        s sVar;
        super.a(f2);
        j.f c2 = this.f143925g.c();
        com.ss.ttvideoengine.j.p a2 = q.a(this.f143922d);
        g gVar = this.f143923e;
        if (gVar == null || gVar.a() == null) {
            sVar = null;
        } else {
            sVar = (s) gVar.a();
        }
        if (!(c2 == null || c2.f115318i == null)) {
            a2 = q.a(c2.f115318i);
        }
        if (!(a2 == null || a2.f152968d == null || a2.f152968d.b() == null || a2.f152968d.b().size() <= 0)) {
            sVar = a2.f152968d.b().get(0);
        }
        if (sVar != null) {
            if (!new File(a.C3820a.f143369a.a().getThumbCacheDir(com.ss.android.ugc.playerkit.simapicommon.a.f148866a) + "/" + h.a(sVar)).exists()) {
                a.C3820a.f143369a.a().downloadFile(sVar.f152996c, h.a(sVar), a.C3820a.f143369a.a().getThumbCacheDir(com.ss.android.ugc.playerkit.simapicommon.a.f148866a), "legacy_video_thumb");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.p
    public final com.ss.android.ugc.playerkit.model.p a(n nVar) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean isAsyncInit = a.C3820a.f143369a.b().isAsyncInit();
        i a2 = com.ss.android.ugc.aweme.video.simplayer.s.a(nVar.f143897a);
        IALog d2 = com.ss.android.ugc.playerkit.simapicommon.a.d();
        StringBuilder sb = new StringBuilder("createDashPrepareData aid:");
        if (a2 != null) {
            str = a2.getSourceId();
        } else {
            str = "null";
        }
        d2.e("SimPlayerHelper", sb.append(str).toString());
        com.ss.android.ugc.playerkit.model.p pVar = null;
        if (a2 == null) {
            return null;
        }
        String sourceId = a2.getSourceId();
        com.ss.ttvideoengine.j.p a3 = a.a(nVar.f143897a.getVideoModelStr());
        if (!(a3 == null || a3.f152968d == null)) {
            e a4 = d.a(a2, new com.ss.android.ugc.aweme.player.sdk.a.p(a3));
            if (nVar.f143904h != null) {
                a4.f115346l = nVar.f143904h.isUseSuperResolution();
            }
            if (nVar.f143897a.getPlayAddr() != null) {
                str2 = nVar.f143897a.getPlayAddr().getUri();
            } else {
                str2 = a3.f152968d.f152983h;
            }
            String str3 = a3.f152968d.f152983h;
            boolean a5 = e.a(a3);
            nVar.f143897a.getPlayAddr().setDashVideoId(str3);
            com.ss.android.ugc.playerkit.session.a.f148854a.c(sourceId, str3);
            nVar.f143897a.getPlayAddr().setDashVideoModelStr(nVar.f143897a.getVideoModelStr());
            if (nVar.f143905i != null) {
                z = nVar.f143905i.f143492l;
            } else {
                z = false;
            }
            pVar = r9;
            com.ss.android.ugc.playerkit.model.p pVar2 = new com.ss.android.ugc.playerkit.model.p(com.ss.android.ugc.aweme.video.simplayer.s.a(sourceId, z, (long) a2.getDuration()), null, com.ss.android.ugc.playerkit.simapicommon.a.f148866a, sourceId, nVar.f143898b, nVar.f143904h, false, a5, com.ss.android.ugc.playerkit.model.c.f148702a.getRenderType(), null, str2, !nVar.f143899c, isAsyncInit, a.C3820a.f143369a.b().get265DecodeType(), 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d7: CONSTRUCTOR  (r9v0 'pVar2' com.ss.android.ugc.playerkit.model.p) = 
                  (wrap: com.ss.android.ugc.playerkit.a.d<com.ss.android.ugc.playerkit.model.u> : 0x00a8: INVOKE  (r10v0 com.ss.android.ugc.playerkit.a.d<com.ss.android.ugc.playerkit.model.u>) = 
                  (r13v0 'sourceId' java.lang.String)
                  (r8v1 'z' boolean)
                  (wrap: long : 0x00a7: CAST (r2v17 long) = (long) (wrap: double : 0x00a3: INVOKE  (r4v1 double) = (r4v0 'a2' com.ss.android.ugc.playerkit.simapicommon.a.i) type: VIRTUAL call: com.ss.android.ugc.playerkit.simapicommon.a.i.getDuration():double))
                 type: STATIC call: com.ss.android.ugc.aweme.video.simplayer.s.a(java.lang.String, boolean, long):com.ss.android.ugc.playerkit.a.d)
                  (null com.ss.android.ugc.playerkit.a.d)
                  (wrap: android.app.Application : 0x00ad: SGET  (r12v0 android.app.Application) =  com.ss.android.ugc.playerkit.simapicommon.a.a android.app.Application)
                  (r13v0 'sourceId' java.lang.String)
                  (wrap: boolean : 0x00af: IGET  (r14v0 boolean) = (r26v0 'nVar' com.ss.android.ugc.aweme.video.simplayer.n) com.ss.android.ugc.aweme.video.simplayer.n.b boolean)
                  (wrap: com.ss.android.ugc.aweme.video.x : 0x00b1: IGET  (r15v0 com.ss.android.ugc.aweme.video.x) = (r26v0 'nVar' com.ss.android.ugc.aweme.video.simplayer.n) com.ss.android.ugc.aweme.video.simplayer.n.h com.ss.android.ugc.aweme.video.x)
                  false
                  (r17v0 'a5' boolean)
                  (wrap: int : 0x00b7: INVOKE  (r18v0 int) = 
                  (wrap: com.ss.android.ugc.playerkit.model.c : 0x00b5: SGET  (r2v18 com.ss.android.ugc.playerkit.model.c) =  com.ss.android.ugc.playerkit.model.c.a com.ss.android.ugc.playerkit.model.c)
                 type: VIRTUAL call: com.ss.android.ugc.playerkit.model.c.getRenderType():int)
                  (null com.ss.android.ugc.playerkit.a.d)
                  (r7v1 'str2' java.lang.String)
                  (wrap: boolean : ?: NOT  
                  (wrap: boolean : 0x00bd: IGET  (r2v19 boolean) = (r26v0 'nVar' com.ss.android.ugc.aweme.video.simplayer.n) com.ss.android.ugc.aweme.video.simplayer.n.c boolean)
                )
                  (r22v0 'isAsyncInit' boolean)
                  (wrap: int : 0x00c8: INVOKE  (r23v0 int) = 
                  (wrap: com.ss.android.ugc.aweme.video.config.IPlayerExperiment : 0x00c4: INVOKE  (r2v21 com.ss.android.ugc.aweme.video.config.IPlayerExperiment) = 
                  (wrap: com.ss.android.ugc.aweme.video.config.a : 0x00c2: SGET  (r2v20 com.ss.android.ugc.aweme.video.config.a) =  com.ss.android.ugc.aweme.video.config.a.a.a com.ss.android.ugc.aweme.video.config.a)
                 type: VIRTUAL call: com.ss.android.ugc.aweme.video.config.a.b():com.ss.android.ugc.aweme.video.config.IPlayerExperiment)
                 type: INTERFACE call: com.ss.android.ugc.aweme.video.config.IPlayerExperiment.get265DecodeType():int)
                  (wrap: com.ss.android.ugc.aweme.video.simplayer.tt.e$1 : 0x00ce: CONSTRUCTOR  (r3v6 com.ss.android.ugc.aweme.video.simplayer.tt.e$1) = (r6v0 'a4' com.ss.android.ugc.aweme.player.sdk.b.e) call: com.ss.android.ugc.aweme.video.simplayer.tt.e.1.<init>(com.ss.android.ugc.aweme.player.sdk.b.e):void type: CONSTRUCTOR)
                 call: com.ss.android.ugc.playerkit.model.p.<init>(com.ss.android.ugc.playerkit.a.d, com.ss.android.ugc.playerkit.a.d, android.content.Context, java.lang.String, boolean, com.ss.android.ugc.playerkit.model.i, boolean, boolean, int, com.ss.android.ugc.playerkit.a.d, java.lang.String, boolean, boolean, int, java.lang.Runnable):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.video.simplayer.tt.c.a(com.ss.android.ugc.aweme.video.simplayer.n):com.ss.android.ugc.playerkit.model.p, file: classes4.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ce: CONSTRUCTOR  (r3v6 com.ss.android.ugc.aweme.video.simplayer.tt.e$1) = (r6v0 'a4' com.ss.android.ugc.aweme.player.sdk.b.e) call: com.ss.android.ugc.aweme.video.simplayer.tt.e.1.<init>(com.ss.android.ugc.aweme.player.sdk.b.e):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.video.simplayer.tt.c.a(com.ss.android.ugc.aweme.video.simplayer.n):com.ss.android.ugc.playerkit.model.p, file: classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:663)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 23 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.video.simplayer.tt.e, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 29 more
                */
            /*
            // Method dump skipped, instructions count: 677
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.simplayer.tt.c.a(com.ss.android.ugc.aweme.video.simplayer.n):com.ss.android.ugc.playerkit.model.p");
        }

        public c(l lVar, boolean z, com.ss.android.ugc.aweme.video.simplayer.l lVar2) {
            super(lVar, z, lVar2);
        }
    }
