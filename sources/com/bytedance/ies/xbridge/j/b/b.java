package com.bytedance.ies.xbridge.j.b;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.b.f;
import com.bytedance.ies.xbridge.base.runtime.d.g;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostThreadPoolExecutorDepend;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.j.a.b;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.m;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.o;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import h.a.ag;
import h.f.b.l;
import h.p;
import h.q;
import h.r;
import h.v;
import h.w;
import h.z;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public final class b extends com.bytedance.ies.xbridge.j.a.b {

    /* renamed from: a  reason: collision with root package name */
    public static String f36156a = b.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public static final a f36157b = new a((byte) 0);

    /* renamed from: com.bytedance.ies.xbridge.j.b.b$b  reason: collision with other inner class name */
    public enum EnumC0849b {
        GET("get"),
        POST(UGCMonitor.TYPE_POST),
        PUT("put"),
        DELETE("delete"),
        UNSUPPORTED("unsupported");
        
        public static final a Companion = new a((byte) 0);
        private final String method;

        /* renamed from: com.bytedance.ies.xbridge.j.b.b$b$a */
        public static final class a {
            static {
                Covode.recordClassIndex(21619);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }

            public static EnumC0849b a(String str) {
                if (str == null) {
                    return EnumC0849b.UNSUPPORTED;
                }
                try {
                    Locale locale = Locale.ROOT;
                    l.a((Object) locale, "");
                    String upperCase = str.toUpperCase(locale);
                    l.a((Object) upperCase, "");
                    return EnumC0849b.valueOf(upperCase);
                } catch (Exception unused) {
                    return EnumC0849b.UNSUPPORTED;
                }
            }
        }

        public final String getMethod() {
            return this.method;
        }

        static {
            Covode.recordClassIndex(21618);
        }

        private EnumC0849b(String str) {
            this.method = str;
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21617);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f36159a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n f36160b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.xbridge.j.c.b f36161c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ n f36162d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f36163e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b.a f36164f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ EnumC0849b f36165g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Object f36166h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f36167i;

        static {
            Covode.recordClassIndex(21620);
        }

        c(b bVar, n nVar, com.bytedance.ies.xbridge.j.c.b bVar2, n nVar2, e eVar, b.a aVar, EnumC0849b bVar3, Object obj, String str) {
            this.f36159a = bVar;
            this.f36160b = nVar;
            this.f36161c = bVar2;
            this.f36162d = nVar2;
            this.f36163e = eVar;
            this.f36164f = aVar;
            this.f36165g = bVar3;
            this.f36166h = obj;
            this.f36167i = str;
        }

        /* renamed from: com.bytedance.ies.xbridge.j.b.b$c$b  reason: collision with other inner class name */
        public static final class C0850b implements com.bytedance.ies.xbridge.base.runtime.d.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f36171a;

            static {
                Covode.recordClassIndex(21622);
            }

            /* renamed from: com.bytedance.ies.xbridge.j.b.b$c$b$a */
            static final class a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C0850b f36172a;

                static {
                    Covode.recordClassIndex(21623);
                }

                a(C0850b bVar) {
                    this.f36172a = bVar;
                }

                public final void run() {
                    this.f36172a.f36171a.f36164f.a(0, "connection failed", null);
                }
            }

            /* renamed from: com.bytedance.ies.xbridge.j.b.b$c$b$b  reason: collision with other inner class name */
            static final class RunnableC0851b implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C0850b f36173a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f36174b;

                static {
                    Covode.recordClassIndex(21624);
                }

                RunnableC0851b(C0850b bVar, String str) {
                    this.f36173a = bVar;
                    this.f36174b = str;
                }

                public final void run() {
                    b.a aVar = this.f36173a.f36171a.f36164f;
                    String str = this.f36174b;
                    if (str == null) {
                        str = "body is null";
                    }
                    aVar.a(0, str, null);
                }
            }

            /* renamed from: com.bytedance.ies.xbridge.j.b.b$c$b$d */
            static final class d implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C0850b f36179a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Exception f36180b;

                static {
                    Covode.recordClassIndex(21626);
                }

                d(C0850b bVar, Exception exc) {
                    this.f36179a = bVar;
                    this.f36180b = exc;
                }

                public final void run() {
                    b.a aVar = this.f36179a.f36171a.f36164f;
                    String message = this.f36180b.getMessage();
                    if (message == null) {
                        message = "get data from stream exception";
                    }
                    aVar.a(0, message, null);
                }
            }

            /* renamed from: com.bytedance.ies.xbridge.j.b.b$c$b$c  reason: collision with other inner class name */
            static final class RunnableC0852c implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C0850b f36175a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ int f36176b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ LinkedHashMap f36177c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ String f36178d;

                static {
                    Covode.recordClassIndex(21625);
                }

                RunnableC0852c(C0850b bVar, int i2, LinkedHashMap linkedHashMap, String str) {
                    this.f36175a = bVar;
                    this.f36176b = i2;
                    this.f36177c = linkedHashMap;
                    this.f36178d = str;
                }

                public final void run() {
                    b.a aVar = this.f36175a.f36171a.f36164f;
                    com.bytedance.ies.xbridge.j.c.c cVar = new com.bytedance.ies.xbridge.j.c.c();
                    cVar.f36199a = Integer.valueOf(this.f36176b);
                    cVar.f36200b = this.f36177c;
                    cVar.f36201c = this.f36178d;
                    cVar.f36203e = "base64";
                    aVar.a(cVar, "");
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C0850b(c cVar) {
                this.f36171a = cVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:57:0x00cb A[Catch:{ IOException -> 0x00d7 }] */
            /* JADX WARNING: Removed duplicated region for block: B:59:0x00d0 A[Catch:{ IOException -> 0x00d7 }] */
            /* JADX WARNING: Removed duplicated region for block: B:64:0x00df  */
            /* JADX WARNING: Removed duplicated region for block: B:70:0x00e9 A[Catch:{ IOException -> 0x00f2 }] */
            /* JADX WARNING: Removed duplicated region for block: B:72:0x00ee A[Catch:{ IOException -> 0x00f2 }] */
            @Override // com.bytedance.ies.xbridge.base.runtime.d.b
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(com.bytedance.ies.xbridge.base.runtime.b.a r11) {
                /*
                // Method dump skipped, instructions count: 250
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.j.b.b.c.C0850b.a(com.bytedance.ies.xbridge.base.runtime.b.a):void");
            }
        }

        public final void run() {
            String str;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            LinkedHashMap<String, String> a2 = com.bytedance.ies.xbridge.base.runtime.d.d.a(this.f36160b);
            if (a2.containsKey("content-type")) {
                str = a2.get("content-type");
            } else if (a2.containsKey("Content-Type")) {
                str = a2.get("Content-Type");
            } else {
                str = null;
            }
            String a3 = com.bytedance.ies.xbridge.base.runtime.d.d.a(this.f36161c.a(), this.f36162d, this.f36163e);
            a aVar = new a(this);
            C0850b bVar = new C0850b(this);
            String method = this.f36165g.getMethod();
            String str2 = "application/x-www-form-urlencoded";
            switch (method.hashCode()) {
                case -1335458389:
                    if (method.equals("delete")) {
                        IHostNetworkDepend a4 = this.f36159a.a();
                        l.c(a3, "");
                        l.c(a2, "");
                        l.c(aVar, "");
                        l.c(a4, "");
                        com.bytedance.ies.xbridge.base.runtime.b.c a5 = new com.bytedance.ies.xbridge.base.runtime.b.c(a3).a(a2);
                        a5.f35814b = true;
                        l.c(a4, "");
                        com.bytedance.ies.xbridge.base.runtime.d.d.a(g.a(f.DELETE, a5, a4), aVar);
                        return;
                    }
                    return;
                case 102230:
                    if (method.equals("get")) {
                        IHostNetworkDepend a6 = this.f36159a.a();
                        l.c(a3, "");
                        l.c(a2, "");
                        l.c(aVar, "");
                        l.c(a6, "");
                        com.bytedance.ies.xbridge.base.runtime.b.c a7 = new com.bytedance.ies.xbridge.base.runtime.b.c(a3).a(a2);
                        a7.f35814b = true;
                        l.c(a6, "");
                        com.bytedance.ies.xbridge.base.runtime.d.d.a(g.a(f.GET, a7, a6), aVar);
                        return;
                    }
                    return;
                case 111375:
                    if (method.equals("put")) {
                        Object obj = this.f36166h;
                        if (obj != null) {
                            jSONObject = com.bytedance.ies.xbridge.o.c.a((n) obj);
                        } else {
                            jSONObject = new JSONObject();
                        }
                        if (str == null) {
                            str = str2;
                        }
                        IHostNetworkDepend a8 = this.f36159a.a();
                        l.c(a3, "");
                        l.c(a2, "");
                        l.c(str, "");
                        l.c(jSONObject, "");
                        l.c(aVar, "");
                        l.c(a8, "");
                        com.bytedance.ies.xbridge.base.runtime.b.c a9 = new com.bytedance.ies.xbridge.base.runtime.b.c(a3).a(a2).a(str);
                        a9.f35814b = true;
                        String jSONObject3 = jSONObject.toString();
                        l.a((Object) jSONObject3, "");
                        Charset forName = Charset.forName("UTF-8");
                        l.a((Object) forName, "");
                        if (jSONObject3 != null) {
                            byte[] bytes = jSONObject3.getBytes(forName);
                            l.a((Object) bytes, "");
                            a9.f35816d = bytes;
                            l.c(a8, "");
                            com.bytedance.ies.xbridge.base.runtime.d.d.a(g.a(f.PUT, a9, a8), aVar);
                            return;
                        }
                        throw new w("null cannot be cast to non-null type");
                    }
                    return;
                case 3446944:
                    if (method.equals(UGCMonitor.TYPE_POST)) {
                        if (str != null) {
                            str2 = str;
                        }
                        a2.put("Content-Type", str2);
                        Object obj2 = this.f36166h;
                        if (!(obj2 instanceof String)) {
                            if (obj2 == null) {
                                jSONObject2 = new JSONObject();
                            } else if (obj2 instanceof m) {
                                String jSONArray = com.bytedance.ies.xbridge.o.c.a((m) obj2).toString();
                                l.a((Object) jSONArray, "");
                                Charset charset = h.m.d.f158808a;
                                if (jSONArray != null) {
                                    byte[] bytes2 = jSONArray.getBytes(charset);
                                    l.a((Object) bytes2, "");
                                    com.bytedance.ies.xbridge.base.runtime.d.d.a(a3, a2, str2, bytes2, aVar, this.f36159a.a());
                                    return;
                                }
                                throw new w("null cannot be cast to non-null type");
                            } else {
                                jSONObject2 = com.bytedance.ies.xbridge.o.c.a((n) obj2);
                            }
                            com.bytedance.ies.xbridge.base.runtime.d.d.a(a3, a2, str2, jSONObject2, aVar, this.f36159a.a());
                            return;
                        } else if (l.a((Object) this.f36167i, (Object) "base64")) {
                            byte[] decode = Base64.decode((String) this.f36166h, 0);
                            l.a((Object) decode, "");
                            IHostNetworkDepend a10 = this.f36159a.a();
                            l.c(a3, "");
                            l.c(a2, "");
                            l.c(str2, "");
                            l.c(decode, "");
                            l.c(bVar, "");
                            l.c(a10, "");
                            try {
                                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                                linkedHashMap.putAll(a2);
                                com.bytedance.ies.xbridge.base.runtime.b.c a11 = new com.bytedance.ies.xbridge.base.runtime.b.c(a3).a(linkedHashMap).a(str2);
                                a11.f35814b = true;
                                a11.f35816d = decode;
                                l.c(a10, "");
                                bVar.a(g.b(f.POST, a11, a10));
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        } else {
                            String str3 = (String) this.f36166h;
                            Charset charset2 = h.m.d.f158808a;
                            if (str3 != null) {
                                byte[] bytes3 = str3.getBytes(charset2);
                                l.a((Object) bytes3, "");
                                com.bytedance.ies.xbridge.base.runtime.d.d.a(a3, a2, str2, bytes3, aVar, this.f36159a.a());
                                return;
                            }
                            throw new w("null cannot be cast to non-null type");
                        }
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }

        public static final class a implements com.bytedance.ies.xbridge.base.runtime.d.a {

            /* renamed from: a  reason: collision with root package name */
            public final String f36168a;

            /* renamed from: b  reason: collision with root package name */
            public final String f36169b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ c f36170c;

            static {
                Covode.recordClassIndex(21621);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(c cVar) {
                this.f36170c = cVar;
                this.f36168a = cVar.f36161c.b();
                this.f36169b = cVar.f36161c.a();
            }

            @Override // com.bytedance.ies.xbridge.base.runtime.d.a
            public final void a(Integer num, Throwable th) {
                int i2;
                int i3;
                int i4;
                l.c(th, "");
                if (th instanceof com.bytedance.frameworks.baselib.network.http.b.d) {
                    i2 = -1001;
                } else {
                    i2 = 0;
                }
                b bVar = this.f36170c.f36159a;
                String str = this.f36168a;
                String str2 = this.f36169b;
                if (num == null) {
                    i3 = -408;
                } else {
                    i3 = num;
                }
                bVar.b(str, str2, i3, i2, th.toString(), this.f36170c.f36163e.name());
                b.a aVar = this.f36170c.f36164f;
                com.bytedance.ies.xbridge.j.c.c cVar = new com.bytedance.ies.xbridge.j.c.c();
                if (num != null) {
                    i4 = num.intValue();
                } else {
                    i4 = -408;
                }
                cVar.f36199a = Integer.valueOf(i4);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (num == null) {
                    num = -408;
                }
                linkedHashMap.put("errCode", num);
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                linkedHashMap.put("message", message);
                linkedHashMap.put("prompts", "");
                cVar.f36201c = linkedHashMap;
                aVar.a(i2, "", cVar);
            }

            @Override // com.bytedance.ies.xbridge.base.runtime.d.a
            public final void a(JSONObject jSONObject, LinkedHashMap<String, String> linkedHashMap, Integer num) {
                int i2;
                String str = "";
                l.c(jSONObject, str);
                l.c(linkedHashMap, str);
                b.a aVar = this.f36170c.f36164f;
                com.bytedance.ies.xbridge.j.c.c cVar = new com.bytedance.ies.xbridge.j.c.c();
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = -1;
                }
                cVar.f36199a = Integer.valueOf(i2);
                cVar.f36200b = linkedHashMap;
                try {
                    String str2 = linkedHashMap.get("x-tt-logid");
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator<String> keys = jSONObject.keys();
                    l.a((Object) keys, str);
                    while (keys.hasNext()) {
                        String next = keys.next();
                        l.a((Object) next, str);
                        Object obj = jSONObject.get(next);
                        l.a(obj, str);
                        linkedHashMap2.put(next, obj);
                    }
                    if (str2 != null) {
                        str = str2;
                    }
                    linkedHashMap2.put("_Header_RequestID", str);
                    cVar.f36201c = linkedHashMap2;
                } catch (Throwable unused) {
                }
                aVar.a(cVar, "");
            }

            @Override // com.bytedance.ies.xbridge.base.runtime.d.a
            public final z a(JSONObject jSONObject, LinkedHashMap<String, String> linkedHashMap, String str, Throwable th, Integer num) {
                int i2;
                String str2 = "";
                l.c(jSONObject, str2);
                l.c(linkedHashMap, str2);
                l.c(str, str2);
                l.c(th, str2);
                this.f36170c.f36159a.b(this.f36168a, this.f36169b, num, 0, th.toString(), this.f36170c.f36163e.name());
                b.a aVar = this.f36170c.f36164f;
                String th2 = th.toString();
                com.bytedance.ies.xbridge.j.c.c cVar = new com.bytedance.ies.xbridge.j.c.c();
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = -1;
                }
                cVar.f36199a = Integer.valueOf(i2);
                cVar.f36200b = linkedHashMap;
                try {
                    String str3 = linkedHashMap.get("x-tt-logid");
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator<String> keys = jSONObject.keys();
                    l.a((Object) keys, str2);
                    while (keys.hasNext()) {
                        String next = keys.next();
                        l.a((Object) next, str2);
                        Object obj = jSONObject.get(next);
                        l.a(obj, str2);
                        linkedHashMap2.put(next, obj);
                    }
                    if (str3 != null) {
                        str2 = str3;
                    }
                    linkedHashMap2.put("_Header_RequestID", str2);
                    cVar.f36201c = linkedHashMap2;
                } catch (Throwable unused) {
                }
                cVar.f36202d = str;
                aVar.a(0, th2, cVar);
                return z.f158842a;
            }
        }
    }

    static {
        Covode.recordClassIndex(21616);
    }

    public final IHostNetworkDepend a() {
        IHostNetworkDepend iHostNetworkDepend;
        IHostNetworkDepend iHostNetworkDepend2;
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar = (com.bytedance.ies.xbridge.base.runtime.depend.b) a(com.bytedance.ies.xbridge.base.runtime.depend.b.class);
        if (bVar != null && (iHostNetworkDepend2 = bVar.f35880i) != null) {
            return iHostNetworkDepend2;
        }
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar2 = com.bytedance.ies.xbridge.base.runtime.depend.b.f35870l;
        if (bVar2 == null || (iHostNetworkDepend = bVar2.f35880i) == null) {
            return new com.bytedance.ies.xbridge.base.runtime.d.f();
        }
        return iHostNetworkDepend;
    }

    private final ExecutorService g() {
        IHostThreadPoolExecutorDepend iHostThreadPoolExecutorDepend;
        ExecutorService normalThreadExecutor;
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar;
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar2 = (com.bytedance.ies.xbridge.base.runtime.depend.b) a(com.bytedance.ies.xbridge.base.runtime.depend.b.class);
        if (((bVar2 != null && (iHostThreadPoolExecutorDepend = bVar2.f35882k) != null) || ((bVar = com.bytedance.ies.xbridge.base.runtime.depend.b.f35870l) != null && (iHostThreadPoolExecutorDepend = bVar.f35882k) != null)) && (normalThreadExecutor = iHostThreadPoolExecutorDepend.getNormalThreadExecutor()) != null) {
            return normalThreadExecutor;
        }
        ExecutorService a2 = com.bytedance.common.utility.b.c.a();
        l.a((Object) a2, "");
        return a2;
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f36181a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36182b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f36183c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Integer f36184d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f36185e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f36186f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f36187g;

        static {
            Covode.recordClassIndex(21627);
        }

        d(b bVar, String str, String str2, Integer num, int i2, String str3, String str4) {
            this.f36181a = bVar;
            this.f36182b = str;
            this.f36183c = str2;
            this.f36184d = num;
            this.f36185e = i2;
            this.f36186f = str3;
            this.f36187g = str4;
        }

        public final void run() {
            int i2;
            IHostLogDepend iHostLogDepend;
            com.bytedance.ies.xbridge.base.runtime.depend.b bVar;
            try {
                p[] pVarArr = new p[6];
                pVarArr[0] = v.a("method", this.f36182b);
                pVarArr[1] = v.a("url", this.f36183c);
                Integer num = this.f36184d;
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = -1;
                }
                pVarArr[2] = v.a("statusCode", Integer.valueOf(i2));
                pVarArr[3] = v.a("requestErrorCode", Integer.valueOf(this.f36185e));
                pVarArr[4] = v.a("requestErrorMsg", this.f36186f);
                pVarArr[5] = v.a("platform", this.f36187g);
                Map<String, ? extends Object> b2 = ag.b(pVarArr);
                com.bytedance.ies.xbridge.base.runtime.depend.b bVar2 = (com.bytedance.ies.xbridge.base.runtime.depend.b) this.f36181a.a(com.bytedance.ies.xbridge.base.runtime.depend.b.class);
                z zVar = null;
                if (!((bVar2 == null || (iHostLogDepend = bVar2.f35873b) == null) && ((bVar = com.bytedance.ies.xbridge.base.runtime.depend.b.f35870l) == null || (iHostLogDepend = bVar.f35873b) == null))) {
                    zVar = iHostLogDepend.reportJSBFetchError(this.f36181a.f35883d, b2);
                }
                q.m223constructorimpl(zVar);
            } catch (Throwable th) {
                q.m223constructorimpl(r.a(th));
            }
        }
    }

    @Override // com.bytedance.ies.xbridge.j.a.b
    public final void a(com.bytedance.ies.xbridge.j.c.b bVar, b.a aVar, e eVar) {
        Object obj;
        o a2;
        l.c(bVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        EnumC0849b a3 = EnumC0849b.a.a(bVar.b());
        if (a3 == EnumC0849b.UNSUPPORTED) {
            b(bVar.b(), bVar.a(), 0, -3, "Illegal method " + bVar.b(), eVar.name());
            aVar.a(-3, "Illegal method " + bVar.b(), null);
            return;
        }
        n nVar = bVar.f36197f;
        Object obj2 = bVar.f36194c;
        String str = bVar.f36195d;
        boolean z = obj2 instanceof k;
        Object obj3 = null;
        if (!z) {
            obj = null;
        } else {
            obj = obj2;
        }
        k kVar = (k) obj;
        if (!(kVar == null || (a2 = kVar.a()) == null)) {
            int i2 = c.f36188a[a2.ordinal()];
            if (i2 == 1) {
                if (!z) {
                    obj2 = null;
                }
                k kVar2 = (k) obj2;
                if (kVar2 != null) {
                    obj3 = kVar2.g();
                }
            } else if (i2 == 2) {
                if (!z) {
                    obj2 = null;
                }
                k kVar3 = (k) obj2;
                if (kVar3 != null) {
                    obj3 = kVar3.e();
                }
            } else if (i2 == 3) {
                if (!z) {
                    obj2 = null;
                }
                k kVar4 = (k) obj2;
                if (kVar4 != null) {
                    obj3 = kVar4.f();
                }
            }
        }
        n nVar2 = bVar.f36196e;
        if (TextUtils.isEmpty(bVar.a())) {
            b(bVar.b(), bVar.a(), 0, -3, "Illegal empty url", eVar.name());
            aVar.a(-3, "url is empty", null);
            return;
        }
        g().execute(new c(this, nVar, bVar, nVar2, eVar, aVar, a3, obj3, str));
    }

    public final void b(String str, String str2, Integer num, int i2, String str3, String str4) {
        g().execute(new d(this, str, str2, num, i2, str3, str4));
    }
}
