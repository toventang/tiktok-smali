package com.ss.android.ugc.aweme.sec;

import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.client.c;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.common.util.NetworkUtils;
import java.io.InputStream;
import k.h;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;

public final class e {
    static {
        Covode.recordClassIndex(79324);
    }

    public static String a(c cVar) {
        String str;
        TypedInput typedInput = cVar.f42477e;
        if (typedInput != null) {
            InputStream in = cVar.f42477e.in();
            b a2 = cVar.a("Content-Type");
            try {
                MediaType parse = MediaType.parse(typedInput.mimeType());
                String str2 = null;
                if (parse != null) {
                    str = parse.toString();
                } else if (a2 == null) {
                    str = null;
                } else {
                    str = a2.f42472b;
                }
                if (str == null) {
                    str = "";
                }
                boolean testIsSSBinary = NetworkUtils.testIsSSBinary(str);
                if (typedInput.length() > 2147483647L) {
                    return null;
                }
                if (!(parse == null || parse.charset() == null)) {
                    str2 = parse.charset().name();
                }
                if (str2 == null) {
                    str2 = "UTF-8";
                }
                String response2String = NetworkUtils.response2String(false, testIsSSBinary, 0, in, str2);
                in.reset();
                return response2String;
            } finally {
                in.reset();
            }
        } else {
            throw new IllegalArgumentException("HTTP body may not be null");
        }
    }

    public static String a(Response response) {
        boolean z;
        String str;
        ResponseBody body = response.body();
        if (body != null) {
            h source = response.body().source();
            source.e(Long.MAX_VALUE);
            InputStream f2 = source.a().clone().f();
            String header = response.header("Content-Encoding");
            if (header == null || !"gzip".equalsIgnoreCase(header)) {
                Logger.debug();
                z = false;
            } else {
                z = true;
            }
            try {
                MediaType contentType = body.contentType();
                if (contentType != null) {
                    str = contentType.toString();
                } else {
                    str = response.header("Content-Type");
                }
                if (str == null) {
                    str = "";
                }
                boolean testIsSSBinary = NetworkUtils.testIsSSBinary(str);
                String str2 = null;
                if (body.contentLength() > 2147483647L) {
                    return null;
                }
                if (!(contentType == null || contentType.charset() == null)) {
                    str2 = contentType.charset().name();
                }
                if (str2 == null) {
                    str2 = "UTF-8";
                }
                String response2String = NetworkUtils.response2String(z, testIsSSBinary, 0, f2, str2);
                NetworkUtils.safeClose(f2);
                return response2String;
            } finally {
                NetworkUtils.safeClose(f2);
            }
        } else {
            throw new IllegalArgumentException("HTTP body may not be null");
        }
    }
}
