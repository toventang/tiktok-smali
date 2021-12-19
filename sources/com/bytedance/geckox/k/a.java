package com.bytedance.geckox.k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.buffer.a.b;
import com.bytedance.geckox.utils.c;
import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    protected OkHttpClient f29919a = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).build();

    /* renamed from: b  reason: collision with root package name */
    protected OkHttpClient f29920b = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS).readTimeout(30, TimeUnit.SECONDS).writeTimeout(30, TimeUnit.SECONDS).build();

    static {
        Covode.recordClassIndex(17347);
    }

    private static Map<String, String> a(Headers headers) {
        if (headers == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : headers.names()) {
            hashMap.put(str, headers.get(str));
        }
        return hashMap;
    }

    @Override // com.bytedance.geckox.k.c
    public final d a(String str, String str2) {
        String str3;
        Response execute = this.f29919a.newCall(new Request.Builder().url(str).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str2)).build()).execute();
        Map<String, String> a2 = a(execute.headers());
        if (execute.code() == 200) {
            str3 = execute.body().string();
        } else {
            str3 = null;
        }
        return new d(a2, str3, execute.code(), execute.message());
    }

    @Override // com.bytedance.geckox.k.c
    public final void a(String str, b bVar) {
        Throwable th;
        Exception e2;
        BufferedInputStream bufferedInputStream;
        MethodCollector.i(8037);
        int i2 = 0;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            Response execute = this.f29920b.newCall(new Request.Builder().get().url(str).build()).execute();
            int code = execute.code();
            if (code == 200) {
                try {
                    bufferedInputStream = new BufferedInputStream(execute.body().byteStream());
                } catch (Exception e3) {
                    e2 = e3;
                    i2 = code;
                    try {
                        RuntimeException runtimeException = new RuntimeException("downloadFile failed, code: " + i2 + ", caused by:" + e2.getMessage(), e2);
                        MethodCollector.o(8037);
                        throw runtimeException;
                    } catch (Throwable th2) {
                        th = th2;
                        c.a(bufferedInputStream2);
                        MethodCollector.o(8037);
                        throw th;
                    }
                }
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, 2048);
                        if (read != -1) {
                            bVar.write(bArr, 0, read);
                        } else {
                            c.a(bufferedInputStream);
                            MethodCollector.o(8037);
                            return;
                        }
                    }
                } catch (Exception e4) {
                    e2 = e4;
                    i2 = 200;
                    bufferedInputStream2 = bufferedInputStream;
                    RuntimeException runtimeException2 = new RuntimeException("downloadFile failed, code: " + i2 + ", caused by:" + e2.getMessage(), e2);
                    MethodCollector.o(8037);
                    throw runtimeException2;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream2 = bufferedInputStream;
                    c.a(bufferedInputStream2);
                    MethodCollector.o(8037);
                    throw th;
                }
            } else {
                RuntimeException runtimeException3 = new RuntimeException("response code error: ".concat(String.valueOf(code)));
                MethodCollector.o(8037);
                throw runtimeException3;
            }
        } catch (Exception e5) {
            e2 = e5;
            RuntimeException runtimeException22 = new RuntimeException("downloadFile failed, code: " + i2 + ", caused by:" + e2.getMessage(), e2);
            MethodCollector.o(8037);
            throw runtimeException22;
        }
    }
}
