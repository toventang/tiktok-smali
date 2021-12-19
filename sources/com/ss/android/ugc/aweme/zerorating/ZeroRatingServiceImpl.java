package com.ss.android.ugc.aweme.zerorating;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.u;
import com.bytedance.sdk.b.a;
import com.bytedance.sdk.b.a.d;
import com.bytedance.sdk.b.b;
import com.bytedance.sdk.b.d.a;
import com.bytedance.ttnet.INetworkApi;
import com.ss.android.agilelogger.ALog;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.api.IZeroRatingService;
import com.ss.android.ugc.aweme.api.g;
import com.ss.android.ugc.aweme.lancet.j;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class ZeroRatingServiceImpl implements IZeroRatingService {

    /* renamed from: d  reason: collision with root package name */
    static final boolean f145344d = false;

    /* renamed from: e  reason: collision with root package name */
    public static final a f145345e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public INetworkApi f145346a;

    /* renamed from: b  reason: collision with root package name */
    public INetworkApi f145347b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<String> f145348c = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private volatile com.bytedance.sdk.b.b f145349f;

    public static final class a {
        static {
            Covode.recordClassIndex(95030);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements a.AbstractC1049a {
        static {
            Covode.recordClassIndex(95032);
        }

        c() {
        }
    }

    @Override // com.ss.android.ugc.aweme.api.IZeroRatingService
    public final com.ss.android.ugc.aweme.api.d c() {
        return new a();
    }

    @Override // com.ss.android.ugc.aweme.api.IZeroRatingService
    public final void d() {
        com.bytedance.sdk.b.b bVar = this.f145349f;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.api.IZeroRatingService
    public final void e() {
        com.bytedance.sdk.b.b bVar = this.f145349f;
        if (bVar != null) {
            bVar.c();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ZeroRatingServiceImpl f145350a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f145351b;

        static {
            Covode.recordClassIndex(95031);
        }

        b(ZeroRatingServiceImpl zeroRatingServiceImpl, String str) {
            this.f145350a = zeroRatingServiceImpl;
            this.f145351b = str;
        }

        public final void run() {
            ArrayList<String> arrayList = this.f145350a.f145348c;
            String str = this.f145351b;
            if (str == null) {
                str = "";
            }
            arrayList.add(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.api.IZeroRatingService
    public final boolean b() {
        com.bytedance.sdk.b.b bVar = this.f145349f;
        if (bVar != null) {
            return bVar.a();
        }
        return false;
    }

    static {
        Covode.recordClassIndex(95029);
    }

    public static IZeroRatingService f() {
        MethodCollector.i(5555);
        Object a2 = com.ss.android.ugc.b.a(IZeroRatingService.class, false);
        if (a2 != null) {
            IZeroRatingService iZeroRatingService = (IZeroRatingService) a2;
            MethodCollector.o(5555);
            return iZeroRatingService;
        }
        if (com.ss.android.ugc.b.eG == null) {
            synchronized (IZeroRatingService.class) {
                try {
                    if (com.ss.android.ugc.b.eG == null) {
                        com.ss.android.ugc.b.eG = new ZeroRatingServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5555);
                    throw th;
                }
            }
        }
        ZeroRatingServiceImpl zeroRatingServiceImpl = (ZeroRatingServiceImpl) com.ss.android.ugc.b.eG;
        MethodCollector.o(5555);
        return zeroRatingServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.api.IZeroRatingService
    public final void a() {
        String str;
        if (this.f145346a == null) {
            this.f145346a = (INetworkApi) RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(INetworkApi.class);
        }
        if (this.f145347b == null) {
            this.f145347b = (INetworkApi) RetrofitFactory.a().b(com.ss.android.c.b.f59141e).a().d().a(INetworkApi.class);
        }
        d.a aVar = new d.a();
        Context applicationContext = com.bytedance.ies.ugc.appcontext.d.a().getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        aVar.f43496b = applicationContext;
        if (com.bytedance.ies.ugc.appcontext.d.n == 1233) {
            str = "carrierflow-va.tiktokv.com";
        } else {
            str = "carrierflow-sg.tiktokv.com";
        }
        aVar.f43501g = str;
        aVar.f43495a = new d(this);
        aVar.f43498d = new e(this);
        aVar.f43499e = new f(this);
        aVar.f43503i = g.a();
        com.bytedance.sdk.b.a.d dVar = new com.bytedance.sdk.b.a.d(aVar, (byte) 0);
        c cVar = new c();
        boolean z = dVar.f43494k;
        com.bytedance.sdk.b.a.f43481a = dVar;
        com.bytedance.sdk.b.a.j();
        com.bytedance.sdk.b.a.a();
        if (z) {
            com.bytedance.sdk.b.d.a aVar2 = a.C1051a.f43568a;
            a.AnonymousClass1 r2 = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008f: CONSTRUCTOR  (r2v1 'r2' com.bytedance.sdk.b.a$1) = (r1v4 'cVar' com.ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl$c) call: com.bytedance.sdk.b.a.1.<init>(com.bytedance.sdk.b.a$a):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl.a():void, file: classes10.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.sdk.b.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                */
            /*
            // Method dump skipped, instructions count: 176
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl.a():void");
        }

        public static final class d implements com.bytedance.sdk.b.a.c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ZeroRatingServiceImpl f145352a;

            static {
                Covode.recordClassIndex(95033);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            d(ZeroRatingServiceImpl zeroRatingServiceImpl) {
                this.f145352a = zeroRatingServiceImpl;
            }

            @Override // com.bytedance.sdk.b.a.c
            public final String a(boolean z, String str) {
                com.bytedance.retrofit2.b<String> doGet;
                u<String> execute;
                T t;
                INetworkApi iNetworkApi = this.f145352a.f145346a;
                if (iNetworkApi == null || (doGet = iNetworkApi.doGet(true, 102400, str, null, null, null)) == null || (execute = doGet.execute()) == null || (t = execute.f42630b) == null) {
                    return "";
                }
                return t;
            }

            @Override // com.bytedance.sdk.b.a.c
            public final String a(String str, Map<String, String> map) {
                com.bytedance.retrofit2.b<String> doPost;
                u<String> execute;
                T t;
                com.bytedance.retrofit2.b<String> doPost2;
                u<String> execute2;
                T t2;
                if (str == null) {
                    return "";
                }
                if (p.a((CharSequence) str, (CharSequence) "/oversea/carrier_flow/", false)) {
                    INetworkApi iNetworkApi = this.f145352a.f145346a;
                    if (iNetworkApi == null || (doPost2 = iNetworkApi.doPost(102400, str, null, map, null, null)) == null || (execute2 = doPost2.execute()) == null || (t2 = execute2.f42630b) == null) {
                        return "";
                    }
                    return t2;
                }
                INetworkApi iNetworkApi2 = this.f145352a.f145347b;
                if (iNetworkApi2 == null || (doPost = iNetworkApi2.doPost(102400, str, null, map, null, null)) == null || (execute = doPost.execute()) == null || (t = execute.f42630b) == null) {
                    return "";
                }
                return t;
            }
        }

        public static final class f implements com.bytedance.sdk.b.a.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ZeroRatingServiceImpl f145354a;

            static {
                Covode.recordClassIndex(95035);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            f(ZeroRatingServiceImpl zeroRatingServiceImpl) {
                this.f145354a = zeroRatingServiceImpl;
            }

            @Override // com.bytedance.sdk.b.a.a
            public final void a(String str) {
                ZeroRatingServiceImpl zeroRatingServiceImpl = this.f145354a;
                if (ZeroRatingServiceImpl.f145344d) {
                    ALog.d("ZeroRatingServiceImpl", "logMsg is:".concat(String.valueOf(str)));
                    if (str == null) {
                        return;
                    }
                    if (p.a((CharSequence) str, (CharSequence) "response raw result", false) || p.a((CharSequence) str, (CharSequence) "request params", false) || p.a((CharSequence) str, (CharSequence) "response exception", false)) {
                        new Handler(Looper.getMainLooper()).post(new b(zeroRatingServiceImpl, str));
                    }
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.api.IZeroRatingService
        public final void a(com.bytedance.sdk.b.d.b.a<com.bytedance.sdk.b.b.a> aVar) {
            com.bytedance.sdk.b.b bVar = this.f145349f;
            if (bVar != null) {
                bVar.a(aVar);
            }
        }

        @Override // com.ss.android.ugc.aweme.api.IZeroRatingService
        public final void a(Handler handler) {
            l.d(handler, "");
            com.bytedance.sdk.b.b bVar = this.f145349f;
            if (bVar != null) {
                bVar.a(handler);
            }
        }

        @Override // com.ss.android.ugc.aweme.api.IZeroRatingService
        public final void a(boolean z, b.a aVar) {
            l.d(aVar, "");
            com.bytedance.sdk.b.b bVar = this.f145349f;
            if (bVar != null) {
                bVar.a(z, aVar);
            }
        }

        static final class e implements com.bytedance.sdk.b.a.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ZeroRatingServiceImpl f145353a;

            static {
                Covode.recordClassIndex(95034);
            }

            e(ZeroRatingServiceImpl zeroRatingServiceImpl) {
                this.f145353a = zeroRatingServiceImpl;
            }

            @Override // com.bytedance.sdk.b.a.b
            public final void a(String str, JSONObject jSONObject) {
                if (str.equals("zero_rating_status")) {
                    com.ss.android.ugc.aweme.api.d c2 = this.f145353a.c();
                    String optString = jSONObject.optString("plan_id");
                    l.b(optString, "");
                    String optString2 = jSONObject.optString("start_date");
                    l.b(optString2, "");
                    String optString3 = jSONObject.optString("status");
                    l.b(optString3, "");
                    String optString4 = jSONObject.optString("network_carrier");
                    l.b(optString4, "");
                    String optString5 = jSONObject.optString("network_mccmnc");
                    l.b(optString5, "");
                    c2.a(optString, optString2, optString3, optString4, optString5);
                    return;
                }
                Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
                if (j.f107228g == NetworkUtils.h.NONE || !j.b() || j.c()) {
                    j.f107228g = NetworkUtils.getNetworkType(a2);
                }
                jSONObject.put("network_type", j.f107228g.toString());
                Bundle bundle = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, jSONObject.optString(next));
                }
                com.ss.android.common.c.a.a(str, bundle);
            }
        }
    }
