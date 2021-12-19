package com.ss.android.ugc.aweme.ay;

import android.net.Uri;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.a;
import com.bytedance.frameworks.baselib.network.http.cronet.b.c;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.bytedance.lighten.a.g;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.j;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.u;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.d.d;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.facebook.net.h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class s extends b {

    /* renamed from: e  reason: collision with root package name */
    public volatile b<TypedInput> f67840e;

    /* renamed from: f  reason: collision with root package name */
    public d f67841f;

    /* renamed from: g  reason: collision with root package name */
    private final int f67842g = 206;

    static {
        Covode.recordClassIndex(41755);
    }

    public final void a(u uVar, g gVar, Throwable th, com.bytedance.ttnet.d.b bVar, int i2, long j2, long j3) {
        if (gVar != null) {
            String str = null;
            try {
                if (m.a((String) null)) {
                    if (uVar != null) {
                        str = uVar.f42629a.f42473a;
                    } else {
                        str = gVar.f39851h.toString();
                    }
                }
                Logger.debug();
                com.facebook.net.g gVar2 = new com.facebook.net.g();
                gVar2.f48990a = uVar;
                gVar2.f48992c = str;
                if (this.f67773c != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestId", gVar.f39849f);
                    jSONObject.put("retryCount", i2);
                    this.f67773c.a(gVar2, bVar, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(u uVar, g gVar, Throwable th, long j2, long j3) {
        com.bytedance.ttnet.d.b bVar;
        long j4 = j3;
        if (gVar != null) {
            try {
                String[] strArr = new String[1];
                if (uVar != null) {
                    a(strArr, uVar.f42629a.f42476d);
                }
                if (m.a(strArr[0])) {
                    strArr[0] = b.a(th);
                }
                long j5 = gVar.f39844a;
                if (j2 > 0) {
                    j4 = j2;
                }
                String str = null;
                if (m.a((String) null)) {
                    if (uVar != null) {
                        str = uVar.f42629a.f42473a;
                    } else {
                        str = gVar.f39851h.toString();
                    }
                }
                Logger.debug();
                if (th instanceof c) {
                    a requestInfo = ((c) th).getRequestInfo();
                    if (requestInfo instanceof com.bytedance.ttnet.d.b) {
                        bVar = (com.bytedance.ttnet.d.b) requestInfo;
                    } else {
                        bVar = new com.bytedance.ttnet.d.b();
                        bVar.v = 0;
                        bVar.y = ((c) th).getRequestLog();
                    }
                } else {
                    bVar = new com.bytedance.ttnet.d.b();
                }
                bVar.f28913a = strArr[0];
                if (this.f67772b != null) {
                    this.f67772b.a(j4, j5, str, bVar, th);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.lighten.a.c.m
    public final void a() {
        if (this.f67840e == null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f67840e.cancel();
        } else {
            this.f67771a.execute(new t(this));
        }
    }

    public static String a(u<TypedInput> uVar) {
        Exception e2;
        String str;
        Pattern compile = Pattern.compile("max-age=\\d+");
        String str2 = null;
        try {
            List<com.bytedance.retrofit2.client.b> list = uVar.f42629a.f42476d;
            if (list != null && list.size() > 0) {
                Iterator<com.bytedance.retrofit2.client.b> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.bytedance.retrofit2.client.b next = it.next();
                    if ("Cache-Control".equals(next.f42471a)) {
                        str = next.f42472b;
                        break;
                    }
                }
            }
            str = null;
            if (str == null) {
                return null;
            }
            try {
                Matcher matcher = compile.matcher(str);
                if (matcher.find()) {
                    return matcher.group();
                }
                return null;
            } catch (Exception e3) {
                e2 = e3;
                str2 = str;
                e2.printStackTrace();
                return str2;
            }
        } catch (Exception e4) {
            e2 = e4;
            e2.printStackTrace();
            return str2;
        }
    }

    @Override // com.bytedance.lighten.a.c.m
    public final void a(g gVar) {
        INetworkApi iNetworkApi;
        gVar.f39844a = System.currentTimeMillis();
        if (gVar.f39854k instanceof com.facebook.net.d) {
            this.f67773c = (com.facebook.net.d) gVar.f39854k;
        }
        Uri uri = gVar.f39851h;
        if (uri != null) {
            String a2 = this.f67774d.a(uri.toString());
            if (!m.a(a2)) {
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Pair<String, String> a3 = i.a(a2, linkedHashMap);
                    String str = (String) a3.first;
                    String str2 = (String) a3.second;
                    if (h.a().b()) {
                        iNetworkApi = (INetworkApi) h.a().a(str, INetworkApi.class);
                    } else {
                        iNetworkApi = (INetworkApi) RetrofitUtils.a(str, INetworkApi.class);
                    }
                    this.f67841f = new com.facebook.net.b(gVar.f39855l);
                    LinkedList linkedList = null;
                    if (gVar.f39848e > 0) {
                        linkedList = new LinkedList();
                        linkedList.add(new com.bytedance.retrofit2.client.b("Range", "bytes=" + gVar.f39848e + "-"));
                    }
                    Logger.debug();
                    if (iNetworkApi != null) {
                        this.f67840e = iNetworkApi.downloadFile(false, -1, str2, linkedHashMap, linkedList, this.f67841f);
                    }
                } catch (Exception e2) {
                    a(null, gVar, e2, 0, 0);
                }
            }
        }
    }

    private static void a(String[] strArr, List<com.bytedance.retrofit2.client.b> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (com.bytedance.retrofit2.client.b bVar : list) {
                        if ("x-net-info.remoteaddr".equals(bVar.f42471a)) {
                            strArr[0] = bVar.f42472b;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if ("request canceled".equals(r4.getMessage()) == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.lighten.a.c.i r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0023
            if (r4 == 0) goto L_0x0010
            java.lang.String r1 = "request canceled"
            java.lang.String r0 = r4.getMessage()     // Catch:{ all -> 0x0023 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x001c
        L_0x0010:
            com.bytedance.retrofit2.b<com.bytedance.retrofit2.mime.TypedInput> r0 = r2.f67840e     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0020
            com.bytedance.retrofit2.b<com.bytedance.retrofit2.mime.TypedInput> r0 = r2.f67840e     // Catch:{ all -> 0x0023 }
            boolean r0 = r0.isCanceled()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0020
        L_0x001c:
            r3.a()     // Catch:{ all -> 0x0023 }
            return
        L_0x0020:
            r3.a(r4)     // Catch:{ all -> 0x0023 }
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ay.s.a(com.bytedance.lighten.a.c.i, java.lang.Throwable):void");
    }

    @Override // com.bytedance.lighten.a.c.m
    public final void a(final g gVar, final com.bytedance.lighten.a.c.i iVar) {
        if (this.f67840e != null && gVar != null) {
            this.f67840e.enqueue(new j<TypedInput>() {
                /* class com.ss.android.ugc.aweme.ay.s.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                com.bytedance.ttnet.d.b f67843a;

                /* renamed from: b  reason: collision with root package name */
                long f67844b = -1;

                static {
                    Covode.recordClassIndex(41756);
                }

                @Override // com.bytedance.retrofit2.d
                public final void a(b<TypedInput> bVar, u<TypedInput> uVar) {
                }

                @Override // com.bytedance.retrofit2.d
                public final void a(b<TypedInput> bVar, Throwable th) {
                    Exception exc;
                    this.f67844b = System.currentTimeMillis();
                    long j2 = gVar.f39847d - gVar.f39844a;
                    long j3 = 0;
                    if (j2 <= 0) {
                        j3 = System.currentTimeMillis() - gVar.f39844a;
                    }
                    s.this.a(null, gVar, th, j2, j3);
                    if (th instanceof Exception) {
                        exc = (Exception) th;
                    } else {
                        exc = new Exception(th.getMessage(), th.getCause());
                    }
                    a(null, exc, this.f67843a, j2, j3);
                    s.this.a(iVar, th);
                }

                /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5 A[Catch:{ all -> 0x00f0 }] */
                @Override // com.bytedance.retrofit2.j
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void b(com.bytedance.retrofit2.b<com.bytedance.retrofit2.mime.TypedInput> r19, com.bytedance.retrofit2.u<com.bytedance.retrofit2.mime.TypedInput> r20) {
                    /*
                    // Method dump skipped, instructions count: 245
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ay.s.AnonymousClass1.b(com.bytedance.retrofit2.b, com.bytedance.retrofit2.u):void");
                }

                /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
                    if (r9 != null) goto L_0x0076;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:41:0x0097 A[Catch:{ all -> 0x00c3 }] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                private void a(com.bytedance.retrofit2.u r16, java.lang.Exception r17, com.bytedance.ttnet.d.b r18, long r19, long r21) {
                    /*
                    // Method dump skipped, instructions count: 196
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ay.s.AnonymousClass1.a(com.bytedance.retrofit2.u, java.lang.Exception, com.bytedance.ttnet.d.b, long, long):void");
                }
            });
        }
    }

    public static void a(a aVar, List<com.bytedance.retrofit2.client.b> list, d dVar, Exception exc) {
        if (aVar != null) {
            try {
                if (m.a(aVar.f28913a)) {
                    String str = null;
                    if (list != null && list.size() > 0) {
                        for (com.bytedance.retrofit2.client.b bVar : list) {
                            if ("x-net-info.remoteaddr".equalsIgnoreCase(bVar.f42471a)) {
                                str = bVar.f42472b;
                            }
                        }
                    }
                    if (m.a(str) && dVar != null) {
                        str = dVar.f28940a;
                    }
                    if (m.a(str)) {
                        str = b.a(exc);
                    }
                    if (!m.a(str)) {
                        aVar.f28913a = str;
                        if (aVar.f28914b != null) {
                            aVar.f28914b.f28940a = str;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
