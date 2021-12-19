package com.bytedance.netecho;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class NetechoConfig {
    public static final NetechoConfig INSTANCE = new NetechoConfig();
    private static b<? super String, z> loadLibrary = NetechoConfig$loadLibrary$1.INSTANCE;

    private NetechoConfig() {
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.String, h.z>, h.f.a.b<java.lang.String, h.z> */
    public final b<String, z> getLoadLibrary() {
        return loadLibrary;
    }

    static {
        Covode.recordClassIndex(25441);
    }

    public final void setLoadLibrary(b<? super String, z> bVar) {
        l.c(bVar, "");
        loadLibrary = bVar;
    }
}
