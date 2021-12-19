package org.greenrobot.eventbus;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.b.b;

/* access modifiers changed from: package-private */
public class u {

    /* renamed from: a  reason: collision with root package name */
    static final Map<Class<?>, List<t>> f159833a = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    private static final a[] f159834f = new a[4];

    /* renamed from: b  reason: collision with root package name */
    final boolean f159835b;

    /* renamed from: c  reason: collision with root package name */
    final EventBus f159836c;

    /* renamed from: d  reason: collision with root package name */
    private List<b> f159837d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f159838e;

    static {
        Covode.recordClassIndex(106493);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final List<t> f159839a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        final Map<Class, Object> f159840b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        final Map<String, Class> f159841c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        final StringBuilder f159842d = new StringBuilder(128);

        /* renamed from: e  reason: collision with root package name */
        Class<?> f159843e;

        /* renamed from: f  reason: collision with root package name */
        Class<?> f159844f;

        /* renamed from: g  reason: collision with root package name */
        boolean f159845g;

        /* renamed from: h  reason: collision with root package name */
        org.greenrobot.eventbus.b.a f159846h;

        static {
            Covode.recordClassIndex(106494);
        }

        a() {
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (!this.f159845g) {
                Class<? super Object> superclass = this.f159844f.getSuperclass();
                this.f159844f = superclass;
                String name = superclass.getName();
                if (!name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("android.") && !name.startsWith("androidx.")) {
                    return;
                }
            }
            this.f159844f = null;
        }

        /* access modifiers changed from: package-private */
        public final void a(Class<?> cls) {
            this.f159844f = cls;
            this.f159843e = cls;
            this.f159845g = false;
            this.f159846h = null;
        }

        private boolean b(Method method, Class<?> cls) {
            this.f159842d.setLength(0);
            this.f159842d.append(method.getName());
            this.f159842d.append('>').append(cls.getName());
            String sb = this.f159842d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.f159841c.put(sb, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f159841c.put(sb, put);
            return false;
        }

        /* access modifiers changed from: package-private */
        public final boolean a(Method method, Class<?> cls) {
            Object put = this.f159840b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (b((Method) put, cls)) {
                    this.f159840b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return b(method, cls);
        }
    }

    private static a a() {
        MethodCollector.i(5658);
        synchronized (f159834f) {
            int i2 = 0;
            while (true) {
                try {
                    a[] aVarArr = f159834f;
                    a aVar = aVarArr[i2];
                    if (aVar != null) {
                        aVarArr[i2] = null;
                        return aVar;
                    }
                    i2++;
                    if (i2 >= 4) {
                        a aVar2 = new a();
                        MethodCollector.o(5658);
                        return aVar2;
                    }
                } finally {
                    MethodCollector.o(5658);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final List<t> b(Class<?> cls) {
        a a2 = a();
        a2.a(cls);
        while (a2.f159844f != null) {
            b(a2);
            a2.a();
        }
        return a(a2);
    }

    private static List<t> a(a aVar) {
        MethodCollector.i(5656);
        ArrayList arrayList = new ArrayList(aVar.f159839a);
        aVar.f159839a.clear();
        aVar.f159840b.clear();
        aVar.f159841c.clear();
        int i2 = 0;
        aVar.f159842d.setLength(0);
        aVar.f159843e = null;
        aVar.f159844f = null;
        aVar.f159845g = false;
        aVar.f159846h = null;
        synchronized (f159834f) {
            while (true) {
                if (i2 >= 4) {
                    break;
                }
                try {
                    a[] aVarArr = f159834f;
                    if (aVarArr[i2] == null) {
                        aVarArr[i2] = aVar;
                        break;
                    }
                    i2++;
                } catch (Throwable th) {
                    MethodCollector.o(5656);
                    throw th;
                }
            }
        }
        MethodCollector.o(5656);
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r6.f159844f == r0.a()) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<org.greenrobot.eventbus.t> a(java.lang.Class<?> r8) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.u.a(java.lang.Class):java.util.List");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0008 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(org.greenrobot.eventbus.u.a r15) {
        /*
        // Method dump skipped, instructions count: 308
        */
        throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.u.b(org.greenrobot.eventbus.u$a):void");
    }

    u(EventBus eventBus, List<b> list, boolean z, boolean z2) {
        this.f159837d = list;
        this.f159838e = z;
        this.f159835b = z2;
        this.f159836c = eventBus;
    }
}
