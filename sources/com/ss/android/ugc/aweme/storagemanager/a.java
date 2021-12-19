package com.ss.android.ugc.aweme.storagemanager;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import c.a.a;
import c.c.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.e.c;
import com.ss.android.agilelogger.ALog;
import com.ss.android.agilelogger.c.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lego.f;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicBoolean f136685a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public static c f136686b = new c() {
        /* class com.ss.android.ugc.aweme.storagemanager.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(89273);
        }

        @Override // com.bytedance.disk.e.c
        public final void a(String str, Map<String, String> map) {
            if (TextUtils.equals("monitor", str) && !map.isEmpty()) {
                C3569a aVar = new C3569a();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    aVar.a(entry.getKey(), entry.getValue());
                }
                if (aVar.f136690a.length() > 0) {
                    r.a("diskmigrate", aVar.f136690a);
                }
            }
        }

        @Override // com.bytedance.disk.e.c
        public final void a(Object obj, com.bytedance.disk.e.b.b bVar, int i2) {
            f.e().a(new TokenResolverInit$1$1(this, bVar, obj, i2)).a();
        }

        @Override // com.bytedance.disk.e.c
        public final int a(int i2, String str, String str2, Throwable th) {
            if (th != null) {
                str2 = str2 + "\n" + Log.getStackTraceString(th);
            }
            ALog.println(i2, str, str2, b.a.MSG);
            return 0;
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public static volatile com.bytedance.v.a f136687c = null;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f136688d;

    /* renamed from: e  reason: collision with root package name */
    private static AtomicBoolean f136689e = new AtomicBoolean(false);

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.storagemanager.a$a  reason: collision with other inner class name */
    static class C3569a {

        /* renamed from: a  reason: collision with root package name */
        JSONObject f136690a = new JSONObject();

        static {
            Covode.recordClassIndex(89274);
        }

        C3569a() {
        }

        /* access modifiers changed from: package-private */
        public final C3569a a(String str, Object obj) {
            try {
                this.f136690a.put(str, obj);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return this;
        }
    }

    static {
        Covode.recordClassIndex(89272);
    }

    /* access modifiers changed from: package-private */
    public static class b implements c.c.b {

        /* renamed from: a  reason: collision with root package name */
        private Context f136691a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f136692b;

        static {
            Covode.recordClassIndex(89275);
        }

        @Override // c.c.b
        public final c.c.a a(b.a aVar) {
            String str;
            String a2;
            com.bytedance.v.a.b.a(this.f136691a);
            c.c.a a3 = aVar.a();
            String str2 = a3.f4909b;
            if (!TextUtils.isEmpty(str2)) {
                str = new com.bytedance.disk.c.a(str2, a3.f4910c).f28530a;
            } else {
                str = new com.bytedance.disk.c.a(a3.f4908a).f28530a;
            }
            if (this.f136692b && a.f136685a.get()) {
                com.bytedance.disk.e.a a4 = com.bytedance.disk.e.a.a();
                a4.a(0);
                if (a4.f28576a == null) {
                    a2 = str;
                } else {
                    a2 = a4.f28576a.a(str);
                }
                if (!TextUtils.isEmpty(a2)) {
                    str = a2;
                }
            }
            a3.f4908a = str;
            return aVar.a(a3);
        }

        b(Context context, boolean z) {
            this.f136691a = context;
            this.f136692b = z;
        }
    }

    public static void a(Context context, boolean z) {
        if (!f136688d) {
            com.bytedance.disk.e.a.a(context, f136686b);
            a.C0068a.f4876a.a(new b(context, z));
            f136688d = true;
        }
    }
}
