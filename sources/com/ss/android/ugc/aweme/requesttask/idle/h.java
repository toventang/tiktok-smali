package com.ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.u;
import com.bytedance.ug.sdk.region.data.b.a;
import com.bytedance.ug.sdk.region.data.b.b;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.s;
import com.ss.android.ugc.aweme.legoImp.task.api.BDRegionReportApi;
import com.ss.android.ugc.aweme.user.f;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class h implements r {

    /* renamed from: a  reason: collision with root package name */
    public static final a f120707a = new a((byte) 0);

    static final class c implements a.AbstractC1125a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f120708a = new c();

        static {
            Covode.recordClassIndex(78642);
        }

        c() {
        }
    }

    static {
        Covode.recordClassIndex(78639);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return s.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "request_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(78640);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements com.bytedance.bdlocation.traceroute.b.a {
        static {
            Covode.recordClassIndex(78641);
        }

        b() {
        }

        @Override // com.bytedance.bdlocation.traceroute.b.a
        public final String a(String str, String str2, Map<String, String> map, Map<String, String> map2) {
            u<String> execute;
            T t;
            String str3 = str + str2;
            com.bytedance.retrofit2.b<String> doPost = ((TraceRouterApi) RetrofitFactory.a().b(str3).d().a(TraceRouterApi.class)).doPost(str3, map, null, map2, true);
            if (doPost == null || (execute = doPost.execute()) == null || (t = execute.f42630b) == null) {
                return "";
            }
            return t;
        }

        @Override // com.bytedance.bdlocation.traceroute.b.a
        public final String a(String str, Map<String, String> map, Map<String, String> map2, byte[] bArr) {
            u<String> execute;
            T t;
            IRetrofitFactory a2 = RetrofitFactory.a();
            if (str == null) {
                l.b();
            }
            com.bytedance.retrofit2.b<String> doRegionPost = ((TraceRouterApi) a2.b(str).d().a(TraceRouterApi.class)).doRegionPost(str, map, map2, new TypedByteArray("application/json; charset=utf-8", bArr, new String[0]), true);
            if (doRegionPost == null || (execute = doRegionPost.execute()) == null || (t = execute.f42630b) == null) {
                return "";
            }
            return t;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final aa b() {
        return aa.IDLE;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static final class e implements com.bytedance.ug.sdk.region.data.c.a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f120710a = new e();

        static {
            Covode.recordClassIndex(78644);
        }

        e() {
        }

        @Override // com.bytedance.ug.sdk.region.data.c.a
        public final void a(Runnable runnable) {
            g.b().execute(runnable);
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final void a(Context context, boolean z) {
        int i2;
        l.d(context, "");
        if (z) {
            com.bytedance.bdlocation.traceroute.a.f26354f = new b();
            b.a aVar = new b.a();
            aVar.f45783i = context;
            aVar.f45776b = "api-va.tiktokv.com";
            aVar.f45778d = true;
            if (!f.a(com.ss.android.ugc.aweme.user.e.f142364k.a()) || !in.e()) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            aVar.f45775a = i2;
            aVar.f45779e = d.f120709a;
            aVar.f45780f = e.f120710a;
            com.bytedance.ug.sdk.region.data.b.b bVar = new com.bytedance.ug.sdk.region.data.b.b(aVar, (byte) 0);
            com.bytedance.ug.sdk.region.data.d.a.f45784a = bVar;
            com.bytedance.ug.sdk.region.data.d.a.f45785b = bVar.f45766a;
            if (Boolean.valueOf(bVar.f45768c).booleanValue() && bVar.f45774i != 1) {
                com.bytedance.ug.sdk.region.data.f.b.a(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005d: INVOKE  
                      (wrap: com.bytedance.ug.sdk.region.data.g.a$1 : 0x005a: CONSTRUCTOR  (r0v18 com.bytedance.ug.sdk.region.data.g.a$1) = 
                      (wrap: android.content.Context : 0x0056: IGET  (r1v3 android.content.Context) = (r1v0 'bVar' com.bytedance.ug.sdk.region.data.b.b) com.bytedance.ug.sdk.region.data.b.b.h android.content.Context)
                     call: com.bytedance.ug.sdk.region.data.g.a.1.<init>(android.content.Context):void type: CONSTRUCTOR)
                     type: STATIC call: com.bytedance.ug.sdk.region.data.f.b.a(java.lang.Runnable):void in method: com.ss.android.ugc.aweme.requesttask.idle.h.a(android.content.Context, boolean):void, file: classes2.dex
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005a: CONSTRUCTOR  (r0v18 com.bytedance.ug.sdk.region.data.g.a$1) = 
                      (wrap: android.content.Context : 0x0056: IGET  (r1v3 android.content.Context) = (r1v0 'bVar' com.bytedance.ug.sdk.region.data.b.b) com.bytedance.ug.sdk.region.data.b.b.h android.content.Context)
                     call: com.bytedance.ug.sdk.region.data.g.a.1.<init>(android.content.Context):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.requesttask.idle.h.a(android.content.Context, boolean):void, file: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 26 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ug.sdk.region.data.g.a, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 32 more
                    */
                /*
                // Method dump skipped, instructions count: 119
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.requesttask.idle.h.a(android.content.Context, boolean):void");
            }

            static final class d implements com.bytedance.ug.sdk.region.data.c.c {

                /* renamed from: a  reason: collision with root package name */
                public static final d f120709a = new d();

                static {
                    Covode.recordClassIndex(78643);
                }

                d() {
                }

                @Override // com.bytedance.ug.sdk.region.data.c.c
                public final String a(String str, Map<String, String> map, Map<String, String> map2, byte[] bArr) {
                    return ((BDRegionReportApi) RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(BDRegionReportApi.class)).doPost(str, map, map2, new TypedByteArray("application/json; charset=utf-8", bArr, new String[0])).get();
                }
            }
        }
