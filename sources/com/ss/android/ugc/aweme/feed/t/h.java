package com.ss.android.ugc.aweme.feed.t;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.experiment.cx;
import com.ss.android.ugc.aweme.feed.FeedApiService;
import com.ss.android.ugc.aweme.feed.k;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.logger.a;
import java.util.concurrent.Callable;

final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final e f93933a;

    static {
        Covode.recordClassIndex(59749);
    }

    h(e eVar) {
        this.f93933a = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        e eVar = this.f93933a;
        d.a();
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = e.d();
        }
        if (!j.f107229h) {
            return null;
        }
        if (eVar.f93917b) {
            eVar.f93917b = false;
            return null;
        }
        int i2 = k.e() ? 4 : 0;
        System.currentTimeMillis();
        System.currentTimeMillis();
        a.b.f109011a.b("app_start_to_preload_first_request", false);
        a.b.f109011a.a("cold_boot_first_request_to_get_did", false);
        if (cx.a()) {
            a.b.f109011a.a("feed_preload_retrofit_start", false);
            a.b.f109011a.b("feed_preload_retrofit_start", false);
        }
        FeedItemList fetchFeedList = FeedApiService.a().fetchFeedList(0, 0, 0, 6, null, null, i2, 0, "", null, null, 0, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0079: INVOKE  (r3v4 'fetchFeedList' com.ss.android.ugc.aweme.feed.model.FeedItemList) = 
              (wrap: com.ss.android.ugc.aweme.feed.cache.IFeedApi : 0x0058: INVOKE  (r3v3 com.ss.android.ugc.aweme.feed.cache.IFeedApi) =  type: STATIC call: com.ss.android.ugc.aweme.feed.FeedApiService.a():com.ss.android.ugc.aweme.feed.cache.IFeedApi)
              (0 int)
              (0 long)
              (0 long)
              (6 int)
              (null java.lang.Integer)
              (null java.lang.String)
              (r12v1 'i2' int)
              (0 int)
              ("")
              (null java.lang.String)
              (null java.lang.String)
              (0 long)
              (wrap: com.ss.android.ugc.aweme.feed.t.e$1 : 0x006c: CONSTRUCTOR  (r2v5 com.ss.android.ugc.aweme.feed.t.e$1) = (r0v1 'eVar' com.ss.android.ugc.aweme.feed.t.e) call: com.ss.android.ugc.aweme.feed.t.e.1.<init>(com.ss.android.ugc.aweme.feed.t.e):void type: CONSTRUCTOR)
              (null android.os.Bundle)
              false
             type: INTERFACE call: com.ss.android.ugc.aweme.feed.cache.IFeedApi.fetchFeedList(int, long, long, int, java.lang.Integer, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, long, com.ss.android.ugc.aweme.feed.cache.j, android.os.Bundle, java.lang.Boolean):com.ss.android.ugc.aweme.feed.model.FeedItemList in method: com.ss.android.ugc.aweme.feed.t.h.call():java.lang.Object, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006c: CONSTRUCTOR  (r2v5 com.ss.android.ugc.aweme.feed.t.e$1) = (r0v1 'eVar' com.ss.android.ugc.aweme.feed.t.e) call: com.ss.android.ugc.aweme.feed.t.e.1.<init>(com.ss.android.ugc.aweme.feed.t.e):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.feed.t.h.call():java.lang.Object, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 22 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.feed.t.e, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 28 more
            */
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.t.h.call():java.lang.Object");
    }
}
