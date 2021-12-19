package com.ss.android.ugc.aweme.awemeservice.a;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.bytedance.common.utility.reflect.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.c.b.b;
import com.google.c.b.c;
import com.google.c.b.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.bw;
import com.ss.android.ugc.aweme.utils.cs;
import java.io.Closeable;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public final class g implements b<String> {

    /* renamed from: a  reason: collision with root package name */
    b<String, Aweme> f67636a = new c().a(g.p.WEAK).a(200).a(new i(this)).c();

    /* renamed from: b  reason: collision with root package name */
    private b<String, Aweme> f67637b = new c().a(100).a(new h(this)).c();

    /* renamed from: c  reason: collision with root package name */
    private bw f67638c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, Object> f67639d;

    /* renamed from: e  reason: collision with root package name */
    private ExecutorService f67640e;

    static {
        Covode.recordClassIndex(41644);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.a.b
    public final Collection<Aweme> a() {
        return this.f67637b.a().values();
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.a.b
    public final void b() {
        try {
            cs.c(a(d.a(), "awemeCache").getAbsolutePath());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public g() {
        l.a a2 = l.a(o.SERIAL);
        a2.f79173b = "AwemeLruMemoryAndDiskCache";
        this.f67640e = com.ss.android.ugc.aweme.cw.g.a(a2.a());
        try {
            File a3 = a(d.a(), "awemeCache");
            if (a3.exists()) {
                cs.c(a3.getAbsolutePath());
            }
            bw a4 = bw.a(a3, MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAppVersionCode());
            this.f67638c = a4;
            Map<String, Object> map = (Map) a.a(a4, "lruEntries");
            this.f67639d = map;
            if (map != null) {
                map.size();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static File a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107194b != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107194b = cacheDir;
        return cacheDir;
    }

    /* access modifiers changed from: private */
    public boolean b(String str) {
        try {
            if (this.f67637b.a(str) == null && this.f67636a.a(str) == null && !d(str)) {
                return false;
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: private */
    public Aweme a(String str) {
        Aweme a2 = this.f67637b.a(str);
        if (a2 == null && (a2 = this.f67636a.a(str)) != null) {
            a(str, a2);
            this.f67636a.b(str);
        }
        if (a2 == null) {
            a2 = c(str);
            if (a2 != null) {
                a(str, a2);
            }
            com.ss.android.ugc.aweme.framework.a.a.a(4, "AwemeLruCache", "get Aweme from diskCache， awemeId = ".concat(String.valueOf(str)));
        }
        if (a2 == null) {
            try {
                JSONObject jSONObject = new JSONObject();
                String stackTraceString = Log.getStackTraceString(new Throwable());
                if (stackTraceString.length() > 4096) {
                    stackTraceString = stackTraceString.substring(0, 4096);
                }
                jSONObject.put("error_stack", stackTraceString);
                jSONObject.put("aid", str);
                com.ss.android.ugc.aweme.base.o.a("aweme_manager_get_aweme_is_null", jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return a2;
    }

    private Aweme c(String str) {
        Throwable th;
        ObjectInputStream objectInputStream;
        Exception e2;
        MethodCollector.i(11639);
        bw bwVar = this.f67638c;
        Aweme aweme = null;
        ObjectInputStream objectInputStream2 = null;
        if (bwVar == null) {
            MethodCollector.o(11639);
            return null;
        }
        try {
            bw.c a2 = bwVar.a(str);
            if (a2 == null) {
                com.bytedance.common.utility.d.b.a((Closeable) null);
                MethodCollector.o(11639);
                return null;
            }
            objectInputStream = new ObjectInputStream(a2.f142747a[0]);
            try {
                Aweme aweme2 = (Aweme) objectInputStream.readObject();
                com.bytedance.common.utility.d.b.a(objectInputStream);
                aweme = aweme2;
            } catch (Exception e3) {
                e2 = e3;
                try {
                    e2.printStackTrace();
                    com.bytedance.common.utility.d.b.a(objectInputStream);
                    MethodCollector.o(11639);
                    return aweme;
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream2 = objectInputStream;
                    com.bytedance.common.utility.d.b.a(objectInputStream2);
                    MethodCollector.o(11639);
                    throw th;
                }
            }
            MethodCollector.o(11639);
            return aweme;
        } catch (Exception e4) {
            e2 = e4;
            objectInputStream = null;
            e2.printStackTrace();
            com.bytedance.common.utility.d.b.a(objectInputStream);
            MethodCollector.o(11639);
            return aweme;
        } catch (Throwable th3) {
            th = th3;
            com.bytedance.common.utility.d.b.a(objectInputStream2);
            MethodCollector.o(11639);
            throw th;
        }
    }

    private boolean d(String str) {
        Object obj;
        bw bwVar = this.f67638c;
        boolean z = false;
        if (bwVar == null || bwVar.c()) {
            return false;
        }
        if (MainServiceImpl.createIMainServicebyMonsterPlugin(false).isContainsKeyWithLruEntries()) {
            Map<String, Object> map = this.f67639d;
            if (map == null || (obj = map.get(str)) == null) {
                return false;
            }
            return ((Boolean) a.a(obj, "readable")).booleanValue();
        }
        try {
            bw.c a2 = this.f67638c.a(str);
            if (a2 != null) {
                z = true;
                a2.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void a(String str, Aweme aweme) {
        this.f67637b.a(str, aweme);
    }

    private static File a(Context context, String str) {
        return new File(a(context).getPath() + File.separator + str);
    }

    public final void b(String str, Aweme aweme) {
        Throwable th;
        Exception e2;
        MethodCollector.i(11466);
        bw bwVar = this.f67638c;
        if (bwVar == null) {
            MethodCollector.o(11466);
            return;
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            bw.a b2 = bwVar.b(str);
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(b2.a(0));
            try {
                objectOutputStream2.writeObject(aweme);
                b2.a();
                com.bytedance.common.utility.d.b.a(objectOutputStream2);
            } catch (Exception e3) {
                e2 = e3;
                objectOutputStream = objectOutputStream2;
                try {
                    e2.printStackTrace();
                    com.bytedance.common.utility.d.b.a(objectOutputStream);
                    MethodCollector.o(11466);
                } catch (Throwable th2) {
                    th = th2;
                    com.bytedance.common.utility.d.b.a(objectOutputStream);
                    MethodCollector.o(11466);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream = objectOutputStream2;
                com.bytedance.common.utility.d.b.a(objectOutputStream);
                MethodCollector.o(11466);
                throw th;
            }
        } catch (Exception e4) {
            e2 = e4;
            e2.printStackTrace();
            com.bytedance.common.utility.d.b.a(objectOutputStream);
            MethodCollector.o(11466);
        }
        MethodCollector.o(11466);
    }

    /* access modifiers changed from: package-private */
    public final void a(final String str, final Aweme aweme) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread() || com.bytedance.ies.abmock.b.a().a(true, "enable_async_put_aweme_disk_cache", true)) {
            this.f67640e.submit(new Runnable() {
                /* class com.ss.android.ugc.aweme.awemeservice.a.g.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(41645);
                }

                public final void run() {
                    try {
                        g.this.b(str, aweme);
                    } catch (Exception unused) {
                    }
                }
            });
        } else {
            b(str, aweme);
        }
    }
}
