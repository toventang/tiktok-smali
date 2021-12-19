package com.bytedance.m.a;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.m.b.a;
import com.google.android.play.core.e.c;
import com.google.android.play.core.e.d;
import com.google.android.play.core.e.e;
import com.google.android.play.core.e.f;
import com.google.android.play.core.e.g;
import com.google.android.play.core.tasks.n;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class b implements com.bytedance.m.b {

    /* renamed from: d  reason: collision with root package name */
    private static volatile b f41310d;

    /* renamed from: a  reason: collision with root package name */
    public List<g> f41311a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    final g f41312b;

    /* renamed from: c  reason: collision with root package name */
    public c f41313c = d.a(com.bytedance.m.c.f41337b);

    static {
        Covode.recordClassIndex(25312);
    }

    @Override // com.bytedance.m.b
    public final Map<String, a> a() {
        return com.bytedance.m.d.a().f41342b;
    }

    private b() {
        AnonymousClass1 r1 = new g() {
            /* class com.bytedance.m.a.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(25313);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.android.play.core.c.a
            public final /* synthetic */ void a(f fVar) {
                final f fVar2 = fVar;
                if (fVar2.b() == 5 && Build.VERSION.SDK_INT >= 26) {
                    Context context = com.bytedance.m.c.f41337b;
                    if (Build.VERSION.SDK_INT > 25 && Build.VERSION.SDK_INT < 28) {
                        com.google.android.play.core.e.b.f53264a.d("Calling dispatchPackageBroadcast", new Object[0]);
                        try {
                            Class<?> cls = Class.forName("android.app.ActivityThread");
                            Method method = cls.getMethod("currentActivityThread", new Class[0]);
                            method.setAccessible(true);
                            Object invoke = method.invoke(null, new Object[0]);
                            Field declaredField = cls.getDeclaredField("mAppThread");
                            declaredField.setAccessible(true);
                            Object obj = declaredField.get(invoke);
                            obj.getClass().getMethod("dispatchPackageBroadcast", Integer.TYPE, String[].class).invoke(obj, 3, new String[]{context.getPackageName()});
                            com.google.android.play.core.e.b.f53264a.d("Called dispatchPackageBroadcast", new Object[0]);
                        } catch (Exception unused) {
                            com.google.android.play.core.e.b.f53264a.c("Update app info with dispatchPackageBroadcast failed!", new Object[0]);
                        }
                    }
                    new Handler().post(new Runnable() {
                        /* class com.bytedance.m.a.b.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(25314);
                        }

                        public final void run() {
                            com.bytedance.m.c.f41337b.getAssets();
                        }
                    });
                }
                new Handler().post(new Runnable() {
                    /* class com.bytedance.m.a.b.AnonymousClass1.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(25315);
                    }

                    public final void run() {
                        f fVar = fVar2;
                        for (String str : fVar.f()) {
                            String str2 = d.a().f41324b.get(str);
                            if (str2 != null) {
                                str = str2;
                            }
                            com.bytedance.m.d.a().a(b.a(str, fVar));
                            a.a().f41309a.put(str, fVar);
                        }
                    }
                });
                for (g gVar : b.this.f41311a) {
                    gVar.a(fVar2);
                }
            }
        };
        this.f41312b = r1;
        this.f41313c.a(r1);
        c();
    }

    public static b b() {
        MethodCollector.i(8000);
        if (f41310d == null) {
            synchronized (b.class) {
                try {
                    if (f41310d == null) {
                        f41310d = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8000);
                    throw th;
                }
            }
        }
        b bVar = f41310d;
        MethodCollector.o(8000);
        return bVar;
    }

    private void c() {
        HashMap hashMap = new HashMap();
        Set<String> b2 = this.f41313c.b();
        try {
            JSONArray jSONArray = new JSONArray(c.a(com.bytedance.m.c.f41337b, "plugins.json"));
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("packageName");
                    String optString2 = optJSONObject.optString("aabName");
                    if (optString2 == null) {
                        optString2 = optString;
                    }
                    d a2 = d.a();
                    if (a2.f41323a.containsKey(optString)) {
                        throw new IllegalArgumentException("duplicate config for package name ".concat(String.valueOf(optString)));
                    } else if (!a2.f41324b.containsKey(optString2)) {
                        a2.f41323a.put(optString, optString2);
                        a2.f41324b.put(optString2, optString);
                        if (b2.contains(optString2)) {
                            hashMap.put(optString, new a(optString, com.bytedance.m.c.f41338c.b(), 5));
                        } else {
                            int a3 = e.a().a(optString);
                            if (a3 == -1) {
                                hashMap.put(optString, new a(optString, com.bytedance.m.c.f41338c.b(), 0));
                            } else {
                                com.google.android.play.core.tasks.d<f> b3 = this.f41313c.b(a3);
                                if (!b3.a()) {
                                    hashMap.put(optString, new a(optString, com.bytedance.m.c.f41338c.b(), 0));
                                } else {
                                    hashMap.put(optString, a(optString, b3.c()));
                                }
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("duplicate config for aab name ".concat(String.valueOf(optString2)));
                    }
                }
            }
        } catch (Exception unused) {
        }
        com.bytedance.m.d.a().f41342b.putAll(hashMap);
    }

    @Override // com.bytedance.m.b
    public final a b(String str) {
        return com.bytedance.m.d.a().f41342b.get(str);
    }

    @Override // com.bytedance.m.b
    public final void a(final String str) {
        this.f41313c.a(e.a().a(d.a().a(str)).a()).a(new com.google.android.play.core.tasks.b<Integer>() {
            /* class com.bytedance.m.a.b.AnonymousClass3 */

            static {
                Covode.recordClassIndex(25317);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.android.play.core.tasks.b
            public final /* synthetic */ void a(Integer num) {
                e.a().a(str, num.intValue());
            }
        }).a(new com.google.android.play.core.tasks.a() {
            /* class com.bytedance.m.a.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(25316);
            }

            @Override // com.google.android.play.core.tasks.a
            public final void a(Exception exc) {
                b.a(exc, str);
            }
        });
    }

    static a a(String str, f fVar) {
        a aVar = new a(str, com.bytedance.m.c.f41338c.b(), fVar.b());
        aVar.f41330d = fVar.e();
        aVar.f41331e = fVar.d();
        aVar.f41334h = fVar.h();
        aVar.f41333g = fVar.c();
        return aVar;
    }

    public static void a(Exception exc, String str) {
        a aVar = new a(str, com.bytedance.m.c.f41338c.b(), 6);
        if (exc instanceof com.google.android.play.core.e.a) {
            aVar.f41333g = ((n) exc).getErrorCode();
        }
        aVar.f41335i = exc;
        com.bytedance.m.d.a().a(aVar);
    }

    @Override // com.bytedance.m.b
    public final boolean a(String str, String str2) {
        if (!this.f41313c.b().contains(d.a().a(str))) {
            return false;
        }
        try {
            Context context = com.bytedance.m.c.f41337b;
            com.google.android.play.core.e.b.a(context.createPackageContext(context.getPackageName(), 0), str2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
