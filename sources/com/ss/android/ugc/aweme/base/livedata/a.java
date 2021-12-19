package com.ss.android.ugc.aweme.base.livedata;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.arch.widgets.base.c;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, c<Object>> f68148a;

    static {
        Covode.recordClassIndex(41986);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.livedata.a$a  reason: collision with other inner class name */
    public static class C1541a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f68149a = new a((byte) 0);

        static {
            Covode.recordClassIndex(41987);
        }
    }

    private a() {
        this.f68148a = new HashMap();
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final synchronized <T> c<T> a(String str) {
        c<T> cVar;
        MethodCollector.i(1618);
        if (!this.f68148a.containsKey(str)) {
            this.f68148a.put(str, new c<>());
        }
        cVar = (c<T>) this.f68148a.get(str);
        MethodCollector.o(1618);
        return cVar;
    }
}
