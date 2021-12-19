package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.c.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class cd implements bi {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, cd> f50736d = new a();

    /* renamed from: a  reason: collision with root package name */
    final Object f50737a = new Object();

    /* renamed from: b  reason: collision with root package name */
    volatile Map<String, ?> f50738b;

    /* renamed from: c  reason: collision with root package name */
    final List<Object> f50739c = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final SharedPreferences f50740e;

    /* renamed from: f  reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f50741f;

    static {
        Covode.recordClassIndex(31697);
    }

    public static synchronized void a() {
        synchronized (cd.class) {
            MethodCollector.i(7615);
            for (cd cdVar : f50736d.values()) {
                cdVar.f50740e.unregisterOnSharedPreferenceChangeListener(cdVar.f50741f);
            }
            f50736d.clear();
            MethodCollector.o(7615);
        }
    }

    private cd(SharedPreferences sharedPreferences) {
        cc ccVar = new cc(this);
        this.f50741f = ccVar;
        this.f50740e = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(ccVar);
    }

    private static SharedPreferences b(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            throw new NullPointerException("startsWith");
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    static cd a(Context context) {
        cd cdVar;
        MethodCollector.i(7608);
        if (bc.a()) {
            throw new NullPointerException("startsWith");
        }
        synchronized (cd.class) {
            try {
                Map<String, cd> map = f50736d;
                cdVar = map.get(null);
                if (cdVar == null) {
                    cdVar = new cd(b(context));
                    map.put(null, cdVar);
                }
            } finally {
                MethodCollector.o(7608);
            }
        }
        return cdVar;
    }

    @Override // com.google.android.gms.internal.measurement.bi
    public final Object a(String str) {
        Object obj;
        MethodCollector.i(7613);
        Map<String, ?> map = this.f50738b;
        if (map == null) {
            synchronized (this.f50737a) {
                try {
                    map = this.f50738b;
                    if (map == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            map = this.f50740e.getAll();
                            this.f50738b = map;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            MethodCollector.o(7613);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    MethodCollector.o(7613);
                    throw th2;
                }
            }
        }
        if (map != null) {
            obj = map.get(str);
        } else {
            obj = null;
        }
        MethodCollector.o(7613);
        return obj;
    }
}
