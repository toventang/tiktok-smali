package com.ss.android.ugc.aweme.awemeservice.a;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.c.b.b;
import com.google.c.b.c;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.bw;
import com.ss.android.ugc.aweme.utils.cs;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import org.json.JSONObject;

public final class d implements b<String> {

    /* renamed from: a  reason: collision with root package name */
    private b<String, Aweme> f67629a = new c().a(100).a(new e(this)).c();

    /* renamed from: b  reason: collision with root package name */
    private bw f67630b;

    static {
        Covode.recordClassIndex(41640);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.a.b
    public final Collection<Aweme> a() {
        return this.f67629a.a().values();
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.a.b
    public final void b() {
        try {
            cs.c(a(com.bytedance.ies.ugc.appcontext.d.a(), "awemeCache").getAbsolutePath());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public d() {
        try {
            File a2 = a(com.bytedance.ies.ugc.appcontext.d.a(), "awemeCache");
            if (a2.exists()) {
                cs.c(a2.getAbsolutePath());
            }
            this.f67630b = bw.a(a2, MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAppVersionCode());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static File a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107193a != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107193a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107193a = externalCacheDir;
        return externalCacheDir;
    }

    private static File b(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107194b != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107194b = cacheDir;
        return cacheDir;
    }

    private Aweme c(String str) {
        Throwable th;
        ObjectInputStream objectInputStream;
        Exception e2;
        MethodCollector.i(12689);
        bw bwVar = this.f67630b;
        Aweme aweme = null;
        ObjectInputStream objectInputStream2 = null;
        if (bwVar == null) {
            MethodCollector.o(12689);
            return null;
        }
        try {
            objectInputStream = new ObjectInputStream(bwVar.a(str).f142747a[0]);
            try {
                Aweme aweme2 = (Aweme) objectInputStream.readObject();
                com.bytedance.common.utility.d.b.a(objectInputStream);
                aweme = aweme2;
            } catch (Exception e3) {
                e2 = e3;
                try {
                    e2.printStackTrace();
                    com.bytedance.common.utility.d.b.a(objectInputStream);
                    MethodCollector.o(12689);
                    return aweme;
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream2 = objectInputStream;
                    com.bytedance.common.utility.d.b.a(objectInputStream2);
                    MethodCollector.o(12689);
                    throw th;
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            objectInputStream = null;
            e2.printStackTrace();
            com.bytedance.common.utility.d.b.a(objectInputStream);
            MethodCollector.o(12689);
            return aweme;
        } catch (Throwable th3) {
            th = th3;
            com.bytedance.common.utility.d.b.a(objectInputStream2);
            MethodCollector.o(12689);
            throw th;
        }
        MethodCollector.o(12689);
        return aweme;
    }

    private boolean d(String str) {
        bw bwVar = this.f67630b;
        boolean z = false;
        if (bwVar == null || bwVar.c()) {
            return false;
        }
        try {
            bw.c a2 = this.f67630b.a(str);
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
    /* renamed from: b */
    public Aweme a(String str) {
        Aweme aweme;
        try {
            aweme = this.f67629a.a(str, new f(this, str));
        } catch (Exception e2) {
            e2.printStackTrace();
            aweme = null;
        }
        if (aweme == null) {
            try {
                JSONObject jSONObject = new JSONObject();
                String stackTraceString = Log.getStackTraceString(new Throwable());
                if (stackTraceString.length() > 4096) {
                    stackTraceString = stackTraceString.substring(0, 4096);
                }
                jSONObject.put("error_stack", stackTraceString);
                jSONObject.put("aid", str);
                o.a("aweme_manager_get_aweme_is_null", jSONObject);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        return aweme;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Aweme a(String str) {
        Aweme c2 = c(str);
        if (c2 != null) {
            bw bwVar = this.f67630b;
            if (bwVar != null) {
                try {
                    bwVar.c(str);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            a(str, c2);
        }
        return c2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.awemeservice.a.b
    public final /* synthetic */ boolean b(String str) {
        String str2 = str;
        boolean containsKey = this.f67629a.a().containsKey(str2);
        if (!containsKey) {
            return d(str2);
        }
        return containsKey;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void a(String str, Aweme aweme) {
        this.f67629a.a(str, aweme);
    }

    private static File a(Context context, String str) {
        String str2;
        if ("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) {
            str2 = a(context).getPath();
        } else {
            str2 = b(context).getPath();
        }
        return new File(str2 + File.separator + str);
    }

    public final void a(String str, Aweme aweme) {
        Throwable th;
        Exception e2;
        MethodCollector.i(12449);
        bw bwVar = this.f67630b;
        if (bwVar == null) {
            MethodCollector.o(12449);
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
                    MethodCollector.o(12449);
                } catch (Throwable th2) {
                    th = th2;
                    com.bytedance.common.utility.d.b.a(objectOutputStream);
                    MethodCollector.o(12449);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream = objectOutputStream2;
                com.bytedance.common.utility.d.b.a(objectOutputStream);
                MethodCollector.o(12449);
                throw th;
            }
        } catch (Exception e4) {
            e2 = e4;
            e2.printStackTrace();
            com.bytedance.common.utility.d.b.a(objectOutputStream);
            MethodCollector.o(12449);
        }
        MethodCollector.o(12449);
    }
}
