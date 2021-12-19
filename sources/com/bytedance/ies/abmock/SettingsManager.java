package com.bytedance.ies.abmock;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.datacenter.i;
import java.util.ArrayList;
import java.util.List;

public class SettingsManager {

    /* renamed from: b  reason: collision with root package name */
    private static volatile SettingsManager f31786b;

    /* renamed from: a  reason: collision with root package name */
    public i f31787a;

    /* renamed from: c  reason: collision with root package name */
    private List<i> f31788c = new ArrayList();

    static {
        Covode.recordClassIndex(18585);
    }

    public i getSettingsValueProvider() {
        return this.f31787a;
    }

    public final void a(i iVar) {
        MethodCollector.i(8355);
        synchronized (this.f31788c) {
            try {
                this.f31788c.add(iVar);
            } finally {
                MethodCollector.o(8355);
            }
        }
    }

    public final boolean a(String str, boolean z) {
        if (j.a().c()) {
            e.a();
            return e.a(str, z, false);
        }
        Boolean bool = (Boolean) a(str);
        if (bool != null) {
            j.a();
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(getSettingsValueProvider().c(str, z));
        j.a();
        return valueOf.booleanValue();
    }

    public final String a(String str, String str2) {
        if (j.a().c()) {
            e.a();
            return e.a(str, str2, false);
        }
        String str3 = (String) a(str);
        if (str3 != null) {
            j.a();
            return str3;
        }
        String d2 = getSettingsValueProvider().d(str, str2);
        j.a();
        return d2;
    }

    private SettingsManager() {
    }

    public final void c() {
        new Handler(Looper.getMainLooper()).post(new q(this));
    }

    public static SettingsManager a() {
        MethodCollector.i(8197);
        if (f31786b == null) {
            synchronized (SettingsManager.class) {
                try {
                    if (f31786b == null) {
                        f31786b = new SettingsManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8197);
                    throw th;
                }
            }
        }
        SettingsManager settingsManager = f31786b;
        MethodCollector.o(8197);
        return settingsManager;
    }

    /* access modifiers changed from: package-private */
    public final Object[] b() {
        Object[] objArr;
        MethodCollector.i(8357);
        synchronized (this.f31788c) {
            try {
                if (this.f31788c.size() > 0) {
                    objArr = this.f31788c.toArray();
                } else {
                    objArr = null;
                }
            } finally {
                MethodCollector.o(8357);
            }
        }
        return objArr;
    }

    private static <T> T a(String str) {
        T t;
        if (!j.a().b() || !j.a().d().enable() || (t = (T) j.a().d().get(str)) == null) {
            return null;
        }
        a.a(str + " use mock data!!");
        return t;
    }

    public final <T> T a(String str, Class cls) {
        T t = (T) b(str, cls);
        j.a();
        return t;
    }

    private <T> T b(String str, Class cls) {
        T t = (T) a(str);
        if (t != null) {
            return t;
        }
        if (cls == String[].class) {
            if (!j.a().c()) {
                return (T) getSettingsValueProvider().b(str);
            }
            e.a();
            return (T) e.a(str, false);
        } else if (!j.a().c()) {
            return (T) getSettingsValueProvider().b(str, cls);
        } else {
            e.a();
            return (T) e.a(str, false, false, cls);
        }
    }

    public final double a(String str, double d2) {
        if (j.a().c()) {
            e.a();
            return e.a(str, d2, false);
        }
        Double d3 = (Double) a(str);
        if (d3 != null) {
            j.a();
            return d3.doubleValue();
        }
        Double valueOf = Double.valueOf(getSettingsValueProvider().b(str, d2));
        j.a();
        return valueOf.doubleValue();
    }

    public final float a(String str, float f2) {
        if (j.a().c()) {
            e.a();
            return e.a(str, f2, false);
        }
        Float f3 = (Float) a(str);
        if (f3 != null) {
            j.a();
            return f3.floatValue();
        }
        Float valueOf = Float.valueOf(getSettingsValueProvider().b(str, f2));
        j.a();
        return valueOf.floatValue();
    }

    public final int a(String str, int i2) {
        if (j.a().c()) {
            e.a();
            return e.a(str, i2, false);
        }
        Integer num = (Integer) a(str);
        if (num != null) {
            j.a();
            return num.intValue();
        }
        Integer valueOf = Integer.valueOf(getSettingsValueProvider().c(str, i2));
        j.a();
        return valueOf.intValue();
    }

    public final long a(String str, long j2) {
        if (j.a().c()) {
            e.a();
            return e.a(str, j2, false);
        }
        Long l2 = (Long) a(str);
        if (l2 != null) {
            j.a();
            return l2.longValue();
        }
        Long valueOf = Long.valueOf(getSettingsValueProvider().b(str, j2));
        j.a();
        return valueOf.longValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T a(String str, Class cls, Object obj) {
        try {
            T t = (T) a(str, cls);
            return (t != null || this.f31787a.c(str)) ? t : obj;
        } catch (Throwable unused) {
            return obj;
        }
    }
}
