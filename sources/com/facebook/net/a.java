package com.facebook.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.d.a.h;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static OkHttpClient f48948a;

    static {
        Covode.recordClassIndex(29503);
    }

    public static OkHttpClient a() {
        MethodCollector.i(3835);
        synchronized (a.class) {
            try {
                OkHttpClient okHttpClient = f48948a;
                if (okHttpClient != null) {
                    return okHttpClient;
                }
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                builder.addInterceptor(new h());
                builder.networkInterceptors().add(new Interceptor() {
                    /* class com.facebook.net.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(29504);
                    }

                    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|(1:4)(1:5)|(1:7)|8|9|10|(3:12|13|24)(1:26)|(1:(1:22))) */
                    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
                        r4 = move-exception;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
                        if (r1 != null) goto L_0x0039;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
                        r2 = r4.getMessage();
                        r3 = new java.lang.StringBuilder();
                        r0 = r3.append(r1.getAddress().getHostAddress()).append("|");
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
                    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r6) {
                        /*
                        // Method dump skipped, instructions count: 105
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.net.a.AnonymousClass1.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
                    }
                });
                OkHttpClient build = builder.build();
                f48948a = build;
                MethodCollector.o(3835);
                return build;
            } finally {
                MethodCollector.o(3835);
            }
        }
    }
}
