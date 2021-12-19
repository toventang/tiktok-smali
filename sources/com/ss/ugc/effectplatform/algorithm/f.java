package com.ss.ugc.effectplatform.algorithm;

import android.content.Context;
import android.content.res.AssetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.ugc.effectplatform.util.n;
import d.a.d.a.c;
import d.a.d.a.d;
import d.a.d.a.k;
import d.a.e.b;
import h.a.i;
import h.f.b.l;
import h.f.b.z;
import h.w;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f153466a;

    /* renamed from: b  reason: collision with root package name */
    private final String f153467b;

    static {
        Covode.recordClassIndex(102328);
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public final boolean a(String str) {
        MethodCollector.i(9572);
        l.c(str, "");
        boolean z = false;
        try {
            Object obj = this.f153466a;
            if (obj instanceof Context) {
                if (obj != null) {
                    Context a2 = a((Context) obj);
                    l.a((Object) a2, "");
                    AssetManager assets = a2.getAssets();
                    String a3 = n.a(str);
                    if (this.f153467b == null || !new h.m.l(this.f153467b).matches(a3)) {
                        c cVar = new c();
                        InputStream open = assets.open(str, 2);
                        l.a((Object) open, "");
                        cVar.a(open);
                        z = true;
                        d.a((k) cVar);
                    } else {
                        RuntimeException runtimeException = new RuntimeException(str + " manually excluded by DownloadableModelSupport.exclusionPattern");
                        MethodCollector.o(9572);
                        throw runtimeException;
                    }
                } else {
                    w wVar = new w("null cannot be cast to non-null type");
                    MethodCollector.o(9572);
                    throw wVar;
                }
            }
            return z;
        } catch (Exception unused) {
            return false;
        } finally {
            MethodCollector.o(9572);
        }
    }

    public final List<String> c(String str) {
        MethodCollector.i(9733);
        l.c(str, "");
        Object obj = this.f153466a;
        List<String> list = null;
        if (!(obj instanceof Context)) {
            MethodCollector.o(9733);
            return null;
        }
        try {
            Context a2 = a((Context) obj);
            l.a((Object) a2, "");
            String[] list2 = a2.getAssets().list(str);
            if (list2 != null) {
                list = i.j(list2);
            }
        } catch (Exception e2) {
            b.a("effect_platform", "error in list file: ".concat(String.valueOf(str)), e2);
        }
        MethodCollector.o(9733);
        return list;
    }

    public final String b(String str) {
        MethodCollector.i(9574);
        l.c(str, "");
        Object obj = this.f153466a;
        if (!(obj instanceof Context)) {
            MethodCollector.o(9574);
            return null;
        }
        try {
            Context a2 = a((Context) obj);
            l.a((Object) a2, "");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(a2.getAssets().open(str)));
            try {
                BufferedReader bufferedReader2 = bufferedReader;
                StringBuilder sb = new StringBuilder();
                z.e eVar = new z.e();
                while (true) {
                    T t = (T) bufferedReader2.readLine();
                    eVar.element = t;
                    if (t != null) {
                        sb.append((String) eVar.element);
                    } else {
                        String sb2 = sb.toString();
                        h.e.c.a(bufferedReader, null);
                        MethodCollector.o(9574);
                        return sb2;
                    }
                }
            } catch (Throwable th) {
                h.e.c.a(bufferedReader, th);
                MethodCollector.o(9574);
                throw th;
            }
        } catch (Exception unused) {
            b.a("effect_platform", "AssetUtils#loadJson::jsonFilePath=" + str + ", file not exists");
            MethodCollector.o(9574);
            return null;
        }
    }

    public f(Object obj, String str) {
        this.f153466a = obj;
        this.f153467b = str;
    }
}
