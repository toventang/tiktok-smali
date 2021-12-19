package com.ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.k.c;
import java.util.Set;

public final class ExtentionKt {
    static {
        Covode.recordClassIndex(61353);
    }

    public static final /* synthetic */ <T> T getService(c<T> cVar) {
        l.c(cVar, "");
        ServiceManager serviceManager = ServiceManager.get();
        l.c();
        return (T) serviceManager.getService(Object.class);
    }

    public static final /* synthetic */ <T> Set<T> getServices(c<T> cVar) {
        l.c(cVar, "");
        ServiceManager serviceManager = ServiceManager.get();
        l.c();
        Set<T> services = serviceManager.getServices(Object.class);
        l.a((Object) services, "");
        return services;
    }

    public static final /* synthetic */ <T> T getService(Class<T> cls) {
        l.c(cls, "");
        ServiceManager serviceManager = ServiceManager.get();
        l.c();
        return (T) serviceManager.getService(Object.class);
    }

    public static final /* synthetic */ <T> Set<T> getServices(Class<T> cls) {
        l.c(cls, "");
        ServiceManager serviceManager = ServiceManager.get();
        l.c();
        Set<T> services = serviceManager.getServices(Object.class);
        l.a((Object) services, "");
        return services;
    }
}
