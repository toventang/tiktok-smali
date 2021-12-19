package com.bytedance.android.livesdk.chatroom.g;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.covode.number.Covode;
import com.facebook.d.c;
import com.facebook.d.f;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.o.b;
import f.a.v;
import f.a.w;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements w {

    /* renamed from: a  reason: collision with root package name */
    private final ImageModel f15536a;

    static {
        Covode.recordClassIndex(8589);
    }

    h(ImageModel imageModel) {
        this.f15536a = imageModel;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        c a2;
        ExecutorService executorService;
        ImageModel imageModel = this.f15536a;
        b[] b2 = g.b(imageModel);
        if (!(b2 == null || b2.length == 0)) {
            ArrayList arrayList = new ArrayList();
            for (b bVar : b2) {
                if (bVar != null) {
                    arrayList.add(k.a().e().a(bVar, b.EnumC1183b.FULL_FETCH));
                }
            }
            if (!arrayList.isEmpty() && (a2 = f.a(arrayList).b()) != null) {
                g.AnonymousClass1 r1 = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0062: CONSTRUCTOR  (r1v1 'r1' com.bytedance.android.livesdk.chatroom.g.g$1) = (r9v0 'vVar' f.a.v), (r6v0 'imageModel' com.bytedance.android.live.base.model.ImageModel) call: com.bytedance.android.livesdk.chatroom.g.g.1.<init>(f.a.v, com.bytedance.android.live.base.model.ImageModel):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.chatroom.g.h.subscribe(f.a.v):void, file: classes6.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.chatroom.g.g, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    */
                /*
                // Method dump skipped, instructions count: 120
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.g.h.subscribe(f.a.v):void");
            }
        }
