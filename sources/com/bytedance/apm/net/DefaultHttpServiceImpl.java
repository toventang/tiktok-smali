package com.bytedance.apm.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.apm.api.c;
import com.ss.android.ugc.aweme.net.l.a;
import com.ss.android.ugc.aweme.net.l.b;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

public class DefaultHttpServiceImpl implements IHttpService {
    private static String METHOD_GET = "GET";
    private static String METHOD_POST = "POST";

    static {
        Covode.recordClassIndex(14676);
    }

    public static byte[] toByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static URLConnection com_bytedance_apm_net_DefaultHttpServiceImpl_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(URL url) {
        URLConnection aVar;
        URLConnection aVar2;
        e<URL, URLConnection> m2 = n.f112474e.m(new e<>(url, null, null, d.CONTINUE));
        if (m2.f112463f == d.INTERCEPT && m2.f112459b != null) {
            R r = m2.f112459b;
            if (r instanceof HttpsURLConnection) {
                aVar2 = new b(r);
            } else if (!(r instanceof HttpURLConnection)) {
                return r;
            } else {
                aVar2 = new a(r);
            }
            return aVar2;
        } else if (m2.f112463f != d.EXCEPTION || m2.f112462e == null) {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                aVar = new b((HttpsURLConnection) openConnection);
            } else if (!(openConnection instanceof HttpURLConnection)) {
                return openConnection;
            } else {
                aVar = new a((HttpURLConnection) openConnection);
            }
            return aVar;
        } else {
            throw m2.f112462e;
        }
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public c doGet(String str, Map<String, String> map) {
        return doRequest(str, null, METHOD_GET, map);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public c doPost(String str, byte[] bArr, Map<String, String> map) {
        return doRequest(str, bArr, METHOD_POST, map);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public c uploadFiles(String str, List<File> list, Map<String, String> map) {
        return com.bytedance.apm.q.d.a(str, list, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:27|28|(1:41)(1:32)|33|(4:36|(2:40|91)|87|34)|88|42|(2:44|45)|46|47|48) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00dc */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fb A[SYNTHETIC, Splitter:B:63:0x00fb] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0100 A[SYNTHETIC, Splitter:B:67:0x0100] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.services.apm.api.c doRequest(java.lang.String r13, byte[] r14, java.lang.String r15, java.util.Map<java.lang.String, java.lang.String> r16) {
        /*
        // Method dump skipped, instructions count: 280
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.net.DefaultHttpServiceImpl.doRequest(java.lang.String, byte[], java.lang.String, java.util.Map):com.bytedance.services.apm.api.c");
    }
}
