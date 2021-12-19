package com.google.gson.internal;

import com.bytedance.covode.number.Covode;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public abstract class l {
    static {
        Covode.recordClassIndex(34050);
    }

    public abstract <T> T a(Class<T> cls);

    public static l a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            final Object obj = declaredField.get(null);
            final Method method = cls.getMethod("allocateInstance", Class.class);
            return new l() {
                /* class com.google.gson.internal.l.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(34051);
                }

                @Override // com.google.gson.internal.l
                public final <T> T a(Class<T> cls) {
                    b(cls);
                    return (T) method.invoke(obj, cls);
                }
            };
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                final int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new l() {
                    /* class com.google.gson.internal.l.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(34052);
                    }

                    @Override // com.google.gson.internal.l
                    public final <T> T a(Class<T> cls) {
                        b(cls);
                        return (T) declaredMethod2.invoke(null, cls, Integer.valueOf(intValue));
                    }
                };
            } catch (Exception unused2) {
                try {
                    final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new l() {
                        /* class com.google.gson.internal.l.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(34053);
                        }

                        @Override // com.google.gson.internal.l
                        public final <T> T a(Class<T> cls) {
                            b(cls);
                            return (T) declaredMethod3.invoke(null, cls, Object.class);
                        }
                    };
                } catch (Exception unused3) {
                    return new l() {
                        /* class com.google.gson.internal.l.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(34054);
                        }

                        @Override // com.google.gson.internal.l
                        public final <T> T a(Class<T> cls) {
                            throw new UnsupportedOperationException("Cannot allocate ".concat(String.valueOf(cls)));
                        }
                    };
                }
            }
        }
    }

    static void b(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }
}
