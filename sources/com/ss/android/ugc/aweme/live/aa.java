package com.ss.android.ugc.aweme.live;

import com.bytedance.android.b.a.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.by;
import java.util.Map;

public final class aa implements e {
    static {
        Covode.recordClassIndex(69303);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static e f108093a = new aa();

        static {
            Covode.recordClassIndex(69304);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.e
    public final void a() {
        if (by.a()) {
            ((b) com.bytedance.android.live.t.a.a(b.class)).requestTabListForyouPage();
        } else if (Live.getService() != null) {
            Live.getService().c();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.e
    public final void a(Map<String, String> map) {
        
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0005: INVOKE  
              (wrap: com.bytedance.android.livesdk.feed.network.a$1 : 0x0002: CONSTRUCTOR  (r0v0 com.bytedance.android.livesdk.feed.network.a$1) =  call: com.bytedance.android.livesdk.feed.network.a.1.<init>():void type: CONSTRUCTOR)
              (r2v0 'map' java.util.Map<java.lang.String, java.lang.String>)
             type: INTERFACE call: com.bytedance.android.livesdk.feed.network.a.a.a(java.util.Map):void in method: com.ss.android.ugc.aweme.live.aa.a(java.util.Map<java.lang.String, java.lang.String>):void, file: classes2.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 com.bytedance.android.livesdk.feed.network.a$1) =  call: com.bytedance.android.livesdk.feed.network.a.1.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.live.aa.a(java.util.Map<java.lang.String, java.lang.String>):void, file: classes2.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.feed.network.a, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            com.bytedance.android.livesdk.feed.network.a$1 r0 = new com.bytedance.android.livesdk.feed.network.a$1
            r0.<init>()
            r0.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.aa.a(java.util.Map):void");
    }
}
