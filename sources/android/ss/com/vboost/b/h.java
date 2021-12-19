package android.ss.com.vboost.b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Method;
import java.util.Arrays;

class h {

    /* renamed from: a  reason: collision with root package name */
    static boolean f432a;

    /* renamed from: b  reason: collision with root package name */
    private static Class<?> f433b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f434c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f435d;

    /* renamed from: e  reason: collision with root package name */
    private Object f436e;

    static {
        Covode.recordClassIndex(22);
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "android_ss_com_vboost_hardware_QcomBoostFramework_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "android_ss_com_vboost_hardware_QcomBoostFramework_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        try {
            Method method = f435d;
            if (method != null) {
                return ((Integer) a(method, this.f436e, new Object[0])).intValue();
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r6.f436e = android.ss.com.vboost.e.b.a(android.ss.com.vboost.b.h.f433b, new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    h(android.content.Context r7) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: android.ss.com.vboost.b.h.<init>(android.content.Context):void");
    }

    /* access modifiers changed from: package-private */
    public final int a(int i2, int... iArr) {
        try {
            Method method = f434c;
            if (method == null) {
                return -1;
            }
            int intValue = ((Integer) a(method, this.f436e, new Object[]{Integer.valueOf(i2), iArr})).intValue();
            Arrays.toString(iArr);
            return intValue;
        } catch (Exception unused) {
            return -1;
        }
    }
}
