package com.ss.android.ugc.aweme.music.presenter;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.musicprovider.interfaces.c;

final /* synthetic */ class p implements c {

    /* renamed from: a  reason: collision with root package name */
    private final n f111613a;

    static {
        Covode.recordClassIndex(71720);
    }

    p(n nVar) {
        this.f111613a = nVar;
    }

    @Override // com.ss.android.ugc.musicprovider.interfaces.c
    public final void a(int i2) {
        String str;
        n nVar = this.f111613a;
        nVar.z = SystemClock.elapsedRealtime();
        ((r) nVar.f76397i).b();
        MusicModel musicModel = nVar.f111604f;
        if (b.a().a(true, "remove_15s_cap_music", true)) {
            if (nVar.q != null) {
                nVar.q.cancel();
            }
            if (musicModel.getDuration() != musicModel.getAuditionDuration().intValue()) {
                long realAuditionDuration = (long) musicModel.getRealAuditionDuration();
                if (realAuditionDuration <= 0) {
                    a.a("MusicDetailFragment: audition_duration is zero, music id: " + musicModel.getMusicId());
                } else {
                    nVar.q = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0152: IPUT  
                          (wrap: com.ss.android.ugc.aweme.music.presenter.n$2 : 0x014f: CONSTRUCTOR  (r0v46 com.ss.android.ugc.aweme.music.presenter.n$2) = (r4v0 'nVar' com.ss.android.ugc.aweme.music.presenter.n), (r1v24 'realAuditionDuration' long) call: com.ss.android.ugc.aweme.music.presenter.n.2.<init>(com.ss.android.ugc.aweme.music.presenter.n, long):void type: CONSTRUCTOR)
                          (r4v0 'nVar' com.ss.android.ugc.aweme.music.presenter.n)
                         com.ss.android.ugc.aweme.music.presenter.n.q android.os.CountDownTimer in method: com.ss.android.ugc.aweme.music.presenter.p.a(int):void, file: classes5.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x014f: CONSTRUCTOR  (r0v46 com.ss.android.ugc.aweme.music.presenter.n$2) = (r4v0 'nVar' com.ss.android.ugc.aweme.music.presenter.n), (r1v24 'realAuditionDuration' long) call: com.ss.android.ugc.aweme.music.presenter.n.2.<init>(com.ss.android.ugc.aweme.music.presenter.n, long):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.music.presenter.p.a(int):void, file: classes5.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 29 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.music.presenter.n, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 33 more
                        */
                    /*
                    // Method dump skipped, instructions count: 347
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.presenter.p.a(int):void");
                }
            }
