package com.ss.android.ugc.aweme.net.corenet;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.h;
import com.bytedance.ttnet.d;
import com.google.c.h.a.q;
import com.ss.android.common.util.MultiProcessSharedProvider;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.net.b.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class IESNetDepend implements d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile IESNetDepend f112281a;

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, String> f112282b = new HashMap();

    interface IESNetDependApi {
        static {
            Covode.recordClassIndex(72155);
        }

        @h
        q<String> doGet(@ag String str);
    }

    @Override // com.bytedance.ttnet.d
    public final String c() {
        return ".tiktokv.com";
    }

    @Override // com.bytedance.ttnet.d
    public final String d() {
        return "";
    }

    @Override // com.bytedance.ttnet.d
    public final int e() {
        return com.bytedance.ies.ugc.appcontext.d.n;
    }

    @Override // com.bytedance.ttnet.d
    public final Context a() {
        return com.bytedance.ies.ugc.appcontext.d.a();
    }

    static {
        Covode.recordClassIndex(72154);
    }

    @Override // com.bytedance.ttnet.d
    public final String[] b() {
        if (a.f112232a == null) {
            a.f112232a = a.f112237f;
        }
        return a.f112232a;
    }

    @Override // com.bytedance.ttnet.d
    public final Map<String, String> f() {
        HashMap hashMap = new HashMap();
        hashMap.put("httpdns", "34.102.215.99");
        hashMap.put("netlog", "ttnet.tiktokv.com");
        hashMap.put("boe", "xxx");
        return hashMap;
    }

    public static IESNetDepend g() {
        MethodCollector.i(6096);
        if (f112281a == null) {
            synchronized (IESNetDepend.class) {
                try {
                    if (f112281a == null) {
                        f112281a = new IESNetDepend();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6096);
                    throw th;
                }
            }
        }
        IESNetDepend iESNetDepend = f112281a;
        MethodCollector.o(6096);
        return iESNetDepend;
    }

    @Override // com.bytedance.ttnet.d
    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            String[] split = str.split(",");
            if (split.length > 0) {
                for (String str2 : split) {
                    if (!TextUtils.isEmpty(str2)) {
                        if (str2.length() > 1 && str2.startsWith(".")) {
                            str2 = str2.substring(1);
                        }
                        arrayList.add(str2);
                    }
                }
            }
            com.ss.android.token.d.a(arrayList);
        }
    }

    @Override // com.bytedance.ttnet.d
    public final void a(String str, JSONObject jSONObject) {
        n.a(str, jSONObject);
    }

    @Override // com.bytedance.ttnet.d
    public final void a(Context context, Map<String, ?> map) {
        try {
            MultiProcessSharedProvider.a aVar = new MultiProcessSharedProvider.a(context, (byte) 0);
            if (map != null) {
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        int intValue = ((Integer) value).intValue();
                        aVar.f59376b.put(entry.getKey(), Integer.valueOf(intValue));
                    } else if (value instanceof Long) {
                        long longValue = ((Long) value).longValue();
                        aVar.f59376b.put(entry.getKey(), Long.valueOf(longValue));
                    } else if (value instanceof Float) {
                        float floatValue = ((Float) value).floatValue();
                        aVar.f59376b.put(entry.getKey(), Float.valueOf(floatValue));
                    } else if (value instanceof Boolean) {
                        boolean booleanValue = ((Boolean) value).booleanValue();
                        aVar.f59376b.put(entry.getKey(), Boolean.valueOf(booleanValue));
                    } else if (value instanceof String) {
                        aVar.f59376b.put(entry.getKey(), (String) value);
                    }
                }
                aVar.a();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.ttnet.d
    public final int a(Context context, String str, int i2) {
        return MultiProcessSharedProvider.a(context).a(str, i2);
    }

    @Override // com.bytedance.ttnet.d
    public final String a(Context context, String str, String str2) {
        return MultiProcessSharedProvider.a(context).a(str, str2);
    }
}
