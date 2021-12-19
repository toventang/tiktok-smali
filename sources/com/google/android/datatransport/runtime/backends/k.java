package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class k implements e {

    /* renamed from: a  reason: collision with root package name */
    private final a f49417a;

    /* renamed from: b  reason: collision with root package name */
    private final i f49418b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, m> f49419c;

    static {
        Covode.recordClassIndex(30923);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f49420a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, String> f49421b;

        static {
            Covode.recordClassIndex(30924);
        }

        a(Context context) {
            this.f49420a = context;
        }

        private static Bundle a(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public final d a(String str) {
            Map<String, String> hashMap;
            if (this.f49421b == null) {
                Bundle a2 = a(this.f49420a);
                if (a2 == null) {
                    hashMap = Collections.emptyMap();
                } else {
                    hashMap = new HashMap<>();
                    for (String str2 : a2.keySet()) {
                        Object a3 = a(a2, str2);
                        if ((a3 instanceof String) && str2.startsWith("backend:")) {
                            String[] split = ((String) a3).split(",", -1);
                            for (String str3 : split) {
                                String trim = str3.trim();
                                if (!trim.isEmpty()) {
                                    hashMap.put(trim, str2.substring(8));
                                }
                            }
                        }
                    }
                }
                this.f49421b = hashMap;
            }
            String str4 = this.f49421b.get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str4).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                com.a.a("Class %s is not found.", new Object[]{str4});
                return null;
            } catch (IllegalAccessException unused2) {
                com.a.a("Could not instantiate %s.", new Object[]{str4});
                return null;
            } catch (InstantiationException unused3) {
                com.a.a("Could not instantiate %s.", new Object[]{str4});
                return null;
            } catch (NoSuchMethodException unused4) {
                com.a.a("Could not instantiate %s", new Object[]{str4});
                return null;
            } catch (InvocationTargetException unused5) {
                com.a.a("Could not instantiate %s", new Object[]{str4});
                return null;
            }
        }

        private static Object a(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception | OutOfMemoryError unused) {
                return null;
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.e
    public final synchronized m a(String str) {
        MethodCollector.i(3994);
        if (this.f49419c.containsKey(str)) {
            m mVar = this.f49419c.get(str);
            MethodCollector.o(3994);
            return mVar;
        }
        d a2 = this.f49417a.a(str);
        if (a2 == null) {
            MethodCollector.o(3994);
            return null;
        }
        i iVar = this.f49418b;
        m create = a2.create(new c(iVar.f49411a, iVar.f49412b, iVar.f49413c, str));
        this.f49419c.put(str, create);
        MethodCollector.o(3994);
        return create;
    }

    k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    private k(a aVar, i iVar) {
        this.f49419c = new HashMap();
        this.f49417a = aVar;
        this.f49418b = iVar;
    }
}
