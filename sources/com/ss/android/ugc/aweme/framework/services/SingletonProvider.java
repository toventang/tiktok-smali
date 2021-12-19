package com.ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* access modifiers changed from: package-private */
public class SingletonProvider<T> implements ServiceProvider<T> {
    volatile T service;
    ServiceProvider<T> serviceProvider;

    static {
        Covode.recordClassIndex(61369);
    }

    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
    public synchronized T get() {
        T t;
        MethodCollector.i(3302);
        if (this.service == null) {
            this.service = this.serviceProvider.get();
        }
        t = this.service;
        MethodCollector.o(3302);
        return t;
    }

    SingletonProvider(ServiceProvider serviceProvider2) {
        this.serviceProvider = serviceProvider2;
    }
}
