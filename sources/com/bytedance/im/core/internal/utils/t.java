package com.bytedance.im.core.internal.utils;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ai;

public class t {

    /* renamed from: b  reason: collision with root package name */
    private static volatile t f38864b;

    /* renamed from: a  reason: collision with root package name */
    public LruCache<String, ai> f38865a;

    static {
        Covode.recordClassIndex(23169);
    }

    public static boolean b() {
        return d.a().b().av;
    }

    private t() {
        int i2 = d.a().b().ar;
        this.f38865a = new LruCache<>(i2 <= 0 ? 20 : i2);
    }

    public static t a() {
        MethodCollector.i(10894);
        if (f38864b == null) {
            synchronized (t.class) {
                try {
                    if (f38864b == null) {
                        f38864b = new t();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10894);
                    throw th;
                }
            }
        }
        t tVar = f38864b;
        MethodCollector.o(10894);
        return tVar;
    }

    public final ai a(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ai aiVar = this.f38865a.get(str);
        StringBuilder append = new StringBuilder("SendMsgCache getMsg, uuid:").append(str).append(", result:");
        if (aiVar != null) {
            z = true;
        } else {
            z = false;
        }
        f.b("imsdk", append.append(z).toString(), (Throwable) null);
        return aiVar;
    }

    public final void a(ai aiVar) {
        if (!TextUtils.isEmpty(aiVar.getUuid()) && this.f38865a.get(aiVar.getUuid()) != null) {
            f.b("imsdk", "SendMsgCache checkUpdate, uuid:" + aiVar.getUuid(), (Throwable) null);
            this.f38865a.put(aiVar.getUuid(), aiVar);
        }
    }
}
