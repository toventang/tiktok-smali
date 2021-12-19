package com.lynx.jsbridge;

import androidx.c.a;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import com.lynx.tasm.base.c;
import java.lang.reflect.Method;

public class e {

    /* renamed from: b  reason: collision with root package name */
    private static a<Class, Character> f55511b;

    /* renamed from: a  reason: collision with root package name */
    public final Method f55512a;

    /* renamed from: c  reason: collision with root package name */
    private final Class[] f55513c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f55514d;

    /* renamed from: e  reason: collision with root package name */
    private String f55515e;

    static {
        Covode.recordClassIndex(34760);
    }

    public final String a() {
        boolean z;
        if (!this.f55514d) {
            this.f55514d = true;
            Method method = this.f55512a;
            Class[] clsArr = this.f55513c;
            StringBuilder sb = new StringBuilder(clsArr.length + 2);
            Class<?> returnType = method.getReturnType();
            char a2 = a(returnType);
            if (a2 == 0) {
                if (returnType == Void.TYPE) {
                    a2 = 'v';
                } else if (returnType == WritableMap.class) {
                    a2 = 'M';
                } else if (returnType == WritableArray.class) {
                    a2 = 'A';
                } else if (returnType == byte[].class) {
                    a2 = 'a';
                } else {
                    throw new RuntimeException("Got unknown return class: " + returnType.getSimpleName());
                }
            }
            sb.append(a2);
            sb.append('.');
            for (int i2 = 0; i2 < clsArr.length; i2++) {
                Class cls = clsArr[i2];
                if (cls == Promise.class) {
                    if (i2 == clsArr.length - 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c.a(z, "Promise must be used as last parameter only");
                }
                char a3 = a(cls);
                if (a3 == 0) {
                    if (cls == Callback.class) {
                        a3 = 'X';
                    } else if (cls == Promise.class) {
                        a3 = 'P';
                    } else if (cls == ReadableMap.class) {
                        a3 = 'M';
                    } else if (cls == ReadableArray.class) {
                        a3 = 'A';
                    } else if (cls == com.lynx.react.bridge.a.class) {
                        a3 = 'Y';
                    } else if (cls == byte[].class) {
                        a3 = 'a';
                    } else {
                        throw new RuntimeException("Got unknown param class: " + cls.getSimpleName());
                    }
                }
                sb.append(a3);
            }
            this.f55515e = sb.toString();
        }
        return (String) c.a(this.f55515e);
    }

    e(Method method) {
        this.f55512a = method;
        method.setAccessible(true);
        this.f55513c = method.getParameterTypes();
    }

    private static char a(Class cls) {
        if (f55511b == null) {
            a<Class, Character> aVar = new a<>();
            f55511b = aVar;
            aVar.put(Byte.TYPE, 'b');
            f55511b.put(Byte.class, 'B');
            f55511b.put(Short.TYPE, 's');
            f55511b.put(Short.class, 'S');
            f55511b.put(Long.TYPE, 'l');
            f55511b.put(Long.class, 'L');
            f55511b.put(Character.TYPE, 'c');
            f55511b.put(Character.class, 'C');
            f55511b.put(Boolean.TYPE, 'z');
            f55511b.put(Boolean.class, 'Z');
            f55511b.put(Integer.TYPE, 'i');
            f55511b.put(Integer.class, 'I');
            f55511b.put(Double.TYPE, 'd');
            f55511b.put(Double.class, 'D');
            f55511b.put(Float.TYPE, 'f');
            f55511b.put(Float.class, 'F');
            f55511b.put(String.class, 'T');
        }
        if (f55511b.containsKey(cls)) {
            return f55511b.get(cls).charValue();
        }
        return 0;
    }
}
