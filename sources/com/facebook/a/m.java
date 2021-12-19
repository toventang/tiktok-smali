package com.facebook.a;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.ab;
import com.facebook.internal.a.b.a;
import com.facebook.internal.ad;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public h f46875a;

    static {
        Covode.recordClassIndex(28539);
    }

    public final void e() {
        this.f46875a.c();
    }

    public final void a() {
        if (ab.b()) {
            this.f46875a.b();
        }
    }

    public final void b() {
        if (ab.b()) {
            this.f46875a.f();
        }
    }

    public final void c() {
        if (ab.b()) {
            this.f46875a.f();
        }
    }

    public final void d() {
        if (ab.b()) {
            this.f46875a.f();
        }
    }

    private m(h hVar) {
        this.f46875a = hVar;
    }

    public m(Context context) {
        this(new h(context, null));
    }

    public final void a(double d2) {
        if (ab.b()) {
            h hVar = this.f46875a;
            if (!a.a(hVar)) {
                try {
                    Double.valueOf(d2);
                } catch (Throwable th) {
                    a.a(th, hVar);
                }
            }
        }
    }

    public final void a(Bundle bundle) {
        if ((bundle.getInt("previous") & 2) != 0 || ab.b()) {
            this.f46875a.f();
        }
    }

    public static void a(Map<String, String> map) {
        String[] strArr;
        if (!a.a(p.class)) {
            try {
                if (!p.f46883a.get()) {
                    p.b();
                }
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String b2 = ad.b(p.a(key, map.get(key).trim()));
                    if (p.f46884b.containsKey(key)) {
                        String str = p.f46884b.get(key);
                        if (str != null) {
                            strArr = str.split(",");
                        } else {
                            strArr = new String[0];
                        }
                        HashSet hashSet = new HashSet(Arrays.asList(strArr));
                        if (!hashSet.contains(b2)) {
                            StringBuilder sb = new StringBuilder();
                            if (strArr.length == 0) {
                                sb.append(b2);
                            } else if (strArr.length < 5) {
                                sb.append(str).append(",").append(b2);
                            } else {
                                int i2 = 1;
                                do {
                                    sb.append(strArr[i2]).append(",");
                                    i2++;
                                } while (i2 < 5);
                                sb.append(b2);
                                hashSet.remove(strArr[0]);
                            }
                            p.f46884b.put(key, sb.toString());
                        } else {
                            return;
                        }
                    } else {
                        p.f46884b.put(key, b2);
                    }
                }
                String a2 = ad.a(p.f46884b);
                if (!a.a(p.class)) {
                    try {
                        com.facebook.m.c().execute(new Runnable("com.facebook.appevents.UserDataStore.internalUserData", a2) {
                            /* class com.facebook.a.p.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ String f46888a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ String f46889b;

                            static {
                                Covode.recordClassIndex(28544);
                            }

                            public final void run() {
                                if (!a.a(this)) {
                                    try {
                                        if (!p.c().get() && !a.a(p.class)) {
                                            try {
                                                p.b();
                                            } catch (Throwable th) {
                                                a.a(th, p.class);
                                            }
                                        }
                                        p.d().edit().putString(this.f46888a, this.f46889b).apply();
                                    } catch (Throwable th2) {
                                        a.a(th2, this);
                                    }
                                }
                            }

                            {
                                this.f46888a = r1;
                                this.f46889b = r2;
                            }
                        });
                    } catch (Throwable th) {
                        a.a(th, p.class);
                    }
                }
            } catch (Throwable th2) {
                a.a(th2, p.class);
            }
        }
    }

    public m(Context context, String str) {
        this(new h(context, str));
    }

    public m(String str, String str2) {
        this(new h(str, str2, null));
    }
}
