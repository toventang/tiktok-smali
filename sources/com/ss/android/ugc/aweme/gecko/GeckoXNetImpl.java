package com.ss.android.ugc.aweme.gecko;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.k.c;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.ae;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.lancet.d;
import h.m.p;
import java.io.BufferedInputStream;
import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class GeckoXNetImpl implements c {

    /* renamed from: a  reason: collision with root package name */
    private File f98990a;

    /* renamed from: b  reason: collision with root package name */
    private GeckoXNetApi f98991b;

    public interface GeckoXNetApi {
        static {
            Covode.recordClassIndex(62942);
        }

        @h
        b<String> doGet(@ag String str);

        @t
        @g
        b<String> doPost(@ag String str, @f Map<String, String> map);

        @h
        @ae
        b<TypedInput> downloadFile(@ag String str, @l List<com.bytedance.retrofit2.client.b> list);

        @t
        b<String> postBody(@ag String str, @com.bytedance.retrofit2.b.b TypedOutput typedOutput);
    }

    static {
        Covode.recordClassIndex(62941);
    }

    private GeckoXNetApi a() {
        if (this.f98991b == null) {
            String str = com.ss.android.c.b.f59141e;
            h.f.b.l.d(GeckoXNetApi.class, "");
            h.f.b.l.d(str, "");
            this.f98991b = (GeckoXNetApi) a.a().a(str).a(GeckoXNetApi.class);
        }
        return this.f98991b;
    }

    public GeckoXNetImpl(Context context) {
        if (d.f107195c == null || !d.f107197e) {
            d.f107195c = context.getFilesDir();
        }
        File file = new File(d.f107195c, "gecko-resume-net-work");
        this.f98990a = file;
        file.mkdirs();
    }

    private static Map<String, String> a(List<com.bytedance.retrofit2.client.b> list) {
        HashMap hashMap = new HashMap();
        if (!com.ss.android.ugc.aweme.base.utils.d.a(list)) {
            for (com.bytedance.retrofit2.client.b bVar : list) {
                hashMap.put(bVar.f42471a, bVar.f42472b);
            }
        }
        return hashMap;
    }

    @Override // com.bytedance.geckox.k.c
    public final com.bytedance.geckox.k.d a(String str, String str2) {
        h.f.b.l.d(str, "");
        if (!p.a((CharSequence) str, (CharSequence) ".snssdk.", false)) {
            u<String> execute = a().postBody(str, new TypedByteArray("application/json", str2.getBytes(Charset.forName("UTF-8")), new String[0])).execute();
            return new com.bytedance.geckox.k.d(a(execute.f42629a.f42476d), execute.f42630b, execute.f42629a.f42474b, execute.f42629a.f42475c);
        }
        throw new Exception("Cannot access this host");
    }

    @Override // com.bytedance.geckox.k.c
    public final void a(String str, com.bytedance.geckox.buffer.a.b bVar) {
        Throwable th;
        Exception e2;
        BufferedInputStream bufferedInputStream;
        MethodCollector.i(10115);
        BufferedInputStream bufferedInputStream2 = null;
        int i2 = 0;
        try {
            u<TypedInput> execute = a().downloadFile(str, null).execute();
            int i3 = execute.f42629a.f42474b;
            try {
                bufferedInputStream = new BufferedInputStream(execute.f42630b.in());
            } catch (Exception e3) {
                e2 = e3;
                i2 = i3;
                try {
                    RuntimeException runtimeException = new RuntimeException("downloadFile failed, code: " + i2 + ", caused by:" + e2.getMessage(), e2);
                    MethodCollector.o(10115);
                    throw runtimeException;
                } catch (Throwable th2) {
                    th = th2;
                    com.bytedance.geckox.utils.c.a(bufferedInputStream2);
                    MethodCollector.o(10115);
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
                        com.bytedance.geckox.utils.c.a(bufferedInputStream);
                        MethodCollector.o(10115);
                        return;
                    }
                }
            } catch (Exception e4) {
                e2 = e4;
                i2 = i3;
                bufferedInputStream2 = bufferedInputStream;
                RuntimeException runtimeException2 = new RuntimeException("downloadFile failed, code: " + i2 + ", caused by:" + e2.getMessage(), e2);
                MethodCollector.o(10115);
                throw runtimeException2;
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream2 = bufferedInputStream;
                com.bytedance.geckox.utils.c.a(bufferedInputStream2);
                MethodCollector.o(10115);
                throw th;
            }
        } catch (Exception e5) {
            e2 = e5;
            RuntimeException runtimeException22 = new RuntimeException("downloadFile failed, code: " + i2 + ", caused by:" + e2.getMessage(), e2);
            MethodCollector.o(10115);
            throw runtimeException22;
        }
    }
}
