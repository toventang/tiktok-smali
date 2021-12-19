package com.bytedance.im.core.a;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.c.i;
import com.bytedance.im.core.c.j;
import com.bytedance.im.core.d.ad;
import com.bytedance.im.core.d.bc;
import com.bytedance.im.core.d.be;
import com.bytedance.im.core.d.bf;
import com.bytedance.im.core.d.bg;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.h.c;
import com.bytedance.im.core.internal.a.i;
import com.bytedance.im.core.internal.b.a.am;
import com.bytedance.im.core.internal.b.a.an;
import com.bytedance.im.core.internal.b.a.x;
import com.bytedance.im.core.internal.b.a.y;
import com.bytedance.im.core.internal.d.a.b;
import com.bytedance.im.core.internal.utils.k;
import com.bytedance.im.core.internal.utils.l;
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.internal.utils.s;
import com.bytedance.im.core.internal.utils.t;
import com.bytedance.im.core.internal.utils.u;
import com.bytedance.im.core.proto.CheckMessagePerUserRequestBody;
import com.bytedance.im.core.proto.InboxMessagesPerUser;
import com.bytedance.im.core.proto.RequestBody;
import h.w;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class d {

    /* renamed from: k  reason: collision with root package name */
    private static d f37560k;

    /* renamed from: a  reason: collision with root package name */
    public Context f37561a;

    /* renamed from: b  reason: collision with root package name */
    public b f37562b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.im.core.c.a f37563c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f37564d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f37565e;

    /* renamed from: f  reason: collision with root package name */
    public Comparator<h> f37566f;

    /* renamed from: g  reason: collision with root package name */
    public o f37567g;

    /* renamed from: h  reason: collision with root package name */
    public i f37568h;

    /* renamed from: i  reason: collision with root package name */
    public h f37569i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f37570j = false;

    /* renamed from: l  reason: collision with root package name */
    private f f37571l;

    /* renamed from: m  reason: collision with root package name */
    private volatile boolean f37572m = false;
    private final Map<Integer, Runnable> n = new HashMap();
    private long o;
    private String p;
    private Handler q = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(22608);
    }

    static class a extends a {
        static {
            Covode.recordClassIndex(22613);
        }

        @Override // com.bytedance.im.core.a.b
        public final long a() {
            return -1;
        }

        @Override // com.bytedance.im.core.a.a, com.bytedance.im.core.a.b
        public final k a(String str) {
            return null;
        }

        @Override // com.bytedance.im.core.a.b
        public final void a(int i2) {
        }

        @Override // com.bytedance.im.core.a.b
        public final void a(int i2, int i3) {
        }

        @Override // com.bytedance.im.core.a.b
        public final void a(int i2, long j2, String str, byte[] bArr) {
        }

        @Override // com.bytedance.im.core.a.b
        public final void a(b bVar, com.bytedance.im.core.internal.d.a.a aVar) {
        }

        @Override // com.bytedance.im.core.a.a, com.bytedance.im.core.a.b
        public final void a(com.bytedance.im.core.internal.d.k kVar) {
        }

        @Override // com.bytedance.im.core.a.a, com.bytedance.im.core.a.b
        public final c b() {
            return null;
        }

        @Override // com.bytedance.im.core.a.b
        public final void b(int i2, int i3) {
        }

        @Override // com.bytedance.im.core.a.b
        public final String c() {
            return "";
        }

        @Override // com.bytedance.im.core.a.b
        public final String d() {
            return "";
        }

        @Override // com.bytedance.im.core.a.b
        public final boolean e() {
            return false;
        }

        @Override // com.bytedance.im.core.a.b
        public final String f() {
            return "";
        }

        @Override // com.bytedance.im.core.a.b
        public final boolean g() {
            return true;
        }

        @Override // com.bytedance.im.core.a.b
        public final int h() {
            return -1;
        }

        @Override // com.bytedance.im.core.a.b
        public final boolean i() {
            return false;
        }

        @Override // com.bytedance.im.core.a.a, com.bytedance.im.core.a.b
        public final c j() {
            return null;
        }

        @Override // com.bytedance.im.core.a.a, com.bytedance.im.core.a.b
        public final Map<String, String> k() {
            return null;
        }

        @Override // com.bytedance.im.core.a.a, com.bytedance.im.core.a.b
        public final void l() {
        }

        @Override // com.bytedance.im.core.a.a, com.bytedance.im.core.a.b
        public final boolean m() {
            return false;
        }

        @Override // com.bytedance.im.core.a.a, com.bytedance.im.core.a.b
        public final boolean n() {
            return false;
        }

        @Override // com.bytedance.im.core.a.a, com.bytedance.im.core.a.b
        public final boolean o() {
            return false;
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final f b() {
        f fVar = this.f37571l;
        if (fVar != null) {
            return fVar;
        }
        return new f();
    }

    public final synchronized void e() {
        MethodCollector.i(12160);
        a(6);
        MethodCollector.o(12160);
    }

    private d() {
        com.bytedance.im.core.e.a.f38057a = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0026: SPUT  
              (wrap: com.bytedance.im.core.e.b$1 : 0x0023: CONSTRUCTOR  (r0v3 com.bytedance.im.core.e.b$1) =  call: com.bytedance.im.core.e.b.1.<init>():void type: CONSTRUCTOR)
             com.bytedance.im.core.e.a.a com.bytedance.im.core.e.a in method: com.bytedance.im.core.a.d.<init>():void, file: classes10.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0023: CONSTRUCTOR  (r0v3 com.bytedance.im.core.e.b$1) =  call: com.bytedance.im.core.e.b.1.<init>():void type: CONSTRUCTOR in method: com.bytedance.im.core.a.d.<init>():void, file: classes10.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:439)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.im.core.e.b, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 18 more
            */
        /*
            this = this;
            r3.<init>()
            com.bytedance.im.core.a.d$a r0 = new com.bytedance.im.core.a.d$a
            r2 = 0
            r0.<init>(r2)
            r3.f37562b = r0
            r3.f37572m = r2
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.n = r0
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1.<init>(r0)
            r3.q = r1
            r3.f37570j = r2
            com.bytedance.im.core.e.b$1 r0 = new com.bytedance.im.core.e.b$1
            r0.<init>()
            com.bytedance.im.core.e.a.f38057a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.a.d.<init>():void");
    }

    public static d a() {
        MethodCollector.i(11682);
        if (f37560k == null) {
            synchronized (d.class) {
                try {
                    if (f37560k == null) {
                        f37560k = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11682);
                    throw th;
                }
            }
        }
        d dVar = f37560k;
        MethodCollector.o(11682);
        return dVar;
    }

    public final synchronized void d() {
        MethodCollector.i(12155);
        f.b("imsdk", "IMClient logout", (Throwable) null);
        try {
            this.f37564d = false;
            this.f37572m = false;
            bf.f37901b = null;
            x.a();
            new am();
            x a2 = x.a();
            a2.f38633b = false;
            a2.f38632a.removeCallbacksAndMessages(null);
            h();
            l.a().f38779d = -1;
            com.bytedance.im.core.internal.c.a.a();
            com.bytedance.im.core.internal.c.a.f38680b = false;
            com.bytedance.im.core.internal.c.a.f38681c = true;
            bf.f37901b = null;
            bg.f37912b = null;
            j.f37649a.removeCallbacks(j.f37650b);
            com.bytedance.im.core.d.f.f37949b.clear();
            com.bytedance.im.core.d.f.f37950c = false;
            MethodCollector.o(12155);
        } catch (Throwable th) {
            f.b("imsdk", "IMClient logout error", th);
            com.bytedance.im.core.g.b.a(false, th, this.o, this.p, this.f37561a);
            e.a(th);
            MethodCollector.o(12155);
        }
    }

    public final void g() {
        if (this.f37562b != null && this.f37561a != null) {
            f.b("imsdk", "onWsConnFailed", new Exception());
            if (a().f37564d && (com.bytedance.im.core.internal.a.b() || com.bytedance.im.core.internal.a.l())) {
                if (com.bytedance.im.core.internal.a.l()) {
                    com.bytedance.im.core.f.a.f38059e = 10;
                } else {
                    com.bytedance.im.core.f.a.f38059e = 8;
                }
                com.bytedance.im.core.f.a.a().c();
            }
            this.f37570j = false;
        }
    }

    public final void f() {
        if (!this.f37572m) {
            this.f37572m = true;
            final int i2 = b().an;
            if (i2 <= 0) {
                f.b("imsdk", "IMClient checkRecover version invalid:".concat(String.valueOf(i2)), (Throwable) null);
                return;
            }
            s.a();
            int a2 = s.f38859a.a(s.a("recover_version"));
            if (i2 <= a2) {
                f.b("imsdk", "IMClient checkRecover already recover, version:" + i2 + ", lastVersion:" + a2, (Throwable) null);
                return;
            }
            f.b("imsdk", "IMClient checkRecover start, version:" + i2 + ", lastVersion:" + a2, (Throwable) null);
            s.a();
            s.f(i2);
            new i().a("im_sdk_recover").a("version", String.valueOf(i2)).a("last_version", String.valueOf(a2)).c();
            x.a().a(new Runnable() {
                /* class com.bytedance.im.core.a.d.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(22611);
                }

                public final void run() {
                    f.b("imsdk", "IMClient checkRecover onRun", (Throwable) null);
                    d.this.d();
                    com.bytedance.im.core.internal.a.a.a.a().d();
                    s.a();
                    s.n();
                    s.a();
                    s.f(i2);
                    d.this.c();
                }
            });
        }
    }

    private synchronized void h() {
        MethodCollector.i(12159);
        if (com.bytedance.im.core.internal.e.a.f38735a != null) {
            com.bytedance.im.core.internal.e.a.f38735a.shutdown();
            com.bytedance.im.core.internal.e.a.f38735a = null;
        }
        if (com.bytedance.im.core.internal.e.a.f38736b != null) {
            com.bytedance.im.core.internal.e.a.f38736b.shutdown();
            com.bytedance.im.core.internal.e.a.f38736b = null;
        }
        if (!com.bytedance.im.core.internal.e.a.f38739e && com.bytedance.im.core.internal.e.a.f38737c != null) {
            com.bytedance.im.core.internal.e.a.f38737c.shutdown();
            com.bytedance.im.core.internal.e.a.f38737c = null;
        }
        if (com.bytedance.im.core.internal.e.a.f38738d != null) {
            com.bytedance.im.core.internal.e.a.f38738d.shutdown();
            com.bytedance.im.core.internal.e.a.f38738d = null;
        }
        com.bytedance.im.core.internal.b.a.f38227a.clear();
        com.bytedance.im.core.internal.b.a.f38228b.clear();
        com.bytedance.im.core.internal.b.a.f38229c.clear();
        com.bytedance.im.core.internal.b.a.f38232f.clear();
        com.bytedance.im.core.internal.b.a.f38234h.clear();
        com.bytedance.im.core.internal.b.a.f38233g.clear();
        com.bytedance.im.core.internal.b.a.f38235i.clear();
        com.bytedance.im.core.internal.b.a.f38236j.clear();
        com.bytedance.im.core.internal.b.a.f38237k.clear();
        com.bytedance.im.core.internal.b.a.f38238l.clear();
        com.bytedance.im.core.internal.b.a.n.clear();
        com.bytedance.im.core.d.j a2 = com.bytedance.im.core.d.j.a();
        f.b("imsdk", "ConversationListModel clear", (Throwable) null);
        a2.f37959a.clear();
        a2.f37960b.clear();
        a2.f37961c = false;
        a2.f37964f = false;
        be a3 = be.a();
        a3.f37894b.clear();
        a3.f37896d.clear();
        a3.f37895c.clear();
        com.bytedance.im.core.internal.a.b.a a4 = com.bytedance.im.core.internal.a.b.a.a();
        if (a4.f38191a != null) {
            a4.f38191a.removeMessages(101);
            a4.f38191a.removeMessages(102);
            a4.f38191a.removeMessages(103);
            a4.f38191a.removeMessages(104);
            a4.f38191a.removeMessages(105);
        }
        bc a5 = bc.a();
        a5.f37885a = 0;
        a5.f37886b = 0;
        a5.f37887c = true;
        a5.f37889e = null;
        for (com.bytedance.im.core.internal.d.b.d dVar : com.bytedance.im.core.internal.d.c.a().f38714a) {
            dVar.a().e();
        }
        if (com.bytedance.im.core.f.a.f38058a) {
            com.bytedance.im.core.f.a a6 = com.bytedance.im.core.f.a.a();
            a6.d();
            a6.f38061b.removeCallbacksAndMessages(null);
        }
        q.f38785i = false;
        if (com.bytedance.im.core.g.c.f38104a) {
            com.bytedance.im.core.g.c a7 = com.bytedance.im.core.g.c.a();
            f.b("imsdk", "ReportManager innerRelease", (Throwable) null);
            a7.f38107b.removeCallbacksAndMessages(null);
            a7.f38108c.clear();
        }
        com.bytedance.im.core.i.f a8 = com.bytedance.im.core.i.f.a();
        f.b("imsdk", "StrangerManager reset", (Throwable) null);
        a8.f38154d = 0;
        a8.f38156f.clear();
        a8.f38155e.evictAll();
        t a9 = t.a();
        f.b("imsdk", "SendMsgCache reset, lru:" + a9.f38865a.size(), (Throwable) null);
        a9.f38865a.evictAll();
        com.bytedance.im.core.internal.e.d.a();
        ad.f37690a.evictAll();
        com.bytedance.im.core.b.b a10 = com.bytedance.im.core.b.b.a();
        if (com.bytedance.im.core.b.b.b()) {
            f.b("imsdk", "ConversationBoxManager reset", (Throwable) null);
            a10.f37621e = null;
            a10.f37619c = new ConcurrentHashMap();
        }
        MethodCollector.o(12159);
    }

    public final synchronized void c() {
        int i2;
        MethodCollector.i(12008);
        f.b("imsdk", "IMClient login", (Throwable) null);
        try {
            this.f37564d = true;
            s.a();
            this.f37565e = s.i();
            h();
            bf.a();
            com.bytedance.im.core.d.j a2 = com.bytedance.im.core.d.j.a();
            if (!a().b().ae || !a().f37565e) {
                if (a().b().I) {
                    com.bytedance.im.core.internal.e.d.a(new com.bytedance.im.core.internal.e.c<Boolean>() {
                        /* class com.bytedance.im.core.d.j.AnonymousClass14 */

                        static {
                            Covode.recordClassIndex(22771);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.im.core.internal.e.c
                        public final /* synthetic */ Boolean a() {
                            u.a();
                            List<h> b2 = u.b();
                            if (b2 == null || b2.size() <= 0) {
                                return false;
                            }
                            j.this.a((h[]) b2.toArray(new h[0]));
                            return true;
                        }
                    }, new com.bytedance.im.core.internal.e.b<Boolean>() {
                        /* class com.bytedance.im.core.d.j.AnonymousClass15 */

                        static {
                            Covode.recordClassIndex(22772);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.bytedance.im.core.internal.e.b
                        public final /* synthetic */ void a(Boolean bool) {
                            Boolean bool2 = bool;
                            if (!j.this.f37963e.isEmpty() && bool2.booleanValue()) {
                                f.b("imsdk", "snapshot onCallback", (Throwable) null);
                                for (p pVar : j.this.f37963e) {
                                    pVar.a(j.this.f37959a);
                                }
                            }
                        }
                    });
                } else if (a().b().G) {
                    com.bytedance.im.core.internal.e.d.a(new com.bytedance.im.core.internal.e.c<Boolean>() {
                        /* class com.bytedance.im.core.d.j.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(22773);
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: b */
                        public Boolean a() {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            List<h> a2 = com.bytedance.im.core.internal.a.c.a(d.a().b().H);
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                                e.a("im_init_conversation_msg_duration", jSONObject);
                            } catch (Exception unused) {
                            }
                            if (a2.size() <= 0) {
                                return false;
                            }
                            j.this.a((h[]) a2.toArray(new h[0]));
                            return true;
                        }
                    }, new com.bytedance.im.core.internal.e.b<Boolean>() {
                        /* class com.bytedance.im.core.d.j.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(22774);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.bytedance.im.core.internal.e.b
                        public final /* synthetic */ void a(Boolean bool) {
                            Boolean bool2 = bool;
                            if (!j.this.f37963e.isEmpty() && bool2.booleanValue()) {
                                f.b("imsdk", "fastLoad onCallback", (Throwable) null);
                                for (p pVar : j.this.f37963e) {
                                    pVar.a(j.this.f37959a);
                                }
                            }
                        }
                    });
                }
            }
            x.a();
            new an();
            int[] a3 = com.bytedance.im.core.internal.utils.e.a();
            for (int i3 : a3) {
                x.a();
                y yVar = new y(i3);
                yVar.f38644b = false;
                f.b("imsdk", "IMInitHandler init, isRetry:false, inbox:" + yVar.f38643a, (Throwable) null);
                if (com.bytedance.im.core.internal.b.a.i(yVar.f38643a)) {
                    f.b("imsdk", "IMInitHandler init, already doing, return", (Throwable) null);
                } else {
                    s.a();
                    if (s.g(yVar.f38643a)) {
                        f.b("imsdk", "IMInitHandler init, already inited", (Throwable) null);
                        com.bytedance.im.core.internal.e.d.a(new com.bytedance.im.core.internal.e.c<Object>() {
                            /* class com.bytedance.im.core.internal.b.a.y.AnonymousClass6 */

                            static {
                                Covode.recordClassIndex(23066);
                            }

                            @Override // com.bytedance.im.core.internal.e.c
                            public final Object a() {
                                long a2 = d.a().f37562b.a();
                                com.bytedance.im.core.internal.utils.j.c("IMMsgDao markUnSendFail, user_id:".concat(String.valueOf(a2)));
                                return Boolean.valueOf(com.bytedance.im.core.internal.a.a.b.b("update msg set " + i.a.COLUMN_STATUS.key + "=3 where " + i.a.COLUMN_SENDER.key + "='" + a2 + "' AND " + i.a.COLUMN_STATUS.key + "<'2'"));
                            }
                        }, new com.bytedance.im.core.internal.e.b<Object>() {
                            /* class com.bytedance.im.core.internal.b.a.y.AnonymousClass7 */

                            static {
                                Covode.recordClassIndex(23067);
                            }

                            @Override // com.bytedance.im.core.internal.e.b
                            public final void a(Object obj) {
                                d.a().f37562b.a(y.this.f38643a, 3);
                                y.this.a(d.a().b().N, false);
                            }
                        });
                        com.bytedance.im.core.internal.c.a.a().f38683a = true;
                    } else {
                        s.a();
                        s.m();
                        int i4 = yVar.f38643a;
                        if (a().b().x == 2) {
                            com.bytedance.im.core.internal.b.a.f38227a.add(Integer.valueOf(i4));
                            a();
                        }
                        com.bytedance.im.core.internal.b.a.f38232f.add(Integer.valueOf(yVar.f38643a));
                        a().f37562b.a(yVar.f38643a, 0);
                        yVar.f38649g = SystemClock.uptimeMillis();
                        s.a();
                        yVar.a(s.f38859a.b(s.a(yVar.f38643a, "im_init_page_cursor"), (Long) 0L));
                        e.a("im_total_pull", "get_session");
                    }
                }
            }
            x.a().f38633b = true;
            if (l.a().b() == 1) {
                s.a();
                s.a(a().b().ai.baseIndexV2);
            }
            s.a();
            long b2 = s.f38859a.b(s.a("saved_msg_fts_index_ts"), (Long) Long.MAX_VALUE);
            if (b2 > 0) {
                Handler handler = new Handler(Looper.getMainLooper());
                i.AnonymousClass1 r5 = new Runnable(b2) {
                    /* class com.bytedance.im.core.internal.a.i.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ long f38219a;

                    static {
                        Covode.recordClassIndex(22903);
                    }

                    public final void run() {
                        com.bytedance.im.core.internal.e.d.a(new com.bytedance.im.core.internal.e.c<Boolean>() {
                            /* class com.bytedance.im.core.internal.a.i.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(22904);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // com.bytedance.im.core.internal.e.c
                            public final /* synthetic */ Boolean a() {
                                com.bytedance.im.core.h.d.a();
                                return true;
                            }
                        }, (com.bytedance.im.core.internal.e.b) null);
                    }

                    {
                        this.f38219a = r1;
                    }
                };
                if (a().f37562b.b() != null) {
                    a().f37562b.b();
                    i2 = -1;
                } else {
                    i2 = 10000;
                }
                handler.postDelayed(r5, (long) i2);
            }
            com.bytedance.im.core.internal.c.a.a();
            com.bytedance.im.core.internal.c.a.f38680b = true;
            bf.a();
            f.b("imsdk", "WaitDelCon onLogin, mode:" + bg.f37911a, (Throwable) null);
            if (bg.f37911a == 0) {
                bg.f37912b = new bg.a();
            } else {
                bg.f37912b = new bg.b();
            }
            bg.f37912b.a();
            f fVar = f.f37632d;
            Context context = f.f37630b;
            if (context == null) {
                h.f.b.l.a("appContext");
                w wVar = new w("null cannot be cast to non-null type");
                MethodCollector.o(12008);
                throw wVar;
            }
            ((Application) context).registerActivityLifecycleCallbacks(fVar);
            if (com.bytedance.im.core.internal.a.o() > 0) {
                j.f37649a.postDelayed(j.f37650b, (long) (com.bytedance.im.core.internal.a.o() * 1000));
            }
            try {
                Context context2 = f.f37630b;
                if (context2 == null) {
                    h.f.b.l.a("appContext");
                }
                Object a4 = f.a(context2, "connectivity");
                if (a4 != null) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) a4;
                    if (connectivityManager != null) {
                        Context context3 = f.f37630b;
                        if (context3 == null) {
                            h.f.b.l.a("appContext");
                        }
                        f.f37631c = f.a(context3);
                        if (Build.VERSION.SDK_INT >= 21) {
                            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build(), new f.a());
                        } else {
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                            Context context4 = f.f37630b;
                            if (context4 == null) {
                                h.f.b.l.a("appContext");
                            }
                            f.a(context4, new f.b(), intentFilter);
                        }
                    }
                    this.q.postDelayed(new Runnable() {
                        /* class com.bytedance.im.core.a.d.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(22612);
                        }

                        public final void run() {
                            if (!d.this.f37562b.i()) {
                                d.this.g();
                            }
                        }
                    }, 5000);
                    MethodCollector.o(12008);
                } else {
                    w wVar2 = new w("null cannot be cast to non-null type");
                    MethodCollector.o(12008);
                    throw wVar2;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                e.a(e2);
            }
        } catch (Throwable th) {
            f.b("imsdk", "IMClient login error", th);
            com.bytedance.im.core.g.b.a(true, th, this.o, this.p, this.f37561a);
            e.a(th);
            MethodCollector.o(12008);
        }
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public final synchronized void a(final int i2) {
        int[] a2;
        MethodCollector.i(12305);
        if (this.f37564d) {
            final int[] a3 = com.bytedance.im.core.internal.utils.e.a();
            if (a3 == null) {
                MethodCollector.o(12305);
                return;
            } else if (!a().b().u || (a2 = com.bytedance.im.core.internal.utils.e.a()) == null || a2.length <= 1) {
                a(a3, i2);
                MethodCollector.o(12305);
                return;
            } else {
                x.a();
                com.bytedance.im.core.internal.b.a.f fVar = new com.bytedance.im.core.internal.b.a.f(new com.bytedance.im.core.a.a.b<int[]>() {
                    /* class com.bytedance.im.core.a.d.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(22609);
                    }

                    @Override // com.bytedance.im.core.a.a.b
                    public final void a(com.bytedance.im.core.d.u uVar) {
                        d.a(a3, i2);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.im.core.a.a.b
                    public final /* bridge */ /* synthetic */ void a(int[] iArr) {
                        int[] iArr2 = iArr;
                        if (iArr2 == null || iArr2.length == 0) {
                            iArr2 = a3;
                        }
                        d.a(iArr2, i2);
                    }
                });
                if (a3.length == 0) {
                    MethodCollector.o(12305);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (int i3 : a3) {
                    InboxMessagesPerUser.Builder inbox_type = new InboxMessagesPerUser.Builder().inbox_type(Integer.valueOf(i3));
                    s.a();
                    arrayList.add(inbox_type.cursor(Long.valueOf(s.a(i3))).build());
                }
                RequestBody build = new RequestBody.Builder().check_messages_per_user_body(new CheckMessagePerUserRequestBody.Builder().checks(arrayList).build()).build();
                int[] iArr = new int[a3.length];
                System.arraycopy(a3, 0, iArr, 0, a3.length);
                fVar.a(0, build, null, iArr);
            }
        }
        MethodCollector.o(12305);
    }

    public final void a(b bVar) {
        f.b("imsdk", "IMClient setBridge", (Throwable) null);
        if (bVar == null) {
            bVar = this.f37562b;
        }
        this.f37562b = bVar;
    }

    public final void a(final boolean z) {
        f.b("imsdk", "IMClient recover, deleteDB:".concat(String.valueOf(z)), (Throwable) null);
        com.bytedance.im.core.c.d dVar = new com.bytedance.im.core.c.d();
        dVar.f37623a = "core";
        dVar.f37624b = "db_crash";
        s.a();
        com.bytedance.im.core.c.d a2 = dVar.a("last_reset_time", Long.valueOf(s.e()));
        s.a();
        a2.a("reset_count", Integer.valueOf(s.f())).a();
        x.a().a(new Runnable() {
            /* class com.bytedance.im.core.a.d.AnonymousClass2 */

            static {
                Covode.recordClassIndex(22610);
            }

            public final void run() {
                d.this.d();
                if (z) {
                    com.bytedance.im.core.internal.a.a.a.a().d();
                }
                s.a();
                f.b("imsdk", "SPUtils reset", (Throwable) null);
                int f2 = s.f();
                if (SystemClock.uptimeMillis() - s.e() > 3600000) {
                    s.n();
                    s.f38859a.a(s.a("im_reset_time"), Long.valueOf(SystemClock.uptimeMillis()));
                }
                s.f38859a.a(s.a("im_reset_count"), f2 + 1);
                d.this.c();
            }
        });
    }

    public static void a(int[] iArr, int i2) {
        if (iArr != null) {
            for (int i3 : iArr) {
                if (i3 != -1) {
                    x.a().a(i3, i2);
                }
            }
        }
    }

    public final void a(Context context, f fVar, com.bytedance.im.core.c.c cVar) {
        String name;
        Context a2;
        this.o = System.currentTimeMillis();
        if (context == null) {
            name = "null";
        } else {
            name = context.getClass().getName();
        }
        this.p = name;
        if (context == null) {
            a2 = null;
        } else {
            a2 = a(context);
        }
        this.f37561a = a2;
        if (fVar == null) {
            fVar = new f();
        }
        this.f37571l = fVar;
        this.n.put(Integer.valueOf(com.bytedance.im.core.d.a.a.f37652a), new Runnable() {
            /* class com.bytedance.im.core.internal.d.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(23100);
            }

            public final void run() {
                c a2 = c.a();
                f.b("RequestManagerFactory", "loadCoreParallelRequestManager", (Throwable) null);
                for (com.bytedance.im.core.internal.d.b.d dVar : a2.f38714a) {
                    if (dVar.b() == com.bytedance.im.core.internal.d.b.c.CORE_PARALLEL) {
                        e a3 = dVar.a();
                        if (a3 instanceof f) {
                            f.b("RequestManagerFactory", "instRightNow", (Throwable) null);
                            ((f) a3).b();
                        }
                    }
                }
            }
        });
        com.bytedance.im.core.internal.utils.j.f38774a = this.f37571l.f37593a;
        f.b("imsdk", "IMClient init, context:" + this.p, (Throwable) null);
        if (cVar != null) {
            f.a(context, cVar);
            return;
        }
        throw new RuntimeException("sdkMonitor should not be null");
    }
}
