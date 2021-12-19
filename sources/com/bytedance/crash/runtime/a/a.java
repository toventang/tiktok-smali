package com.bytedance.crash.runtime.a;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.m;
import com.bytedance.crash.runtime.p;
import com.bytedance.crash.util.d;
import com.bytedance.crash.util.j;
import com.bytedance.crash.util.n;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {
    private static volatile a B;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27842a = true;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f27843b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f27844c;

    /* renamed from: d  reason: collision with root package name */
    public static int f27845d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f27846e;

    /* renamed from: f  reason: collision with root package name */
    public static long f27847f = -1;
    private final Application A;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f27848g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final List<Long> f27849h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final List<String> f27850i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final List<Long> f27851j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    final LinkedList<C0593a> f27852k = new LinkedList<>();

    /* renamed from: l  reason: collision with root package name */
    public String f27853l;

    /* renamed from: m  reason: collision with root package name */
    public long f27854m;
    public String n;
    public long o;
    public String p;
    public long q;
    public String r;
    public long s;
    public String t;
    public long u;
    public boolean v;
    public long w = -1;
    public int x = 50;
    public int y;
    public com.bytedance.crash.i.a z;

    public final long b() {
        return SystemClock.uptimeMillis() - this.w;
    }

    static {
        Covode.recordClassIndex(16305);
    }

    public static a a() {
        MethodCollector.i(8718);
        if (B == null) {
            synchronized (a.class) {
                try {
                    if (B == null) {
                        B = new a(m.f27725b);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8718);
                    throw th;
                }
            }
        }
        a aVar = B;
        MethodCollector.o(8718);
        return aVar;
    }

    public final JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.f27852k).iterator();
        while (it.hasNext()) {
            jSONArray.put(((C0593a) it.next()).toString());
        }
        return jSONArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.runtime.a.a$a  reason: collision with other inner class name */
    public static class C0593a {

        /* renamed from: a  reason: collision with root package name */
        String f27862a;

        /* renamed from: b  reason: collision with root package name */
        String f27863b;

        /* renamed from: c  reason: collision with root package name */
        long f27864c;

        static {
            Covode.recordClassIndex(16309);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (d.f27989a == null) {
                d.f27989a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            }
            return sb.append(d.f27989a.format(new Date(this.f27864c))).append(" : ").append(this.f27862a).append(' ').append(this.f27863b).toString();
        }

        C0593a(String str, String str2, long j2) {
            this.f27863b = str2;
            this.f27864c = j2;
            this.f27862a = str;
        }
    }

    private a(Application application) {
        this.A = application;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (application != null) {
                application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                    /* class com.bytedance.crash.runtime.a.a.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(16308);
                    }

                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    public final void onActivityStarted(Activity activity) {
                        String a2;
                        a aVar = a.this;
                        if (aVar.z == null) {
                            a2 = activity.getClass().getName();
                        } else {
                            a2 = a.this.z.a(activity);
                        }
                        aVar.n = a2;
                        a.this.o = System.currentTimeMillis();
                        a aVar2 = a.this;
                        aVar2.a(aVar2.n, a.this.o, "onStart", activity.hashCode());
                    }

                    public final void onActivityStopped(Activity activity) {
                        String a2;
                        a aVar = a.this;
                        if (aVar.z == null) {
                            a2 = activity.getClass().getName();
                        } else {
                            a2 = a.this.z.a(activity);
                        }
                        aVar.t = a2;
                        a.this.u = System.currentTimeMillis();
                        a aVar2 = a.this;
                        aVar2.a(aVar2.t, a.this.u, "onStop", activity.hashCode());
                    }

                    public final void onActivityDestroyed(Activity activity) {
                        String a2;
                        if (a.this.z == null) {
                            a2 = activity.getClass().getName();
                        } else {
                            a2 = a.this.z.a(activity);
                        }
                        int indexOf = a.this.f27848g.indexOf(a2);
                        if (indexOf >= 0 && indexOf < a.this.f27848g.size()) {
                            a.this.f27848g.remove(indexOf);
                            a.this.f27849h.remove(indexOf);
                        }
                        a.this.f27850i.add(a2);
                        long currentTimeMillis = System.currentTimeMillis();
                        a.this.f27851j.add(Long.valueOf(currentTimeMillis));
                        a.this.a(a2, currentTimeMillis, "onDestroy", activity.hashCode());
                    }

                    public final void onActivityPaused(Activity activity) {
                        String a2;
                        a aVar = a.this;
                        if (aVar.z == null) {
                            a2 = activity.getClass().getName();
                        } else {
                            a2 = a.this.z.a(activity);
                        }
                        aVar.r = a2;
                        a.this.s = System.currentTimeMillis();
                        a aVar2 = a.this;
                        aVar2.y--;
                        if (a.this.y == 0) {
                            a.this.v = false;
                            a.f27844c = false;
                            a.this.w = SystemClock.uptimeMillis();
                        } else if (a.this.y < 0) {
                            a.this.y = 0;
                            a.this.v = false;
                            a.f27844c = false;
                            a.this.w = SystemClock.uptimeMillis();
                        }
                        a aVar3 = a.this;
                        aVar3.a(aVar3.r, a.this.s, "onPause", activity.hashCode());
                    }

                    public final void onActivityResumed(Activity activity) {
                        String a2;
                        a aVar = a.this;
                        if (aVar.z == null) {
                            a2 = activity.getClass().getName();
                        } else {
                            a2 = a.this.z.a(activity);
                        }
                        aVar.p = a2;
                        a.this.q = System.currentTimeMillis();
                        a.this.y++;
                        if (!a.this.v) {
                            a.this.v = true;
                            if (a.f27842a) {
                                a.f27842a = false;
                                a.f27845d = 1;
                                a.f27847f = a.this.q;
                            }
                            if (a.this.p.equals(a.this.r)) {
                                if (a.f27844c && !a.f27843b) {
                                    a.f27845d = 4;
                                    a.f27847f = a.this.q;
                                } else if (!a.f27844c) {
                                    a.f27845d = 3;
                                    a.f27847f = a.this.q;
                                }
                            }
                        }
                        a aVar2 = a.this;
                        aVar2.a(aVar2.p, a.this.q, "onResume", activity.hashCode());
                    }

                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        String a2;
                        boolean z;
                        a aVar = a.this;
                        if (aVar.z == null) {
                            a2 = activity.getClass().getName();
                        } else {
                            a2 = a.this.z.a(activity);
                        }
                        aVar.f27853l = a2;
                        a.this.f27854m = System.currentTimeMillis();
                        if (bundle != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        a.f27843b = z;
                        a.f27844c = true;
                        a.this.f27848g.add(a.this.f27853l);
                        a.this.f27849h.add(Long.valueOf(a.this.f27854m));
                        a aVar2 = a.this;
                        aVar2.a(aVar2.f27853l, a.this.f27854m, "onCreate", activity.hashCode());
                    }
                });
            }
        } catch (Throwable unused) {
        }
        com.bytedance.crash.util.a.f27976a = new Callable<JSONArray>() {
            /* class com.bytedance.crash.runtime.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(16306);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ JSONArray call() {
                return a.a().c();
            }
        };
    }

    public static JSONObject a(String str, long j2) {
        JSONObject jSONObject = new JSONObject();
        n.a(jSONObject, StringSet.name, str);
        n.a(jSONObject, "time", Long.valueOf(j2));
        return jSONObject;
    }

    public final JSONArray a(List<String> list, List<Long> list2) {
        JSONArray jSONArray = new JSONArray();
        if (this.f27848g != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                try {
                    jSONArray.put(a(list.get(i2), list2.get(i2).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    public final void a(final String str, final long j2, final String str2, final int i2) {
        com.bytedance.crash.runtime.n.b().a(new Runnable() {
            /* class com.bytedance.crash.runtime.a.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(16307);
            }

            public final void run() {
                C0593a aVar;
                try {
                    a aVar2 = a.this;
                    String str = str;
                    String str2 = str2;
                    long j2 = j2;
                    if (aVar2.f27852k.size() < aVar2.x || (aVar = aVar2.f27852k.poll()) == null) {
                        aVar = new C0593a(str, str2, j2);
                        aVar2.f27852k.add(aVar);
                    } else {
                        aVar2.f27852k.add(aVar);
                    }
                    aVar.f27863b = str2;
                    aVar.f27862a = str;
                    aVar.f27864c = j2;
                } catch (Throwable unused) {
                }
                String str3 = str + '.' + str2 + '@' + Long.toHexString((long) i2);
                long j3 = j2;
                try {
                    File a2 = p.a();
                    if (a2 != null) {
                        j.a(a2, "activityLifeCycle" + ' ' + str3 + ' ' + d.a().format(new Date(j3)) + '\n', true);
                    }
                } catch (Throwable unused2) {
                }
            }
        });
    }
}
