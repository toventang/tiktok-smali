package com.ss.android.ugc.aweme.services;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.b.a;
import com.ss.android.ugc.aweme.common.b.b;
import com.ss.android.ugc.aweme.port.in.i;
import h.e.c;
import h.e.q;
import h.f.b.l;
import h.m.d;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public final class AndroidAssetServiceImpl {
    static {
        Covode.recordClassIndex(79416);
    }

    public final <T> T convertJsonToObject(String str, Class<T> cls) {
        l.d(str, "");
        l.d(cls, "");
        return (T) convertJsonToObject(str, cls, new a());
    }

    public final <T> T convertJsonToObject(String str, Class<T> cls, b<String, T> bVar) {
        MethodCollector.i(9685);
        l.d(str, "");
        l.d(cls, "");
        l.d(bVar, "");
        Application application = i.f115645a;
        l.b(application, "");
        InputStream open = application.getAssets().open(str);
        l.b(open, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, d.f158808a), 8192);
        try {
            String a2 = q.a((Reader) bufferedReader);
            c.a(bufferedReader, null);
            T a3 = bVar.a(a2, cls);
            MethodCollector.o(9685);
            return a3;
        } catch (Throwable th) {
            c.a(bufferedReader, th);
            MethodCollector.o(9685);
            throw th;
        }
    }
}
