package com.bytedance.jedi.arch.ext.list.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final b f39440a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f39441b;

    /* renamed from: c  reason: collision with root package name */
    private final int f39442c;

    public interface b {
        static {
            Covode.recordClassIndex(24242);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(24240);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f39443a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f39444b;

        /* renamed from: c  reason: collision with root package name */
        public final b f39445c;

        static {
            Covode.recordClassIndex(24241);
        }

        public a(b bVar) {
            l.c(bVar, "");
            this.f39445c = bVar;
        }
    }

    public final void a(int i2) {
        if (this.f39441b) {
            this.f39440a.a(i2 + this.f39442c);
        }
    }

    private e(b bVar, boolean z, int i2) {
        this.f39440a = bVar;
        this.f39441b = z;
        this.f39442c = i2;
    }

    public /* synthetic */ e(b bVar, boolean z, int i2, byte b2) {
        this(bVar, z, i2);
    }
}
