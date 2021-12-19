package com.bytedance.helios.sdk;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.d.d;
import com.bytedance.helios.sdk.g.b;
import com.bytedance.helios.sdk.utils.f;
import com.bytedance.helios.sdk.utils.i;
import h.a.n;
import h.f.b.l;
import h.w;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30728a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final HashSet<String> f30729b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private static final ArrayList<Integer> f30730c = n.d(102701, 102700, 102800, 102801);

    private a() {
    }

    private static boolean a(int i2) {
        return (HeliosEnvImpl.INSTANCE.isEnabled() && b.a(i2)) || f30730c.contains(Integer.valueOf(i2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.helios.sdk.a$a  reason: collision with other inner class name */
    public static final class RunnableC0643a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f30731a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f30732b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f30733c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object[] f30734d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f30735e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f30736f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f30737g;

        static {
            Covode.recordClassIndex(17869);
        }

        RunnableC0643a(int i2, Object obj, Object obj2, Object[] objArr, long j2, boolean z, String str) {
            this.f30731a = i2;
            this.f30732b = obj;
            this.f30733c = obj2;
            this.f30734d = objArr;
            this.f30735e = j2;
            this.f30736f = z;
            this.f30737g = str;
        }

        public final void run() {
            com.bytedance.helios.sdk.d.b a2 = e.a(this.f30731a);
            if (a2 != null) {
                a2.a(this.f30732b, this.f30733c, this.f30734d, this.f30731a, this.f30735e, this.f30736f, this.f30737g);
            }
        }
    }

    static {
        Covode.recordClassIndex(17868);
    }

    private static Integer a(Integer num) {
        if (num == null) {
            return num;
        }
        if (num.intValue() == 100106) {
            return 100101;
        }
        if (num.intValue() == 100205) {
            return 100201;
        }
        if (num.intValue() == 100404) {
            return 100401;
        }
        if (num.intValue() == 100405) {
            return 100403;
        }
        return num;
    }

    private static void a(String str, Runnable runnable) {
        if (str != null && str.length() != 0) {
            HashSet<String> hashSet = f30729b;
            if (!hashSet.contains(str)) {
                hashSet.add(str);
                runnable.run();
                hashSet.remove(str);
            }
        }
    }

    public static final void a(Object obj, Object obj2, Object[] objArr, String str) {
        String name;
        Integer num;
        Method method = (Method) obj2;
        if (method != null) {
            Class<?> declaringClass = method.getDeclaringClass();
            l.a((Object) declaringClass, "");
            String name2 = declaringClass.getName();
            if (name2 != null && name2.length() != 0 && (name = method.getName()) != null && name.length() != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                String str2 = name2 + '.' + name;
                HashMap<String, Integer> hashMap = i.f31017a;
                if (hashMap != null) {
                    num = hashMap.get(str2);
                } else {
                    num = null;
                }
                Integer a2 = a(num);
                if (a2 != null) {
                    int intValue = a2.intValue();
                    f.a("Helios-Log-Monitor-Ability-Api-Call", "actionInvokeReflection id=" + intValue + " calledTime=" + currentTimeMillis + " proxyMethodKey=" + str, (String) null, 12);
                    if (!a(intValue)) {
                        f.a("Helios-Log-Monitor-Ability-Api-Call", "triggerAction: not enabled, return id=" + intValue + " calledTime=" + currentTimeMillis, (String) null, 12);
                        return;
                    }
                    Class<?> cls = objArr[0];
                    if (cls == null) {
                        cls = method.getDeclaringClass();
                    }
                    a(obj, cls, h.a.i.a(objArr, 2), intValue, str, currentTimeMillis, true);
                }
                com.bytedance.helios.sdk.c.f.a("actionInvokeReflection", currentTimeMillis);
            }
        }
    }

    public static final void a(Object obj, Object[] objArr, int i2, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!a(i2)) {
            f.a("Helios-Log-Monitor-Ability-Api-Call", "triggerAction: not enabled, return id=" + i2 + " calledTime=" + currentTimeMillis, (String) null, 12);
            return;
        }
        f.a("Helios-Log-Monitor-Ability-Api-Call", "actionInvokeInsert id=" + i2 + " calledTime=" + currentTimeMillis + " proxyMethodKey=" + str, (String) null, 12);
        a((Object) null, obj, objArr, i2, str, currentTimeMillis, false);
        com.bytedance.helios.sdk.c.f.a("actionInvokeInsert", currentTimeMillis);
    }

    public static final void a(Object obj, Object obj2, Object[] objArr, int i2, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!a(i2)) {
            f.a("Helios-Log-Monitor-Ability-Api-Call", "triggerAction: not enabled, return id=" + i2 + " calledTime=" + currentTimeMillis, (String) null, 12);
            return;
        }
        f.a("Helios-Log-Monitor-Ability-Api-Call", "actionInvoke id=" + i2 + " calledTime=" + currentTimeMillis + " proxyMethodKey=" + str, (String) null, 12);
        a(obj, obj2, objArr, i2, str, currentTimeMillis, false);
        com.bytedance.helios.sdk.c.f.a("actionInvoke", currentTimeMillis);
    }

    public static final Pair<Boolean, Object> a(Object obj, Object[] objArr, int i2, String str, boolean z, String str2) {
        if (!HeliosEnvImpl.INSTANCE.isEnabled()) {
            return new Pair<>(false, null);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long currentTimeMillis2 = System.currentTimeMillis();
        Pair<Boolean, Object> a2 = a(obj, objArr, i2, str, z, currentTimeMillis, str2);
        com.bytedance.helios.sdk.c.f.a("actionIntercept", currentTimeMillis2);
        return a2;
    }

    private static void a(Object obj, Object obj2, Object[] objArr, int i2, String str, long j2, boolean z) {
        a(str, new RunnableC0643a(i2, obj, obj2, objArr, j2, z, str));
    }

    private static Pair<Boolean, Object> a(Object obj, Object[] objArr, int i2, String str, boolean z, long j2, String str2) {
        Integer num;
        Object[] objArr2;
        if (!z) {
            return com.bytedance.helios.sdk.f.b.a.a(new d(obj, objArr, i2, j2, false, str, (String) null, (String) null, 384));
        }
        StringBuilder sb = new StringBuilder();
        if (obj != null) {
            Method method = (Method) obj;
            Class<?> declaringClass = method.getDeclaringClass();
            String str3 = "";
            l.a((Object) declaringClass, str3);
            String sb2 = sb.append(declaringClass.getName()).append('.').append(method.getName()).toString();
            HashMap<String, Integer> hashMap = i.f31017a;
            Class<?> cls = null;
            if (hashMap != null) {
                num = hashMap.get(sb2);
            } else {
                num = null;
            }
            Integer a2 = a(num);
            if (a2 == null) {
                return new Pair<>(false, null);
            }
            int intValue = a2.intValue();
            if (objArr == null || objArr.length == 0) {
                objArr2 = null;
            } else {
                cls = objArr[0];
                if (cls == null) {
                    cls = method.getDeclaringClass();
                }
                objArr2 = h.a.i.a(objArr, objArr.length);
            }
            Class<?> returnType = method.getReturnType();
            l.a((Object) returnType, str3);
            String canonicalName = returnType.getCanonicalName();
            if (str2 != null) {
                str3 = str2;
            }
            return com.bytedance.helios.sdk.f.b.a.a(new d(cls, objArr2, intValue, j2, z, canonicalName, str3, (String) null, 256));
        }
        throw new w("null cannot be cast to non-null type");
    }
}
