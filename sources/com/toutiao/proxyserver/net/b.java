package com.toutiao.proxyserver.net;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.a;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.bytedance.ttnet.d.d;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.toutiao.proxyserver.b.c;
import com.toutiao.proxyserver.k;
import com.toutiao.proxyserver.u;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.Connection;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Long, c> f154925a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Long, Pair<String, List<InetAddress>>> f154926b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static OkHttpClient f154927c;

    static {
        Covode.recordClassIndex(103168);
    }

    private static synchronized OkHttpClient a() {
        OkHttpClient okHttpClient;
        synchronized (b.class) {
            MethodCollector.i(9917);
            if (f154927c == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                if (!u.u) {
                    builder.protocols(Collections.singletonList(Protocol.HTTP_1_1));
                }
                builder.connectTimeout(10000, TimeUnit.MILLISECONDS).readTimeout(10000, TimeUnit.MILLISECONDS).writeTimeout(10000, TimeUnit.MILLISECONDS);
                builder.dns(new Dns() {
                    /* class com.toutiao.proxyserver.net.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(103169);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
                    @Override // okhttp3.Dns
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.util.List<java.net.InetAddress> lookup(java.lang.String r7) {
                        /*
                        // Method dump skipped, instructions count: 109
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.net.b.AnonymousClass1.lookup(java.lang.String):java.util.List");
                    }
                });
                builder.interceptors().add(new Interceptor() {
                    /* class com.toutiao.proxyserver.net.b.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(103170);
                    }

                    @Override // okhttp3.Interceptor
                    public final Response intercept(Interceptor.Chain chain) {
                        Request request = chain.request();
                        Request.Builder newBuilder = request.newBuilder();
                        long a2 = u.a();
                        final c cVar = new c();
                        cVar.f154789a = request.header("Vpwp-Raw-Key");
                        cVar.f154792d = request.url().toString();
                        try {
                            if (request.header("local_url_index") != null) {
                                cVar.f154801m = Integer.valueOf(request.header("local_url_index")).intValue();
                            }
                            if (request.header("local_url_count") != null) {
                                cVar.n = Integer.valueOf(request.header("local_url_count")).intValue();
                            }
                        } catch (Exception unused) {
                        }
                        newBuilder.tag(Long.valueOf(a2));
                        if (!u.B) {
                            newBuilder.removeHeader("Vpwp-Raw-Key");
                        }
                        newBuilder.removeHeader("local_url_index");
                        newBuilder.removeHeader("local_url_count");
                        b.f154925a.put(Long.valueOf(a2), cVar);
                        Request build = newBuilder.build();
                        try {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Response proceed = chain.proceed(build);
                            cVar.f154797i = SystemClock.elapsedRealtime() - elapsedRealtime;
                            cVar.f154800l = proceed.code();
                            try {
                                cVar.f154798j = Integer.parseInt(proceed.header("Content-Length", "0"));
                            } catch (Exception unused2) {
                                cVar.f154798j = 0;
                            }
                            try {
                                cVar.f154799k = new HashMap();
                                cVar.f154799k.put("X-Cache", proceed.header("X-Cache"));
                                cVar.f154799k.put("X-M-Cache", proceed.header("X-M-Cache"));
                                cVar.f154799k.put("X-Cache-Remote", proceed.header("X-Cache-Remote"));
                                cVar.f154799k.put("Server-Timing", b.a(proceed.headers()));
                            } catch (Exception unused3) {
                                cVar.f154799k = null;
                            }
                            b.f154925a.remove(build.tag());
                            Pair<String, List<InetAddress>> remove = b.f154926b.remove(build.tag());
                            if (remove != null) {
                                cVar.f154790b = (String) remove.first;
                                if (remove.second != null) {
                                    cVar.f154791c = remove.second.toString();
                                }
                            }
                            com.toutiao.proxyserver.g.b.b(new Runnable() {
                                /* class com.toutiao.proxyserver.net.b.AnonymousClass2.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(103171);
                                }

                                public final void run() {
                                    if (u.f154992g != null) {
                                        u.f154992g.a(cVar);
                                    }
                                }
                            });
                            return proceed;
                        } catch (IOException e2) {
                            if ((e2 instanceof SocketTimeoutException) || (e2 instanceof ConnectException)) {
                                cVar.f154800l = -104;
                            } else {
                                cVar.f154800l = -10000;
                            }
                            throw e2;
                        } catch (Throwable th) {
                            b.f154925a.remove(build.tag());
                            Pair<String, List<InetAddress>> remove2 = b.f154926b.remove(build.tag());
                            if (remove2 != null) {
                                cVar.f154790b = (String) remove2.first;
                                if (remove2.second != null) {
                                    cVar.f154791c = remove2.second.toString();
                                }
                            }
                            com.toutiao.proxyserver.g.b.b(new Runnable() {
                                /* class com.toutiao.proxyserver.net.b.AnonymousClass2.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(103171);
                                }

                                public final void run() {
                                    if (u.f154992g != null) {
                                        u.f154992g.a(cVar);
                                    }
                                }
                            });
                            throw th;
                        }
                    }
                });
                builder.networkInterceptors().add(new Interceptor() {
                    /* class com.toutiao.proxyserver.net.b.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(103172);
                    }

                    @Override // okhttp3.Interceptor
                    public final Response intercept(Interceptor.Chain chain) {
                        Socket socket;
                        String str;
                        String str2;
                        InetSocketAddress socketAddress;
                        Socket socket2;
                        String str3;
                        String str4;
                        InetSocketAddress socketAddress2;
                        Request request = chain.request();
                        String header = request.header("User-Agent");
                        InetAddress inetAddress = null;
                        try {
                            Response proceed = chain.proceed(request);
                            c cVar = b.f154925a.get(request.tag());
                            if (cVar != null) {
                                Connection connection = chain.connection();
                                if (connection == null) {
                                    socket2 = null;
                                } else {
                                    socket2 = connection.socket();
                                }
                                if (socket2 != null) {
                                    InetAddress localAddress = socket2.getLocalAddress();
                                    if (localAddress == null || localAddress.isAnyLocalAddress()) {
                                        str3 = null;
                                    } else {
                                        str3 = localAddress.getHostAddress();
                                    }
                                    InetAddress inetAddress2 = socket2.getInetAddress();
                                    if (inetAddress2 != null) {
                                        str4 = inetAddress2.getHostAddress();
                                    } else {
                                        str4 = null;
                                    }
                                    if (TextUtils.isEmpty(str3)) {
                                        str3 = u.f154991f;
                                    }
                                    if (!TextUtils.isEmpty(str3)) {
                                        u.f154991f = str3;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        Route route = connection.route();
                                        if (route == null) {
                                            socketAddress2 = null;
                                        } else {
                                            socketAddress2 = route.socketAddress();
                                        }
                                        if (socketAddress2 != null) {
                                            inetAddress = socketAddress2.getAddress();
                                        }
                                        if (inetAddress != null) {
                                            str4 = inetAddress.getHostAddress();
                                        }
                                    }
                                    cVar.f154794f = str3;
                                    cVar.f154795g = str4;
                                    k.a.f154917a.a(cVar.f154792d, cVar);
                                    cVar.f154793e = request.url().toString();
                                    cVar.f154796h = header;
                                }
                            }
                            return proceed;
                        } catch (IOException e2) {
                            throw e2;
                        } catch (Throwable th) {
                            c cVar2 = b.f154925a.get(request.tag());
                            if (cVar2 != null) {
                                Connection connection2 = chain.connection();
                                if (connection2 == null) {
                                    socket = null;
                                } else {
                                    socket = connection2.socket();
                                }
                                if (socket != null) {
                                    InetAddress localAddress2 = socket.getLocalAddress();
                                    if (localAddress2 == null || localAddress2.isAnyLocalAddress()) {
                                        str = null;
                                    } else {
                                        str = localAddress2.getHostAddress();
                                    }
                                    InetAddress inetAddress3 = socket.getInetAddress();
                                    if (inetAddress3 != null) {
                                        str2 = inetAddress3.getHostAddress();
                                    } else {
                                        str2 = null;
                                    }
                                    if (TextUtils.isEmpty(str)) {
                                        str = u.f154991f;
                                    }
                                    if (!TextUtils.isEmpty(str)) {
                                        u.f154991f = str;
                                    }
                                    if (TextUtils.isEmpty(str2)) {
                                        Route route2 = connection2.route();
                                        if (route2 == null) {
                                            socketAddress = null;
                                        } else {
                                            socketAddress = route2.socketAddress();
                                        }
                                        if (socketAddress != null) {
                                            inetAddress = socketAddress.getAddress();
                                        }
                                        if (inetAddress != null) {
                                            str2 = inetAddress.getHostAddress();
                                        }
                                    }
                                    cVar2.f154794f = str;
                                    cVar2.f154795g = str2;
                                    k.a.f154917a.a(cVar2.f154792d, cVar2);
                                    cVar2.f154793e = request.url().toString();
                                    cVar2.f154796h = header;
                                }
                            }
                            throw th;
                        }
                    }
                });
                f154927c = builder.build();
            }
            okHttpClient = f154927c;
            MethodCollector.o(9917);
        }
        return okHttpClient;
    }

    private static List<com.bytedance.retrofit2.client.b> a(List<c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (c cVar : list) {
            arrayList.add(new com.bytedance.retrofit2.client.b(cVar.f154930a, cVar.f154931b));
        }
        return arrayList;
    }

    public static String a(Headers headers) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < headers.size(); i2++) {
            if ("Server-Timing".equals(headers.name(i2))) {
                sb.append(headers.value(i2)).append(",");
            }
        }
        if (sb.length() > 0) {
            return sb.toString().substring(0, sb.length() - 1);
        }
        return "";
    }

    private static Headers b(List<c> list) {
        String str;
        String str2;
        Headers.Builder builder = new Headers.Builder();
        for (c cVar : list) {
            if (u.p) {
                str = cVar.f154930a;
                StringBuilder sb = null;
                int length = str.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = str.charAt(i2);
                    if (charAt <= ' ' || charAt >= 127) {
                        if (sb == null) {
                            sb = new StringBuilder(str.substring(0, i2));
                        }
                    } else if (sb != null) {
                        sb.append(charAt);
                    }
                }
                if (sb != null) {
                    str = sb.toString();
                }
                str2 = com.toutiao.proxyserver.g.b.b(cVar.f154931b);
            } else {
                str = cVar.f154930a;
                str2 = cVar.f154931b;
            }
            builder.add(str, str2);
        }
        return builder.build();
    }

    public static a a(d dVar) {
        com.bytedance.retrofit2.b head;
        if (dVar.b("Accept-Encoding") == null) {
            dVar.f154934c.add(new c("Accept-Encoding", "identity"));
        }
        boolean z = false;
        for (c cVar : dVar.f154934c) {
            if (TextUtils.equals(cVar.f154930a, "cache_scene") && TextUtils.equals(cVar.f154931b, "music")) {
                z = true;
            }
        }
        if (u.f154997l || z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> a2 = i.a(dVar.f154932a, linkedHashMap);
            String str = (String) a2.second;
            INetApi iNetApi = (INetApi) RetrofitUtils.a((String) a2.first, INetApi.class);
            if (iNetApi != null) {
                d dVar2 = new d();
                dVar2.f28942c = dVar.f154935d;
                dVar2.f28943d = dVar.f154936e;
                dVar2.f28944e = dVar.f154937f;
                List<com.bytedance.retrofit2.client.b> a3 = a(dVar.f154934c);
                if ("GET".equals(dVar.f154933b)) {
                    head = iNetApi.get(str, linkedHashMap, a3, dVar2);
                } else {
                    head = iNetApi.head(str, linkedHashMap, a3, dVar2);
                }
                com.toutiao.proxyserver.e.c.b("HttpExcutor", "use ttnet retrofit", null);
                if (!f.R.getAndSet(true)) {
                    a.L = new a.AbstractC0620a() {
                        /* class com.toutiao.proxyserver.net.f.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(103178);
                        }

                        @Override // com.bytedance.frameworks.baselib.network.http.a.AbstractC0620a
                        public final a a() {
                            return new f();
                        }
                    };
                }
                return new a(head, dVar);
            }
        }
        Request.Builder builder = new Request.Builder();
        builder.url(dVar.f154932a);
        builder.method(dVar.f154933b, null);
        builder.headers(b(dVar.f154934c));
        OkHttpClient a4 = a();
        if (!(dVar.f154935d == ((long) a4.connectTimeoutMillis()) && dVar.f154936e == ((long) a4.readTimeoutMillis()) && dVar.f154937f == ((long) a4.writeTimeoutMillis()))) {
            a4 = a4.newBuilder().connectTimeout(dVar.f154935d, TimeUnit.MILLISECONDS).readTimeout(dVar.f154936e, TimeUnit.MILLISECONDS).writeTimeout(dVar.f154937f, TimeUnit.MILLISECONDS).build();
        }
        com.toutiao.proxyserver.e.c.b("HttpExcutor", "use ttnet okhttp", null);
        return new a(a4.newCall(builder.build()), dVar);
    }
}
