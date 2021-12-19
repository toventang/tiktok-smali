package com.lynx.tasm.behavior.utils;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.n;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.v;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class, Map<String, j>> f56454a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, j> f56455b = new androidx.c.a();

    /* access modifiers changed from: package-private */
    public static abstract class j {

        /* renamed from: e  reason: collision with root package name */
        private static final Object[] f56460e = new Object[1];

        /* renamed from: f  reason: collision with root package name */
        private static final Object[] f56461f = new Object[2];

        /* renamed from: g  reason: collision with root package name */
        private static final Object[] f56462g = new Object[1];

        /* renamed from: h  reason: collision with root package name */
        private static final Object[] f56463h = new Object[2];

        /* renamed from: a  reason: collision with root package name */
        public final String f56464a;

        /* renamed from: b  reason: collision with root package name */
        public final String f56465b;

        /* renamed from: c  reason: collision with root package name */
        protected final Method f56466c;

        /* renamed from: d  reason: collision with root package name */
        protected final Integer f56467d;

        private static Object a(Method method, Object obj, Object[] objArr) {
            Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_lynx_tasm_behavior_utils_PropsSetterCache$PropSetter_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                return a2.second;
            }
            Object invoke = method.invoke(obj, objArr);
            com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_lynx_tasm_behavior_utils_PropsSetterCache$PropSetter_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        /* access modifiers changed from: protected */
        public abstract Object a(v vVar);

        static {
            Covode.recordClassIndex(35235);
        }

        public final void a(ShadowNode shadowNode, v vVar) {
            try {
                Integer num = this.f56467d;
                if (num == null) {
                    Object[] objArr = f56462g;
                    objArr[0] = a(vVar);
                    a(this.f56466c, shadowNode, objArr);
                    Arrays.fill(objArr, (Object) null);
                    return;
                }
                Object[] objArr2 = f56463h;
                objArr2[0] = num;
                objArr2[1] = a(vVar);
                a(this.f56466c, shadowNode, objArr2);
                Arrays.fill(objArr2, (Object) null);
            } catch (Throwable th) {
                throw new RuntimeException("Error while updating property '" + this.f56464a + "' in shadow node of type: " + shadowNode.e() + ":" + th.getMessage(), th);
            }
        }

        public final void a(LynxBaseUI lynxBaseUI, v vVar) {
            try {
                Integer num = this.f56467d;
                if (num == null) {
                    Object[] objArr = f56460e;
                    objArr[0] = a(vVar);
                    a(this.f56466c, lynxBaseUI, objArr);
                    Arrays.fill(objArr, (Object) null);
                    return;
                }
                Object[] objArr2 = f56461f;
                objArr2[0] = num;
                objArr2[1] = a(vVar);
                a(this.f56466c, lynxBaseUI, objArr2);
                Arrays.fill(objArr2, (Object) null);
            } catch (Throwable th) {
                throw new RuntimeException("Error while updating property '" + this.f56464a + "' in shadow node of type: " + lynxBaseUI.getClass() + ":" + th.getMessage(), th);
            }
        }

        private j(m mVar, String str, Method method) {
            this.f56464a = mVar.a();
            this.f56465b = !"__default_type__".equals(mVar.b()) ? mVar.b() : str;
            this.f56466c = method;
            this.f56467d = null;
        }

        /* synthetic */ j(m mVar, String str, Method method, byte b2) {
            this(mVar, str, method);
        }

        private j(n nVar, String str, Method method, int i2) {
            this.f56464a = nVar.a()[i2];
            this.f56465b = !"__default_type__".equals(nVar.b()) ? nVar.b() : str;
            this.f56466c = method;
            this.f56467d = Integer.valueOf(i2);
        }

        /* synthetic */ j(n nVar, String str, Method method, int i2, byte b2) {
            this(nVar, str, method, i2);
        }
    }

    static {
        Covode.recordClassIndex(35225);
    }

    /* access modifiers changed from: package-private */
    public static class a extends j {
        static {
            Covode.recordClassIndex(35226);
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.d.j
        public final Object a(v vVar) {
            return vVar.d(this.f56464a);
        }

        public a(m mVar, Method method) {
            super(mVar, "Array", method, (byte) 0);
        }

        public a(n nVar, Method method, int i2) {
            super(nVar, "Array", method, i2, (byte) 0);
        }
    }

    /* access modifiers changed from: package-private */
    public static class f extends j {
        static {
            Covode.recordClassIndex(35231);
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.d.j
        public final Object a(v vVar) {
            return vVar.f(this.f56464a);
        }

        public f(m mVar, Method method) {
            super(mVar, "mixed", method, (byte) 0);
        }

        public f(n nVar, Method method, int i2) {
            super(nVar, "mixed", method, i2, (byte) 0);
        }
    }

    /* access modifiers changed from: package-private */
    public static class i extends j {
        static {
            Covode.recordClassIndex(35234);
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.d.j
        public final Object a(v vVar) {
            return vVar.e(this.f56464a);
        }

        public i(m mVar, Method method) {
            super(mVar, "Map", method, (byte) 0);
        }
    }

    /* access modifiers changed from: package-private */
    public static class k extends j {
        static {
            Covode.recordClassIndex(35236);
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.d.j
        public final Object a(v vVar) {
            return vVar.c(this.f56464a);
        }

        public k(m mVar, Method method) {
            super(mVar, "String", method, (byte) 0);
        }

        public k(n nVar, Method method, int i2) {
            super(nVar, "String", method, i2, (byte) 0);
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends j {

        /* renamed from: e  reason: collision with root package name */
        private final boolean f56456e;

        static {
            Covode.recordClassIndex(35227);
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.d.j
        public final Object a(v vVar) {
            if (vVar.a(this.f56464a, this.f56456e)) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }

        public b(m mVar, Method method, boolean z) {
            super(mVar, "boolean", method, (byte) 0);
            this.f56456e = z;
        }
    }

    /* access modifiers changed from: package-private */
    public static class e extends j {

        /* renamed from: e  reason: collision with root package name */
        private final double f56457e;

        static {
            Covode.recordClassIndex(35230);
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.d.j
        public final Object a(v vVar) {
            return Double.valueOf(vVar.a(this.f56464a, this.f56457e));
        }

        public e(m mVar, Method method, double d2) {
            super(mVar, "number", method, (byte) 0);
            this.f56457e = d2;
        }

        public e(n nVar, Method method, int i2, double d2) {
            super(nVar, "number", method, i2, (byte) 0);
            this.f56457e = d2;
        }
    }

    /* access modifiers changed from: package-private */
    public static class g extends j {

        /* renamed from: e  reason: collision with root package name */
        private final float f56458e;

        static {
            Covode.recordClassIndex(35232);
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.d.j
        public final Object a(v vVar) {
            return Float.valueOf(vVar.a(this.f56464a, this.f56458e));
        }

        public g(m mVar, Method method, float f2) {
            super(mVar, "number", method, (byte) 0);
            this.f56458e = f2;
        }

        public g(n nVar, Method method, int i2, float f2) {
            super(nVar, "number", method, i2, (byte) 0);
            this.f56458e = f2;
        }
    }

    /* access modifiers changed from: package-private */
    public static class h extends j {

        /* renamed from: e  reason: collision with root package name */
        private final int f56459e;

        static {
            Covode.recordClassIndex(35233);
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.d.j
        public final Object a(v vVar) {
            return Integer.valueOf(vVar.a(this.f56464a, this.f56459e));
        }

        public h(m mVar, Method method, int i2) {
            super(mVar, "number", method, (byte) 0);
            this.f56459e = i2;
        }

        public h(n nVar, Method method, int i2, int i3) {
            super(nVar, "number", method, i2, (byte) 0);
            this.f56459e = i3;
        }
    }

    /* access modifiers changed from: package-private */
    public static class c extends j {
        static {
            Covode.recordClassIndex(35228);
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.d.j
        public final Object a(v vVar) {
            if (vVar.b(this.f56464a)) {
                return null;
            }
            if (vVar.a(this.f56464a, false)) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }

        public c(m mVar, Method method) {
            super(mVar, "boolean", method, (byte) 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.utils.d$d  reason: collision with other inner class name */
    public static class C1266d extends j {
        static {
            Covode.recordClassIndex(35229);
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.behavior.utils.d.j
        public final Object a(v vVar) {
            if (!vVar.b(this.f56464a)) {
                return Integer.valueOf(vVar.a(this.f56464a, 0));
            }
            return null;
        }

        public C1266d(m mVar, Method method) {
            super(mVar, "number", method, (byte) 0);
        }

        public C1266d(n nVar, Method method, int i2) {
            super(nVar, "number", method, i2, (byte) 0);
        }
    }

    static Map<String, j> b(Class<? extends ShadowNode> cls) {
        Class<? super Object> superclass;
        if (cls == null) {
            return f56455b;
        }
        Map<String, j> map = f56454a.get(cls);
        if (map != null) {
            return map;
        }
        androidx.c.a aVar = new androidx.c.a();
        if (cls == ShadowNode.class) {
            superclass = null;
        } else {
            superclass = cls.getSuperclass();
        }
        aVar.putAll(b(superclass));
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            m mVar = (m) method.getAnnotation(m.class);
            if (mVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    aVar.put(mVar.a(), a(mVar, method, parameterTypes[0]));
                } else {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
            }
            n nVar = (n) method.getAnnotation(n.class);
            if (nVar != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                } else if (parameterTypes2[0] == Integer.TYPE) {
                    a(nVar, method, parameterTypes2[1], aVar);
                } else {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
            }
        }
        f56454a.put(cls, aVar);
        return aVar;
    }

    static Map<String, j> a(Class<? extends LynxBaseUI> cls) {
        Class<? super Object> superclass;
        if (cls == null) {
            return f56455b;
        }
        Map<String, j> map = f56454a.get(cls);
        if (map != null) {
            return map;
        }
        androidx.c.a aVar = new androidx.c.a();
        if (cls == LynxBaseUI.class) {
            superclass = null;
        } else {
            superclass = cls.getSuperclass();
        }
        aVar.putAll(a(superclass));
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            m mVar = (m) method.getAnnotation(m.class);
            if (mVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    aVar.put(mVar.a(), a(mVar, method, parameterTypes[0]));
                } else {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
            }
            n nVar = (n) method.getAnnotation(n.class);
            if (nVar != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                } else if (parameterTypes2[0] == Integer.TYPE) {
                    a(nVar, method, parameterTypes2[1], aVar);
                } else {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
            }
        }
        f56454a.put(cls, aVar);
        return aVar;
    }

    private static j a(m mVar, Method method, Class<?> cls) {
        if (cls == com.lynx.react.bridge.a.class) {
            return new f(mVar, method);
        }
        if (cls == Boolean.TYPE) {
            return new b(mVar, method, mVar.f());
        }
        if (cls == Integer.TYPE) {
            return new h(mVar, method, mVar.e());
        }
        if (cls == Float.TYPE) {
            return new g(mVar, method, mVar.d());
        }
        if (cls == Double.TYPE) {
            return new e(mVar, method, mVar.c());
        }
        if (cls == String.class) {
            return new k(mVar, method);
        }
        if (cls == Boolean.class) {
            return new c(mVar, method);
        }
        if (cls == Integer.class) {
            return new C1266d(mVar, method);
        }
        if (cls == ReadableArray.class) {
            return new a(mVar, method);
        }
        if (cls == ReadableMap.class) {
            return new i(mVar, method);
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    private static void a(n nVar, Method method, Class<?> cls, Map<String, j> map) {
        String[] a2 = nVar.a();
        int i2 = 0;
        if (cls == com.lynx.react.bridge.a.class) {
            while (i2 < a2.length) {
                map.put(a2[i2], new f(nVar, method, i2));
                i2++;
            }
        } else if (cls == Integer.TYPE) {
            while (i2 < a2.length) {
                map.put(a2[i2], new h(nVar, method, i2, nVar.e()));
                i2++;
            }
        } else if (cls == Float.TYPE) {
            while (i2 < a2.length) {
                map.put(a2[i2], new g(nVar, method, i2, nVar.c()));
                i2++;
            }
        } else if (cls == Double.TYPE) {
            while (i2 < a2.length) {
                map.put(a2[i2], new e(nVar, method, i2, nVar.d()));
                i2++;
            }
        } else if (cls == Integer.class) {
            while (i2 < a2.length) {
                map.put(a2[i2], new C1266d(nVar, method, i2));
                i2++;
            }
        } else if (cls == String.class) {
            while (i2 < a2.length) {
                map.put(a2[i2], new k(nVar, method, i2));
                i2++;
            }
        } else if (cls == ReadableArray.class) {
            while (i2 < a2.length) {
                map.put(a2[i2], new a(nVar, method, i2));
                i2++;
            }
        } else {
            throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
        }
    }
}
