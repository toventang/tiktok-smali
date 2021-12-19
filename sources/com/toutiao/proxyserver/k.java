package com.toutiao.proxyserver;

import com.bytedance.covode.number.Covode;
import com.toutiao.proxyserver.b.c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    ConcurrentHashMap<String, c> f154915a;

    /* renamed from: b  reason: collision with root package name */
    private ConcurrentLinkedQueue<String> f154916b;

    static {
        Covode.recordClassIndex(103161);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final k f154917a = new k((byte) 0);

        static {
            Covode.recordClassIndex(103162);
        }
    }

    private k() {
        this.f154916b = new ConcurrentLinkedQueue<>();
        this.f154915a = new ConcurrentHashMap<>();
    }

    /* synthetic */ k(byte b2) {
        this();
    }

    public final void a(String str, c cVar) {
        if (str != null && cVar != null && !this.f154915a.containsKey(str)) {
            this.f154915a.put(str, cVar);
            this.f154916b.offer(str);
            int i2 = 0;
            while (this.f154916b.size() > 30) {
                String poll = this.f154916b.poll();
                if (poll != null) {
                    this.f154915a.remove(poll);
                }
                i2++;
                if (i2 > 30) {
                    return;
                }
                if (poll == null) {
                    return;
                }
            }
        }
    }
}
