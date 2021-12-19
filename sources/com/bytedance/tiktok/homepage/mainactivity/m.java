package com.bytedance.tiktok.homepage.mainactivity;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.liko.leakdetector.a;
import com.bytedance.liko.leakdetector.b;
import com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver;
import java.util.List;

final /* synthetic */ class m implements b {

    /* renamed from: b  reason: collision with root package name */
    private final PerformanceActivityObserver.LikoInitTask f44175b;

    static {
        Covode.recordClassIndex(27069);
    }

    m(PerformanceActivityObserver.LikoInitTask likoInitTask) {
        this.f44175b = likoInitTask;
    }

    @Override // com.bytedance.liko.leakdetector.b
    public final void a(String str, List list, a aVar) {
        ((PerformanceActivityObserver.FileApi) RetrofitFactory.a().a(str).a(PerformanceActivityObserver.FileApi.class)).upload(str, list).enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: INVOKE  
              (wrap: com.bytedance.retrofit2.b<java.lang.String> : 0x0012: INVOKE  (r1v1 com.bytedance.retrofit2.b<java.lang.String>) = 
              (wrap: com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$FileApi : 0x0010: CHECK_CAST (r0v3 com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$FileApi) = (com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$FileApi) (wrap: java.lang.Object : 0x000c: INVOKE  (r0v2 java.lang.Object) = 
              (wrap: com.bytedance.ies.ugc.aweme.network.f : 0x0006: INVOKE  (r1v0 com.bytedance.ies.ugc.aweme.network.f) = 
              (wrap: com.bytedance.ies.ugc.aweme.network.IRetrofitFactory : 0x0002: INVOKE  (r0v0 com.bytedance.ies.ugc.aweme.network.IRetrofitFactory) =  type: STATIC call: com.bytedance.ies.ugc.aweme.network.RetrofitFactory.a():com.bytedance.ies.ugc.aweme.network.IRetrofitFactory)
              (r4v0 'str' java.lang.String)
             type: INTERFACE call: com.bytedance.ies.ugc.aweme.network.IRetrofitFactory.a(java.lang.String):com.bytedance.ies.ugc.aweme.network.f)
              (wrap: java.lang.Class : 0x000a: CONST_CLASS   com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$FileApi.class)
             type: INTERFACE call: com.bytedance.ies.ugc.aweme.network.f.a(java.lang.Class):java.lang.Object))
              (r4v0 'str' java.lang.String)
              (r5v0 'list' java.util.List)
             type: INTERFACE call: com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver.FileApi.upload(java.lang.String, java.util.List):com.bytedance.retrofit2.b)
              (wrap: com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$LikoInitTask$1 : 0x0018: CONSTRUCTOR  (r0v4 com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$LikoInitTask$1) = 
              (wrap: com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$LikoInitTask : 0x0000: IGET  (r2v0 com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$LikoInitTask) = (r3v0 'this' com.bytedance.tiktok.homepage.mainactivity.m A[IMMUTABLE_TYPE, THIS]) com.bytedance.tiktok.homepage.mainactivity.m.b com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$LikoInitTask)
              (r6v0 'aVar' com.bytedance.liko.leakdetector.a)
             call: com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver.LikoInitTask.1.<init>(com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$LikoInitTask, com.bytedance.liko.leakdetector.a):void type: CONSTRUCTOR)
             type: INTERFACE call: com.bytedance.retrofit2.b.enqueue(com.bytedance.retrofit2.d):void in method: com.bytedance.tiktok.homepage.mainactivity.m.a(java.lang.String, java.util.List, com.bytedance.liko.leakdetector.a):void, file: classes2.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0018: CONSTRUCTOR  (r0v4 com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$LikoInitTask$1) = 
              (wrap: com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$LikoInitTask : 0x0000: IGET  (r2v0 com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$LikoInitTask) = (r3v0 'this' com.bytedance.tiktok.homepage.mainactivity.m A[IMMUTABLE_TYPE, THIS]) com.bytedance.tiktok.homepage.mainactivity.m.b com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$LikoInitTask)
              (r6v0 'aVar' com.bytedance.liko.leakdetector.a)
             call: com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver.LikoInitTask.1.<init>(com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$LikoInitTask, com.bytedance.liko.leakdetector.a):void type: CONSTRUCTOR in method: com.bytedance.tiktok.homepage.mainactivity.m.a(java.lang.String, java.util.List, com.bytedance.liko.leakdetector.a):void, file: classes2.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$LikoInitTask r2 = r3.f44175b
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r0 = com.bytedance.ies.ugc.aweme.network.RetrofitFactory.a()
            com.bytedance.ies.ugc.aweme.network.f r1 = r0.a(r4)
            java.lang.Class<com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$FileApi> r0 = com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver.FileApi.class
            java.lang.Object r0 = r1.a(r0)
            com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$FileApi r0 = (com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver.FileApi) r0
            com.bytedance.retrofit2.b r1 = r0.upload(r4, r5)
            com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$LikoInitTask$1 r0 = new com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$LikoInitTask$1
            r0.<init>(r6)
            r1.enqueue(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainactivity.m.a(java.lang.String, java.util.List, com.bytedance.liko.leakdetector.a):void");
    }
}
