package com.toutiao.proxyserver;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    ConcurrentHashMap<String, a> f154775a;

    /* renamed from: b  reason: collision with root package name */
    ConcurrentHashMap<String, String> f154776b;

    /* renamed from: c  reason: collision with root package name */
    private ConcurrentHashMap<String, String> f154777c;

    /* renamed from: d  reason: collision with root package name */
    private ConcurrentLinkedQueue<String> f154778d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public AtomicLong f154779a = new AtomicLong(0);

        static {
            Covode.recordClassIndex(103104);
        }
    }

    static {
        Covode.recordClassIndex(103103);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final ae f154780a = new ae((byte) 0);

        static {
            Covode.recordClassIndex(103105);
        }
    }

    private ae() {
        this.f154775a = new ConcurrentHashMap<>();
        this.f154777c = new ConcurrentHashMap<>();
        this.f154776b = new ConcurrentHashMap<>();
        this.f154778d = new ConcurrentLinkedQueue<>();
    }

    private void a() {
        int i2 = 0;
        while (this.f154778d.size() > 100) {
            String poll = this.f154778d.poll();
            if (poll != null) {
                String str = this.f154777c.get(poll);
                this.f154775a.remove(poll);
                this.f154777c.remove(poll);
                this.f154776b.remove(str);
            }
            i2++;
            if (i2 > 100) {
                return;
            }
            if (poll == null) {
                return;
            }
        }
    }

    /* synthetic */ ae(byte b2) {
        this();
    }

    public final long a(String str) {
        a aVar;
        if (str == null || !this.f154775a.containsKey(str) || (aVar = this.f154775a.get(str)) == null) {
            return 0;
        }
        return aVar.f154779a.get();
    }

    public final void a(String str, long j2) {
        a aVar;
        if (str != null) {
            if (this.f154775a.containsKey(str)) {
                aVar = this.f154775a.get(str);
                if (aVar == null) {
                    return;
                }
            } else {
                aVar = new a();
                this.f154775a.put(str, aVar);
            }
            aVar.f154779a.set(j2);
        }
    }

    public final void a(String str, String str2) {
        if (!this.f154777c.containsKey(str)) {
            this.f154778d.offer(str);
        }
        this.f154777c.put(str, str2);
        this.f154776b.put(str2, str);
        a();
    }
}
