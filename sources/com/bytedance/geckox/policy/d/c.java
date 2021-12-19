package com.bytedance.geckox.policy.d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ConcurrentHashMap<String, Long> f29974a = new ConcurrentHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private static AtomicLong f29975f = new AtomicLong(System.currentTimeMillis());

    /* renamed from: b  reason: collision with root package name */
    public a f29976b;

    /* renamed from: c  reason: collision with root package name */
    private AtomicBoolean f29977c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f29978d;

    /* renamed from: e  reason: collision with root package name */
    private String f29979e;

    public interface a {
        static {
            Covode.recordClassIndex(17397);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(17396);
    }

    class b extends com.bytedance.geckox.m.a<Long> {
        static {
            Covode.recordClassIndex(17398);
        }

        @Override // com.bytedance.geckox.m.a
        public final int a() {
            return 1;
        }

        @Override // com.bytedance.geckox.m.a
        public final void b() {
            if (c.f29974a.contains(Long.valueOf(((Long) this.f29928c).longValue())) && c.this.f29976b != null) {
                c.this.f29976b.a();
            }
        }

        private b() {
        }

        /* synthetic */ b(c cVar, byte b2) {
            this();
        }
    }

    public final void a() {
        if (!this.f29977c.get() && f29974a.containsKey(this.f29979e)) {
            f29974a.remove(this.f29979e, Long.valueOf(f29974a.get(this.f29979e).longValue()));
        } else if (this.f29977c.get()) {
            f29974a.remove(this.f29979e);
        }
    }

    public final void b() {
        if (!this.f29977c.get() && this.f29978d && System.currentTimeMillis() - f29975f.get() <= 1800000) {
            b bVar = new b(this, (byte) 0);
            long currentTimeMillis = System.currentTimeMillis();
            bVar.f29928c = Long.valueOf(currentTimeMillis);
            com.bytedance.geckox.m.c.a().a(bVar, 60000);
            f29974a.put(this.f29979e, Long.valueOf(currentTimeMillis));
            com.bytedance.geckox.i.a.a(this.f29979e + ">>gecko update request retry hit", null);
        } else if (this.f29977c.get()) {
            f29975f.set(System.currentTimeMillis());
        }
    }

    public c(boolean z, boolean z2, String str, a aVar) {
        this.f29977c = new AtomicBoolean(z);
        this.f29978d = z2;
        this.f29979e = str;
        this.f29976b = aVar;
    }
}
