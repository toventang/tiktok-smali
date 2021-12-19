package com.facebook.net;

import android.net.Uri;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.a.b;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.bytedance.retrofit2.j;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.u;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.d.d;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.n.ag;
import com.facebook.imagepipeline.n.al;
import com.facebook.imagepipeline.n.ax;
import com.facebook.imagepipeline.n.k;
import com.facebook.imagepipeline.n.t;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class c extends com.facebook.imagepipeline.n.c<C1191c> {

    /* renamed from: b  reason: collision with root package name */
    public static d f48949b;

    /* renamed from: c  reason: collision with root package name */
    public static b f48950c;

    /* renamed from: a  reason: collision with root package name */
    public Executor f48951a;

    public interface a {
        static {
            Covode.recordClassIndex(29511);
        }

        Pair<InputStream, Long> a(InputStream inputStream, String str, long j2);

        String a(String str);
    }

    public interface b {
        static {
            Covode.recordClassIndex(29512);
        }

        a a();
    }

    static {
        Covode.recordClassIndex(29506);
    }

    public c() {
        this(new com.bytedance.frameworks.baselib.network.http.retrofit.a());
    }

    private c(Executor executor) {
        this.f48951a = executor;
        com.facebook.common.e.a.c("FrescoTTNetFetcher", "init FrescoTTNetFetcher");
    }

    private static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            String[] split = th.getMessage().split("\\|");
            if (split != null && split.length >= 2) {
                Logger.debug();
                return split[0];
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    private static int a(C1191c cVar) {
        Uri c2;
        if (!(cVar == null || cVar.f48390e == null || cVar.f48390e.d() == null)) {
            Object d2 = cVar.f48390e.d();
            if ((d2 instanceof i) && (c2 = cVar.c()) != null) {
                i iVar = (i) d2;
                String uri = c2.toString();
                if (!m.a(uri) && iVar.f49003a.containsKey(uri)) {
                    return iVar.f49003a.get(uri).intValue();
                }
            }
        }
        return -1;
    }

    @Override // com.facebook.imagepipeline.n.ag
    public final /* synthetic */ t createFetchState(k kVar, al alVar) {
        return new C1191c(kVar, alVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.facebook.imagepipeline.n.t, int] */
    @Override // com.facebook.imagepipeline.n.c, com.facebook.imagepipeline.n.ag
    public final /* synthetic */ void onFetchCompletion(C1191c cVar, int i2) {
        cVar.f48973k.run();
    }

    /* renamed from: com.facebook.net.c$c  reason: collision with other inner class name */
    public static class C1191c extends t {

        /* renamed from: a  reason: collision with root package name */
        public long f48968a;

        /* renamed from: b  reason: collision with root package name */
        public long f48969b;

        /* renamed from: c  reason: collision with root package name */
        public long f48970c;

        /* renamed from: i  reason: collision with root package name */
        public long f48971i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f48972j;

        /* renamed from: k  reason: collision with root package name */
        public Runnable f48973k;

        static {
            Covode.recordClassIndex(29513);
        }

        public C1191c(k<e> kVar, al alVar) {
            super(kVar, alVar);
            if (kVar instanceof ax.a) {
                ax.a aVar = (ax.a) kVar;
                if (aVar.f48269a != null) {
                    this.f48971i = (long) aVar.f48269a.h();
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.facebook.imagepipeline.n.t, int] */
    @Override // com.facebook.imagepipeline.n.c, com.facebook.imagepipeline.n.ag
    public final /* synthetic */ Map getExtraMap(C1191c cVar, int i2) {
        String str;
        HashMap hashMap = new HashMap(1);
        hashMap.put("image_size", Integer.toString(i2));
        if (cVar.f48972j) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("hit_cdn_cache", str);
        return hashMap;
    }

    @Override // com.facebook.imagepipeline.n.ag
    public final /* synthetic */ void fetch(t tVar, ag.a aVar) {
        a aVar2;
        INetworkApi iNetworkApi;
        C1191c cVar = (C1191c) tVar;
        if (cVar != null) {
            cVar.f48968a = System.currentTimeMillis();
            Uri c2 = cVar.c();
            if (c2 != null) {
                b bVar = f48950c;
                LinkedList linkedList = null;
                if (bVar != null) {
                    aVar2 = bVar.a();
                } else {
                    aVar2 = null;
                }
                String uri = c2.toString();
                if (aVar2 != null) {
                    uri = aVar2.a(uri);
                }
                if (!m.a(uri)) {
                    try {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Pair<String, String> a2 = i.a(uri, linkedHashMap);
                        String str = (String) a2.first;
                        String str2 = (String) a2.second;
                        if (h.a().b()) {
                            iNetworkApi = (INetworkApi) h.a().a(str, INetworkApi.class);
                        } else {
                            iNetworkApi = (INetworkApi) RetrofitUtils.a(str, INetworkApi.class);
                        }
                        b bVar2 = new b(cVar.d());
                        if (cVar.f48971i > 0) {
                            linkedList = new LinkedList();
                            linkedList.add(new com.bytedance.retrofit2.client.b("Range", "bytes=" + cVar.f48971i + "-"));
                        }
                        Logger.debug();
                        if (iNetworkApi != null) {
                            final com.bytedance.retrofit2.b<TypedInput> downloadFile = iNetworkApi.downloadFile(false, -1, str2, linkedHashMap, linkedList, bVar2);
                            cVar.f48390e.a(new com.facebook.imagepipeline.n.e() {
                                /* class com.facebook.net.c.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(29507);
                                }

                                @Override // com.facebook.imagepipeline.n.am, com.facebook.imagepipeline.n.e
                                public final void a() {
                                    if (Looper.myLooper() != Looper.getMainLooper()) {
                                        downloadFile.cancel();
                                    } else {
                                        c.this.f48951a.execute(new Runnable() {
                                            /* class com.facebook.net.c.AnonymousClass1.AnonymousClass1 */

                                            static {
                                                Covode.recordClassIndex(29508);
                                            }

                                            public final void run() {
                                                downloadFile.cancel();
                                            }
                                        });
                                    }
                                }
                            });
                            e.AbstractC0626e eVar = com.bytedance.frameworks.baselib.network.http.e.f29330b;
                            if (eVar != null) {
                                eVar.b(uri);
                            }
                            downloadFile.enqueue(new j<TypedInput>(aVar2, cVar, bVar2, aVar, false, downloadFile) {
                                /* class com.facebook.net.c.AnonymousClass2 */

                                /* renamed from: a  reason: collision with root package name */
                                com.bytedance.ttnet.d.b f48955a;

                                /* renamed from: b  reason: collision with root package name */
                                long f48956b;

                                /* renamed from: c  reason: collision with root package name */
                                final /* synthetic */ a f48957c;

                                /* renamed from: d  reason: collision with root package name */
                                final /* synthetic */ C1191c f48958d;

                                /* renamed from: e  reason: collision with root package name */
                                final /* synthetic */ d f48959e;

                                /* renamed from: f  reason: collision with root package name */
                                final /* synthetic */ ag.a f48960f;

                                /* renamed from: g  reason: collision with root package name */
                                final /* synthetic */ boolean f48961g = false;

                                /* renamed from: h  reason: collision with root package name */
                                final /* synthetic */ com.bytedance.retrofit2.b f48962h;

                                static {
                                    Covode.recordClassIndex(29509);
                                }

                                @Override // com.bytedance.retrofit2.d
                                public final void a(com.bytedance.retrofit2.b<TypedInput> bVar, u<TypedInput> uVar) {
                                }

                                @Override // com.bytedance.retrofit2.d
                                public final void a(com.bytedance.retrofit2.b<TypedInput> bVar, Throwable th) {
                                    Exception exc;
                                    this.f48956b = System.currentTimeMillis();
                                    if (this.f48961g) {
                                        b.a.f28828a.b();
                                    }
                                    if (th instanceof Exception) {
                                        exc = (Exception) th;
                                    } else {
                                        exc = new Exception(th.getMessage(), th.getCause());
                                    }
                                    a((u) null, exc);
                                }

                                /* JADX WARNING: Failed to process nested try/catch */
                                /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00c0 */
                                /* JADX WARNING: Removed duplicated region for block: B:51:0x00c4 A[Catch:{ all -> 0x00d9 }] */
                                /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                private void a(com.bytedance.retrofit2.u r7, java.lang.Exception r8) {
                                    /*
                                    // Method dump skipped, instructions count: 218
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.net.c.AnonymousClass2.a(com.bytedance.retrofit2.u, java.lang.Exception):void");
                                }

                                /* JADX WARNING: Removed duplicated region for block: B:66:0x0101  */
                                @Override // com.bytedance.retrofit2.j
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                public final void b(final com.bytedance.retrofit2.b<com.bytedance.retrofit2.mime.TypedInput> r12, final com.bytedance.retrofit2.u<com.bytedance.retrofit2.mime.TypedInput> r13) {
                                    /*
                                    // Method dump skipped, instructions count: 266
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.net.c.AnonymousClass2.b(com.bytedance.retrofit2.b, com.bytedance.retrofit2.u):void");
                                }

                                {
                                    this.f48957c = r4;
                                    this.f48958d = r5;
                                    this.f48959e = r6;
                                    this.f48960f = r7;
                                    this.f48962h = r9;
                                    this.f48956b = -1;
                                }
                            });
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    public static void a(C1191c cVar, boolean z, long j2) {
        if (a(cVar) == 1) {
            e.a().a(cVar.c().toString(), z, j2, true);
        } else if (a(cVar) == 0) {
            e.a().a(cVar.c().toString(), z, j2, false);
        }
    }

    public static void a(com.bytedance.frameworks.baselib.network.http.a aVar, List<com.bytedance.retrofit2.client.b> list, d dVar, Exception exc) {
        if (aVar != null) {
            try {
                if (m.a(aVar.f28913a)) {
                    String str = null;
                    if (list != null && list.size() > 0) {
                        for (com.bytedance.retrofit2.client.b bVar : list) {
                            if ("x-snssdk.remoteaddr".equalsIgnoreCase(bVar.f42471a)) {
                                str = bVar.f42472b;
                            }
                        }
                    }
                    if (m.a(str) && dVar != null) {
                        str = dVar.f28940a;
                    }
                    if (m.a(str)) {
                        str = a(exc);
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

    public static void a(u uVar, C1191c cVar, Throwable th, com.bytedance.ttnet.d.b bVar, int i2) {
        if (cVar != null) {
            try {
                long j2 = cVar.f48970c - cVar.f48968a;
                if (j2 <= 0) {
                    j2 = System.currentTimeMillis() - cVar.f48968a;
                }
                String str = null;
                if (m.a((String) null)) {
                    if (uVar != null) {
                        str = uVar.f42629a.f42473a;
                    } else {
                        str = cVar.c().toString();
                    }
                }
                Logger.debug();
                a(cVar, false, j2);
                g gVar = new g();
                gVar.f48990a = uVar;
                gVar.f48992c = str;
                if (f48949b != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestId", cVar.a());
                    jSONObject.put("retryCount", i2);
                    f48949b.a(gVar, bVar, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
