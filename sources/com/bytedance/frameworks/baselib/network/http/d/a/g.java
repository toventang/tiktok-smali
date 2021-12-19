package com.bytedance.frameworks.baselib.network.http.d.a;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.TlsVersion;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static a f29238a;

    /* renamed from: c  reason: collision with root package name */
    private static int f29239c;

    /* renamed from: b  reason: collision with root package name */
    private OkHttpClient f29240b;

    public interface a {
        static {
            Covode.recordClassIndex(17081);
        }

        void a(OkHttpClient.Builder builder);
    }

    static {
        Covode.recordClassIndex(17079);
    }

    public final OkHttpClient a() {
        MethodCollector.i(4659);
        synchronized (e.class) {
            try {
                OkHttpClient okHttpClient = this.f29240b;
                if (okHttpClient != null) {
                    int i2 = f29239c;
                    if (i2 > 0 && i2 < 4) {
                        OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
                        a(newBuilder);
                        newBuilder.build();
                    }
                    return this.f29240b;
                }
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                int i3 = f29239c;
                if (i3 > 0 && i3 < 4) {
                    a(builder);
                }
                builder.connectionPool(new ConnectionPool(15, 180000, TimeUnit.MILLISECONDS));
                builder.connectTimeout(15000, TimeUnit.MILLISECONDS);
                builder.readTimeout(15000, TimeUnit.MILLISECONDS);
                builder.writeTimeout(15000, TimeUnit.MILLISECONDS);
                builder.addNetworkInterceptor(new Interceptor() {
                    /* class com.bytedance.frameworks.baselib.network.http.d.a.g.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(17080);
                    }

                    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|(1:4)(1:5)|(1:7)|8|9|10|(3:12|13|24)(1:26)|(1:(1:22))) */
                    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
                        r4 = move-exception;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
                        if (r5 != null) goto L_0x0039;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
                        r2 = r4.getMessage();
                        r3 = new java.lang.StringBuilder();
                        r0 = r3.append(r5.getAddress().getHostAddress()).append("|");
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
                        if (r2 == null) goto L_0x0056;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
                        r2 = "null";
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
                        r0.append(r2);
                        com.bytedance.common.utility.reflect.Reflect.on(r4).set("detailMessage", r3.toString());
                     */
                    /* JADX WARNING: Failed to process nested try/catch */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001a */
                    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020 A[SYNTHETIC, Splitter:B:12:0x0020] */
                    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
                    @Override // okhttp3.Interceptor
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r7) {
                        /*
                        // Method dump skipped, instructions count: 105
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.d.a.g.AnonymousClass1.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
                    }
                });
                builder.dns(i.a());
                builder.cookieJar(CookieJar.NO_COOKIES);
                builder.addInterceptor(new h());
                builder.addInterceptor(new l());
                OkHttpClient.Builder b2 = b(builder);
                b2.followRedirects(true);
                a aVar = f29238a;
                if (aVar != null) {
                    aVar.a(b2);
                }
                OkHttpClient build = b2.build();
                this.f29240b = build;
                MethodCollector.o(4659);
                return build;
            } finally {
                MethodCollector.o(4659);
            }
        }
    }

    public static void a(int i2) {
        if (i2 > 0 && f29239c == 0) {
            f29239c = i2;
        }
    }

    private static void a(OkHttpClient.Builder builder) {
        if (builder != null) {
            ArrayList arrayList = new ArrayList();
            int i2 = f29239c;
            if (i2 == 1) {
                arrayList.add(Protocol.HTTP_2);
            } else if (i2 == 2) {
                arrayList.add(Protocol.SPDY_3);
            } else if (i2 != 3) {
                arrayList.add(Protocol.HTTP_2);
                arrayList.add(Protocol.SPDY_3);
            }
            f29239c = 4;
            arrayList.add(Protocol.HTTP_1_1);
            builder.protocols(Collections.unmodifiableList(arrayList));
        }
    }

    private static OkHttpClient.Builder b(OkHttpClient.Builder builder) {
        int i2 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT < 22) {
            try {
                SSLContext instance = SSLContext.getInstance("TLSv1.2");
                instance.init(null, null, null);
                builder.sslSocketFactory(new s(instance.getSocketFactory()));
                ConnectionSpec build = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).build();
                ArrayList arrayList = new ArrayList();
                arrayList.add(build);
                arrayList.add(ConnectionSpec.COMPATIBLE_TLS);
                arrayList.add(ConnectionSpec.CLEARTEXT);
                builder.connectionSpecs(arrayList);
            } catch (Exception unused) {
            }
        }
        return builder;
    }
}
