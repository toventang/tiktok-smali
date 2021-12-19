package com.ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class GroupBinding<T> {
    Map<Class<?>, Map<String, ServiceProvider<?>>> classProviderMaps;
    String groupName;
    Class<T> klass;
    ServiceProvider<T> serviceProvider;

    static {
        Covode.recordClassIndex(61354);
    }

    public final GroupBinding<T> asSingleton() {
        if (!(this.serviceProvider instanceof SingletonProvider)) {
            Map<String, ServiceProvider<?>> map = this.classProviderMaps.get(this.klass);
            map.remove(this.serviceProvider);
            SingletonProvider singletonProvider = new SingletonProvider(this.serviceProvider);
            this.serviceProvider = singletonProvider;
            map.put(this.groupName, singletonProvider);
        }
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.ss.android.ugc.aweme.framework.services.ServiceProvider<T> */
    /* JADX WARN: Multi-variable type inference failed */
    GroupBinding(Map<Class<?>, Map<String, ServiceProvider<?>>> map, Class<T> cls, String str, ServiceProvider<T> serviceProvider2) {
        this.classProviderMaps = map;
        this.groupName = str;
        this.klass = cls;
        this.serviceProvider = serviceProvider2;
        Map<String, ServiceProvider<?>> map2 = map.get(cls);
        if (map2 == null) {
            map2 = Collections.synchronizedMap(new HashMap());
            this.classProviderMaps.put(cls, map2);
        }
        map2.put(str, serviceProvider2);
    }
}
