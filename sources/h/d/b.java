package h.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f158680a;

    private static final int a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int a2 = p.a((CharSequence) property, '.', 0, false, 6);
        if (a2 < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        } else {
            int i2 = a2 + 1;
            int a3 = p.a((CharSequence) property, '.', i2, false, 4);
            if (a3 < 0) {
                a3 = property.length();
            }
            Objects.requireNonNull(property, "null cannot be cast to non-null type java.lang.String");
            String substring = property.substring(0, a2);
            l.b(substring, "");
            Objects.requireNonNull(property, "null cannot be cast to non-null type java.lang.String");
            String substring2 = property.substring(i2, a3);
            l.b(substring2, "");
            try {
                return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
            } catch (NumberFormatException unused2) {
                return 65542;
            }
        }
    }

    static {
        a aVar;
        Object newInstance;
        Object newInstance2;
        Covode.recordClassIndex(105144);
        int a2 = a();
        if (a2 >= 65544) {
            try {
                Object newInstance3 = Class.forName("h.d.b.a").newInstance();
                l.b(newInstance3, "");
                if (newInstance3 != null) {
                    try {
                        aVar = (a) newInstance3;
                        f158680a = aVar;
                    } catch (ClassCastException e2) {
                        ClassLoader classLoader = newInstance3.getClass().getClassLoader();
                        Throwable initCause = new ClassCastException("Instance classloader: " + classLoader + ", base type classloader: " + a.class.getClassLoader()).initCause(e2);
                        l.b(initCause, "");
                        throw initCause;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                }
            } catch (ClassNotFoundException unused) {
                try {
                    newInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    l.b(newInstance2, "");
                    if (newInstance2 != null) {
                        aVar = (a) newInstance2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused2) {
                }
            } catch (ClassCastException e3) {
                ClassLoader classLoader2 = newInstance2.getClass().getClassLoader();
                Throwable initCause2 = new ClassCastException("Instance classloader: " + classLoader2 + ", base type classloader: " + a.class.getClassLoader()).initCause(e3);
                l.b(initCause2, "");
                throw initCause2;
            }
        }
        if (a2 >= 65543) {
            try {
                Object newInstance4 = Class.forName("h.d.a.a").newInstance();
                l.b(newInstance4, "");
                if (newInstance4 != null) {
                    try {
                        aVar = (a) newInstance4;
                        f158680a = aVar;
                    } catch (ClassCastException e4) {
                        ClassLoader classLoader3 = newInstance4.getClass().getClassLoader();
                        Throwable initCause3 = new ClassCastException("Instance classloader: " + classLoader3 + ", base type classloader: " + a.class.getClassLoader()).initCause(e4);
                        l.b(initCause3, "");
                        throw initCause3;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                }
            } catch (ClassNotFoundException unused3) {
                try {
                    newInstance = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    l.b(newInstance, "");
                    if (newInstance != null) {
                        aVar = (a) newInstance;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused4) {
                }
            } catch (ClassCastException e5) {
                ClassLoader classLoader4 = newInstance.getClass().getClassLoader();
                Throwable initCause4 = new ClassCastException("Instance classloader: " + classLoader4 + ", base type classloader: " + a.class.getClassLoader()).initCause(e5);
                l.b(initCause4, "");
                throw initCause4;
            }
        }
        aVar = new a();
        f158680a = aVar;
    }
}
