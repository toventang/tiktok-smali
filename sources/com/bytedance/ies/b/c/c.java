package com.bytedance.ies.b.c;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.b.a.a;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.http.a.b.d;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public final class c implements com.ss.android.common.b.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f31927a = " okhttp/3.5.0";

    /* renamed from: b  reason: collision with root package name */
    private a f31928b;

    static {
        Covode.recordClassIndex(18673);
    }

    @Override // com.ss.android.common.b.a
    public final byte[] a(int i2, String str) {
        Throwable th;
        ResponseBody responseBody;
        ResponseBody responseBody2 = null;
        try {
            Response execute = this.f31928b.b().newCall(new Request.Builder().url(str).build()).execute();
            if (execute.code() == 200) {
                responseBody = execute.body();
                if (responseBody != null) {
                    try {
                        InputStream byteStream = responseBody.byteStream();
                        String header = execute.header("Content-Length");
                        long j2 = -1;
                        if (header != null) {
                            j2 = Long.parseLong(header);
                        }
                        byte[] stream2ByteArray = NetworkUtils.stream2ByteArray(i2, byteStream, j2);
                        NetworkUtils.safeClose(responseBody);
                        return stream2ByteArray;
                    } catch (Exception unused) {
                    } catch (Throwable th2) {
                        th = th2;
                        responseBody2 = responseBody;
                        NetworkUtils.safeClose(responseBody2);
                        throw th;
                    }
                }
                NetworkUtils.safeClose(responseBody);
                return null;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
            NetworkUtils.safeClose(responseBody2);
            throw th;
        }
        responseBody = null;
        NetworkUtils.safeClose(responseBody);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x010b A[SYNTHETIC, Splitter:B:57:0x010b] */
    @Override // com.ss.android.common.b.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, com.ss.android.common.util.b<java.lang.String> r31, java.lang.String r32, com.ss.android.common.util.e r33, java.util.List<com.ss.android.http.a.b.d> r34, java.lang.String[] r35, int[] r36) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.b.c.c.a(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.common.util.b, java.lang.String, com.ss.android.common.util.e, java.util.List, java.lang.String[], int[]):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0111 A[SYNTHETIC, Splitter:B:57:0x0111] */
    @Override // com.ss.android.common.b.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r26, java.lang.String r27, java.lang.StringBuffer r28, java.lang.StringBuffer r29, java.lang.StringBuffer r30, com.ss.android.common.util.b<java.lang.String> r31, java.lang.String r32, com.ss.android.common.util.e r33, java.util.List<com.ss.android.http.a.b.d> r34, java.lang.String[] r35, int[] r36, org.apache.http.client.RedirectHandler r37) {
        /*
        // Method dump skipped, instructions count: 280
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.b.c.c.a(int, java.lang.String, java.lang.StringBuffer, java.lang.StringBuffer, java.lang.StringBuffer, com.ss.android.common.util.b, java.lang.String, com.ss.android.common.util.e, java.util.List, java.lang.String[], int[], org.apache.http.client.RedirectHandler):boolean");
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, String str, com.ss.android.common.b.a.a aVar, com.ss.android.common.util.c<Long> cVar, long j2, com.ss.android.common.b.c[] cVarArr) {
        Request.Builder url = new Request.Builder().url(str);
        MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
        for (a.c cVar2 : aVar.f59348a) {
            if (cVar2 instanceof a.d) {
                type.addFormDataPart(cVar2.a(), (String) cVar2.b());
            } else if (cVar2 instanceof a.C1293a) {
                a.C1293a aVar2 = (a.C1293a) cVar2;
                type.addFormDataPart(aVar2.f59349a, aVar2.f59351c, RequestBody.create((MediaType) null, aVar2.f59350b));
            } else if (cVar2 instanceof a.b) {
                File file = (File) cVar2.b();
                type.addFormDataPart(cVar2.a(), file.getName(), RequestBody.create((MediaType) null, file));
            }
        }
        return a(0, i2, str, url, type.build(), cVarArr);
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, byte[] bArr, String str2, String str3, List<com.ss.android.http.a.a> list) {
        RequestBody create;
        Request.Builder url = new Request.Builder().url(str);
        if (str2 != null) {
            url.header("Content-Encoding", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            url.header("Content-Type", str3);
        }
        url.addHeader("Accept-Encoding", "gzip");
        if (list != null) {
            for (com.ss.android.http.a.a aVar : list) {
                url.addHeader(aVar.a(), aVar.b());
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            create = RequestBody.create(MediaType.parse(str3), bArr);
        } else {
            create = RequestBody.create((MediaType) null, bArr);
        }
        return a(i2, i3, str, url, create, (com.ss.android.common.b.c[]) null);
    }

    public static class a implements com.ss.android.common.b.c {

        /* renamed from: a  reason: collision with root package name */
        Call f31935a;

        static {
            Covode.recordClassIndex(18676);
        }

        public a(Call call) {
            this.f31935a = call;
        }
    }

    public c(a aVar) {
        this.f31928b = aVar;
    }

    private static void a(String[] strArr, String str) {
        if (strArr != null && strArr.length != 0 && !m.a(str)) {
            try {
                strArr[0] = str;
            } catch (Throwable unused) {
            }
        }
    }

    private static Request a(int i2, Request request) {
        if (i2 < 0) {
            return request;
        }
        return request.newBuilder().cacheControl(new CacheControl.Builder().maxStale(i2, TimeUnit.SECONDS).build()).removeHeader("Pragma").build();
    }

    private static String a(int i2, ResponseBody responseBody, Response response) {
        String str;
        if (responseBody == null || response == null) {
            throw new IllegalArgumentException("HTTP body may not be null");
        }
        InputStream byteStream = responseBody.byteStream();
        boolean z = false;
        String header = response.header("Content-Encoding");
        if (header == null || !"gzip".equalsIgnoreCase(header)) {
            Logger.debug();
        } else {
            z = true;
        }
        try {
            MediaType contentType = responseBody.contentType();
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
            if (responseBody.contentLength() > 2147483647L) {
                return null;
            }
            if (!(contentType == null || contentType.charset() == null)) {
                str2 = contentType.charset().name();
            }
            if (str2 == null) {
                str2 = "UTF-8";
            }
            String response2String = NetworkUtils.response2String(z, testIsSSBinary, i2, byteStream, str2);
            NetworkUtils.safeClose(byteStream);
            return response2String;
        } finally {
            NetworkUtils.safeClose(byteStream);
        }
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, byte[] bArr, String str2, String str3) {
        return a(i2, i3, str, bArr, str2, str3, (List<com.ss.android.http.a.a>) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d6, code lost:
        r11 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d7, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00eb, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        com.ss.android.common.util.NetworkUtils.safeClose(r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00eb A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x001c] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ee A[SYNTHETIC, Splitter:B:50:0x00ee] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(int r19, int r20, java.lang.String r21, okhttp3.Request.Builder r22, okhttp3.RequestBody r23, com.ss.android.common.b.c[] r24) {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.b.c.c.a(int, int, java.lang.String, okhttp3.Request$Builder, okhttp3.RequestBody, com.ss.android.common.b.c[]):java.lang.String");
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, List<d> list, com.ss.android.common.b.a.a aVar, com.ss.android.common.b.c[] cVarArr) {
        Request.Builder url = new Request.Builder().url(str);
        MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
        for (d dVar : list) {
            type.addFormDataPart(dVar.f59532a, dVar.f59533b);
        }
        for (a.c cVar : aVar.f59348a) {
            if (cVar instanceof a.d) {
                type.addFormDataPart(cVar.a(), (String) cVar.b());
            } else if (cVar instanceof a.C1293a) {
                a.C1293a aVar2 = (a.C1293a) cVar;
                type.addFormDataPart(aVar2.f59349a, aVar2.f59351c, RequestBody.create((MediaType) null, aVar2.f59350b));
            } else if (cVar instanceof a.b) {
                File file = (File) cVar.b();
                type.addFormDataPart(cVar.a(), file.getName(), RequestBody.create((MediaType) null, file));
            }
        }
        url.addHeader("Accept-Encoding", "gzip");
        return a(i2, i3, str, url, new d(type.build()), cVarArr);
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, List<d> list, boolean z, com.ss.android.common.b.c[] cVarArr, List<com.ss.android.http.a.a> list2) {
        Request.Builder url = new Request.Builder().url(str);
        FormBody.Builder builder = new FormBody.Builder();
        for (d dVar : list) {
            builder.add(dVar.f59532a, dVar.f59533b);
        }
        url.addHeader("Accept-Encoding", "gzip");
        if (list2 != null) {
            for (com.ss.android.http.a.a aVar : list2) {
                url.addHeader(aVar.a(), aVar.b());
            }
        }
        return a(i2, i3, str, url, builder.build(), cVarArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013d, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013e, code lost:
        r19 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0157, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0158, code lost:
        r3 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0157 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015b A[SYNTHETIC, Splitter:B:70:0x015b] */
    @Override // com.ss.android.common.b.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(int r28, int r29, java.lang.String r30, java.util.List<com.ss.android.http.a.a> r31, boolean r32, boolean r33, com.ss.android.http.a.b.e r34, boolean r35) {
        /*
        // Method dump skipped, instructions count: 351
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.b.c.c.a(int, int, java.lang.String, java.util.List, boolean, boolean, com.ss.android.http.a.b.e, boolean):java.lang.String");
    }
}
