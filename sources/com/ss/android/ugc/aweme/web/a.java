package com.ss.android.ugc.aweme.web;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.settings.f;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.utils.dc;
import h.a.ag;
import h.a.n;
import h.a.z;
import h.f.b.ad;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.m.p;
import h.v;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public final class a extends com.ss.android.ugc.aweme.web.b.a {

    /* renamed from: d  reason: collision with root package name */
    public static String f144858d;

    /* renamed from: e  reason: collision with root package name */
    public static long f144859e;

    /* renamed from: f  reason: collision with root package name */
    public static String f144860f;

    /* renamed from: g  reason: collision with root package name */
    public static final CopyOnWriteArrayList<C3850a.C3851a> f144861g = new CopyOnWriteArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public static final CopyOnWriteArrayList<C3850a.C3851a> f144862h = new CopyOnWriteArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public static int f144863i;

    /* renamed from: j  reason: collision with root package name */
    public static int f144864j;

    /* renamed from: k  reason: collision with root package name */
    public static boolean f144865k;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f144866l;

    /* renamed from: m  reason: collision with root package name */
    public static int f144867m;
    public static final C3850a n = new C3850a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f144868a;

    /* renamed from: b  reason: collision with root package name */
    public String f144869b;

    /* renamed from: c  reason: collision with root package name */
    public String f144870c;

    @Override // com.ss.android.ugc.aweme.web.b.a
    public final String a() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.web.b.a
    public final InputStream b(String str) {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.web.a$a  reason: collision with other inner class name */
    public static final class C3850a {

        /* renamed from: com.ss.android.ugc.aweme.web.a$a$b */
        public static final class b {

            /* renamed from: c  reason: collision with root package name */
            public static final C3852a f144879c = new C3852a((byte) 0);

            /* renamed from: a  reason: collision with root package name */
            public final String f144880a;

            /* renamed from: b  reason: collision with root package name */
            public final int f144881b;

            static {
                Covode.recordClassIndex(94726);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return l.a(this.f144880a, bVar.f144880a) && this.f144881b == bVar.f144881b;
            }

            public final int hashCode() {
                String str = this.f144880a;
                return ((str != null ? str.hashCode() : 0) * 31) + this.f144881b;
            }

            public final String toString() {
                return "AdWebResStatus(url=" + this.f144880a + ", status=" + this.f144881b + ")";
            }

            /* renamed from: com.ss.android.ugc.aweme.web.a$a$b$a  reason: collision with other inner class name */
            public static final class C3852a {
                static {
                    Covode.recordClassIndex(94727);
                }

                private C3852a() {
                }

                public /* synthetic */ C3852a(byte b2) {
                    this();
                }

                public static List<b> a(String str) {
                    int i2;
                    if (str == null || str.length() == 0) {
                        return z.INSTANCE;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : p.c(str, new String[]{"$$"})) {
                        String b2 = p.b(str2, '.');
                        Integer e2 = p.e(p.j(str2));
                        if (e2 != null) {
                            i2 = e2.intValue();
                        } else {
                            i2 = 0;
                        }
                        arrayList.add(new b(b2, i2));
                    }
                    return arrayList;
                }
            }

            public b(String str, int i2) {
                l.d(str, "");
                this.f144880a = str;
                this.f144881b = i2;
            }
        }

        static {
            Covode.recordClassIndex(94724);
        }

        private C3850a() {
        }

        public static void a() {
            a.f144858d = null;
            a.f144859e = 0;
            a.f144860f = null;
            a.f144861g.clear();
            a.f144862h.clear();
            a.f144863i = 0;
            a.f144864j = 0;
            a.f144867m = 0;
            a.f144865k = false;
        }

        /* renamed from: com.ss.android.ugc.aweme.web.a$a$a  reason: collision with other inner class name */
        public static final class C3851a {

            /* renamed from: a  reason: collision with root package name */
            public final String f144874a;

            /* renamed from: b  reason: collision with root package name */
            public final String f144875b;

            /* renamed from: c  reason: collision with root package name */
            public final String f144876c;

            /* renamed from: d  reason: collision with root package name */
            public int f144877d;

            /* renamed from: e  reason: collision with root package name */
            public final int f144878e;

            static {
                Covode.recordClassIndex(94725);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3851a)) {
                    return false;
                }
                C3851a aVar = (C3851a) obj;
                return l.a(this.f144874a, aVar.f144874a) && l.a(this.f144875b, aVar.f144875b) && l.a(this.f144876c, aVar.f144876c) && this.f144877d == aVar.f144877d && this.f144878e == aVar.f144878e;
            }

            public final int hashCode() {
                String str = this.f144874a;
                int i2 = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f144875b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f144876c;
                if (str3 != null) {
                    i2 = str3.hashCode();
                }
                return ((((hashCode2 + i2) * 31) + this.f144877d) * 31) + this.f144878e;
            }

            public final String toString() {
                String jSONObject = new JSONObject().putOpt("url", this.f144874a).putOpt(StringSet.type, this.f144875b).putOpt("size", this.f144876c).putOpt("status", Integer.valueOf(this.f144877d)).putOpt("first_page", Integer.valueOf(this.f144878e)).toString();
                l.b(jSONObject, "");
                return jSONObject;
            }

            public C3851a(String str, String str2, String str3, int i2, int i3) {
                l.d(str3, "");
                this.f144874a = str;
                this.f144875b = str2;
                this.f144876c = str3;
                this.f144877d = i2;
                this.f144878e = i3;
            }
        }

        public static void b() {
            String g2;
            String b2;
            IAdLandPagePreloadService f2;
            JSONObject b3;
            JSONObject optJSONObject;
            IAdLandPagePreloadService f3 = AdLandPagePreloadServiceImpl.f();
            if (!(f3 == null || (g2 = f3.g("feed")) == null || (b2 = dc.b(g2, a.f144858d)) == null || (f2 = AdLandPagePreloadServiceImpl.f()) == null || (b3 = f2.b(b2)) == null)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List<b> a2 = b.C3852a.a(a.f144860f);
                ArrayList arrayList = new ArrayList();
                for (T t : a2) {
                    T t2 = t;
                    String a3 = com.ss.android.ugc.aweme.utils.gecko.a.a(t2.f144880a);
                    if (b3.has(a3)) {
                        String str = t2.f144880a;
                        l.b(a3, "");
                        linkedHashMap.put(str, a3);
                    } else {
                        String a4 = a(t2.f144880a);
                        if (b3.has(a4)) {
                            linkedHashMap.put(a4, a4);
                        }
                    }
                    arrayList.add(t);
                }
                ArrayList<b> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
                for (b bVar : arrayList2) {
                    arrayList3.add(v.a(bVar.f144880a, bVar));
                }
                Map d2 = ag.d(ag.a(arrayList3));
                for (T t3 : a.f144861g) {
                    b bVar2 = (b) ad.h(d2).remove(t3.f144874a);
                    if (bVar2 != null) {
                        t3.f144877d = bVar2.f144881b;
                    }
                }
                for (Map.Entry entry : d2.entrySet()) {
                    String str2 = (String) linkedHashMap.get(entry.getKey());
                    if (!(str2 == null || (optJSONObject = b3.optJSONObject(str2)) == null)) {
                        String optString = optJSONObject.optString("fileSize");
                        CopyOnWriteArrayList<C3851a> copyOnWriteArrayList = a.f144861g;
                        String a5 = com.bytedance.falconx.c.a.a(a((String) entry.getKey()));
                        l.b(optString, "");
                        copyOnWriteArrayList.add(new C3851a((String) entry.getKey(), a5, optString, ((b) entry.getValue()).f144881b, 1));
                    }
                }
            }
        }

        public /* synthetic */ C3850a(byte b2) {
            this();
        }

        public static String a(String str) {
            int a2;
            if (TextUtils.isEmpty(str) || (a2 = p.a((CharSequence) str, '?', 0, false, 6)) == -1) {
                return str;
            }
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String substring = str.substring(0, a2);
            l.b(substring, "");
            return substring;
        }
    }

    static final class b extends m implements h.f.a.a<h.z> {
        final /* synthetic */ String $url;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(94728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, String str) {
            super(0);
            this.this$0 = aVar;
            this.$url = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            a();
            return h.z.f158842a;
        }

        public final void a() {
            if (com.ss.android.ugc.aweme.ad.settings.b.a() && this.$url != null && a.f144866l && !a.f144865k) {
                String str = this.$url;
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                if (!p.b(p.b((CharSequence) str).toString(), "http://", false)) {
                    String str2 = this.$url;
                    Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.CharSequence");
                    if (!p.b(p.b((CharSequence) str2).toString(), "https://", false)) {
                        return;
                    }
                }
                if (a.d(this.$url)) {
                    if (a.f144862h.size() > 10000) {
                        a.f144862h.clear();
                        a.f144864j = 0;
                    }
                    int i2 = a.f144864j + 1;
                    a.f144864j = i2;
                    if (i2 <= f.a().f66161a) {
                        CopyOnWriteArrayList<C3850a.C3851a> copyOnWriteArrayList = a.f144862h;
                        String str3 = this.$url;
                        copyOnWriteArrayList.add(new C3850a.C3851a(str3, this.this$0.c(C3850a.a(str3)), "0", 0, AdWebStatBusiness.a()));
                    }
                    a.f144858d = this.this$0.f144869b;
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(94723);
    }

    public static boolean d(String str) {
        if (!p.a((CharSequence) C3850a.a(str), (CharSequence) ".", false)) {
            return false;
        }
        int a2 = p.a((CharSequence) str, ".");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(a2);
        l.b(substring, "");
        if (p.e((CharSequence) substring, (CharSequence) "/")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.web.b.a
    public final String c(String str) {
        if (str != null && (p.c(str, ".shtml", false) || p.c(str, ".do", false))) {
            return "text/html";
        }
        String c2 = super.c(str);
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.web.b.a, com.ss.android.sdk.webview.h.a
    public final WebResourceResponse a(String str) {
        String str2;
        WebResourceResponse webResourceResponse;
        JSONObject b2;
        boolean z;
        MethodCollector.i(11623);
        b bVar = new b(this, str);
        String str3 = this.f144869b;
        WebResourceResponse webResourceResponse2 = null;
        String str4 = null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            bVar.a();
            MethodCollector.o(11623);
            return null;
        }
        z.e eVar = new z.e();
        eVar.element = null;
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
        if (f2 != null) {
            eVar.element = (T) f2.g(this.f144870c);
            str2 = dc.b(eVar.element, str3);
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            bVar.a();
            MethodCollector.o(11623);
            return null;
        }
        c cVar = new c(this, str, str2, eVar, str3);
        IAdLandPagePreloadService f3 = AdLandPagePreloadServiceImpl.f();
        boolean z2 = true;
        if (!(f3 == null || (b2 = f3.b(str2)) == null)) {
            String a2 = com.ss.android.ugc.aweme.utils.gecko.a.a(str);
            if (!b2.has(a2)) {
                if (str == null || str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    String a3 = C3850a.a(str);
                    if (a3.length() != str.length()) {
                        a2 = com.ss.android.ugc.aweme.utils.gecko.a.a(a3);
                    }
                }
            }
            JSONObject optJSONObject = b2.optJSONObject(a2);
            if (optJSONObject != null) {
                System.currentTimeMillis();
                File file = new File(str2, optJSONObject.optString("fileName"));
                if (file.exists()) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("respHeader");
                    if (optJSONObject2 != null) {
                        str4 = optJSONObject2.optString("content-type");
                    }
                    webResourceResponse2 = a(str4, "", new FileInputStream(file));
                }
                if (webResourceResponse2 != null) {
                    cVar.a(webResourceResponse2.getMimeType(), String.valueOf(file.length()));
                } else {
                    bVar.a();
                }
                MethodCollector.o(11623);
                return webResourceResponse2;
            }
        }
        System.currentTimeMillis();
        if (str != null) {
            String a4 = C3850a.a(str);
            String c2 = c(a4);
            if (AdLandPagePreloadServiceImpl.f() == null) {
                z2 = false;
            }
            if (!TextUtils.isEmpty(c2) || !z2) {
                try {
                    File file2 = new File(str2, com.ss.android.ugc.aweme.utils.gecko.a.a(a4));
                    if (file2.exists()) {
                        webResourceResponse = a(c2, "", new FileInputStream(file2));
                    } else {
                        webResourceResponse = null;
                    }
                    if (webResourceResponse != null) {
                        cVar.a(webResourceResponse.getMimeType(), String.valueOf(file2.length()));
                    } else {
                        bVar.a();
                    }
                    MethodCollector.o(11623);
                    return webResourceResponse;
                } catch (Throwable unused) {
                    bVar.a();
                    MethodCollector.o(11623);
                    return null;
                }
            } else {
                bVar.a();
                MethodCollector.o(11623);
                return null;
            }
        } else {
            bVar.a();
            MethodCollector.o(11623);
            return null;
        }
    }

    static final class c extends m implements h.f.a.m<String, String, h.z> {
        final /* synthetic */ z.e $accessKey;
        final /* synthetic */ String $channel;
        final /* synthetic */ String $channelPath;
        final /* synthetic */ String $url;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(94729);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, String str, String str2, z.e eVar, String str3) {
            super(2);
            this.this$0 = aVar;
            this.$url = str;
            this.$channelPath = str2;
            this.$accessKey = eVar;
            this.$channel = str3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(String str, String str2) {
            a(str, str2);
            return h.z.f158842a;
        }

        public final void a(String str, String str2) {
            String str3 = str;
            l.d(str2, "");
            if (com.ss.android.ugc.aweme.ad.settings.b.a() && this.$url != null && a.f144866l && !a.f144865k) {
                String str4 = this.$url;
                Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.CharSequence");
                int i2 = 0;
                if (!p.b(p.b((CharSequence) str4).toString(), "http://", false)) {
                    String str5 = this.$url;
                    Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.CharSequence");
                    if (!p.b(p.b((CharSequence) str5).toString(), "https://", false)) {
                        return;
                    }
                }
                if (a.d(this.$url)) {
                    if (str3 == null) {
                        str3 = this.this$0.c(C3850a.a(this.$url));
                    }
                    if (a.f144861g.size() > 10000) {
                        a.f144861g.clear();
                        a.f144863i = 0;
                    }
                    a.f144863i++;
                    a.f144861g.add(new C3850a.C3851a(this.$url, str3, str2, 1, AdWebStatBusiness.a()));
                    a.f144858d = this.this$0.f144869b;
                    if (a.f144867m == 0) {
                        String str6 = this.$channelPath;
                        if (str6 == null) {
                            l.b();
                        }
                        if (new File(str6).exists() && new File(this.$channelPath).isDirectory()) {
                            File[] listFiles = new File(this.$channelPath).listFiles();
                            if (listFiles != null) {
                                i2 = listFiles.length;
                            }
                            a.f144867m = i2;
                        }
                    }
                    T t = this.$accessKey.element;
                    if (t != null && a.f144859e == 0) {
                        Long b2 = dc.b("offlineX", t, this.$channel);
                        l.b(b2, "");
                        a.f144859e = b2.longValue();
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3) {
        super(true);
        l.d(str, "");
        l.d(str3, "");
        this.f144868a = str;
        this.f144869b = str2;
        this.f144870c = str3;
    }
}
