package com.google.android.gms.internal.measurement;

import com.a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.fy;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
public abstract class gl<T extends fy> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f50935a = Logger.getLogger(ft.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static String f50936b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* access modifiers changed from: protected */
    public abstract T a();

    gl() {
    }

    static {
        Covode.recordClassIndex(31819);
    }

    static <T extends fy> T a(Class<T> cls) {
        String str;
        String str2;
        ClassLoader classLoader = gl.class.getClassLoader();
        if (cls.equals(fy.class)) {
            str = f50936b;
        } else if (cls.getPackage().equals(gl.class.getPackage())) {
            str = a.a("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                return cls.cast(((gl) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException(e2);
            } catch (InstantiationException e3) {
                throw new IllegalStateException(e3);
            } catch (IllegalAccessException e4) {
                throw new IllegalStateException(e4);
            } catch (InvocationTargetException e5) {
                throw new IllegalStateException(e5);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(gl.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((gl) it.next()).a()));
                } catch (ServiceConfigurationError e6) {
                    Logger logger = f50935a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(cls.getSimpleName());
                    if (valueOf.length() != 0) {
                        str2 = "Unable to load ".concat(valueOf);
                    } else {
                        str2 = new String("Unable to load ");
                    }
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", str2, (Throwable) e6);
                }
            }
            if (arrayList.size() == 1) {
                return (T) ((fy) arrayList.get(0));
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) ((fy) cls.getMethod("combine", Collection.class).invoke(null, arrayList));
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (IllegalAccessException e8) {
                throw new IllegalStateException(e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException(e9);
            }
        }
    }
}
