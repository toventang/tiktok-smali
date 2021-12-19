package com.ss.android.ugc.aweme.base.g;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;
import com.ss.android.ugc.aweme.base.h.c;
import com.ss.android.ugc.aweme.base.h.e;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    private static final f f68114e = new f();

    /* renamed from: f  reason: collision with root package name */
    private static final Type f68115f = new com.google.gson.b.a<Map<String, Map<String, Long>>>() {
        /* class com.ss.android.ugc.aweme.base.g.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(41971);
        }
    }.type;

    /* renamed from: a  reason: collision with root package name */
    private final String f68116a;

    /* renamed from: b  reason: collision with root package name */
    private Context f68117b;

    /* renamed from: c  reason: collision with root package name */
    private EnumC1540a f68118c;

    /* renamed from: d  reason: collision with root package name */
    private final String f68119d;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, Long> f68120g;

    /* renamed from: h  reason: collision with root package name */
    private Map<String, Long> f68121h;

    /* renamed from: i  reason: collision with root package name */
    private Map<String, Long> f68122i;

    /* renamed from: j  reason: collision with root package name */
    private Map<String, Map<String, Long>> f68123j;

    static {
        Covode.recordClassIndex(41970);
    }

    public final synchronized JSONObject b() {
        JSONObject jSONObject;
        MethodCollector.i(11959);
        jSONObject = new JSONObject(a());
        MethodCollector.o(11959);
        return jSONObject;
    }

    /* renamed from: com.ss.android.ugc.aweme.base.g.a$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f68124a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 41972(0xa3f4, float:5.8815E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.base.g.a$a[] r0 = com.ss.android.ugc.aweme.base.g.a.EnumC1540a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.base.g.a.AnonymousClass2.f68124a = r2
                com.ss.android.ugc.aweme.base.g.a$a r0 = com.ss.android.ugc.aweme.base.g.a.EnumC1540a.PERSISTENT     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.base.g.a.AnonymousClass2.f68124a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.base.g.a$a r0 = com.ss.android.ugc.aweme.base.g.a.EnumC1540a.APP_ALIVE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.g.a.AnonymousClass2.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.g.a$a  reason: collision with other inner class name */
    public enum EnumC1540a {
        PERSISTENT,
        APP_ALIVE;

        static {
            Covode.recordClassIndex(41973);
        }
    }

    public final synchronized String a() {
        String b2;
        MethodCollector.i(11958);
        b2 = f68114e.b(this.f68123j);
        MethodCollector.o(11958);
        return b2;
    }

    private e c(String str) {
        return c.a(this.f68117b, str);
    }

    public final synchronized a a(String str) {
        a b2;
        MethodCollector.i(11955);
        b2 = b(str);
        MethodCollector.o(11955);
        return b2;
    }

    private synchronized a b(String str) {
        long valueOf;
        MethodCollector.i(11957);
        Long l2 = this.f68120g.get(str);
        if (l2 == null) {
            valueOf = 1L;
        } else {
            valueOf = Long.valueOf(l2.longValue() + 1);
        }
        this.f68120g.put(str, valueOf);
        if (this.f68118c == EnumC1540a.PERSISTENT) {
            c(this.f68119d).b("raw", a());
        }
        MethodCollector.o(11957);
        return this;
    }

    public a(Context context, String str) {
        this(context, str, EnumC1540a.PERSISTENT);
    }

    private a(Context context, String str, EnumC1540a aVar) {
        this.f68120g = new LinkedHashMap();
        this.f68121h = new androidx.c.a();
        this.f68122i = new LinkedHashMap();
        androidx.c.a aVar2 = new androidx.c.a();
        this.f68123j = aVar2;
        aVar2.put("events", this.f68120g);
        this.f68123j.put("durations", this.f68122i);
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f68117b = applicationContext;
        this.f68116a = str;
        this.f68118c = aVar;
        if (!TextUtils.isEmpty(str)) {
            String str2 = str + "_funnel";
            this.f68119d = str2;
            int i2 = AnonymousClass2.f68124a[aVar.ordinal()];
            if (i2 == 1) {
                Map map = (Map) f68114e.a(c(str2).a("raw", ""), f68115f);
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        Map<String, Long> map2 = this.f68123j.get(entry.getKey());
                        if (!(map2 == null || entry.getValue() == null)) {
                            map2.putAll((Map) entry.getValue());
                        }
                    }
                }
            } else if (i2 == 2) {
                c(str2).a().clear().apply();
            }
        } else {
            throw new IllegalArgumentException("name is null");
        }
    }
}
