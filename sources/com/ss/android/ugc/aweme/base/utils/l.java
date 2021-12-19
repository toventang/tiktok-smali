package com.ss.android.ugc.aweme.base.utils;

import android.content.Context;
import com.bytedance.common.utility.d.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.utils.bw;
import java.io.File;
import java.io.ObjectInputStream;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static bw f68437a;

    static {
        Covode.recordClassIndex(42138);
    }

    public static File a(Context context) {
        if (d.f107193a != null && d.f107197e) {
            return d.f107193a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        d.f107193a = externalCacheDir;
        return externalCacheDir;
    }

    public static Runnable a(String str) {
        Throwable th;
        ObjectInputStream objectInputStream;
        Exception e2;
        MethodCollector.i(1569);
        bw bwVar = f68437a;
        Runnable runnable = null;
        ObjectInputStream objectInputStream2 = null;
        if (bwVar == null) {
            MethodCollector.o(1569);
            return null;
        }
        try {
            objectInputStream = new ObjectInputStream(bwVar.a(str).f142747a[0]);
            try {
                Runnable runnable2 = (Runnable) objectInputStream.readObject();
                b.a(objectInputStream);
                runnable = runnable2;
            } catch (Exception e3) {
                e2 = e3;
                try {
                    e2.printStackTrace();
                    b.a(objectInputStream);
                    MethodCollector.o(1569);
                    return runnable;
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream2 = objectInputStream;
                    b.a(objectInputStream2);
                    MethodCollector.o(1569);
                    throw th;
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            objectInputStream = null;
            e2.printStackTrace();
            b.a(objectInputStream);
            MethodCollector.o(1569);
            return runnable;
        } catch (Throwable th3) {
            th = th3;
            b.a(objectInputStream2);
            MethodCollector.o(1569);
            throw th;
        }
        MethodCollector.o(1569);
        return runnable;
    }
}
