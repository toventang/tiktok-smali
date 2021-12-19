package com.bytedance.b.e.b;

import com.bytedance.b.j.c.a;
import com.bytedance.b.k.d;
import com.bytedance.b.k.d.c;
import com.bytedance.b.k.e;
import com.bytedance.b.k.k;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f26200a = true;

    /* renamed from: b  reason: collision with root package name */
    public static String f26201b;

    /* renamed from: c  reason: collision with root package name */
    private static AtomicInteger f26202c = new AtomicInteger(0);

    public static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(15206);
    }

    private static byte[] a(byte[] bArr) {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream2.write(bArr);
                d.a(gZIPOutputStream2);
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = gZIPOutputStream2;
                d.a(gZIPOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            d.a(gZIPOutputStream);
            throw th;
        }
    }

    static a a(String str, byte[] bArr) {
        HashMap hashMap = new HashMap();
        if (bArr.length > 128) {
            try {
                byte[] a2 = a(bArr);
                hashMap.put("Content-Encoding", "gzip");
                bArr = a2;
            } catch (IOException unused) {
            }
        }
        return new a(k.a(str, com.bytedance.b.e.a.a.q()), hashMap, bArr);
    }

    static void a(final String str, final String str2, final Throwable th) {
        if (f26200a && f26202c.get() < 3) {
            f26202c.incrementAndGet();
            com.bytedance.b.k.d.b.a(c.IO).a(new com.bytedance.b.k.d.a() {
                /* class com.bytedance.b.e.b.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(15207);
                }

                public final void run() {
                    String str = str;
                    String str2 = str2;
                    a aVar = new a("tag=" + str + " message=" + str2, th);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("event_type", "exception");
                        jSONObject.put("timestamp", System.currentTimeMillis());
                        StringWriter stringWriter = new StringWriter();
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        aVar.printStackTrace(printWriter);
                        Throwable cause = aVar.getCause();
                        if (cause != null) {
                            cause.printStackTrace(printWriter);
                            Throwable cause2 = cause.getCause();
                            if (cause2 != null) {
                                cause2.printStackTrace(printWriter);
                            }
                        }
                        String stringWriter2 = stringWriter.toString();
                        printWriter.close();
                        jSONObject.put("stack", stringWriter2);
                        jSONObject.put("exception_type", 1);
                        jSONObject.put("message", str + "_" + str2);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("apm_sdk", "apm6_error");
                        jSONObject2.put("host_aid", String.valueOf(com.bytedance.b.e.a.a.e()));
                        jSONObject.put("filters", jSONObject2);
                        JSONObject jSONObject3 = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(jSONObject);
                        jSONObject3.put("data", jSONArray);
                        JSONObject jSONObject4 = new JSONObject();
                        e.a(jSONObject4, com.bytedance.b.e.a.a.m());
                        com.bytedance.b.e.a.b bVar = com.bytedance.b.e.a.a.f26190a;
                        if (bVar != null) {
                            e.a(jSONObject4, bVar.r());
                        }
                        jSONObject4.put("os", "Android");
                        jSONObject4.put("aid", 2085);
                        jSONObject4.put("device_id", com.bytedance.b.e.a.a.n());
                        jSONObject4.put("channel", com.bytedance.b.e.a.a.f());
                        jSONObject4.put("version_code", com.bytedance.b.e.a.a.i());
                        jSONObject4.put("update_version_code", com.bytedance.b.e.a.a.g());
                        jSONObject4.put("device_id", com.bytedance.b.e.a.a.n());
                        jSONObject4.put("uid", com.bytedance.b.e.a.a.p());
                        jSONObject4.put("process_name", com.bytedance.b.e.a.a.d());
                        jSONObject3.put("header", jSONObject4);
                        String str3 = b.f26201b;
                        byte[] bytes = jSONObject3.toString().getBytes();
                        if (!j.f107226e || !j.b() || j.c()) {
                            j.f107226e = b.a();
                        }
                        if (j.f107226e && bytes != null) {
                            if (bytes.length != 0) {
                                a a2 = b.a(str3, bytes);
                                com.bytedance.b.e.a.a.a(a2.f26305a, a2.f26306b, a2.f26307c);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
