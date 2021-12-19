package com.bytedance.lynx.hybrid;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.monitorV2.webview.d;
import com.bytedance.android.monitorV2.webview.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.a.f;
import com.bytedance.lynx.hybrid.a.i;
import com.bytedance.lynx.hybrid.c;
import com.bytedance.lynx.hybrid.j.c;
import com.bytedance.lynx.hybrid.webkit.a.a.c;
import com.bytedance.lynx.hybrid.webkit.e;
import com.bytedance.webx.h;
import h.f.b.l;
import h.m.p;
import h.w;
import h.z;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f40918a = f40918a;

    /* renamed from: b  reason: collision with root package name */
    public static b f40919b;

    /* renamed from: c  reason: collision with root package name */
    public static AtomicBoolean f40920c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicBoolean f40921d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    public static h.f.a.a<z> f40922e;

    /* renamed from: f  reason: collision with root package name */
    public static AtomicBoolean f40923f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    public static d.a f40924g;

    /* renamed from: h  reason: collision with root package name */
    public static final Map<Integer, WeakReference<k>> f40925h = new LinkedHashMap();

    /* renamed from: i  reason: collision with root package name */
    public static final a f40926i = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(25084);
        }

        public static final class b extends h.d {
            static {
                Covode.recordClassIndex(25087);
            }

            b() {
            }

            @Override // com.bytedance.webx.h.d
            public final void a(h.a aVar) {
                l.c(aVar, "");
                aVar.a(com.bytedance.lynx.hybrid.webkit.a.a.a.class);
            }
        }

        private a() {
        }

        private static boolean c() {
            if (!d.f40923f.compareAndSet(false, true)) {
                return true;
            }
            try {
                h.f.a.a<z> aVar = d.f40922e;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            } catch (Exception unused) {
                c.a("Call PrepareBlock failed, please check your code.", com.bytedance.lynx.hybrid.j.b.E, d.f40918a);
                d.f40919b = null;
                d.f40920c.set(false);
                d.f40921d.set(false);
                d.f40922e = null;
                d.f40923f.set(false);
                return false;
            }
        }

        public static void a() {
            i iVar;
            if (c()) {
                b bVar = d.f40919b;
                i iVar2 = null;
                if (bVar == null || bVar.f40863c == null) {
                    c.a("LynxConfig cannot be null, Please set value by HybridKit.setLynxConfig", com.bytedance.lynx.hybrid.j.b.E, d.f40918a);
                    return;
                }
                b bVar2 = d.f40919b;
                if (bVar2 == null || bVar2.f40864d == null) {
                    c.a("ResourceConfig cannot be null, Please set value by HybridKit.setResourceConfig", com.bytedance.lynx.hybrid.j.b.E, d.f40918a);
                    return;
                }
                d();
                b bVar3 = d.f40919b;
                if (bVar3 != null) {
                    iVar2 = bVar3.f40863c;
                }
                if (iVar2 instanceof com.bytedance.lynx.hybrid.e.b) {
                    b bVar4 = d.f40919b;
                    if (bVar4 == null || (iVar = bVar4.f40863c) == null) {
                        throw new w("null cannot be cast to non-null type");
                    }
                    h.a((com.bytedance.lynx.hybrid.e.b) iVar);
                }
            }
        }

        public static void b() {
            if (d.f40921d.compareAndSet(false, true) && c()) {
                d();
                d.a d2 = n.a().d();
                d.f40924g = d2;
                d2.a(new com.bytedance.android.monitorV2.webview.a());
                d2.a();
                d2.a(e.class.getName());
                n.a().a(d.f40924g);
                h.a(c.a.a().a());
                h.a("hybrid_webx_webkit", com.bytedance.webx.e.a.e.class, new b());
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
            if (r3.a(com.bytedance.lynx.hybrid.service.IResourceService.class, r1) == null) goto L_0x0047;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void d() {
            /*
            // Method dump skipped, instructions count: 211
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.d.a.d():void");
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.lynx.hybrid.d$a$a  reason: collision with other inner class name */
        public static final class C0992a implements h.c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.bytedance.lynx.hybrid.webkit.d f40927a;

            static {
                Covode.recordClassIndex(25085);
            }

            C0992a(com.bytedance.lynx.hybrid.webkit.d dVar) {
                this.f40927a = dVar;
            }

            @Override // com.bytedance.webx.h.c
            public final void a(com.bytedance.webx.a<Object> aVar) {
                if (!(aVar instanceof com.bytedance.lynx.hybrid.webkit.a.a.c)) {
                    aVar = null;
                }
                com.bytedance.lynx.hybrid.webkit.a.a.c cVar = (com.bytedance.lynx.hybrid.webkit.a.a.c) aVar;
                if (cVar != null) {
                    AnonymousClass1 r1 = new c.b(this) {
                        /* class com.bytedance.lynx.hybrid.d.a.C0992a.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ C0992a f40928a;

                        /* renamed from: b  reason: collision with root package name */
                        private final com.bytedance.lynx.hybrid.webkit.a.a.e f40929b;

                        /* renamed from: c  reason: collision with root package name */
                        private final com.bytedance.lynx.hybrid.webkit.a.a.d f40930c;

                        static {
                            Covode.recordClassIndex(25086);
                        }

                        @Override // com.bytedance.lynx.hybrid.webkit.a.a.c.b
                        public final com.bytedance.lynx.hybrid.webkit.a.a.e a() {
                            return this.f40929b;
                        }

                        @Override // com.bytedance.lynx.hybrid.webkit.a.a.c.b
                        public final com.bytedance.lynx.hybrid.webkit.a.a.d b() {
                            return this.f40930c;
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f40928a = r2;
                            com.bytedance.lynx.hybrid.webkit.a.a.e eVar = r2.f40927a.f41289a;
                            this.f40929b = eVar == null ? new com.bytedance.lynx.hybrid.webkit.a.a.e() : eVar;
                            com.bytedance.lynx.hybrid.webkit.a.a.d dVar = r2.f40927a.f41290b;
                            this.f40930c = dVar == null ? new com.bytedance.lynx.hybrid.webkit.a.a.d() : dVar;
                        }
                    };
                    l.c(r1, "");
                    cVar.f41270a = r1;
                }
            }
        }

        public static com.bytedance.lynx.hybrid.service.c.b a(Uri uri) {
            String host;
            l.c(uri, "");
            if (uri.isHierarchical() && (host = uri.getHost()) != null) {
                l.a((Object) host, "");
                if (p.a((CharSequence) host, (CharSequence) "lynxview", false)) {
                    return com.bytedance.lynx.hybrid.service.c.b.LYNX;
                }
                if (p.a((CharSequence) host, (CharSequence) "webview", false)) {
                    return com.bytedance.lynx.hybrid.service.c.b.WEB;
                }
            }
            return com.bytedance.lynx.hybrid.service.c.b.UNKNOWN;
        }

        public static void a(String str, Object obj) {
            l.c(str, "");
            l.c(obj, "");
            com.bytedance.lynx.hybrid.a.a aVar = c.a.a().f40904d;
            if (aVar != null) {
                aVar.put(str, obj);
            }
        }

        public static com.bytedance.lynx.hybrid.a.h a(com.bytedance.lynx.hybrid.h.b bVar, com.bytedance.lynx.hybrid.h.a aVar, Context context, f fVar) {
            l.c(bVar, "");
            l.c(aVar, "");
            l.c(context, "");
            return b(bVar, aVar, context, fVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fb, code lost:
            if (r1.f41285a == true) goto L_0x00fd;
         */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x0215  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x0220  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x022c  */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x02c7  */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x02e1  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x02ec  */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x0325  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x0327  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x011f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static com.bytedance.lynx.hybrid.a.h b(com.bytedance.lynx.hybrid.h.b r17, com.bytedance.lynx.hybrid.h.a r18, android.content.Context r19, com.bytedance.lynx.hybrid.a.f r20) {
            /*
            // Method dump skipped, instructions count: 1182
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.d.a.b(com.bytedance.lynx.hybrid.h.b, com.bytedance.lynx.hybrid.h.a, android.content.Context, com.bytedance.lynx.hybrid.a.f):com.bytedance.lynx.hybrid.a.h");
        }
    }

    static {
        Covode.recordClassIndex(25083);
    }
}
