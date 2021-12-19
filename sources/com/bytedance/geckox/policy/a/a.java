package com.bytedance.geckox.policy.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.m.c;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public b f29946a;

    /* renamed from: b  reason: collision with root package name */
    public AtomicBoolean f29947b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    private int f29948c;

    /* renamed from: d  reason: collision with root package name */
    private int f29949d;

    static {
        Covode.recordClassIndex(17383);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.geckox.policy.a.a$a  reason: collision with other inner class name */
    public class C0633a extends com.bytedance.geckox.m.a {
        static {
            Covode.recordClassIndex(17384);
        }

        @Override // com.bytedance.geckox.m.a
        public final int a() {
            return 2;
        }

        @Override // com.bytedance.geckox.m.a
        public final void b() {
            a.this.f29946a.a();
            a.this.a();
        }

        private C0633a() {
        }

        /* synthetic */ C0633a(a aVar, byte b2) {
            this();
        }
    }

    public final void a() {
        int i2 = this.f29948c + 1;
        this.f29948c = i2;
        long floor = (long) Math.floor((Math.random() + 0.5d) * Math.pow(2.0d, (double) Math.min(i2 - 2, 8)) * 5.0d);
        this.f29949d = (int) (((long) this.f29949d) + floor);
        com.bytedance.geckox.i.a.a("EB retry counts:" + this.f29948c + ",next retry delay:" + floor + "s,total delay:" + this.f29949d + "s");
        if (this.f29949d > 5115) {
            b();
            return;
        }
        c.a().a(new C0633a(this, (byte) 0), floor * 1000);
    }

    public final void b() {
        if (this.f29947b.get()) {
            com.bytedance.geckox.i.a.a("EB retry stops,retry counts:" + this.f29948c + ",total delay:" + this.f29949d + "s");
            this.f29948c = 0;
            c.a().a(2);
            this.f29947b.set(false);
        }
    }

    public a(b bVar) {
        this.f29946a = bVar;
    }
}
