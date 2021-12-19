package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import h.m.p;
import h.w;
import java.io.BufferedReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f159128a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(105656);
    }

    public static List<MainDispatcherFactory> a() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!h.f159129a) {
            return a(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 == null) {
                return arrayList;
            }
            arrayList.add(mainDispatcherFactory2);
            return arrayList;
        } catch (Throwable unused3) {
            return a(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    private static List<String> a(BufferedReader bufferedReader) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return n.k(linkedHashSet);
            }
            String str = p.b(readLine, "#", readLine);
            if (str != null) {
                String obj = p.b((CharSequence) str).toString();
                for (int i2 = 0; i2 < obj.length(); i2++) {
                    char charAt = obj.charAt(i2);
                    if (charAt != '.' && !Character.isJavaIdentifierPart(charAt)) {
                        throw new IllegalArgumentException("Illegal service provider class name: ".concat(String.valueOf(obj)).toString());
                    }
                }
                if (obj.length() > 0) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:78)
        */
    private static java.util.List<java.lang.String> a(java.net.URL r6) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.g.a(java.net.URL):java.util.List");
    }

    private static <S> List<S> a(Class<S> cls, ClassLoader classLoader) {
        try {
            ArrayList<URL> list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
            l.a((Object) list, "");
            ArrayList arrayList = new ArrayList();
            for (URL url : list) {
                n.a((Collection) arrayList, (Iterable) a(url));
            }
            Set<String> m2 = n.m(arrayList);
            if (!m2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(n.a(m2, 10));
                for (String str : m2) {
                    Class<?> cls2 = Class.forName(str, false, classLoader);
                    if (cls.isAssignableFrom(cls2)) {
                        arrayList2.add(cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
                    } else {
                        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
                    }
                }
                return arrayList2;
            }
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        } catch (Throwable unused) {
            return n.k(ServiceLoader.load(cls, classLoader));
        }
    }
}
