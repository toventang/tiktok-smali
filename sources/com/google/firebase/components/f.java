package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f54319a;

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f54320b;

    public interface b<T> {
        static {
            Covode.recordClassIndex(33724);
        }

        List<String> a(T t);
    }

    static {
        Covode.recordClassIndex(33722);
    }

    public static class a implements b<Context> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<? extends Service> f54321a;

        static {
            Covode.recordClassIndex(33723);
        }

        private a(Class<? extends Service> cls) {
            this.f54321a = cls;
        }

        private Bundle a(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f54321a), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.firebase.components.f.b
        public final /* synthetic */ List a(Context context) {
            Bundle a2 = a(context);
            if (a2 == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : a2.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(a(a2, str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        public /* synthetic */ a(Class cls, byte b2) {
            this(cls);
        }

        private static Object a(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception | OutOfMemoryError unused) {
                return null;
            }
        }
    }

    public static List<h> a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                Class<?> cls = Class.forName(str);
                if (!h.class.isAssignableFrom(cls)) {
                    com.a.a("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"});
                } else {
                    arrayList.add(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException unused) {
                com.a.a("Class %s is not an found.", new Object[]{str});
            } catch (IllegalAccessException unused2) {
                com.a.a("Could not instantiate %s.", new Object[]{str});
            } catch (InstantiationException unused3) {
                com.a.a("Could not instantiate %s.", new Object[]{str});
            } catch (NoSuchMethodException unused4) {
                com.a.a("Could not instantiate %s", new Object[]{str});
            } catch (InvocationTargetException unused5) {
                com.a.a("Could not instantiate %s", new Object[]{str});
            }
        }
        return arrayList;
    }

    public f(T t, b<T> bVar) {
        this.f54319a = t;
        this.f54320b = bVar;
    }
}
