package com.ss.android.ugc.aweme.compliance.business.c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.compliance.business.a.c;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.net.monitor.i;
import com.ss.android.ugc.aweme.net.monitor.k;
import com.ss.android.ugc.aweme.net.monitor.l;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import h.a.n;
import h.m.p;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

public final class e implements i, k, l {

    /* renamed from: a  reason: collision with root package name */
    public static final String f76853a;

    /* renamed from: b  reason: collision with root package name */
    public static String f76854b;

    /* renamed from: c  reason: collision with root package name */
    public static final Keva f76855c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f76856d = new a((byte) 0);

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final boolean a() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.k
    public final com.ss.android.ugc.aweme.net.model.e<Request, Response> d(com.ss.android.ugc.aweme.net.model.e<Request, Response> eVar) {
        h.f.b.l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final com.ss.android.ugc.aweme.net.model.e<HttpURLConnection, InputStream> f(com.ss.android.ugc.aweme.net.model.e<HttpURLConnection, InputStream> eVar) {
        h.f.b.l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final com.ss.android.ugc.aweme.net.model.e<HttpURLConnection, InputStream> h(com.ss.android.ugc.aweme.net.model.e<HttpURLConnection, InputStream> eVar) {
        h.f.b.l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final com.ss.android.ugc.aweme.net.model.e<HttpURLConnection, Integer> i(com.ss.android.ugc.aweme.net.model.e<HttpURLConnection, Integer> eVar) {
        h.f.b.l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final com.ss.android.ugc.aweme.net.model.e<HttpURLConnection, Integer> j(com.ss.android.ugc.aweme.net.model.e<HttpURLConnection, Integer> eVar) {
        h.f.b.l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final com.ss.android.ugc.aweme.net.model.e<HttpURLConnection, InputStream> k(com.ss.android.ugc.aweme.net.model.e<HttpURLConnection, InputStream> eVar) {
        h.f.b.l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final com.ss.android.ugc.aweme.net.model.e<HttpURLConnection, InputStream> l(com.ss.android.ugc.aweme.net.model.e<HttpURLConnection, InputStream> eVar) {
        h.f.b.l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final com.ss.android.ugc.aweme.net.model.e<URL, URLConnection> m(com.ss.android.ugc.aweme.net.model.e<URL, URLConnection> eVar) {
        h.f.b.l.d(eVar, "");
        return eVar;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47505);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(47504);
        String simpleName = e.class.getSimpleName();
        h.f.b.l.b(simpleName, "");
        f76853a = simpleName;
        Keva repo = Keva.getRepo("x-tt-cmpl-token", 1);
        h.f.b.l.b(repo, "");
        f76855c = repo;
    }

    private final String b() {
        String str = f76854b;
        if (str == null || p.a((CharSequence) str)) {
            String string = f76855c.getString(d(""), "");
            if (string == null || p.a((CharSequence) string)) {
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                h.f.b.l.b(createIUserServicebyMonsterPlugin, "");
                User currentUser = createIUserServicebyMonsterPlugin.getCurrentUser();
                h.f.b.l.b(currentUser, "");
                string = c(currentUser.getUid());
            }
            if (string != null && !p.a((CharSequence) string)) {
                b(string);
            }
        }
        return f76854b;
    }

    private static void b(String str) {
        f76854b = str;
        f76855c.storeString(d(""), str);
    }

    private static String d(String str) {
        if (p.a((CharSequence) str)) {
            return "x-tt-cmpl-token";
        }
        return "x-tt-cmpl-token_".concat(String.valueOf(str));
    }

    private static String c(String str) {
        boolean z;
        String str2;
        if (str == null || p.a((CharSequence) str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String d2 = d(str);
        Keva keva = f76855c;
        if (keva.contains(d2)) {
            str2 = keva.getString(d2, "");
        } else {
            str2 = null;
        }
        a("keva", null, str2, null, 10);
        return str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r2 != null) goto L_0x0016;
     */
    @Override // com.ss.android.ugc.aweme.net.monitor.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.net.model.e<java.net.HttpURLConnection, java.io.InputStream> e(com.ss.android.ugc.aweme.net.model.e<java.net.HttpURLConnection, java.io.InputStream> r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r6, r0)
            Q r2 = r6.f112458a
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            r4 = 0
            if (r2 == 0) goto L_0x0030
            java.net.URL r0 = r2.getURL()
            if (r0 == 0) goto L_0x0037
            java.lang.String r3 = r0.toString()
        L_0x0016:
            boolean r0 = a(r3)
            if (r0 == 0) goto L_0x0030
            java.lang.String r1 = r5.b()
            if (r1 == 0) goto L_0x0028
            boolean r0 = h.m.p.a(r1)
            if (r0 == 0) goto L_0x0031
        L_0x0028:
            r2 = 4
            java.lang.String r1 = "no token"
            java.lang.String r0 = "3"
            a(r1, r3, r4, r0, r2)
        L_0x0030:
            return r6
        L_0x0031:
            java.lang.String r0 = "x-tt-cmpl-token"
            r2.setRequestProperty(r0, r1)
            goto L_0x0030
        L_0x0037:
            r3 = r4
            if (r2 == 0) goto L_0x0030
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.c.e.e(com.ss.android.ugc.aweme.net.model.e):com.ss.android.ugc.aweme.net.model.e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r2 != null) goto L_0x0016;
     */
    @Override // com.ss.android.ugc.aweme.net.monitor.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.net.model.e<java.net.HttpURLConnection, java.io.InputStream> g(com.ss.android.ugc.aweme.net.model.e<java.net.HttpURLConnection, java.io.InputStream> r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r6, r0)
            Q r2 = r6.f112458a
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            r4 = 0
            if (r2 == 0) goto L_0x0030
            java.net.URL r0 = r2.getURL()
            if (r0 == 0) goto L_0x0037
            java.lang.String r3 = r0.toString()
        L_0x0016:
            boolean r0 = a(r3)
            if (r0 == 0) goto L_0x0030
            java.lang.String r1 = r5.b()
            if (r1 == 0) goto L_0x0028
            boolean r0 = h.m.p.a(r1)
            if (r0 == 0) goto L_0x0031
        L_0x0028:
            r2 = 4
            java.lang.String r1 = "no token"
            java.lang.String r0 = "3"
            a(r1, r3, r4, r0, r2)
        L_0x0030:
            return r6
        L_0x0031:
            java.lang.String r0 = "x-tt-cmpl-token"
            r2.setRequestProperty(r0, r1)
            goto L_0x0030
        L_0x0037:
            r3 = r4
            if (r2 == 0) goto L_0x0030
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.c.e.g(com.ss.android.ugc.aweme.net.model.e):com.ss.android.ugc.aweme.net.model.e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r5 != null) goto L_0x0016;
     */
    @Override // com.ss.android.ugc.aweme.net.monitor.k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.net.model.e<okhttp3.Request, okhttp3.Response> c(com.ss.android.ugc.aweme.net.model.e<okhttp3.Request, okhttp3.Response> r7) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r7, r0)
            Q r5 = r7.f112458a
            okhttp3.Request r5 = (okhttp3.Request) r5
            r4 = 0
            if (r5 == 0) goto L_0x0030
            okhttp3.HttpUrl r0 = r5.url()
            if (r0 == 0) goto L_0x0053
            java.lang.String r3 = r0.toString()
        L_0x0016:
            boolean r0 = a(r3)
            if (r0 == 0) goto L_0x0030
            java.lang.String r1 = r6.b()
            if (r1 == 0) goto L_0x0028
            boolean r0 = h.m.p.a(r1)
            if (r0 == 0) goto L_0x0031
        L_0x0028:
            r2 = 4
            java.lang.String r1 = "no token"
            java.lang.String r0 = "4"
            a(r1, r3, r4, r0, r2)
        L_0x0030:
            return r7
        L_0x0031:
            okhttp3.Headers r0 = r5.headers()
            if (r0 == 0) goto L_0x003d
            okhttp3.Headers$Builder r2 = r0.newBuilder()
            if (r2 != 0) goto L_0x0042
        L_0x003d:
            okhttp3.Headers$Builder r2 = new okhttp3.Headers$Builder
            r2.<init>()
        L_0x0042:
            java.lang.String r0 = "x-tt-cmpl-token"
            r2.set(r0, r1)
            okhttp3.Request$Builder r1 = r5.newBuilder()
            okhttp3.Headers r0 = r2.build()
            r1.headers(r0)
            goto L_0x0030
        L_0x0053:
            r3 = r4
            if (r5 == 0) goto L_0x0030
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.c.e.c(com.ss.android.ugc.aweme.net.model.e):com.ss.android.ugc.aweme.net.model.e");
    }

    private static boolean a(String str) {
        String str2;
        if (str == null || p.a((CharSequence) str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse != null) {
            str2 = parse.getHost();
        } else {
            str2 = null;
        }
        List<String> d2 = com.bytedance.ttnet.a.a.a(d.a()).d(str2);
        if (str2 != null && !p.a((CharSequence) str2) && d2 != null && !d2.isEmpty()) {
            for (T t : d2) {
                h.f.b.l.b(t, "");
                if (p.c(str2, (String) t, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.l
    public final com.ss.android.ugc.aweme.net.model.e<com.bytedance.retrofit2.client.Request, u<?>> b(com.ss.android.ugc.aweme.net.model.e<com.bytedance.retrofit2.client.Request, u<?>> eVar) {
        String str;
        R r;
        List<b> list;
        T t;
        String str2;
        h.f.b.l.d(eVar, "");
        Q q = eVar.f112458a;
        if (q != null) {
            str = q.getUrl();
        } else {
            str = null;
        }
        if (!(!a(str) || (r = eVar.f112459b) == null || (list = r.f42629a.f42476d) == null)) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                T t2 = t;
                h.f.b.l.b(t2, "");
                String str3 = t2.f42471a;
                h.f.b.l.b(str3, "");
                Locale locale = Locale.ROOT;
                h.f.b.l.b(locale, "");
                Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = str3.toLowerCase(locale);
                h.f.b.l.b(lowerCase, "");
                if (h.f.b.l.a((Object) lowerCase, (Object) "x-tt-cmpl-token")) {
                    break;
                }
            }
            T t3 = t;
            if (!(t3 == null || (str2 = t3.f42472b) == null || p.a((CharSequence) str2))) {
                b(str2);
            }
        }
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.l
    public final com.ss.android.ugc.aweme.net.model.e<com.bytedance.retrofit2.client.Request, u<?>> a(com.ss.android.ugc.aweme.net.model.e<com.bytedance.retrofit2.client.Request, u<?>> eVar) {
        List<b> list;
        h.f.b.l.d(eVar, "");
        Q q = eVar.f112458a;
        if (q != null) {
            String url = q.getUrl();
            if (a(url)) {
                List<b> headers = q.getHeaders();
                if (headers != null) {
                    ArrayList arrayList = new ArrayList();
                    for (T t : headers) {
                        T t2 = t;
                        h.f.b.l.b(t2, "");
                        if (!h.f.b.l.a((Object) t2.f42471a, (Object) "x-tt-cmpl-token")) {
                            arrayList.add(t);
                        }
                    }
                    list = n.g((Collection) arrayList);
                } else {
                    list = new ArrayList<>();
                }
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder("login=");
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g2, "");
                sb.append(sb2.append(g2.isLogin() ? 1 : 0).append(';').toString());
                sb.append("ct=" + (c.a.d() ? 1 : 0) + ';');
                sb.append("rt=" + c.a.e());
                list.add(new b("x-tt-dm-status", sb.toString()));
                String b2 = b();
                if (b2 == null || p.a((CharSequence) b2)) {
                    a("no token", url, null, "2", 4);
                } else {
                    list.add(new b("x-tt-cmpl-token", b2));
                }
                Request.a newBuilder = q.newBuilder();
                newBuilder.f42460c = list;
                eVar.f112458a = (Q) newBuilder.a();
            }
        }
        return eVar;
    }

    private static void a(String str, String str2, String str3, String str4) {
        try {
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            h.f.b.l.b(createIUserServicebyMonsterPlugin, "");
            User currentUser = createIUserServicebyMonsterPlugin.getCurrentUser();
            h.f.b.l.b(currentUser, "");
            String uid = currentUser.getUid();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("op", str);
            jSONObject.put("uid", uid);
            if (str2 != null) {
                jSONObject.put("url", str2);
            }
            if (str3 != null) {
                jSONObject.put("value", str3);
            }
            if (str4 != null) {
                jSONObject.put("netType", str4);
            }
            com.bytedance.apm.b.a(com.ss.android.ugc.aweme.net.model.c.PENETRATE_HEADER_LOG.getLogType(), jSONObject);
        } catch (Exception unused) {
        }
    }

    private static /* synthetic */ void a(String str, String str2, String str3, String str4, int i2) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            str3 = null;
        }
        if ((i2 & 8) != 0) {
            str4 = null;
        }
        a(str, str2, str3, str4);
    }
}
