package com.ss.android.ugc.aweme.ck;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.AbsOpenResultCallback;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ck.c;
import com.ss.android.ugc.aweme.lancet.q;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONObject;

public class t {

    /* renamed from: a  reason: collision with root package name */
    public static Set<a> f71163a = new LinkedHashSet();

    /* renamed from: b  reason: collision with root package name */
    public static b f71164b = null;

    /* renamed from: d  reason: collision with root package name */
    static boolean f71165d = false;

    /* renamed from: e  reason: collision with root package name */
    private static final String f71166e = t.class.getName();

    /* renamed from: f  reason: collision with root package name */
    private static Application f71167f;

    /* renamed from: g  reason: collision with root package name */
    private static final LinkedHashMap<String, j> f71168g = new LinkedHashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private static boolean f71169h = false;

    /* renamed from: i  reason: collision with root package name */
    private static t f71170i;

    /* renamed from: c  reason: collision with root package name */
    public r f71171c = new r();

    public interface a {
        static {
            Covode.recordClassIndex(43804);
        }

        void a();
    }

    public interface b {
        static {
            Covode.recordClassIndex(43805);
        }

        String a(String str);
    }

    public static t a() {
        t tVar = f71170i;
        if (tVar != null) {
            return tVar;
        }
        throw new RuntimeException("RouterManager need init first before use!");
    }

    static {
        Covode.recordClassIndex(43800);
    }

    private static void b() {
        MethodCollector.i(1097);
        if (f71169h) {
            MethodCollector.o(1097);
            return;
        }
        synchronized (f71168g) {
            try {
                for (a aVar : f71163a) {
                    aVar.a();
                }
                f71169h = true;
            } finally {
                MethodCollector.o(1097);
            }
        }
    }

    private t(Application application) {
        f71167f = application;
    }

    public static void a(Application application) {
        MethodCollector.i(1096);
        if (f71170i == null) {
            synchronized (t.class) {
                try {
                    if (f71170i == null) {
                        f71170i = new t(application);
                    }
                } finally {
                    MethodCollector.o(1096);
                }
            }
            return;
        }
        MethodCollector.o(1096);
    }

    public static void a(String str, j jVar) {
        f71168g.put(str, jVar);
    }

    public static void a(String str, Class<? extends Activity> cls) {
        b bVar = new b(f71167f, str, cls);
        bVar.f71112c = f71165d;
        LinkedHashMap<String, j> linkedHashMap = f71168g;
        if (linkedHashMap.get(str) == null) {
            linkedHashMap.put(str, bVar);
        }
    }

    public static void a(String str, boolean z) {
        String str2;
        try {
            if (TextUtils.isEmpty(str)) {
                str = "empty url";
            }
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str2 = "smartrouter";
            } else {
                str2 = "all";
            }
            jSONObject.put(StringSet.type, str2);
            jSONObject.put("open_url", str);
            com.bytedance.apm.b.a("in_app_router_no_matched", (JSONObject) null, (JSONObject) null, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        a(r5, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.ss.android.ugc.aweme.ck.t r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ck.t.a(com.ss.android.ugc.aweme.ck.t, java.lang.String):boolean");
    }

    public static boolean a(t tVar, Activity activity, String str) {
        q.a(str);
        final boolean[] zArr = new boolean[1];
        SmartRouter.buildRoute(activity, str).withCallback(new AbsOpenResultCallback() {
            /* class com.ss.android.ugc.aweme.ck.t.AnonymousClass2 */

            static {
                Covode.recordClassIndex(43802);
            }

            @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
            public final void onSuccess(Intent intent) {
                zArr[0] = true;
            }

            @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
            public final void onFail(String str, String str2) {
                zArr[0] = false;
                t.a(str, true);
            }
        }).open();
        if (!zArr[0]) {
            b();
            b bVar = f71164b;
            if (bVar != null) {
                str = bVar.a(str);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Iterator<String> it = f71168g.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (v.a(next, str)) {
                    j jVar = f71168g.get(next);
                    if (jVar != null) {
                        zArr[0] = jVar.a(activity, str);
                    }
                }
            }
            a(str, false);
            return false;
        }
        if (!zArr[0]) {
            a(str, false);
        }
        return zArr[0];
    }

    public static boolean a(t tVar, Activity activity, String str, int i2) {
        q.a(str);
        final boolean[] zArr = new boolean[1];
        SmartRouter.buildRoute(activity, str).withCallback(new AbsOpenResultCallback() {
            /* class com.ss.android.ugc.aweme.ck.t.AnonymousClass3 */

            static {
                Covode.recordClassIndex(43803);
            }

            @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
            public final void onSuccess(Intent intent) {
                zArr[0] = true;
            }

            @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
            public final void onFail(String str, String str2) {
                zArr[0] = false;
                t.a(str, true);
            }
        }).open(i2);
        if (!zArr[0]) {
            b();
            b bVar = f71164b;
            if (bVar != null) {
                str = bVar.a(str);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Iterator<String> it = f71168g.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (v.a(next, str)) {
                    j jVar = f71168g.get(next);
                    if (jVar != null) {
                        if (jVar instanceof b) {
                            b bVar2 = (b) jVar;
                            c.a aVar = new c.a();
                            aVar.f71124a = 1;
                            c cVar = new c();
                            cVar.f71122e = aVar.f71124a;
                            cVar.f71118a = aVar.f71125b;
                            cVar.f71119b = aVar.f71126c;
                            cVar.f71120c = aVar.f71127d;
                            cVar.f71121d = aVar.f71128e;
                            cVar.f71120c = i2;
                            bVar2.f71111b = cVar;
                            zArr[0] = bVar2.b(activity, str);
                        } else {
                            zArr[0] = jVar.a(activity, str);
                        }
                    }
                }
            }
            a(str, false);
            return false;
        }
        if (!zArr[0]) {
            a(str, false);
        }
        return zArr[0];
    }
}
