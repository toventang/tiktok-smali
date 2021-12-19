package com.ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public final class Binding<T> {
    Class<T> klass;
    ServiceManager serviceManager;
    ServiceProvider<T> serviceProvider;

    static {
        Covode.recordClassIndex(61345);
    }

    public final Binding<T> asSingleton() {
        Set<ServiceProvider<?>> set = this.serviceManager.classServiceProviderConcurrentHashMap.get(this.klass);
        ServiceProvider<T> serviceProvider2 = this.serviceProvider;
        if (!(serviceProvider2 instanceof SingletonProvider)) {
            set.remove(serviceProvider2);
            SingletonProvider singletonProvider = new SingletonProvider(this.serviceProvider);
            this.serviceProvider = singletonProvider;
            set.add(singletonProvider);
        }
        return this;
    }

    Binding(ServiceManager serviceManager2, Class<T> cls, ServiceProvider<T> serviceProvider2) {
        this.serviceManager = serviceManager2;
        this.klass = cls;
        this.serviceProvider = serviceProvider2;
        Set<ServiceProvider<?>> set = serviceManager2.classServiceProviderConcurrentHashMap.get(cls);
        if (set == null) {
            Set<ServiceProvider<?>> synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
            synchronizedSet.add(serviceProvider2);
            serviceManager2.classServiceProviderConcurrentHashMap.put(cls, synchronizedSet);
            return;
        }
        set.add(serviceProvider2);
    }
}
