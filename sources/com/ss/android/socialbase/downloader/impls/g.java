package com.ss.android.socialbase.downloader.impls;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.g.e;
import com.ss.android.socialbase.downloader.g.j;
import com.ss.android.socialbase.downloader.k.i;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;
import java.util.zip.GZIPInputStream;
import okhttp3.Call;
import okhttp3.Dns;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public final class g implements j {

    /* renamed from: a  reason: collision with root package name */
    private final i<String, OkHttpClient> f60632a = new i<>(4, 8);

    static {
        Covode.recordClassIndex(37440);
    }

    private OkHttpClient a(String str, final String str2) {
        MethodCollector.i(13971);
        try {
            final String host = Uri.parse(str).getHost();
            if (!TextUtils.isEmpty(host) && !TextUtils.isEmpty(str2)) {
                String str3 = host + "_" + str2;
                synchronized (this.f60632a) {
                    try {
                        OkHttpClient okHttpClient = (OkHttpClient) this.f60632a.get(str3);
                        if (okHttpClient != null) {
                            return okHttpClient;
                        }
                        OkHttpClient.Builder n = c.n();
                        n.dns(new Dns() {
                            /* class com.ss.android.socialbase.downloader.impls.g.AnonymousClass2 */

                            static {
                                Covode.recordClassIndex(37442);
                            }

                            @Override // okhttp3.Dns
                            public final List<InetAddress> lookup(String str) {
                                if (TextUtils.equals(host, str)) {
                                    return Collections.singletonList(InetAddress.getByName(str2));
                                }
                                return Dns.SYSTEM.lookup(str);
                            }
                        });
                        OkHttpClient build = n.build();
                        synchronized (this.f60632a) {
                            try {
                                this.f60632a.put(str3, build);
                            } finally {
                                MethodCollector.o(13971);
                            }
                        }
                        return build;
                    } finally {
                        MethodCollector.o(13971);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        OkHttpClient m2 = c.m();
        MethodCollector.o(13971);
        return m2;
    }

    @Override // com.ss.android.socialbase.downloader.g.j
    public final com.ss.android.socialbase.downloader.g.i a(String str, List<HttpHeader> list) {
        String str2;
        OkHttpClient m2;
        final InputStream inputStream;
        MethodCollector.i(13919);
        Request.Builder url = new Request.Builder().url(str);
        if (list == null || list.size() <= 0) {
            str2 = null;
        } else {
            str2 = null;
            for (HttpHeader httpHeader : list) {
                String str3 = httpHeader.f60856a;
                if (str2 != null || !"ss_d_request_host_ip_114".equals(str3)) {
                    url.addHeader(str3, com.ss.android.socialbase.downloader.k.g.d(httpHeader.f60857b));
                } else {
                    str2 = httpHeader.f60857b;
                }
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            m2 = a(str, str2);
        } else {
            m2 = c.m();
        }
        if (m2 != null) {
            final Call newCall = m2.newCall(url.build());
            final Response execute = newCall.execute();
            if (execute != null) {
                final ResponseBody body = execute.body();
                if (body != null) {
                    InputStream byteStream = body.byteStream();
                    String header = execute.header("Content-Encoding");
                    if (header == null || !"gzip".equalsIgnoreCase(header) || (byteStream instanceof GZIPInputStream)) {
                        inputStream = byteStream;
                    } else {
                        inputStream = new GZIPInputStream(byteStream);
                    }
                    AnonymousClass1 r8 = new e() {
                        /* class com.ss.android.socialbase.downloader.impls.g.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(37441);
                        }

                        @Override // com.ss.android.socialbase.downloader.g.a
                        public final String e() {
                            return "";
                        }

                        @Override // com.ss.android.socialbase.downloader.g.i
                        public final InputStream c() {
                            return inputStream;
                        }

                        @Override // com.ss.android.socialbase.downloader.g.g
                        public final int a() {
                            return execute.code();
                        }

                        @Override // com.ss.android.socialbase.downloader.g.g
                        public final void b() {
                            Call call = newCall;
                            if (call != null && !call.isCanceled()) {
                                newCall.cancel();
                            }
                        }

                        @Override // com.ss.android.socialbase.downloader.g.i
                        public final void d() {
                            try {
                                ResponseBody responseBody = body;
                                if (responseBody != null) {
                                    responseBody.close();
                                }
                                Call call = newCall;
                                if (call != null && !call.isCanceled()) {
                                    newCall.cancel();
                                }
                            } catch (Throwable unused) {
                            }
                        }

                        @Override // com.ss.android.socialbase.downloader.g.g
                        public final String a(String str) {
                            return execute.header(str);
                        }
                    };
                    MethodCollector.o(13919);
                    return r8;
                }
                MethodCollector.o(13919);
                return null;
            }
            IOException iOException = new IOException("can't get response");
            MethodCollector.o(13919);
            throw iOException;
        }
        IOException iOException2 = new IOException("can't get httpClient");
        MethodCollector.o(13919);
        throw iOException2;
    }
}
