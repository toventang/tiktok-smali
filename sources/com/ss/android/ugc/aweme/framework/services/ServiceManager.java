package com.ss.android.ugc.aweme.framework.services;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class ServiceManager {
    final ConcurrentHashMap<Class<?>, Set<ServiceProvider<?>>> classServiceProviderConcurrentHashMap;
    public volatile boolean enableDynamicProxyDefault;
    final Map<Class<?>, Map<String, ServiceProvider<?>>> groupServiceProviderConcurrentHashMap;
    final Set<Class<?>> resolvedClasses;

    /* renamed from: com.ss.android.ugc.aweme.framework.services.ServiceManager$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(61366);
        }
    }

    static {
        Covode.recordClassIndex(61365);
    }

    /* access modifiers changed from: package-private */
    public static final class Holder {
        public static final ServiceManager INSTANCE = new ServiceManager(null);

        private Holder() {
        }

        static {
            Covode.recordClassIndex(61367);
        }
    }

    public static ServiceManager get() {
        return Holder.INSTANCE;
    }

    public final Map<Class<?>, Map<String, ServiceProvider<?>>> getGroupServiceProviderMap() {
        return this.groupServiceProviderConcurrentHashMap;
    }

    public final ConcurrentHashMap getServiceProviderMap() {
        return this.classServiceProviderConcurrentHashMap;
    }

    private ServiceManager() {
        this.classServiceProviderConcurrentHashMap = new ConcurrentHashMap<>();
        this.groupServiceProviderConcurrentHashMap = Collections.synchronizedMap(new HashMap());
        this.enableDynamicProxyDefault = true;
        this.resolvedClasses = Collections.synchronizedSet(new HashSet());
    }

    /* synthetic */ ServiceManager(AnonymousClass1 r1) {
        this();
    }

    public final void setDynamicProxyEnableDefault(boolean z) {
        this.enableDynamicProxyDefault = z;
    }

    private void markResolved(Class cls) {
        this.resolvedClasses.add(cls);
    }

    public final boolean downgradeComponent(String str) {
        return downgradeComponent(str, false);
    }

    public final <T> T getService(Class<T> cls) {
        return (T) getService(cls, false);
    }

    public final <T> Set<T> getServices(Class<T> cls) {
        return getServices(cls, false);
    }

    public final <T> T getServiceForReal(Class<T> cls) {
        return (T) getService(cls, false, this.enableDynamicProxyDefault, true);
    }

    public final <T> Binding bind(Class<T> cls, ServiceProvider<T> serviceProvider) {
        return new Binding(this, cls, serviceProvider);
    }

    public final <T> void bindDowngradeImpl(Class<T> cls, ServiceProvider<T> serviceProvider) {
        bindDowngradeImpl(cls, serviceProvider, true);
    }

    public final <T> T getService(Class<T> cls, boolean z) {
        return (T) getService(cls, z, this.enableDynamicProxyDefault);
    }

    public final <T> T getServiceByGroup(Class<T> cls, String str) {
        Map<String, ServiceProvider<?>> map = this.groupServiceProviderConcurrentHashMap.get(cls);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (T) map.get(str).get();
    }

    public final boolean downgradeComponent(String str, boolean z) {
        if (!z) {
            Map<String, String> map = DowngradeImplManager.getInstance().componentsMap;
            for (String str2 : map.keySet()) {
                if (this.resolvedClasses.contains(str2) && TextUtils.equals(map.get(str2), str)) {
                    return false;
                }
            }
        }
        DowngradeImplManager.getInstance().downgradeComponent(str);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Set<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> Set<T> getServices(Class<T> cls, boolean z) {
        Set<T> staticServiceImplSet;
        Set<ServiceProvider<?>> set = this.classServiceProviderConcurrentHashMap.get(cls);
        if (set == null || set.isEmpty()) {
            Set<T> staticServiceImplSet2 = StaticServiceImplManager.getInstance().getStaticServiceImplSet(cls);
            if (staticServiceImplSet2 == null || staticServiceImplSet2.isEmpty()) {
                return Collections.synchronizedSet(new LinkedHashSet());
            }
            return staticServiceImplSet2;
        }
        Set<T> set2 = (Set<T>) Collections.synchronizedSet(new LinkedHashSet());
        for (ServiceProvider<?> serviceProvider : set) {
            set2.add(serviceProvider.get());
        }
        if (z && (staticServiceImplSet = StaticServiceImplManager.getInstance().getStaticServiceImplSet(cls)) != null && !staticServiceImplSet.isEmpty()) {
            set2.addAll(staticServiceImplSet);
        }
        return set2;
    }

    public final <T> GroupBinding bind(Class<T> cls, String str, ServiceProvider<T> serviceProvider) {
        return new GroupBinding(this.groupServiceProviderConcurrentHashMap, cls, str, serviceProvider);
    }

    public final <T> void bindDowngradeImpl(Class<T> cls, ServiceProvider<T> serviceProvider, boolean z) {
        if (z) {
            serviceProvider = new SingletonProvider(serviceProvider);
        }
        DowngradeImplManager.getInstance().bindDowngradeImpl(cls, serviceProvider);
    }

    public final <T> T getService(Class<T> cls, boolean z, boolean z2) {
        return (T) getService(cls, z, z2, false);
    }

    public final <T> T getService(Class<T> cls, boolean z, boolean z2, boolean z3) {
        boolean z4;
        T t;
        if (z3 || !DowngradeImplManager.getInstance().isServiceForceDowngrade(cls)) {
            z4 = false;
        } else {
            T t2 = (T) DowngradeImplManager.getInstance().getDowngradeImpl(cls);
            if (t2 != null) {
                return t2;
            }
            z4 = true;
        }
        Set<ServiceProvider<?>> set = this.classServiceProviderConcurrentHashMap.get(cls);
        if (set == null || set.isEmpty() || z || (t = (T) ((ServiceProvider) set.toArray()[0]).get()) == null) {
            T t3 = (T) StaticServiceImplManager.getInstance().getStaticServiceImpl(cls);
            if (t3 != null) {
                markResolved(cls);
                return t3;
            } else if (z3) {
                return null;
            } else {
                if (!z4 && (t3 = (T) DowngradeImplManager.getInstance().getDowngradeImpl(cls)) != null) {
                    return t3;
                }
                if (!z2) {
                    return t3;
                }
                new DynamicProxy();
                return (T) DynamicProxy.get(cls);
            }
        } else {
            markResolved(cls);
            return t;
        }
    }
}
