package com.ss.ttvideoengine.k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ttvideoengine.k.k;
import com.ss.ttvideoengine.s.c;
import java.io.IOException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.ConnectionSpec;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;

public class j extends k {

    /* renamed from: a  reason: collision with root package name */
    public static final MediaType f153044a = MediaType.parse("application/json");

    /* renamed from: c  reason: collision with root package name */
    private static OkHttpClient f153045c;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f153046e = true;

    /* renamed from: f  reason: collision with root package name */
    private static int f153047f = 10;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f153048g = false;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f153049h = false;

    /* renamed from: b  reason: collision with root package name */
    public int f153050b;

    /* renamed from: d  reason: collision with root package name */
    private Call f153051d;

    @Override // com.ss.ttvideoengine.k.k
    public final void a() {
        Call call = this.f153051d;
        if (call != null && !call.isCanceled()) {
            this.f153051d.cancel();
        }
    }

    static {
        Covode.recordClassIndex(101701);
    }

    public j() {
        MethodCollector.i(12872);
        if (f153045c == null || f153049h) {
            synchronized (j.class) {
                try {
                    b();
                } finally {
                    MethodCollector.o(12872);
                }
            }
            return;
        }
        MethodCollector.o(12872);
    }

    private static void b() {
        if (f153049h) {
            f153045c = null;
        }
        if (f153045c == null) {
            OkHttpClient.Builder readTimeout = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS);
            if (f153048g) {
                try {
                    SSLContext instance = SSLContext.getInstance("TLS");
                    instance.init(null, null, null);
                    TrustManagerFactory instance2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    instance2.init((KeyStore) null);
                    ConnectionSpec build = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).build();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(build);
                    arrayList.add(ConnectionSpec.COMPATIBLE_TLS);
                    arrayList.add(ConnectionSpec.CLEARTEXT);
                    readTimeout.connectionSpecs(arrayList);
                    readTimeout.sslSocketFactory(new i(instance.getSocketFactory()), (X509TrustManager) instance2.getTrustManagers()[0]);
                    com.ss.ttvideoengine.s.j.a("TTHTTPNetwork", "tls1.2 enabled");
                } catch (Exception unused) {
                    com.ss.ttvideoengine.s.j.e("TTHTTPNetwork", "enable tls1.2 error");
                }
            }
            f153045c = readTimeout.build();
            f153049h = false;
        }
    }

    @Override // com.ss.ttvideoengine.k.k
    public final void a(String str, final k.a aVar) {
        MethodCollector.i(13157);
        synchronized (j.class) {
            try {
                b();
            } catch (Throwable th) {
                MethodCollector.o(13157);
                throw th;
            }
        }
        Call newCall = f153045c.newCall(new Request.Builder().url(str).build());
        this.f153051d = newCall;
        newCall.enqueue(new Callback() {
            /* class com.ss.ttvideoengine.k.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(101702);
            }

            @Override // okhttp3.Callback
            public final void onFailure(Call call, IOException iOException) {
                j.this.f153050b = 2;
                aVar.a(null, new c("", -9994, iOException.toString()));
            }

            @Override // okhttp3.Callback
            public final void onResponse(Call call, Response response) {
                JSONObject jSONObject;
                int i2;
                Exception e2;
                ResponseBody body = response.body();
                try {
                    jSONObject = new JSONObject(body.string());
                    i2 = -1;
                    e2 = null;
                    try {
                        if (!response.isSuccessful()) {
                            e2 = new Exception("http fail");
                            i2 = response.code();
                        }
                        if (body != null) {
                            try {
                                body.close();
                            } catch (Exception unused) {
                            }
                        }
                        if (e2 == null) {
                            aVar.a(jSONObject, null);
                        } else {
                            aVar.a(jSONObject, new c("", i2, e2.toString()));
                        }
                    } catch (Throwable th) {
                        if (body != null) {
                            try {
                                body.close();
                                throw th;
                            } catch (Exception unused2) {
                                throw th;
                            }
                        } else {
                            throw th;
                        }
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    jSONObject = null;
                    i2 = -9979;
                }
            }
        });
        MethodCollector.o(13157);
    }

    private void a(Request request, final k.a aVar) {
        MethodCollector.i(13233);
        synchronized (j.class) {
            try {
                int i2 = this.f153050b;
                if (i2 != 3) {
                    if (i2 != 1) {
                        this.f153050b = 1;
                        Call newCall = f153045c.newCall(request);
                        this.f153051d = newCall;
                        newCall.enqueue(new Callback() {
                            /* class com.ss.ttvideoengine.k.j.AnonymousClass2 */

                            static {
                                Covode.recordClassIndex(101703);
                            }

                            @Override // okhttp3.Callback
                            public final void onFailure(Call call, IOException iOException) {
                                j.this.f153050b = 2;
                                aVar.a(null, new c("", -9994, iOException.toString()));
                            }

                            /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
                                r8 = -1;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
                                r6 = r12.body();
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
                                r0 = r6.string();
                                r4 = new org.json.JSONObject(r0);
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
                                com.ss.ttvideoengine.s.j.b("TTHTTPNetwork", "startTask onResponse body:".concat(java.lang.String.valueOf(r0)));
                                r3 = null;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
                                r0 = e;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
                                r0 = e;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
                                r4 = null;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
                                r3 = r0.toString();
                                r0.printStackTrace();
                                r8 = -9994;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
                                if (r12.isSuccessful() == false) goto L_0x004f;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
                                r3 = r12.message();
                                r8 = r12.code();
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
                                if (r6 != null) goto L_0x0059;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
                                r6.close();
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
                                if (r3 == null) goto L_0x005e;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
                                r7.a(r4, null);
                                com.bytedance.frameworks.apm.trace.MethodCollector.o(10950);
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:32:0x0066, code lost:
                                return;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:33:0x0067, code lost:
                                r7.a(r4, new com.ss.ttvideoengine.s.c("", -9994, r8, r3));
                                com.bytedance.frameworks.apm.trace.MethodCollector.o(10950);
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:34:0x0076, code lost:
                                return;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:35:0x0077, code lost:
                                r0 = th;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
                                if (r6 != null) goto L_0x007a;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
                                r6.close();
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:39:0x007e, code lost:
                                r0 = th;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:40:0x007f, code lost:
                                com.bytedance.frameworks.apm.trace.MethodCollector.o(10950);
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:42:0x0082, code lost:
                                throw r0;
                             */
                            @Override // okhttp3.Callback
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final void onResponse(okhttp3.Call r11, okhttp3.Response r12) {
                                /*
                                // Method dump skipped, instructions count: 137
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.k.j.AnonymousClass2.onResponse(okhttp3.Call, okhttp3.Response):void");
                            }
                        });
                        MethodCollector.o(13233);
                        return;
                    }
                }
                com.ss.ttvideoengine.s.j.a("TTHTTPNetwork", "_startTask status error, return. " + this.f153050b);
            } finally {
                MethodCollector.o(13233);
            }
        }
    }

    @Override // com.ss.ttvideoengine.k.k
    public final void b(String str, Map<String, String> map, k.a aVar) {
        MethodCollector.i(12968);
        synchronized (j.class) {
            try {
                b();
            } catch (Throwable th) {
                MethodCollector.o(12968);
                throw th;
            }
        }
        Request.Builder url = new Request.Builder().url(str);
        if (map != null) {
            for (String str2 : map.keySet()) {
                url.header(str2, map.get(str2));
            }
        }
        a(url.build(), aVar);
        MethodCollector.o(12968);
    }

    @Override // com.ss.ttvideoengine.k.k
    public final void a(String str, Map<String, String> map, k.a aVar) {
        MethodCollector.i(13061);
        synchronized (j.class) {
            try {
                b();
            } catch (Throwable th) {
                MethodCollector.o(13061);
                throw th;
            }
        }
        Request.Builder url = new Request.Builder().url(str);
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                url.addHeader(str2, map.get(str2));
            }
        }
        a(url.build(), aVar);
        MethodCollector.o(13061);
    }

    @Override // com.ss.ttvideoengine.k.k
    public final void a(String str, Map<String, String> map, final k.b bVar) {
        MethodCollector.i(13235);
        synchronized (j.class) {
            try {
                b();
            } catch (Throwable th) {
                MethodCollector.o(13235);
                throw th;
            }
        }
        Request.Builder url = new Request.Builder().url(str);
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                url.addHeader(str2, map.get(str2));
            }
        }
        Call newCall = f153045c.newCall(url.build());
        this.f153051d = newCall;
        newCall.enqueue(new Callback() {
            /* class com.ss.ttvideoengine.k.j.AnonymousClass3 */

            static {
                Covode.recordClassIndex(101704);
            }

            @Override // okhttp3.Callback
            public final void onFailure(Call call, IOException iOException) {
                com.ss.ttvideoengine.s.j.b("TTHTTPNetwork", "startTask onFailure: " + iOException.toString());
                bVar.a(null, new c("", -9994, iOException.toString()));
            }

            @Override // okhttp3.Callback
            public final void onResponse(Call call, Response response) {
                String str;
                int i2;
                ResponseBody body = response.body();
                try {
                    String string = body.string();
                    com.ss.ttvideoengine.s.j.b("TTHTTPNetwork", "startTask onResponse body:".concat(String.valueOf(string)));
                    if (!response.isSuccessful()) {
                        str = response.message();
                        i2 = response.code();
                    } else {
                        i2 = 0;
                        str = null;
                    }
                    body.close();
                    if (str == null) {
                        bVar.a(string, null);
                    } else if (i2 == -9979) {
                        bVar.a(null, new c("", -9979, i2, str));
                    } else {
                        bVar.a(string, new c("", -9994, i2, str));
                    }
                } catch (Throwable th) {
                    if (body != null) {
                        body.close();
                        throw th;
                    }
                    throw th;
                }
            }
        });
        MethodCollector.o(13235);
    }
}
