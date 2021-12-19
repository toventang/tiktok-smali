package com.bytedance.android.ecommerce.j;

import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.bytedance.android.ecommerce.a.a.b;
import com.bytedance.android.ecommerce.a.a.c;
import com.bytedance.android.ecommerce.a.a.d;
import com.bytedance.android.ecommerce.c.a;
import com.bytedance.android.ecommerce.c.f;
import com.bytedance.common.utility.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

public final class m implements h {

    /* renamed from: a  reason: collision with root package name */
    private final String f7107a = "RequestService";

    static {
        Covode.recordClassIndex(3417);
    }

    @Override // com.bytedance.android.ecommerce.j.h
    public final void a(final b bVar, final a aVar) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            e.a(new Runnable() {
                /* class com.bytedance.android.ecommerce.j.m.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(3420);
                }

                public final void run() {
                    m.b(bVar, aVar);
                }
            });
        } else {
            b(bVar, aVar);
        }
    }

    public static void b(c cVar, com.bytedance.android.ecommerce.c.e eVar) {
        Throwable th;
        String a2 = com.bytedance.android.ecommerce.d.a.a("/payment/v1/pay");
        List<Pair<String, String>> a3 = cVar.a();
        com.bytedance.android.ecommerce.a.b.c cVar2 = new com.bytedance.android.ecommerce.a.b.c();
        try {
            com.bytedance.android.ecommerce.a.b.c cVar3 = new com.bytedance.android.ecommerce.a.b.c(com.bytedance.android.ecommerce.e.c.f7063a.d().f7041m.a(a2, a3, cVar.f6880d));
            try {
                eVar.a(cVar3);
            } catch (Throwable th2) {
                th = th2;
                cVar2 = cVar3;
            }
        } catch (Throwable th3) {
            th = th3;
            cVar2.f6914d = "exception";
            cVar2.f6915e = th.getLocalizedMessage();
            eVar.a(cVar2);
        }
    }

    @Override // com.bytedance.android.ecommerce.j.h
    public final void a(final c cVar, final com.bytedance.android.ecommerce.c.e eVar) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            e.a(new Runnable() {
                /* class com.bytedance.android.ecommerce.j.m.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(3418);
                }

                public final void run() {
                    m.b(cVar, eVar);
                }
            });
        } else {
            b(cVar, eVar);
        }
    }

    public static void b(d dVar, f fVar) {
        System.currentTimeMillis();
        try {
            fVar.a(new com.bytedance.android.ecommerce.a.b.d(com.bytedance.android.ecommerce.e.c.f7063a.d().f7041m.a(com.bytedance.android.ecommerce.d.a.a("/payment/v1/payment_details"), dVar.a(), dVar.f6880d)));
        } catch (Throwable th) {
            com.bytedance.android.ecommerce.a.b.d dVar2 = new com.bytedance.android.ecommerce.a.b.d();
            dVar2.f6929f = "exception";
            dVar2.f6930g = th.getLocalizedMessage();
            fVar.a(dVar2);
        }
    }

    @Override // com.bytedance.android.ecommerce.j.h
    public final void a(final d dVar, final f fVar) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            e.a(new Runnable() {
                /* class com.bytedance.android.ecommerce.j.m.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(3419);
                }

                public final void run() {
                    m.b(dVar, fVar);
                }
            });
        } else {
            b(dVar, fVar);
        }
    }

    public static void b(b bVar, a aVar) {
        MethodCollector.i(6230);
        List<Pair<String, String>> a2 = bVar.a();
        Map<String, String> map = bVar.f6880d;
        try {
            StringBuilder sb = new StringBuilder("");
            for (int i2 = 0; i2 < a2.size(); i2++) {
                Pair<String, String> pair = a2.get(i2);
                sb.append(((String) pair.first) + "=" + URLEncoder.encode((String) pair.second, "UTF-8"));
                if (i2 < a2.size() - 1) {
                    sb.append("&");
                }
            }
            byte[] bytes = sb.toString().getBytes("UTF-8");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bytes);
            } catch (Throwable unused) {
            }
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("Content-Type", "application/x-www-form-urlencoded");
            map.put("Content-Encoding", "gzip");
            map.put("Accept-Encoding", "gzip");
            aVar.a(true, "", new com.bytedance.android.ecommerce.a.b.b(com.bytedance.android.ecommerce.e.c.f7063a.d().f7041m.a(com.bytedance.android.ecommerce.d.a.a("/payment/v1/get_bankcard_info_by_ocr"), byteArray, map)));
            MethodCollector.o(6230);
        } catch (Throwable th) {
            th.getMessage();
            Log.getStackTraceString(th);
            aVar.a(false, th.getMessage(), null);
            MethodCollector.o(6230);
        }
    }
}
