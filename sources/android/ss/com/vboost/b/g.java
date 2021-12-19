package android.ss.com.vboost.b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Method;

public class g {

    /* renamed from: a  reason: collision with root package name */
    static boolean f423a;

    /* renamed from: b  reason: collision with root package name */
    private static Class<?> f424b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f425c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f426d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f427e;

    /* renamed from: f  reason: collision with root package name */
    private static Method f428f;

    /* renamed from: g  reason: collision with root package name */
    private static Method f429g;

    /* renamed from: h  reason: collision with root package name */
    private static Method f430h;

    /* renamed from: i  reason: collision with root package name */
    private Object f431i;

    static {
        Covode.recordClassIndex(21);
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "android_ss_com_vboost_hardware_MTKPerfService_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "android_ss_com_vboost_hardware_MTKPerfService_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        try {
            Method method = f426d;
            if (method != null) {
                return ((Integer) a(method, this.f431i, new Object[0])).intValue();
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        try {
            Method method = f430h;
            if (method != null) {
                a(method, this.f431i, new Object[]{Integer.valueOf(i2)});
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(int i2) {
        try {
            Method method = f425c;
            if (method == null) {
                return -1;
            }
            return ((Integer) a(method, this.f431i, new Object[]{Integer.valueOf(i2)})).intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r7.f431i = android.ss.com.vboost.e.b.a(android.ss.com.vboost.b.g.f424b, new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x00ac */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    g(android.content.Context r8) {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: android.ss.com.vboost.b.g.<init>(android.content.Context):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        try {
            Method method = f429g;
            if (method != null) {
                a(method, this.f431i, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)});
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, int i4, int i5) {
        try {
            Method method = f427e;
            if (method != null) {
                a(method, this.f431i, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), -1, -1});
            }
        } catch (Exception unused) {
        }
    }
}
